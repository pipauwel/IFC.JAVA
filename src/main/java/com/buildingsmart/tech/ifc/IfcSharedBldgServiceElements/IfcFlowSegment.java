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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierSegment;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableSegment;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSegment;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeSegment;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("249d6324-b4ec-4cbf-b5d3-601cf1306621")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCableCarrierSegment.class, name = "IfcCableCarrierSegment"), @JsonSubTypes.Type(value = IfcCableSegment.class, name = "IfcCableSegment"), @JsonSubTypes.Type(value = IfcDuctSegment.class, name = "IfcDuctSegment"), @JsonSubTypes.Type(value = IfcPipeSegment.class, name = "IfcPipeSegment")})
public class IfcFlowSegment extends IfcDistributionFlowElement
{

	public IfcFlowSegment()
	{
	}

	public IfcFlowSegment(String globalId)
	{
		super(globalId);
	}


}

