// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcBuildingElementPartTypeEnum;

@Guid("f248ebd3-afb8-4ffe-9a34-195555c0b22b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingElementPartType extends IfcElementComponentType
{
	@Description("Subtype of building element part")
	@DataMember(Order = 0)
	@Required()
	@Guid("7f3f97cc-02d4-4243-a8b4-48f9f4d87ec0")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

