// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

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
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElement;

@Guid("c337853a-d06e-4127-b850-0e1835ef32e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSystemFurnitureElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElement
{
	@DataMember(Order = 0)
	@Guid("1b552577-dee4-43c6-b8fb-6b786e6729fc")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSystemFurnitureElementTypeEnum predefinedType;


	public IfcSystemFurnitureElement()
	{
	}

	public IfcSystemFurnitureElement(String globalId)
	{
		super(globalId);
	}

	public IfcSystemFurnitureElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSystemFurnitureElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

