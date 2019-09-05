// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c337853a-d06e-4127-b850-0e1835ef32e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSystemFurnitureElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFurnishingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("1b552577-dee4-43c6-b8fb-6b786e6729fc")
	private com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcSystemFurnitureElementTypeEnum predefinedType;


	public IfcSystemFurnitureElement()
	{
	}

	public IfcSystemFurnitureElement(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcSystemFurnitureElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcSystemFurnitureElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

