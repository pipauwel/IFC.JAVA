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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType;

@Guid("c8109093-505d-450a-871d-6a67de192b17")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSystemFurnitureElementType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElementType
{
	@DataMember(Order = 0)
	@Guid("c246be92-c357-473a-957f-6aefef35989b")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSystemFurnitureElementTypeEnum predefinedType;


	public IfcSystemFurnitureElementType()
	{
	}

	public IfcSystemFurnitureElementType(String globalId)
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

