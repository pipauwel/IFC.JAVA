package com.buildingsmart.tech.IO;

import be.ugent.IfcSpfParser;
import be.ugent.IfcSpfReader;
import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSite;
import com.buildingsmart.tech.ifcowl.vo.IFCVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class IfcParser {

	private static final int FLAG_DIR = 0;
	private static final int FLAG_KEEP_DUPLICATES = 1;

	private static final Logger LOG = LoggerFactory.getLogger(IfcSpfReader.class);

	private String inputFile = "";
	private String outputFile = "";
	private String filePath = "";
	private Boolean radical = true;

	private Map<Long, IFCVO> linemap = new HashMap<>();
	private Map<Long, Object> objectmap = new HashMap<>();

	private Map<String, String> IFC4_ADD2_classes = new HashMap<String, String>();

	// ATTRIBUTES	
	private static IfcProject proj;

	// CONSTRUCTOR
	public IfcParser(String inputFile, String outputFormat, boolean radical) {
		this.inputFile = inputFile;
		this.outputFile = inputFile.substring(0, inputFile.length() - 4) + "." + outputFormat;
		this.filePath = inputFile.substring(0, inputFile.length() - 4);
		this.radical = radical;
	}

	public static void main(String[] args) {

		List<String> argsList = new ArrayList<>(Arrays.asList(args));

		String inputFile = "C:\\Users\\20194060\\Desktop\\resources\\files\\7m900_tue_hello_wall_with_door_ifc4.ifc";
		String inputFormat = "spf";
		String outputFormat = "json";
		String radical = "true";

		argsList.add(0,inputFile);
		argsList.add(1,inputFormat);
		argsList.add(2,outputFormat);
		argsList.add(3,radical);

		final int numRequiredOptions = 4;
		if (argsList.size() != numRequiredOptions) {
			LOG.info("Usage:\n" + "    IfcParser <inputFile> <inputFormat> <outputFormat> <radical>\n");
			return;
		}

		IfcParser parser = new IfcParser(inputFile, outputFormat, Boolean.valueOf(radical));
		LOG.info("Parsing file: " + inputFile + "\r\n");

		//parser.setup();
		//parser.convert(inputFile, outputFile, r.DEFAULT_PATH);

		parser.loadClassNames();
		parser.parseModelFromSPF();

		parser.writeModelToJSON();
		//parser.writeModelToXML();


		/*parser.parseModelFromXML(args[0]);
		parser.writeModelToXML(fp+".xml");
		parser.writeModelToJSON(fp+".json");*/

		/*String fp1 = "C:\\Users\\pipauwel\\Desktop\\resources\\files\\serialized_randomhouse_second";
		proj = null;
		parser.parseModelFromXML(fp+".xml");
		parser.writeModelToXML(fp1+".xml");*/
	}

	private void loadClassNames(){
		File file = new File(getClass().getClassLoader().getResource("IFC4_ADD2_classes.txt").getFile());

		if (file == null) return;

		try (FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader)) {

			String line;
			while ((line = br.readLine()) != null) {
				if(line.contains(" - ")) {
					String first = line.split(" - ")[0];
					String second = line.split(" - ")[1];
					IFC4_ADD2_classes.put(second.toUpperCase(), first);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseModelFromSPF(){
		try {
			FileInputStream is = new FileInputStream(inputFile);

			IfcSpfParser parser = new IfcSpfParser(is);
			parser.readModel();
			LOG.info("Model parsed");
			boolean parsedSuccessfully = parser.mapEntries();
			if (!parsedSuccessfully)
				return;

			LOG.info("Entries mapped into list");

			//recover data from parser
			//conv.idCounter = parser.getIdCounter();
			linemap = parser.getLinemap();

			loadToClassLibrary();
			secondRunForMakingMatches();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadToClassLibrary(){
		//First run to collect everything in memory
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO ifcLineEntry = entry.getValue();

			//get full classname;
			String name = ifcLineEntry.getName();
			System.out.println(name + " - " + ifcLineEntry.getLineNum());
			String className = IFC4_ADD2_classes.get(name);

			try {
				Class<?> cls = Class.forName(className);
				Object clsInstance = cls.getDeclaredConstructor().newInstance();
				System.out.println(clsInstance);
				objectmap.put(ifcLineEntry.getLineNum(),clsInstance);

				if(ifcLineEntry.getName().equalsIgnoreCase("IfcProject"))
					this.proj = (IfcProject)clsInstance;

				//parsing attributes and relations
				List<Field> fields = getInheritedPrivateFieldsWithDataMemberAnnotation(cls);
				List<Object> input = removeCommas(ifcLineEntry.getObjectList());

				boolean unevenlistsizes = false;
				int diff = 0;
				int inputIndex = 0; // this is used to track the index number of the input list

				if(fields.size()!=input.size()){
					//input values is not equal in number to field values
					//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
					System.out.println("Fields and input do not match in size - some values are .... just mixed up ... clean first");
					unevenlistsizes = true;
					diff = input.size() - fields.size();
				}

				for (int fieldIndex = 0; fieldIndex < fields.size(); fieldIndex++) {
					if(input.get(inputIndex) instanceof String) {
						String txt = (String) input.get(inputIndex);
						if(unevenlistsizes == true){
							//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
							String clsX = returnBasicTypes(txt);
							String originalType = returnOriginalType(txt);
							//Class<?> clsSelect = Class.forName(txt);
							//if(clsSelect!=null){
							if(clsX!="" && input.get(inputIndex+1)!=null && input.get(inputIndex+1) instanceof LinkedList){
								//This class exists!
								System.out.println("found this in the linkedlist string or whatever it is: " + input.get(inputIndex+1));
								LinkedList xx = (LinkedList) input.get(inputIndex+1);
								if(xx.size()!=1) {
									System.out.println("ERROR: LinkedList should have only one element: " + fields.get(fieldIndex));
									inputIndex++;
									diff--;
									if(diff == 0)
										unevenlistsizes = false;
									continue;
								}

								String x = (String)xx.get(0);
								//This is typically a string, it needs to be handled again before creating again
								//Object clsSelectInstance = (Object) clsSelect.getDeclaredConstructor().newInstance(x);
								System.out.println("DOING THIS: This is the issue with the Unexisting Select class - go to " +
										"com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue and find ... no subclasses!");

								Type t = fields.get(fieldIndex).getType();
								if(clsX.equalsIgnoreCase("REAL")){
									double d  = Double.parseDouble(x);
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setDoubleValue(d);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else if(clsX.equalsIgnoreCase("STRING")){
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setStringValue(x.substring(1));
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else if(clsX.equalsIgnoreCase("INTEGER")){
									int d  = Integer.parseInt(x);
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setIntValue(d);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else if(clsX.equalsIgnoreCase("BINARY")){
									System.out.println("ERROR: Damn binary: " + fields.get(fieldIndex));
								}
								else if(clsX.equalsIgnoreCase("BOOLEAN")){
									if(x.equalsIgnoreCase(".T."))
										x = "true";
									else if(x.equalsIgnoreCase(".F."))
										x = "false";
									else
										System.out.println("ERROR: Unknown boolean value : " + x);

									boolean d  = Boolean.parseBoolean(x);
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setBooleanValue(d);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else if(clsX.equalsIgnoreCase("NUMBER")){
									int d  = Integer.parseInt(x);
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setIntValue(d);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else if(clsX.equalsIgnoreCase("LOGICAL")){
									boolean d  = Boolean.parseBoolean(x);
									IfcValue v = new IfcValue();
									v.setType(originalType);
									v.setBooleanValue(d);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, v);
								}
								else{
									System.out.println("ERROR: Done nothing really: " + fields.get(fieldIndex));
								}

								System.out.println("OKOK declared field: " + fields.get(fieldIndex));

								inputIndex++;
								diff--;
								if(diff == 0)
									unevenlistsizes = false;
								continue;
							}
						}

						if(txt.startsWith("'"))
							txt = txt.substring(1);

						if(txt.equalsIgnoreCase("$")) {
							inputIndex++;
							continue;
						}

						Type t = fields.get(fieldIndex).getType();
						if(txt.equalsIgnoreCase("*")){
							if(cls.equals(IfcSIUnit.class)){
								// Somebody made this an exception to save space in file size, so now this needs to be parsed differently
								String unitName = (String)input.get(3);
								unitName= unitName.substring(1, unitName.length()-1);
								IfcDimensionalExponents ide = getIfcDimensionsForSiUnit(unitName);
								fields.get(fieldIndex).setAccessible(true);
								fields.get(fieldIndex).set(clsInstance, ide);
								System.out.println("OK declared field: " + fields.get(fieldIndex));

								inputIndex++;
								continue;

								//NOTE  In the examples the '*' character as the first value in the IfcSIUnit-instances is
								// due to the fact that in the IfcSIUnit the inherited attribute .Dimensions is redefined
								// as a derived attribute. In the IFC Object Model schema there is a function that returns
								// the derived dimensional exponent values for SI units. In the exchange file the derived
								// attribute values are not exchanged, and in the case of redefinition the value is
								// replaced by '*'.
							}
							else{
								System.out.println("Skipping field: Field " + fields.get(fieldIndex) + " is not assignable from type "
										+ String.class + ", especially not because it is a '*'.");
								inputIndex++;
								continue;
							}
						}

						if(t != null && ((Class<?>)t).isEnum()){
							txt = txt.substring(1,txt.length()-1);
							Enum anEnum = Enum.valueOf((Class<Enum>) fields.get(fieldIndex).getType(), txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, anEnum);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Integer.TYPE)){
							int x = Integer.parseInt(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Long.TYPE)){
							long x = Long.parseLong(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Double.TYPE)){
							double x = Double.parseDouble(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(fields.get(fieldIndex).getName().endsWith("valueComponent")){
							// these fields point to interfaces, which are the JAVA versions of EXPRESS Selects.
							//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
							System.out.println("Skipping field: The SELECT field " + fields.get(fieldIndex) + " is not assignable from type " + String.class);
							inputIndex++;
							continue;
						}

						if (!fields.get(fieldIndex).getType().isAssignableFrom(String.class)) {
							System.out.println("Skipping field: Field " + fields.get(fieldIndex) + " is not assignable from type " + String.class);
							continue;
						}

						fields.get(fieldIndex).setAccessible(true);
						fields.get(fieldIndex).set(clsInstance, txt);
						System.out.println("OK declared field: " + fields.get(fieldIndex));
					}
					else if(input.get(inputIndex) instanceof IFCVO){
						System.out.println("OK skipping field: " + fields.get(fieldIndex));
					}
					else if(input.get(inputIndex) instanceof LinkedList){
						System.out.println("OK skipping List field: " + fields.get(fieldIndex));
					}
					else {
						System.out.println("not sure what this field is: " + fields.get(fieldIndex));
					}

					inputIndex++;
				}
			} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
				LOG.error("ERROR in instantiating Class : " + className);
				e.printStackTrace();
			}
		}
	}

	private List<Object> removeCommas(List<Object> lvo){
		List<Object> theRealList = new ArrayList<Object>();
		for(Object o : lvo) {
			if(!o.getClass().equals(Character.class))
				theRealList.add(o);
		}
		return theRealList;
	}

	private List<Field> getInheritedPrivateFieldsWithDataMemberAnnotation(Class<?> type) {
		List<Field> result = new ArrayList<Field>();
		List<Field> extra = new ArrayList<Field>();

		Class<?> i = type;
		while (i != null && i != Object.class) {
			Field[] declaredFields = i.getDeclaredFields();

			for(Field f : declaredFields){
				// check datamember annotation. only those with datamember are direct attributes (not inverse)
				Annotation[] annotations = f.getAnnotations();
				for(Annotation annotation : annotations){
					if(annotation instanceof DataMember){
						DataMember myAnnotation = (DataMember) annotation;
						//System.out.println("order: " + myAnnotation.Order());
						extra.add(f);
					}
				}
			}

			for(int j = extra.size(); j>0; j--){
				result.add(0, extra.get(j-1));
			}

			//Collections.addAll(result, i.getDeclaredFields());
			//result.add(0,extra.toArray());
			i = i.getSuperclass();
			extra.clear();
		}

		return result;
	}

	private List<Field> getInheritedPrivateFieldsWithInverseAnnotation(Class<?> type){
		List<Field> result = new ArrayList<Field>();
		List<Field> extra = new ArrayList<Field>();

		Class<?> i = type;
		while (i != null && i != Object.class) {
			Field[] declaredFields = i.getDeclaredFields();

			for(Field f : declaredFields){
				// check datamember annotation. only those with datamember are direct attributes (not inverse)
				Annotation[] annotations = f.getAnnotations();
				for(Annotation annotation : annotations){
					if(annotation instanceof InverseProperty){
						InverseProperty myAnnotation = (InverseProperty) annotation;
						extra.add(f);
					}
				}
			}

			for(int j = extra.size(); j>0; j--){
				result.add(0, extra.get(j-1));
			}

			//Collections.addAll(result, i.getDeclaredFields());
			//result.add(0,extra.toArray());
			i = i.getSuperclass();
			extra.clear();
		}

		return result;
	}

	private void secondRunForMakingMatches() {

		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			//Long lineNum = entry.getKey();
			IFCVO ifcLineEntry = entry.getValue();
			Object ifcObject = objectmap.get(ifcLineEntry.getLineNum());
			Long l = ifcLineEntry.getLineNum();
			if (l == 44 || l == 45) {
				System.out.println("Stop");
			}

			//get full classname;
			String name = ifcLineEntry.getName();
			System.out.println(name + " - " + ifcLineEntry.getLineNum());
			String className = IFC4_ADD2_classes.get(name);

			// load all the catches
			try {
				Class<?> cls = Class.forName(className);
				List<Field> fields = getInheritedPrivateFieldsWithDataMemberAnnotation(cls);
				List<Object> input = removeCommas(ifcLineEntry.getObjectList());
				for (int i = 0; i < fields.size(); i++) {
					if (input.get(i) instanceof String) {
						//do nothing, because already done


						/*if (!fields.get(i).getType().isAssignableFrom(String.class)) {
							System.out.println("Need to handle this here: Field " + fields.get(i) + " is not assignable from type " + String.class);
							//continue;
						}
						else{
							//do nothing, because already done
						}*/
					} else if (input.get(i) instanceof IFCVO) {
						long linenum = ((IFCVO) input.get(i)).getLineNum();
						if (linenum == 44 || linenum == 45) {
							System.out.println("Stop");
						}

						Object ifcObject2 = objectmap.get(((IFCVO) input.get(i)).getLineNum());
						fields.get(i).setAccessible(true);
						fields.get(i).set(ifcObject, ifcObject2);
						System.out.println("OK declared field: " + fields.get(i));
					} else if (input.get(i) instanceof LinkedList) {
						LinkedList<Object> list = (LinkedList<Object>) input.get(i);
						if (fields.get(i).getType() == List.class) {
							List x = new ArrayList();
							for (Object v : list) {
								if (v instanceof Character) {
									//must be comma
								} else if (v instanceof String) {
									Type type = fields.get(i).getGenericType();
									//System.out.println("type: " + type);
									if (type instanceof ParameterizedType) {
										ParameterizedType pt = (ParameterizedType) type;
										for (Type t : pt.getActualTypeArguments()) {
											//System.out.println("    " + t);
											if (t.equals(String.class))
												x.add(v);
											else if (t.equals(Double.class))
												x.add(Double.parseDouble(v.toString()));
										}
									} else {
										System.out.println("skipping String to linkedlist: " + fields.get(i));
									}
								} else if (v instanceof IFCVO) {
									Object ifcObject2 = objectmap.get(((IFCVO) v).getLineNum());
									x.add(ifcObject2);
								} else if (v instanceof LinkedList) {
									System.out.println("skipping LIST to linkedlist: " + fields.get(i));
								} else {
									System.out.println("Panic and run");
								}
							}
							fields.get(i).setAccessible(true);
							fields.get(i).set(ifcObject, x);
							System.out.println("declared LIST to field: " + fields.get(i));
						} else if (fields.get(i).getType() == Set.class) {
							Set x = new HashSet();
							for (Object v : list) {
								if (v instanceof Character) {
									//must be comma
								} else if (v instanceof String) {
									x.add(v);
								} else if (v instanceof IFCVO) {
									Object ifcObject2 = objectmap.get(((IFCVO) v).getLineNum());
									x.add(ifcObject2);
								} else if (v instanceof LinkedList) {
									System.out.println("skipping SET to linkedlist: " + fields.get(i));
								} else {
									System.out.println("Panic and run");
								}
							}
							fields.get(i).setAccessible(true);
							fields.get(i).set(ifcObject, x);
							System.out.println("OK declared SET to field: " + ifcObject.toString() + " - " + fields.get(i).getName() + " - " + x);
						} else {
							System.out.println("skipping field LinkedList : " + fields.get(i).getType());
							//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
						}
					} else {
						System.out.println("not sure what this field is: " + fields.get(i));
					}
				}
			} catch (ClassNotFoundException | IllegalAccessException e) {
				LOG.error("ERROR in instantiating Class : " + className);
				e.printStackTrace();
			}
		}

		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			//Long lineNum = entry.getKey();
			IFCVO ifcLineEntry = entry.getValue();
			Object ifcObject = objectmap.get(ifcLineEntry.getLineNum());
			Long l = ifcLineEntry.getLineNum();
			if (l==35 || l == 44 || l == 45) {
				System.out.println("Stop");
			}

			//Get the classname of the object being filled
			String name = ifcLineEntry.getName();
			System.out.println(name + " - " + ifcLineEntry.getLineNum());
			String className = IFC4_ADD2_classes.get(name);

			// make sure that inverse properties are filled
			try {
				//Get the classname of the object being filled
				Class<?> cls = Class.forName(className);
				List<Field> fields = getInheritedPrivateFieldsWithInverseAnnotation(cls);
				for (int i = 0; i < fields.size(); i++) {
					//Get the fields of the object being filled, one by one
					Field f = fields.get(i);
					Annotation[] annotations = f.getAnnotations();
					for (Annotation annotation : annotations) {
						if (annotation instanceof InverseProperty) {
							//Make sure to only continue with fields that have an inverse annotation, because only those may be set
							InverseProperty myAnnotation = (InverseProperty) annotation;
							//Find the range of objects that may refer to the object being filled (range)
							String inverseProp = myAnnotation.InverseProp();
							String range = myAnnotation.Range();

							for (Map.Entry objEntry : objectmap.entrySet()) {
								//Go from scratch through all objects in the objectmap and get their class
								Class cl = objEntry.getValue().getClass();
								//Check whether the class matches the range of objects that might point to our object to be filled
								if (cl.getName().endsWith(range)) {
									if (range.equalsIgnoreCase("IfcRelContainedInSpatialStructure")) {
										System.out.println("Stop1");
									}
									if (range.equalsIgnoreCase("IfcSpatialElement")) {
										System.out.println("Stop1");
									}
									Field[] declaredFields = cl.getDeclaredFields();
									for (Field fi : declaredFields) {
										//Find out whether the class has a field that matches the inverse of the property
										if (fi.getName().equalsIgnoreCase(inverseProp)) {
											fi.setAccessible(true);
											//get that value
											Object x = fi.get(objEntry.getValue());

											//IF that object is the same as the object to be filled, then we need to fill properties
											if (x == null) {
												//TODO: not relevant or needed
												System.out.println("WARNING: Object is null: " + fields.get(i));
												//return;
											}
											else {
												if (x instanceof Set){
													if(((Set) x).contains(ifcObject)) {
														if (f.getType() == Set.class) {
															f.setAccessible(true);
															Set mySet = (Set) f.get(ifcObject);
															if (mySet == null) {
																mySet = new HashSet();
																f.set(ifcObject, mySet);
															}
															mySet.add(objEntry.getValue());
															//mySet.addAll((Collection) x);

															System.out.println("OK: declared SET with "+objEntry.getValue()+" to field: " + fields.get(i));
														}
														else{
															System.out.println("Errrr " + fields.get(i));
														}
													}
													else{
														//Different object: can be ignored
														//System.out.println("Errrr " + fields.get(i));
													}
												}
												else if (x instanceof List && ((Set) x).contains(ifcObject)) {
													//TODO
													System.out.println("TODO 4: " + fields.get(i));
												}
												else if (x.equals(ifcObject)) {
													//TODO check and complete!!!!!
													if(f.getType()==Set.class){
														f.setAccessible(true);
														Set mySet = (Set) f.get(ifcObject);
														if(mySet==null) {
															mySet = new HashSet();
															f.set(ifcObject, mySet);
														}
														mySet.add(objEntry.getValue());
														System.out.println("OK: declared SET with "+objEntry.getValue()+"  to field: " + fields.get(i));
													}
													else if(f.getType()==List.class) {
														//TODO
														System.out.println("TODO 3");
													}
													else if (f.getType().getName().endsWith(range)) {
														f.setAccessible(true);
														f.set(ifcObject, objEntry.getValue());
														System.out.println("OK: declared IfcObject " + objEntry.getValue() + " to field: " + fields.get(i));
													} else {
														//TODO
														System.out.println("TODO 2");
													}

													System.out.println("MAJOR OK declared field: " + f);

												} else {
													//TODO
													System.out.println("TODO 1");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	private void parseModelFromXML(String fp) {
		try {
			InputStream inputStream = new FileInputStream(fp);		
		
			XmlMapper m = new XmlMapper();
			m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
			m.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);			
			
			try {
				proj = m.readValue(inputStream, IfcProject.class);
				IfcRelAggregates ira = proj.getIsDecomposedBy();
				//while(iter.hasNext()){
				//	IfcRelAggregates ira = iter.next();
					if(ira.getRelatedObjects().size() == 0){
						System.out.println("did not find IfcSite");
						ira.getRelatedObjects().add(new IfcSite());
						IfcSite s = new IfcSite();
						s.setName("testName");
					}				
				//}
	
				System.out.println("completed");
	
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void writeModelToXML() {
		try {
			String fp = filePath;

			XmlMapper m = new XmlMapper();
			m.configure(SerializationFeature.INDENT_OUTPUT, true);
			m.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			m.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

//			JacksonXmlModule xmlModule = new JacksonXmlModule();
//			xmlModule.setDefaultUseWrapper(false);
//			ObjectMapper om = new XmlMapper(xmlModule);
//			om.configure(SerializationFeature.INDENT_OUTPUT, true);
//			om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//			om.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
			
			//om.writeValueAsString(proj);

			String xmlString;
			xmlString = m.writeValueAsString(proj);
			//xmlString = om.writeValueAsString(proj);

			File xmlOutput = new File(fp+".xml");
			FileWriter fileWriter = new FileWriter(xmlOutput);
			fileWriter.write(xmlString);
			fileWriter.close();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void writeModelToJSON() {
		try {
			String fp = filePath;
			ObjectMapper m = new ObjectMapper();
			m.configure(SerializationFeature.INDENT_OUTPUT, true);
			m.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			m.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

			String jsonString;
			jsonString = m.writeValueAsString(proj);

			File jsonOutput = new File(fp + ".json");
			FileWriter fileWriter = new FileWriter(jsonOutput);
			fileWriter.write(jsonString);
			fileWriter.close();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// METHODS

	// ACCESSORS

	//UNBELIEVABLE METHODS
	private IfcDimensionalExponents getIfcDimensionsForSiUnit(String name){
		switch(name){
			case "METRE": return new IfcDimensionalExponents(1, 0, 0, 0, 0, 0, 0);
			case "SQUARE_METRE": return new IfcDimensionalExponents(2, 0, 0, 0, 0, 0, 0);
			case "CUBIC_METRE": return new IfcDimensionalExponents(3, 0, 0, 0, 0, 0, 0);
			case "GRAM": return new IfcDimensionalExponents(0, 1, 0, 0, 0, 0, 0);
			case "SECOND": return new IfcDimensionalExponents(0, 0, 1, 0, 0, 0, 0);
			case "AMPERE": return new IfcDimensionalExponents(0, 0, 0, 1, 0, 0, 0);
			case "KELVIN": return new IfcDimensionalExponents(0, 0, 0, 0, 1, 0, 0);
			case "MOLE": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 1, 0);
			case "CANDELA": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 1);
			case "RADIAN": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
			case "STERADIAN": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
			case "HERTZ": return new IfcDimensionalExponents(0, 0, -1, 0, 0, 0, 0);
			case "NEWTON": return new IfcDimensionalExponents(1, 1, -2, 0, 0, 0, 0);
			case "PASCAL": return new IfcDimensionalExponents(-1, 1, -2, 0, 0, 0, 0);
			case "JOULE": return new IfcDimensionalExponents(2, 1, -2, 0, 0, 0, 0);
			case "WATT": return new IfcDimensionalExponents(2, 1, -3, 0, 0, 0, 0);
			case "COULOMB": return new IfcDimensionalExponents(0, 0, 1, 1, 0, 0, 0);
			case "VOLT": return new IfcDimensionalExponents(2, 1, -3, -1, 0, 0, 0);
			case "FARAD": return new IfcDimensionalExponents(-2, -1, 4, 2, 0, 0, 0);
			case "OHM": return new IfcDimensionalExponents(2, 1, -3, -2, 0, 0, 0);
			case "SIEMENS": return new IfcDimensionalExponents(-2, -1, 3, 2, 0, 0, 0);
			case "WEBER ": return new IfcDimensionalExponents(2, 1, -2, -1, 0, 0, 0);
			case "TESLA": return new IfcDimensionalExponents(0, 1, -2, -1, 0, 0, 0);
			case "HENRY": return new IfcDimensionalExponents(2, 1, -2, -2, 0, 0, 0);
			case "DEGREE_CELSIUS": return new IfcDimensionalExponents(0, 0, 0, 0, 1, 0, 0);
			case "LUMEN": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 1);
			case "LUX": return new IfcDimensionalExponents(-2, 0, 0, 0, 0, 0, 1);
			case "BECQUEREL": return new IfcDimensionalExponents(0, 0, -1, 0, 0, 0, 0);
			case "GRAY": return new IfcDimensionalExponents(2, 0, -2, 0, 0, 0, 0);
			case "SIEVERT": return new IfcDimensionalExponents(2, 0, -2, 0, 0, 0, 0);
			case "OTHERWISE": return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
		}
		return null;
	}

	private enum realTypes{ IfcAbsorbedDoseMeasure, IfcAccelerationMeasure, IfcAmountOfSubstanceMeasure, IfcAngularVelocityMeasure,
		IfcAreaDensityMeasure, IfcAreaMeasure, IfcContextDependentMeasure, IfcCurvatureMeasure, IfcDoseEquivalentMeasure,
		IfcDynamicViscosityMeasure, IfcElectricCapacitanceMeasure, IfcElectricChargeMeasure, IfcElectricConductanceMeasure,
		IfcElectricCurrentMeasure, IfcElectricResistanceMeasure,IfcElectricVoltageMeasure, IfcEnergyMeasure, IfcForceMeasure,
		IfcFrequencyMeasure, IfcHeatFluxDensityMeasure, IfcHeatingValueMeasure, IfcIlluminanceMeasure, IfcInductanceMeasure,
		IfcIonConcentrationMeasure, IfcIsothermalMoistureCapacityMeasure, IfcKinematicViscosityMeasure, IfcLengthMeasure,
		IfcLinearForceMeasure, IfcLinearMomentMeasure, IfcLinearStiffnessMeasure, IfcLinearVelocityMeasure, IfcLuminousFluxMeasure,
		IfcLuminousIntensityDistributionMeasure, IfcLuminousIntensityMeasure, IfcMagneticFluxDensityMeasure, IfcMagneticFluxMeasure,
		IfcMassDensityMeasure, IfcMassFlowRateMeasure, IfcMassMeasure, IfcMassPerLengthMeasure, IfcModulusOfElasticityMeasure,
		IfcModulusOfLinearSubgradeReactionMeasure, IfcModulusOfRotationalSubgradeReactionMeasure, IfcModulusOfSubgradeReactionMeasure,
		IfcMoistureDiffusivityMeasure, IfcMolecularWeightMeasure, IfcMomentOfInertiaMeasure, IfcMonetaryMeasure, IfcPHMeasure,
		IfcParameterValue, IfcPlanarForceMeasure, IfcPlaneAngleMeasure, IfcPowerMeasure, IfcPressureMeasure, IfcRadioActivityMeasure,
		IfcRatioMeasure, IfcReal, IfcRotationalFrequencyMeasure, IfcRotationalMassMeasure, IfcRotationalStiffnessMeasure,
		IfcSectionModulusMeasure, IfcSectionalAreaIntegralMeasure, IfcShearModulusMeasure, IfcSolidAngleMeasure, IfcSoundPowerLevelMeasure,
		IfcSoundPowerMeasure, IfcSoundPressureLevelMeasure, IfcSoundPressureMeasure, IfcSpecificHeatCapacityMeasure, IfcSpecularExponent,
		IfcSpecularRoughness, IfcTemperatureGradientMeasure, IfcTemperatureRateOfChangeMeasure, IfcThermalAdmittanceMeasure,
		IfcThermalConductivityMeasure, IfcThermalExpansionCoefficientMeasure, IfcThermalResistanceMeasure, IfcThermalTransmittanceMeasure,
		IfcThermodynamicTemperatureMeasure, IfcTimeMeasure, IfcTorqueMeasure, IfcVaporPermeabilityMeasure, IfcVolumeMeasure,
		IfcVolumetricFlowRateMeasure, IfcWarpingConstantMeasure, IfcWarpingMomentMeasure
	};
	private enum integerTypes{ IfcCardinalPointReference, IfcDayInMonthNumber, IfcDayInWeekNumber, IfcMonthInYearNumber, IfcDimensionCount, IfcInteger,
		IfcIntegerCountRateMeasure, IfcTimeStamp
	};
	private enum stringTypes{ IfcDate, IfcDateTime, IfcDescriptiveMeasure, IfcDuration, IfcFontStyle, IfcFontVariant,
		IfcFontWeight, IfcGloballyUniqueId, IfcIdentifier, IfcLabel, IfcPresentableText, IfcText, IfcTextAlignment, IfcTextDecoration,
		IfcTextFontName, IfcTextTransformation, IfcTime, IfcURIReference};
	private enum binaryTypes{ IfcBinary	};
	private enum booleanTypes{ IfcBoolean };
	private enum numberTypes{ IfcCountMeasure, IfcNumericMeasure };
	private enum logicalTypes{ IfcLogical };

	private String returnOriginalType(String type){
		for (realTypes c : realTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (integerTypes c : integerTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (stringTypes c : stringTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (binaryTypes c : binaryTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (booleanTypes c : booleanTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (numberTypes c : numberTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (logicalTypes c : logicalTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		return "";

	}

	private String returnBasicTypes(String type){
		for (realTypes c : realTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "REAL";
			}
		}
		for (integerTypes c : integerTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "INTEGER";
			}
		}
		for (stringTypes c : stringTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "STRING";
			}
		}
		for (binaryTypes c : binaryTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "BINARY";
			}
		}
		for (booleanTypes c : booleanTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "BOOLEAN";
			}
		}
		for (numberTypes c : numberTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "NUMBER";
			}
		}
		for (logicalTypes c : logicalTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return "LOGICAL";
			}
		}
		return "";
	}
}
