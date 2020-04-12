package com.buildingsmart.tech.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import be.ugent.IfcSpfParser;
import be.ugent.IfcSpfReader;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSite;
import com.buildingsmart.tech.ifcowl.vo.IFCVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcParser {

	private static final int FLAG_DIR = 0;
	private static final int FLAG_KEEP_DUPLICATES = 1;

	private static final Logger LOG = LoggerFactory.getLogger(IfcSpfReader.class);

	private String inputFile = "";
	private String outputFile = "";
	private String filePath = "";
	private Boolean radical = true;

	private Map<Long, IFCVO> linemap = new HashMap<>();

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

		String inputFile = "C:\\Users\\20194060\\Desktop\\resources\\files\\7m900_tue_hello_wall_with_door.ifc";
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

		parser.parseModelFromSPF();

		/*parser.parseModelFromXML(args[0]);
		parser.writeModelToXML(fp+".xml");
		parser.writeModelToJSON(fp+".json");*/

		/*String fp1 = "C:\\Users\\pipauwel\\Desktop\\resources\\files\\serialized_randomhouse_second";
		proj = null;
		parser.parseModelFromXML(fp+".xml");
		parser.writeModelToXML(fp1+".xml");*/
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

			writeModelToJSON(filePath);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadToClassLibrary(){
		//First run to collect everything in memory
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO ifcLineEntry = entry.getValue();

			//Class<? extends IFCVO> aClass = ifcLineEntry.getClass();
			String name = ifcLineEntry.getName();
			System.out.println(name);

			String className = "com.buildingsmart.tech.ifc.IfcKernel.IfcProject";
			/*try {
				*//*Class<?> cls = Class.forName(className);
				Object clsInstance = (Object) cls.getDeclaredConstructor().newInstance();
				System.out.println(clsInstance);

				//Field[] fields = cls.getFields();
				List<Field> fields = getInheritedPrivateFields(cls);
				for (int i = 0; i < fields.size(); i++) {
					fields.get(i).set(clsInstance, ifcLineEntry.getObjectList().get(i));
					System.out.println("declared field: " + fields.get(i));
				}

				Annotation[] annotations = cls.getAnnotations();

				for(Annotation annotation : annotations){
					if(annotation instanceof MyAnnotation){
						MyAnnotation myAnnotation = (MyAnnotation) annotation;
						System.out.println("name: " + myAnnotation.name());
						System.out.println("value: " + myAnnotation.value());
					}
				}*//*


			} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
				LOG.error("ERROR in instantiating Class : " + className);
				e.printStackTrace();
			}*/

			/*//System.out.println("line number : " + ifcLineEntry.getLineNum());
			if(Element.containedInBEO(ifcLineEntry.getName().substring(3)) || Element.containedInMEP(ifcLineEntry.getName().substring(3)) ||
					Element.containedInIFC4_ADD2_TC1(ifcLineEntry.getName()) || Element.containedInIFC2x3_TC1(ifcLineEntry.getName())){
				Element el = new Element(ifcLineEntry);
				//LOG.info("Element: "+ el.toString());
				continue;
			}*/



		}



	}

	private List<Field> getInheritedPrivateFields(Class<?> type) {
		List<Field> result = new ArrayList<Field>();

		Class<?> i = type;
		while (i != null && i != Object.class) {
			Collections.addAll(result, i.getDeclaredFields());
			i = i.getSuperclass();
		}


		return result;
	}

	private void secondRunForMakingMatches(){

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
				Iterator<IfcRelAggregates> iter = proj.getIsDecomposedBy().iterator();
				while(iter.hasNext()){
					IfcRelAggregates ira = iter.next();
					if(ira.getRelatedObjects().size() == 0){
						System.out.println("did not find IfcSite");
						ira.getRelatedObjects().add(new IfcSite());
						IfcSite s = new IfcSite();
						s.setName("testName");
					}				
				}
	
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

	private void writeModelToXML(String fp) {
		try {
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

			File xmlOutput = new File(fp);
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
	
	private void writeModelToJSON(String fp) {
		try {
			ObjectMapper m = new ObjectMapper();
			m.configure(SerializationFeature.INDENT_OUTPUT, true);
			m.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			m.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

			String jsonString;
			jsonString = m.writeValueAsString(proj);

			File jsonOutput = new File(fp);
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




}
