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

@Guid("f177bcf7-bde4-4b21-b501-2c688045a9fb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRampType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a ramp element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8d438bbb-1379-4603-8e27-5b8882fd46fc")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRampTypeEnum predefinedType;


	public IfcRampType()
	{
	}

	public IfcRampType(String globalId, IfcRampTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcRampTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRampTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

