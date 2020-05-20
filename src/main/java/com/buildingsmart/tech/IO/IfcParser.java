package com.buildingsmart.tech.IO;

import be.ugent.IfcSpfParser;
import be.ugent.IfcSpfReader;
import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcArcIndex;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcLineIndex;
import com.buildingsmart.tech.ifc.IfcHelperDomain.IfcParameterValueList;
import com.buildingsmart.tech.ifc.IfcHelperDomain.IfcPositiveIntegerList;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSet;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSite;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGeometricRepresentationSubContext;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge;
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
import java.lang.reflect.*;
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
	private Map<String, String> IFC4_ADD2_types = new HashMap<String, String>();

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

		if (args.length != 0 && args.length!=4) {
			LOG.info("Usage:\n" + "    IfcParser <inputFile> <inputFormat> <outputFormat> <radical>\n");
			return;
		}

		List<String> argsList = new ArrayList<>(Arrays.asList(args));

		String inputFile = "C:\\Users\\20194060\\Desktop\\resources\\files\\7m900_tue_hello_wall_with_door_ifc4.ifc";
		String inputFormat = "spf";
		String outputFormat = "json";
		String radical = "true";

		if(argsList.size() == 0){
			argsList.add(0,inputFile);
			argsList.add(1,inputFormat);
			argsList.add(2,outputFormat);
			argsList.add(3,radical);
		}
		else{
			inputFile = args[0];
			inputFormat = args[1];
			outputFormat = args[2];
			radical = args[3];
		}

		final int numRequiredOptions = 4;
		if (argsList.size() != numRequiredOptions) {
			LOG.info("Usage:\n" + "    IfcParser <inputFile> <inputFormat> <outputFormat> <radical>\n");
			return;
		}

		IfcParser parser = new IfcParser(inputFile, outputFormat, Boolean.valueOf(radical));
		LOG.info("Parsing file: " + inputFile + "\r\n");

		//parser.setup();
		//parser.convert(inputFile, outputFile, r.DEFAULT_PATH);

		if(inputFormat.equalsIgnoreCase("spf")){
            parser.loadClassNames();
            parser.loadTypeNames();
            parser.parseModelFromSPF();
        }
		else{
		    //TODO other formats
        }

		if(outputFormat.equalsIgnoreCase("json")) {
			parser.writeModelToJSON();
			parser.writeModelToXML();
		}
		else if(outputFormat.equalsIgnoreCase("xml")) {
			parser.writeModelToXML();
			//parser.parseModelFromXML();
			//parser.writeModelToXML();
		}


		/*parser.parseModelFromXML(args[0]);
		parser.writeModelToXML(fp+".xml");
		parser.writeModelToJSON(fp+".json");*/

		/*String fp1 = "C:\\Users\\pipauwel\\Desktop\\resources\\files\\serialized_randomhouse_second";
		proj = null;
		parser.parseModelFromXML(fp+".xml");
		parser.writeModelToXML(fp1+".xml");*/
	}

	private void loadTypeNames(){
		File file = new File(getClass().getClassLoader().getResource("IFC4_ADD2_types.txt").getFile());

		if (file == null) return;

		try (FileReader reader = new FileReader(file);
			 BufferedReader br = new BufferedReader(reader)) {

			String line;
			while ((line = br.readLine()) != null) {
				if(line.contains(" - ")) {
					String first = line.split(" - ")[0];
					String second = line.split(" - ")[1];
					IFC4_ADD2_types.put(first, second);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
			linkObjects();
			computeInverses();
			//secondRunForMakingMatches();
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
					System.out.println("Fields and input do not match in size - probably a type reference in the line");
					unevenlistsizes = true;
					diff = input.size() - fields.size();
				}

				//INFO: Going through all the fields of the host class
				for (int fieldIndex = 0; fieldIndex < fields.size(); fieldIndex++) {
					if(input.get(inputIndex) instanceof String) {
						String txt = (String) input.get(inputIndex);

						//INFO: INPUT EMPTY - SKIP
						if(txt.equalsIgnoreCase("$")) {
							inputIndex++;
							continue;
						}

						//INFO: There are more input fields than that there are target fields, so... have to process it all very carefully
						//e.g. #13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
						if(unevenlistsizes == true){
							//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);

							String originalType = returnOriginalType(txt);

							if(originalType!="" && input.get(inputIndex+1)!=null && input.get(inputIndex+1) instanceof LinkedList){
								//This class exists!
								//System.out.println("found this in the linkedlist string or whatever it is: " + input.get(inputIndex+1));
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
								/*System.out.println("DOING THIS: This is the issue with the Unexisting Select class - go to " +
										"com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue and find ... no subclasses!");*/

								String originalTypeName = getOriginalFullTypeName(originalType);
								String range = IFC4_ADD2_types.get(originalTypeName);
								Class<?> referencedType = Class.forName(originalTypeName);
								Object typeclsInstance = referencedType.getDeclaredConstructor().newInstance();
								Field valField;
								if(!range.equalsIgnoreCase("REAL") && !range.equalsIgnoreCase("STRING") &&
										!range.equalsIgnoreCase("INTEGER") && !range.equalsIgnoreCase("LOGICAL")
										&& !range.equalsIgnoreCase("NUMBER")  && !range.equalsIgnoreCase("BINARY")
										&& !range.equalsIgnoreCase("BOOLEAN")) {
									//One of these types:
									// com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLanguageId - IfcIdentifier
									//com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcBoxAlignment - IfcLabel
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure - IfcLengthMeasure
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure - IfcRatioMeasure
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger - IfcInteger
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure - IfcLengthMeasure
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositivePlaneAngleMeasure - IfcPlaneAngleMeasure
									//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure - IfcRatioMeasure

									valField = referencedType.getSuperclass().getDeclaredField("value");
								}
								else{
									valField = typeclsInstance.getClass().getDeclaredField("value");
								}
								Type valType = valField.getType();
								valField.setAccessible(true);
								if(valType.equals(String.class)){
									if(x.startsWith("'"))
										x = x.substring(1);
									if(x!="")
										valField.set(typeclsInstance,x);
								}
								else if(valType.equals(Integer.class))
									valField.set(typeclsInstance,Integer.parseInt(x));
								else if(valType.equals(Double.class))
									valField.set(typeclsInstance,Double.parseDouble(x));
								else if(valType.equals(Array.class)) {
									//TODO probably a Byte[] array
									System.out.println("WARNING: TODO Byte Array");
								}
								else if(valType.equals(Boolean.class))
									valField.set(typeclsInstance,Boolean.parseBoolean(x));

								fields.get(fieldIndex).setAccessible(true);
								fields.get(fieldIndex).set(clsInstance, typeclsInstance);

								System.out.println("OK declared field: " + fields.get(fieldIndex));

								inputIndex++;
								inputIndex++;
								diff--;
								if(diff == 0)
									unevenlistsizes = false;
								continue;
							}
						}

						if(txt.startsWith("'"))
							txt = txt.substring(1);

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
							else if(cls.equals(IfcGeometricRepresentationSubContext.class) || cls.equals(IfcOrientedEdge.class)){
								// value derived from the parentclass IfcGeometricRepresentationContext (DERIVE),
								// so we can safely skip these values and assume the derive values
								//#266= IFCORIENTEDEDGE(*,*,#226,.T.);
								inputIndex++;
								continue;
							}
							else{
								System.out.println("Skipping field: Field " + fields.get(fieldIndex) + " is not assignable from type "
										+ String.class + ", especially not because it is a '*'.");
								inputIndex++;
								continue;
							}
						}

						//Check whether the range is a TYPE (simple datatype wrapping basically)
						if(IFC4_ADD2_types.containsKey(t.getTypeName())){
							String range = IFC4_ADD2_types.get(t.getTypeName());
							if(!range.equalsIgnoreCase("REAL") && !range.equalsIgnoreCase("STRING") &&
									!range.equalsIgnoreCase("INTEGER") && !range.equalsIgnoreCase("LOGICAL")
									&& !range.equalsIgnoreCase("NUMBER")  && !range.equalsIgnoreCase("BINARY")
									&& !range.equalsIgnoreCase("BOOLEAN")){
								//One of these types:
								// com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLanguageId - IfcIdentifier
								//com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcBoxAlignment - IfcLabel
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure - IfcLengthMeasure
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure - IfcRatioMeasure
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger - IfcInteger
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure - IfcLengthMeasure
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositivePlaneAngleMeasure - IfcPlaneAngleMeasure
								//com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure - IfcRatioMeasure
								Class<?> outercls = Class.forName(t.getTypeName());
								Object typeclsInstance = outercls.getDeclaredConstructor().newInstance();

								Field valField = outercls.getSuperclass().getDeclaredField("value");
								Type valType = valField.getType();
								valField.setAccessible(true);
								if(valType.equals(String.class))
									valField.set(typeclsInstance,txt);
								else if(valType.equals(Integer.class))
									valField.set(typeclsInstance,Integer.parseInt(txt));
								else if(valType.equals(Double.class))
									valField.set(typeclsInstance,Double.parseDouble(txt));
								else if(valType.equals(Array.class)) {
									//TODO probably a Byte[] array
									System.out.println("WARNING: TODO Byte Array");
								}
								else if(valType.equals(Boolean.class))
									valField.set(typeclsInstance,Boolean.parseBoolean(txt));

								fields.get(fieldIndex).setAccessible(true);
								fields.get(fieldIndex).set(clsInstance, typeclsInstance);
								System.out.println("OK declared field: " + fields.get(fieldIndex));

								inputIndex++;
								continue;
							}
							else{
								Class<?> typecls = Class.forName(t.getTypeName());
								Object typeclsInstance = typecls.getDeclaredConstructor().newInstance();
								Field valField = typecls.getDeclaredField("value");
								Type valType = valField.getType();
								valField.setAccessible(true);
								if(valType.equals(String.class))
									valField.set(typeclsInstance,txt);
								else if(valType.equals(Integer.class))
									valField.set(typeclsInstance,Integer.parseInt(txt));
								else if(valType.equals(Double.class))
									valField.set(typeclsInstance,Double.parseDouble(txt));
								else if(valType.equals(Array.class)) {
									//TODO probably a Byte[] array
									System.out.println("WARNING: TODO Byte Array");
								}
								else if(valType.equals(Boolean.class))
									valField.set(typeclsInstance,Boolean.parseBoolean(txt));
								fields.get(fieldIndex).setAccessible(true);
								fields.get(fieldIndex).set(clsInstance, typeclsInstance);
								System.out.println("OK declared field: " + fields.get(fieldIndex));
								inputIndex++;
								continue;
							}
						}
						else if(t != null && ((Class<?>)t).isEnum()){
							txt = txt.substring(1,txt.length()-1);
							Enum anEnum = Enum.valueOf((Class<Enum>) fields.get(fieldIndex).getType(), txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, anEnum);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(String.class)){
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, txt);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Integer.class)){
							int x = Integer.parseInt(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Double.class)){
							double x = Double.parseDouble(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(t.equals(Boolean.class)){
							Boolean x = Boolean.parseBoolean(txt);
							fields.get(fieldIndex).setAccessible(true);
							fields.get(fieldIndex).set(clsInstance, x);
							System.out.println("OK declared field: " + fields.get(fieldIndex));
							inputIndex++;
							continue;
						}
						else if(fields.get(fieldIndex).getName().endsWith("valueComponent")){
							// these fields point to interfaces, which are the JAVA versions of EXPRESS Selects.
							//#13 = IFCMEASUREWITHUNIT(IFCPLANEANGLEMEASURE(1.745E-2), #14);
							System.out.println("WARNING: Skipping field: The SELECT field " + fields.get(fieldIndex) + " is not assignable from type " + String.class);
							inputIndex++;
							continue;
						}

						if (!fields.get(fieldIndex).getType().isAssignableFrom(String.class)) {
							System.out.println("WARNING: Skipping field: Field " + fields.get(fieldIndex) + " is not assignable from type " + String.class);
							continue;
						}

						System.out.println("WARNING: This code should be unreachable.");
					}
					else if(input.get(inputIndex) instanceof IFCVO){
						//regular class - record this - to be mapped afterwards
						new ToBeMappedObject(clsInstance,fields.get(fieldIndex),(IFCVO)input.get(inputIndex));
						System.out.println("OK marked object and field to be filled in later (IFCVO): " + fields.get(fieldIndex));
					}
					else if(input.get(inputIndex) instanceof LinkedList){
						System.out.println("OK marked object and field to be filled in later (LinkedList): " + fields.get(fieldIndex) + " except for type-based linked lists");
						// only if this is a list of values, we can handle it here: e.g. #23 = IFCSITE('3rNg_N55v4CRBpQVbZJoHB', $, 'TU/e campus',
						//      'The High Tech campus of the Eindhoven University of Technology', $, $, $, $, .ELEMENT.,
						//      (24, 28, 0), (54, 25, 0), $, $, $);

						LinkedList<Object> list = (LinkedList<Object>) input.get(inputIndex);
						if(fields.get(fieldIndex).getType() == IfcComplexNumber.class) {
							//TODO
							// com.buildingsmart.tech.ifc.IfcMeasureResource.IfcComplexNumber - ARRAY [1:2] OF REAL
							System.out.println("WARNING: TODO IfcComplexNumber");
						}
						else if(fields.get(fieldIndex).getType() == IfcArcIndex.class) {
							//TODO
							// com.buildingsmart.tech.ifc.IfcMeasureResource.IfcArcIndex - LIST [3:3] OF IfcPositiveInteger
							System.out.println("WARNING: TODO IfcArcIndex");
						}
						else if(fields.get(fieldIndex).getType() == IfcLineIndex.class) {
							//TODO
							// com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLineIndex - LIST [2:?] OF IfcPositiveInteger
							System.out.println("WARNING: TODO IfcLineIndex");
						}
						else if(fields.get(fieldIndex).getType() == IfcPropertySetDefinitionSet.class) {
							//TODO
							// com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSet - SET [1:?] OF IfcPropertySetDefinition
							System.out.println("WARNING: TODO IfcPropertySetDefinition");
						}
						else if(fields.get(fieldIndex).getType() == IfcCompoundPlaneAngleMeasure.class){
							//handling IfcCompoundPlaneAngleMeasure case
							List<Object> cleanList = removeCommas(list);
							if(cleanList.size()==3){
								try
								{
									int degrees = Integer.parseInt((String) cleanList.get(0));
									int minutes = Integer.parseInt((String) cleanList.get(1));
									int seconds = Integer.parseInt((String) cleanList.get(2));

									IfcCompoundPlaneAngleMeasure cpam = new IfcCompoundPlaneAngleMeasure(degrees, minutes, seconds);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, cpam);
								}
								catch (NumberFormatException nfe)
								{
									System.out.println("ERROR : IfcCompoundPlaneAngleMeasure found with elements other than integers. Should be Integers.");
								}
							}
							else if(cleanList.size()==4){
								try
								{
									int degrees = Integer.parseInt((String) cleanList.get(0));
									int minutes = Integer.parseInt((String) cleanList.get(1));
									int seconds = Integer.parseInt((String) cleanList.get(2));
									int microseconds = Integer.parseInt((String) cleanList.get(3));

									IfcCompoundPlaneAngleMeasure cpam = new IfcCompoundPlaneAngleMeasure(degrees, minutes, seconds, microseconds);
									fields.get(fieldIndex).setAccessible(true);
									fields.get(fieldIndex).set(clsInstance, cpam);
								}
								catch (NumberFormatException nfe)
								{
									System.out.println("ERROR : IfcCompoundPlaneAngleMeasure found with elements other than integers. Should be Integers.");
								}
							}
							else {
								System.out.println("ERROR : IfcCompoundPlaneAngleMeasure found with wrong number of elements. Should be 3 or 4.");
							}
						}
						else{
							/*String s = fields.get(fieldIndex).getType().getName();
							if(IFC4_ADD2_types.containsKey(fields.get(fieldIndex).getType().getName())){
								System.out.println("out");
							}*/
							//regular class - record this - to be mapped afterwards
							new ToBeMappedList(clsInstance,fields.get(fieldIndex),list);
							System.out.println("OK marked object and field to be filled in later (LinkedList): " + fields.get(fieldIndex));
						}
					}
					else {
						System.out.println("not sure what this field is: " + fields.get(fieldIndex));
					}

					inputIndex++;
				}
			} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
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

	private String getOriginalFullTypeName(String shortName){
		Iterator iter = IFC4_ADD2_types.keySet().iterator();
		String originalTypeName = "";
		while (iter.hasNext()){
			String s = (String)iter.next();
			if(s.endsWith(shortName)){
				return s;
			}
		}
		System.out.println("ERROR: typename not found while it should be");
		return null;
	}

	private void linkObjects(){
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("LINKING OBJECTS");
		System.out.println("---------------------------------");
		System.out.println("");
		for(ToBeMappedObject obj : ToBeMappedObject.listOfObjects){
			try {
				//Fill forward object value
				System.out.println(obj.getClsInstance());
				Object source = obj.getClsInstance();
				Field forwardField = obj.getField();
				Object target = objectmap.get(obj.getIfcvo().getLineNum());
				forwardField.setAccessible(true);
				forwardField.set(obj.getClsInstance(),target);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		for(ToBeMappedList list : ToBeMappedList.listOfObjects){
			try {
				Object clsInstance = list.getClsInstance();
				System.out.println(clsInstance);
				Field f = list.getField();
				LinkedList<Object> theList = list.getLinkedlist();

				if(f.getType() == List.class){
					List x = new ArrayList();
					for (int inputIndex = 0; inputIndex<theList.size();inputIndex++) {
						Object v = theList.get(inputIndex);
						if (v instanceof Character) {
							//must be comma
						}
						else if (v instanceof String) {
							Type type = f.getGenericType();
							String originalType = returnOriginalType((String) v);
							if(originalType!="" && theList.get(inputIndex+1)!=null && theList.get(inputIndex+1) instanceof LinkedList){

								LinkedList theLinkedList = (LinkedList) theList.get(inputIndex+1);
								if(theLinkedList.get(0) instanceof String) {
									String value = (String) theLinkedList.get(0);

									Iterator iter = IFC4_ADD2_types.keySet().iterator();
									String originalTypeName = "";
									while (iter.hasNext()) {
										String s = (String) iter.next();
										if (s.endsWith(originalType)) {
											originalTypeName = s;
											break;
										}
									}
									if (originalTypeName == "")
										System.out.println("ERROR: typename not found while it should be");

									Class<?> referencedType = Class.forName(originalTypeName);
									Object typeclsInstance = referencedType.getDeclaredConstructor().newInstance();
									Field valField = typeclsInstance.getClass().getDeclaredField("value");
									Type valType = valField.getType();
									valField.setAccessible(true);
									if (valType.equals(String.class)) {
										if (value.startsWith("'"))
											value = value.substring(1);
										if (value != "")
											valField.set(typeclsInstance, value);
									} else if (valType.equals(Integer.class))
										valField.set(typeclsInstance, Integer.parseInt(value));
									else if (valType.equals(Double.class))
										valField.set(typeclsInstance, Double.parseDouble(value));
									else if (valType.equals(Array.class)) {
										//TODO probably a Byte[] array
										System.out.println("WARNING: TODO Byte Array");
									} else if (valType.equals(Boolean.class))
										valField.set(typeclsInstance, Boolean.parseBoolean(value));
									else {
										System.out.println("ERROR: found unknown data type : " + valType.getTypeName());
									}

									x.add(typeclsInstance);
									inputIndex++;
								}
								else if(theLinkedList.get(0) instanceof LinkedList){
									//ArcIndex of LineIndex
									LinkedList innerList = (LinkedList)theLinkedList.get(0);
									List<Object> theRealInnerList = removeCommas((List<Object>) innerList);

									//matching expected type with provided type - very special case.
									if(type instanceof ParameterizedType) {
										ParameterizedType pt = (ParameterizedType) type;
										for (Type innertype : pt.getActualTypeArguments()) {
											Class<?> typecls = Class.forName(innertype.getTypeName());
											Iterator iter = IFC4_ADD2_types.keySet().iterator();
											String originalTypeName = "";
											while (iter.hasNext()) {
												String s = (String) iter.next();
												if (s.endsWith(originalType)) {
													originalTypeName = s;
													break;
												}
											}
											Class<?> declaredClass = Class.forName(originalTypeName);

											if (typecls.isAssignableFrom(declaredClass)) {
												//LineIndex and ArcIndex
												Object typeclsInstance = declaredClass.getDeclaredConstructor().newInstance();
												Field innerField = declaredClass.getDeclaredField("value");
												Type valType = innerField.getType();
												innerField.setAccessible(true);
												if(valType == List.class){
													//List of IfcPositiveInteger
													Type innerTypeList = innerField.getGenericType();
													if(innerTypeList instanceof ParameterizedType) {
														Type innerType = ((ParameterizedType) innerTypeList).getActualTypeArguments()[0];
														Class<?> innerTypeClass = Class.forName(innerType.getTypeName());
														List<Object> listValue = new ArrayList<Object>();
														for(Object o : theRealInnerList){
															if(o instanceof String){
																String value = (String)o;
																//expected input data type is correct
																Object typeclsInnerInstance = innerTypeClass.getDeclaredConstructor().newInstance();
																Field innerinnerField;
																if(innerTypeClass.getFields().length == 0)
																	innerinnerField = typeclsInnerInstance.getClass().getSuperclass().getDeclaredField("value");
																else
																	innerinnerField = typeclsInnerInstance.getClass().getDeclaredField("value");

																Type innerValType = innerinnerField.getType(); //should be Double
																innerinnerField.setAccessible(true);
																if (innerValType.equals(String.class)) {
																	if (value.startsWith("'"))
																		value = value.substring(1);
																	if (value != "")
																		innerinnerField.set(typeclsInnerInstance, value);
																}
																else if (innerValType.equals(Integer.class))
																	innerinnerField.set(typeclsInnerInstance, Integer.parseInt(value));
																else if (innerValType.equals(Double.class))
																	innerinnerField.set(typeclsInnerInstance, Double.parseDouble(value));
																else if (innerValType.equals(Array.class)) {
																	//TODO probably a Byte[] array
																	System.out.println("WARNING: TODO Byte Array");
																}
																else if (innerValType.equals(Boolean.class))
																	innerinnerField.set(typeclsInnerInstance, Boolean.parseBoolean(value));
																else {
																	System.out.println("ERROR: found unknown data type : " + innerValType.getTypeName());
																}
																listValue.add(typeclsInnerInstance);
															}
														}
														innerField.set(typeclsInstance,listValue);
													}

												}
												x.add(typeclsInstance);
												inputIndex++;
											}
										}
									}

								}
								else{
									System.out.println("WARNING: unhandled type");
								}
							}
							else if(type instanceof ParameterizedType) {
								ParameterizedType pt = (ParameterizedType) type;
								for (Type t : pt.getActualTypeArguments()) {
									//System.out.println("    " + t);
									String className = t.getTypeName();
									if (t.equals(String.class)) {
										if(v.toString().startsWith("'"))
											v = v.toString().substring(1);
										x.add(v);
									}
									else if (t.equals(Double.class))
										x.add(Double.parseDouble(v.toString()));
									else if(IFC4_ADD2_types.containsKey(className)){
										Class<?> typecls = Class.forName(t.getTypeName());
										Object typeclsInstance = typecls.getDeclaredConstructor().newInstance();
										Field valField = typecls.getDeclaredField("value");
										Type valType = valField.getType();
										valField.setAccessible(true);
										if(valType.equals(String.class)) {
											if(typecls.getDeclaredField("bytes") != null){
												//this is the IfcBinary special case
												Field bytesField = typecls.getDeclaredField("value");
												Type bytesType = bytesField.getType();
												bytesField.setAccessible(true);
												if(bytesType == Byte[].class){
													String value = (String) v;
													if(value.startsWith("\""))
														value = value.replaceAll("\"", "");
													if(value.startsWith("0"))
														value = value.substring(1);
													Byte[] vConv = hexStringToByteArray((String)value);
													bytesField.set(typeclsInstance,vConv);
												}

												valField.set(typeclsInstance, ((String)v).replaceAll("\"", ""));
											}
											else{
												//The regular case
												valField.set(typeclsInstance, v);
											}
										}
										else if(valType.equals(Integer.class))
											valField.set(typeclsInstance,Integer.parseInt((String) v));
										else if(valType.equals(Double.class))
											valField.set(typeclsInstance,Double.parseDouble((String) v));
										else if(valType.equals(Boolean.class))
											valField.set(typeclsInstance,Boolean.parseBoolean((String) v));
										else{
											System.out.println("WARNING: unhandled type");
										}

										x.add(typeclsInstance);
									}
									else{
										System.out.println("WARNING: not handled : " + className + " - " + v);
									}
								}
							}
							else {
								System.out.println("WARNING: skipping String to linkedlist: " + f);
							}
						}
						else if (v instanceof IFCVO) {
							Object ifcObject2 = objectmap.get(((IFCVO) v).getLineNum());
							x.add(ifcObject2);
						}
						else if (v instanceof LinkedList) {
							List<Object> theRealList = removeCommas((List<Object>) v);
							if(theRealList.get(0).getClass().equals(String.class)){
								List innerList = new ArrayList();
								Type type = f.getGenericType();
								if(type instanceof ParameterizedType) {
									ParameterizedType pt = (ParameterizedType) type;
									for (Type innertype : pt.getActualTypeArguments()) {
										Class<?> typecls = Class.forName(innertype.getTypeName());
										if(typecls.equals(IfcCartesianPoint.class)){
											IfcCartesianPoint value = new IfcCartesianPoint();
											for(int inputInputIndex = 0; inputInputIndex<theRealList.size();inputInputIndex++) {
												Double doubleValue = Double.parseDouble(theRealList.get(inputInputIndex).toString());
												IfcLengthMeasure ifcl = new IfcLengthMeasure(doubleValue);
												value.getCoordinates().add(ifcl);
											}
											x.add(value);
										}
										else if(typecls.equals(IfcParameterValueList.class)){
											IfcParameterValueList value = new IfcParameterValueList();
											for(int inputInputIndex = 0; inputInputIndex<theRealList.size();inputInputIndex++) {
												Double doubleValue = Double.parseDouble(theRealList.get(inputInputIndex).toString());
												IfcParameterValue ifcp = new IfcParameterValue(doubleValue);
												value.getParameterValues().add(ifcp);
											}
											x.add(value);
										}
										else if(typecls.equals(IfcPositiveIntegerList.class)){
											IfcPositiveIntegerList value = new IfcPositiveIntegerList();
											for(int inputInputIndex = 0; inputInputIndex<theRealList.size();inputInputIndex++){
												Integer integerValue = Integer.parseInt(theRealList.get(inputInputIndex).toString());
												IfcPositiveInteger ifcl = new IfcPositiveInteger(integerValue);
												value.getPositiveIntegers().add(ifcl);
											}
											x.add(value);
										}
									}
								}
								//x.add(innerList);
							}
							else if(theRealList.get(0).getClass().equals(IFCVO.class)) {
								List innerList = new ArrayList();
								for (int inputInputIndex = 0; inputInputIndex < theRealList.size(); inputInputIndex++) {
									/*else if(v1 instanceof IFCVO){*/
									Object ifcObject2 = objectmap.get(((IFCVO) theRealList.get(inputInputIndex)).getLineNum());
									innerList.add(ifcObject2);
									/*}*/
								}
								x.add(innerList);
							}

							System.out.println("OK!: Declared LIST to LIST: " + f);
						}
						else {
							System.out.println("WARNING: Panic and run");
						}
						inputIndex++;
					}
					f.setAccessible(true);
					f.set(clsInstance, x);
					System.out.println("OK declared LIST to field: " + f);
				}
				else if(f.getType() == Set.class){
					Set x = new HashSet();
					for (int inputIndex = 0; inputIndex<theList.size();inputIndex++) {
						Object v = theList.get(inputIndex);
						if (v instanceof Character) {
							//must be comma
						} else if (v instanceof String) {
							Type type = f.getGenericType();
							String originalType = returnOriginalType((String) v);
							if(originalType!="" && theList.get(inputIndex+1)!=null && theList.get(inputIndex+1) instanceof LinkedList){
								LinkedList theLinkedList = (LinkedList) theList.get(inputIndex+1);
								String value = (String)theLinkedList.get(0);

								Iterator iter = IFC4_ADD2_types.keySet().iterator();
								String originalTypeName = "";
								while (iter.hasNext()){
									String s = (String)iter.next();
									if(s.endsWith(originalType)){
										originalTypeName = s;
										break;
									}
								}
								if(originalTypeName == "")
									System.out.println("ERROR: typename not found while it should be");

								Class<?> referencedType = Class.forName(originalTypeName);
								Object typeclsInstance = referencedType.getDeclaredConstructor().newInstance();
								Field valField = typeclsInstance.getClass().getDeclaredField("value");
								Type valType = valField.getType();
								valField.setAccessible(true);
								if(valType.equals(String.class)){
									if(value.startsWith("'"))
										value = value.substring(1);
									if(value!="")
										valField.set(typeclsInstance,value);
								}
								else if(valType.equals(Integer.class))
									valField.set(typeclsInstance,Integer.parseInt(value));
								else if(valType.equals(Double.class))
									valField.set(typeclsInstance,Double.parseDouble(value));
								else if(valType.equals(Array.class)) {
									//TODO probably a Byte[] array
									System.out.println("WARNING: TODO Byte Array");
								}
								else if(valType.equals(Boolean.class))
									valField.set(typeclsInstance,Boolean.parseBoolean(value));
								else{
									System.out.println("ERROR: found unknown data type : " + valType.getTypeName());
								}

								x.add(typeclsInstance);

								inputIndex++;
							}
							else {
								if(type instanceof ParameterizedType) {
									ParameterizedType pt = (ParameterizedType) type;
									for (Type t : pt.getActualTypeArguments()) {
										String className = t.getTypeName();
										if (t.equals(String.class)) {
											if (v.toString().startsWith("'"))
												v = v.toString().substring(1);
											x.add(v);
										} else if (t.equals(Double.class))
											x.add(Double.parseDouble(v.toString()));
										else if (IFC4_ADD2_types.containsKey(className)) {
											Class<?> typecls = Class.forName(t.getTypeName());
											Object typeclsInstance = typecls.getDeclaredConstructor().newInstance();
											Field valField = typecls.getDeclaredField("value");
											Type valType = valField.getType();
											valField.setAccessible(true);
											if (valType.equals(String.class))
												valField.set(typeclsInstance, v);
											else if (valType.equals(Integer.class))
												valField.set(typeclsInstance, Integer.parseInt((String) v));
											else if (valType.equals(Double.class))
												valField.set(typeclsInstance, Double.parseDouble((String) v));
											else if (valType.equals(Array.class)) {
												//TODO probably a Byte[] array
												System.out.println("WARNING: TODO Byte[] array ");
											} else if (valType.equals(Boolean.class))
												valField.set(typeclsInstance, Boolean.parseBoolean((String) v));

											x.add(typeclsInstance);
										} else {
											System.out.println("WARNING: not handled : " + className + " - " + v);
										}
									}
								}
								else {
									System.out.println("WARNING: Not really handled in detail");
									x.add(v);
								}
							}
						} else if (v instanceof IFCVO) {
							Object ifcObject2 = objectmap.get(((IFCVO) v).getLineNum());
							x.add(ifcObject2);
						} else if (v instanceof LinkedList) {
							System.out.println("WARNING: skipping SET to linkedlist - to Check 1");
						} else {
							System.out.println("WARNING: Panic and run");
						}
					}
					f.setAccessible(true);
					f.set(clsInstance, x);
					System.out.println("OK declared SET to field: " + clsInstance.toString() + " - " + f.getName() + " - " + x);
				}
				else if(f.getType().isArray()){
					//This is a major exception. This could either be an ARRAY of Real or an ARRAY of IfcLengthMeasure
					//#481= IFCMATERIALPROFILEWITHOFFSETS('Body',$,#441,#440,$,$,(0.,0.));
					// TYPE IfcComplexNumber = ARRAY [1:2] OF REAL;
					// END_TYPE;
					//
					//ENTITY IfcMaterialLayerWithOffsets
					// SUBTYPE OF (IfcMaterialLayer);
					//	OffsetDirection : IfcLayerSetDirectionEnum;
					//	OffsetValues : ARRAY [1:2] OF IfcLengthMeasure;
					//END_ENTITY;

					List x = new ArrayList();
					Type type = f.getType().getComponentType();
					String className = type.getTypeName();
					Class<?> typecls = Class.forName(className);
					for (Object v : theList) {
						if (v instanceof Character) {
							//must be comma
						} else if (v instanceof String) {
							//System.out.println("    " + t);
							if(IFC4_ADD2_types.containsKey(className)) {
								Object typeclsInstance = typecls.getDeclaredConstructor().newInstance();
								Field valField = typecls.getDeclaredField("value");
								Type valType = valField.getType();
								valField.setAccessible(true);
								if (valType.equals(String.class))
									valField.set(typeclsInstance, v);
								else if (valType.equals(Integer.class))
									valField.set(typeclsInstance, Integer.parseInt((String) v));
								else if (valType.equals(Double.class))
									valField.set(typeclsInstance, Double.parseDouble((String) v));
								else if (valType.equals(Array.class)) {
									//TODO probably a Byte[] array
								} else if (valType.equals(Boolean.TYPE))
									valField.set(typeclsInstance, Boolean.parseBoolean((String) v));

								x.add(typeclsInstance);
							}
							else {
								System.out.println("WARNING: not handled : " + className + " - " + v);
							}
						} else {
							System.out.println("WARNING: Encountered unknown data type : " + v);
						}
					}

					Object o = Array.newInstance(typecls, x.size());
					for (int i = 0; i < x.size(); i++) {
						Array.set(o, i, x.get(i));
					}

					f.setAccessible(true);
					f.set(clsInstance, o); //toArray(new String[list.size()]);

					System.out.println("OK declared ARRAY to field: " + clsInstance.toString() + " - " + f.getName() + " - " + x);
				}
				else {
					System.out.println("WARNING: This should be unreachable code ");
				}
			} catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InstantiationException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	private static Byte[] hexStringToByteArray(String s) {
		int len = s.length();
		Byte[] data = new Byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
					+ Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}

	private void computeInverses(){
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("COMPUTING INVERSES");
		System.out.println("---------------------------------");
		System.out.println("");
		for(ToBeMappedObject obj : ToBeMappedObject.listOfObjects){
			try {
				System.out.println(obj.getClsInstance());
				Object source = obj.getClsInstance();
				Field forwardField = obj.getField();
				Object target = objectmap.get(obj.getIfcvo().getLineNum());

				//Fill inverses
				List<Field> fields = getInheritedPrivateFieldsWithInverseAnnotation(target.getClass());
				for (int i = 0; i < fields.size(); i++) {
					Field inverseField = fields.get(i);
					Annotation[] annotations = inverseField.getAnnotations();
					for (Annotation annotation : annotations) {
						if (annotation instanceof InverseProperty) {
							//Make sure to only continue with fields that have an inverse annotation, because only those may be set
							InverseProperty myAnnotation = (InverseProperty) annotation;
							//Find the range of objects that may refer to the object being filled (range)
							String inverseProp = myAnnotation.InverseProp(); //e.g. relatingObject
							String range = myAnnotation.Range(); //e.g. IfcRelAggregates

							if (source.getClass().getName().endsWith(range) && forwardField.getName().equalsIgnoreCase(inverseProp)) {
								inverseField.setAccessible(true);
								//Object x = inverseField.get(target);
								if (inverseField.getType() == Set.class) {
									Set mySet = (Set) inverseField.get(target);
									if (mySet == null) {
										mySet = new HashSet();
										inverseField.set(target, mySet);
									}
									mySet.add(source);
									System.out.println("OK: declared SET with " + source + " to field: " + inverseField);
								}
								else if (inverseField.getType() == List.class) {
									List myList = (List) inverseField.get(target);
									if (myList == null) {
										myList = new ArrayList();
										inverseField.set(target, myList);
									}
									myList.add(source);
									System.out.println("OK: declared LIST with " + source + " to field: " + inverseField);
								}
								else if(inverseField.getType() == source.getClass()) {
									inverseField.set(target, source);
									System.out.println("OK: declared IfcObject " + source + " to field: " + inverseField);
								}
								else {
									System.out.println("WARNING: This should be unreachable code : " + fields.get(i));
								}
							}
							break;
						}
					}
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		for(ToBeMappedList list : ToBeMappedList.listOfObjects){
			//Get data
			Object source = list.getClsInstance();
			Field forwardField = list.getField();
			LinkedList<Object> targetList = list.getLinkedlist();

			for(Object obj : targetList){
				if(obj.getClass().equals(IFCVO.class)){
					Object target = objectmap.get(((IFCVO)obj).getLineNum());
					//Fill inverses
					List<Field> fields = getInheritedPrivateFieldsWithInverseAnnotation(target.getClass());
					for (int i = 0; i < fields.size(); i++) {
						Field inverseField = fields.get(i);
						Annotation[] annotations = inverseField.getAnnotations();
						boolean yes = false;
						for (Annotation annotation : annotations) {
							if (annotation instanceof InverseProperty) {
								//Make sure to only continue with fields that have an inverse annotation, because only those may be set
								InverseProperty myAnnotation = (InverseProperty) annotation;
								//Find the range of objects that may refer to the object being filled (range)
								String inverseProp = myAnnotation.InverseProp(); //e.g. relatedObjects
								String range = myAnnotation.Range(); //e.g. IfcRelAggregates

								Class theClass = source.getClass();
								if(source.getClass().getName().endsWith(range) && forwardField.getName().equalsIgnoreCase(inverseProp)){
									yes = true;
									theClass = source.getClass();
								}
								if(!yes) {
									List<Class> superclasses = getSuperclasses(source.getClass());
									for (Class c : superclasses) {
										if (c.getName().endsWith(range) && forwardField.getName().equalsIgnoreCase(inverseProp)) {
											yes = true;
											theClass = c;
											break;
										}
									}
								}

								try {
									if (yes == true) {
										inverseField.setAccessible(true);
										//Object x = inverseField.get(target);
										if (inverseField.getType() == Set.class) {
											Set mySet = null;
											mySet = (Set) inverseField.get(target);
											if (mySet == null) {
												mySet = new HashSet();
												inverseField.set(target, mySet);
											}
											mySet.add(source);
											System.out.println("OK: declared SET with " + source + " to field: " + inverseField);
										}
										else if (inverseField.getType() == List.class) {
											List myList = (List) inverseField.get(target);
											if (myList == null) {
												myList = new ArrayList();
												inverseField.set(target, myList);
											}
											myList.add(source);
											System.out.println("OK: declared LIST with " + source + " to field: " + inverseField);
										}
										else if(inverseField.getType() == theClass) {
											inverseField.set(target, source);
											System.out.println("OK: declared IfcObject " + source + " to field: " + inverseField);
										}
										else {
											System.out.println("WARNING: This should be unreachable code : " + fields.get(i));
										}
									}
								} catch (IllegalAccessException e) {
									e.printStackTrace();
								}

								break;
							}
						}
						if(yes) {
							//found the inverse field
							break;
						}
					}
				}
				else if (obj.getClass().equals(List.class)){
					System.out.println("ERROR: unhandled List of List");
				}
			}
		}
	}

	private List<Class> getSuperclasses(Class cl){
		List<Class> supers = new ArrayList<>();
		Class superc = cl.getSuperclass();
		if(superc!=null){
			supers.add(superc);
			supers.addAll(getSuperclasses(superc));
		}
		return supers;
	}

	private void parseModelFromXML() {
		try {
			String fp = filePath;
			InputStream inputStream = new FileInputStream(fp+".xml");
		
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
						s.setName(new IfcLabel("testName"));
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

	private enum wrappedTypes{IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure}

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
		IfcParameterValue, IfcPlanarForceMeasure, IfcPlaneAngleMeasure, IfcPositiveRatioMeasure, IfcPowerMeasure, IfcPressureMeasure, IfcRadioActivityMeasure,
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
	private enum listTypes{IfcLineIndex, IfcArcIndex}

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
		for (wrappedTypes c : wrappedTypes.values()) {
			if (c.name().equalsIgnoreCase(type)) {
				return c.name();
			}
		}
		for (listTypes c : listTypes.values()) {
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

	private Object getWrapperObject(String input, String originalType){
		if(originalType.equalsIgnoreCase("IfcNormalisedRatioMeasure")){
			return new IfcNormalisedRatioMeasure(Double.parseDouble(input));
			/*o.setType(originalType);*/
			/* o;*/
		}
		else if(originalType.equalsIgnoreCase("IfcPositiveLengthMeasure")){
			return new IfcPositiveLengthMeasure(Double.parseDouble(input));
		}
		return null;
	}
}
