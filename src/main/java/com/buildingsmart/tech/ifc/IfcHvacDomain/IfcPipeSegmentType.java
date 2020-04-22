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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeSegmentTypeEnum;

@Guid("6ff8bb62-5b12-4204-85f9-d8aea8bb8b00")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeSegmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType
{
	@Description("The type of pipe segment.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7cf082e3-2380-49ba-be0e-eae30275e85d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPipeSegmentTypeEnum predefinedType;


	public IfcPipeSegmentType()
	{
	}

	public IfcPipeSegmentType(String globalId, IfcPipeSegmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPipeSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

