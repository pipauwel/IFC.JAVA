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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierSegmentType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableSegmentType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSegmentType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeSegmentType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElementType;

@Guid("bba24c30-4562-4049-b08d-4c3ed6146531")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCableCarrierSegmentType.class, name = "IfcCableCarrierSegmentType"), @JsonSubTypes.Type(value = IfcCableSegmentType.class, name = "IfcCableSegmentType"), @JsonSubTypes.Type(value = IfcDuctSegmentType.class, name = "IfcDuctSegmentType"), @JsonSubTypes.Type(value = IfcPipeSegmentType.class, name = "IfcPipeSegmentType")})
public abstract class IfcFlowSegmentType extends IfcDistributionFlowElementType
{

	public IfcFlowSegmentType()
	{
	}

	public IfcFlowSegmentType(String globalId)
	{
		super(globalId);
	}


}

