// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("73f7c69a-738b-407d-8e68-505ddadbfb41")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFurniture extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElement
{
	@DataMember(Order = 0)
	@Guid("ffe18e42-a9d5-4e8f-984d-86632f76b530")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFurnitureTypeEnum predefinedType;


	public IfcFurniture()
	{
	}

	public IfcFurniture(String globalId)
	{
		super(globalId);
	}

	public IfcFurnitureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFurnitureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

