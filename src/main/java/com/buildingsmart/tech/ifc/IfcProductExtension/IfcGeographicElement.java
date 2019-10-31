// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("4393710f-f1af-4927-8800-2e6b98edef41")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeographicElement extends IfcElement
{
	@Description("Predefined generic types for a geographic element that are specified in an enumeration. There might be property sets defined specifically for each predefined type.")
	@Guid("5a1c5b8d-f2f7-464f-9a4b-7c580a022a18")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcGeographicElementTypeEnum predefinedType;


	public IfcGeographicElement()
	{
	}

	public IfcGeographicElement(String globalId)
	{
		super(globalId);
	}

	public IfcGeographicElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcGeographicElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

