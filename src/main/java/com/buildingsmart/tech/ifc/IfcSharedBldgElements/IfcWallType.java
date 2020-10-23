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

@Guid("598d0f96-6b0f-45f5-90f4-96758e77d64f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWallType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a wall element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a6dd8a76-1f8b-47b3-b75c-ec1a762f6758")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcWallTypeEnum predefinedType;


	public IfcWallType()
	{
	}

	public IfcWallType(String globalId, IfcWallTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcWallTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWallTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

