package com.buildingsmart.tech.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import com.buildingsmart.tech.ifc.IfcKernel.IfcProject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class IfcParser {

	// ATTRIBUTES
	private InputStream inputStream;
	
	private IfcProject proj;

	// CONSTRUCTOR
	public IfcParser(String ifcFilePath) {
		try {
			inputStream = new FileInputStream(ifcFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void parseModelFromXML() {
		XmlMapper m = new XmlMapper();
		try {
			proj = m.readValue(inputStream, IfcProject.class);
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
	}

	private void writeModelToXML() {
		try {
			XmlMapper m = new XmlMapper();

			JacksonXmlModule xmlModule = new JacksonXmlModule();
			xmlModule.setDefaultUseWrapper(false);
			ObjectMapper objectMapper = new XmlMapper(xmlModule);
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

			String xmlString;
			xmlString = m.writeValueAsString(proj);

			File xmlOutput = new File("C:\\Users\\pipauwel\\Desktop\\files\\ifcxml\\serialized.xml");
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
			ObjectMapper m = new ObjectMapper();

			String jsonString;
			jsonString = m.writeValueAsString(proj);

			File jsonOutput = new File("C:\\Users\\pipauwel\\Desktop\\files\\ifcxml\\serialized.json");
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

		IfcParser parser = new IfcParser(args[0]);

		parser.parseModelFromXML();
		parser.writeModelToXML();
		parser.writeModelToJSON();
	}

	// ACCESSORS
}
