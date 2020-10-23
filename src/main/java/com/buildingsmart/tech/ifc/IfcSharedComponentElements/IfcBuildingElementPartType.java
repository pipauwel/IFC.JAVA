// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f248ebd3-afb8-4ffe-9a34-195555c0b22b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingElementPartType extends IfcElementComponentType
{
	@Description("Subtype of building element part")
	@DataMember(Order = 0)
	@Required()
	@Guid("7f3f97cc-02d4-4243-a8b4-48f9f4d87ec0")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBuildingElementPartTypeEnum predefinedType;


	public IfcBuildingElementPartType()
	{
	}

	public IfcBuildingElementPartType(String globalId, IfcBuildingElementPartTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcBuildingElementPartTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBuildingElementPartTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

