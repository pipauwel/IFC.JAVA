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

@Guid("668a688f-c24c-4c94-8950-a3a03b3a8bfc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurtainWallType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a curtain wall element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("db5825ed-e082-45c7-b97b-65c1a5dc462e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCurtainWallTypeEnum predefinedType;


	public IfcCurtainWallType()
	{
	}

	public IfcCurtainWallType(String globalId, IfcCurtainWallTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCurtainWallTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCurtainWallTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

