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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRampTypeEnum;

@Guid("f177bcf7-bde4-4b21-b501-2c688045a9fb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRampType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a ramp element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8d438bbb-1379-4603-8e27-5b8882fd46fc")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

