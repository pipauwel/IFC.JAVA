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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRoofTypeEnum;

@Guid("63d5034b-fa9c-4b85-bf43-9f24d48e41e5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoofType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a roof element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1e67307a-a7f0-418c-9478-1e90ab9d50c9")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcRoofTypeEnum predefinedType;


	public IfcRoofType()
	{
	}

	public IfcRoofType(String globalId, IfcRoofTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcRoofTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRoofTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

