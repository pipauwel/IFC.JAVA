// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCompressorType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFanType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPumpType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElementType;

@Guid("d8da8935-bba2-4350-aa6e-80c238da573c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCompressorType.class, name = "IfcCompressorType"), @JsonSubTypes.Type(value = IfcFanType.class, name = "IfcFanType"), @JsonSubTypes.Type(value = IfcPumpType.class, name = "IfcPumpType")})
public abstract class IfcFlowMovingDeviceType extends IfcDistributionFlowElementType
{

	public IfcFlowMovingDeviceType()
	{
	}

	public IfcFlowMovingDeviceType(String globalId)
	{
		super(globalId);
	}


}

