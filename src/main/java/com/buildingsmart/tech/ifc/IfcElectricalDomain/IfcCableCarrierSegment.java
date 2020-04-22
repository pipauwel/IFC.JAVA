// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment;

@Guid("cbe43c1f-9ddd-4279-bb40-699045a1e748")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierSegment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment
{
	@Description("<p>Identifies the predefined types of cable carrier segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("5801fc0e-a0ce-4891-b588-7510f5b9f78d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCableCarrierSegmentTypeEnum predefinedType;


	public IfcCableCarrierSegment()
	{
	}

	public IfcCableCarrierSegment(String globalId)
	{
		super(globalId);
	}

	public IfcCableCarrierSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

