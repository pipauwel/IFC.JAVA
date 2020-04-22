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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCompressor;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFan;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPump;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("a2b0c2d2-b084-44b1-9760-b5524ad39005")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCompressor.class, name = "IfcCompressor"), @JsonSubTypes.Type(value = IfcFan.class, name = "IfcFan"), @JsonSubTypes.Type(value = IfcPump.class, name = "IfcPump")})
public class IfcFlowMovingDevice extends IfcDistributionFlowElement
{

	public IfcFlowMovingDevice()
	{
	}

	public IfcFlowMovingDevice(String globalId)
	{
		super(globalId);
	}


}

