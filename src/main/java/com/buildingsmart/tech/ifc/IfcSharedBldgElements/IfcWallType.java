// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWallTypeEnum;

@Guid("598d0f96-6b0f-45f5-90f4-96758e77d64f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWallType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a wall element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a6dd8a76-1f8b-47b3-b75c-ec1a762f6758")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

