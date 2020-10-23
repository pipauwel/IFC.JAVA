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

@Guid("a674ecb6-09b2-4165-9f92-d2ab912be8ed")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShadingDeviceType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a shading device element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2720f317-fb5d-4013-b767-c475b264dbd2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcShadingDeviceTypeEnum predefinedType;


	public IfcShadingDeviceType()
	{
	}

	public IfcShadingDeviceType(String globalId, IfcShadingDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcShadingDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcShadingDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

