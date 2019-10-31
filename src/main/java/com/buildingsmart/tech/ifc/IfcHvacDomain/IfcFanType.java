// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFanTypeEnum;

@Guid("13691192-2383-4c23-ab6a-c8a9a2b8c1ba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFanType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType
{
	@Description("Defines the type of fan typically used in building services.")
	@Required()
	@Guid("a35b99d4-7d3d-4273-92a5-5812abe54400")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFanTypeEnum predefinedType;


	public IfcFanType()
	{
	}

	public IfcFanType(String globalId, IfcFanTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFanTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFanTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

