package com.buildingsmart.tech.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.buildingsmart.tech.ifc.IfcKernel.IfcProject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSite;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class IfcParser {

	// ATTRIBUTES	
	private static IfcProject proj;

	// CONSTRUCTOR
	public IfcParser(String ifcFilePath) {
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
	public static void main(String[] args) {
		
		String fp = "C:\\Users\\pipauwel\\Desktop\\resources\\files\\serialized_randomhouse";

		IfcParser parser = new IfcParser(args[0]);

		parser.parseModelFromXML(args[0]);
		parser.writeModelToXML(fp+".xml");
		parser.writeModelToJSON(fp+".json");

		String fp1 = "C:\\Users\\pipauwel\\Desktop\\resources\\files\\serialized_randomhouse_second";
		proj = null;
		parser.parseModelFromXML(fp+".xml");
		parser.writeModelToXML(fp1+".xml");
	}

	// ACCESSORS
}
