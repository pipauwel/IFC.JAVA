// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4393710f-f1af-4927-8800-2e6b98edef41")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeographicElement extends IfcElement
{
	@Description("Predefined generic types for a geographic element that are specified in an enumeration. There might be property sets defined specifically for each predefined type.")
	@DataMember(Order = 0)
	@Guid("5a1c5b8d-f2f7-464f-9a4b-7c580a022a18")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
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

