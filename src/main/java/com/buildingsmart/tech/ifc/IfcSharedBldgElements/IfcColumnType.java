// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e99d4f9c-26f3-48bf-81bc-dcadc07e58a4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcColumnType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a column element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c77d6271-5b85-4588-ae59-002957e5d2c7")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcColumnTypeEnum predefinedType;


	public IfcColumnType()
	{
	}

	public IfcColumnType(String globalId, IfcColumnTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcColumnTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcColumnTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

