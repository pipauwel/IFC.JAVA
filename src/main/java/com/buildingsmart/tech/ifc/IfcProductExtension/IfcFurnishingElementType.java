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
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcFurnitureType;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcSystemFurnitureElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementType;

@Guid("e90e5d98-6bfd-4367-a672-781c00f9651b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFurnitureType.class, name = "IfcFurnitureType"), @JsonSubTypes.Type(value = IfcSystemFurnitureElementType.class, name = "IfcSystemFurnitureElementType")})
public class IfcFurnishingElementType extends IfcElementType
{

	public IfcFurnishingElementType()
	{
	}

	public IfcFurnishingElementType(String globalId)
	{
		super(globalId);
	}


}

