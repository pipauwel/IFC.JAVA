// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcFurnitureType;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcSystemFurnitureElementType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("e90e5d98-6bfd-4367-a672-781c00f9651b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
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

