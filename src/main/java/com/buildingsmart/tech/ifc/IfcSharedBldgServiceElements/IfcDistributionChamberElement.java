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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("0ed9ba24-3b80-425e-989f-171cef0fce7a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionChamberElement extends IfcDistributionFlowElement
{
	@Guid("a495b02a-3151-4111-88a8-f27d4e85c9bf")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDistributionChamberElementTypeEnum predefinedType;


	public IfcDistributionChamberElement()
	{
	}

	public IfcDistributionChamberElement(String globalId)
	{
		super(globalId);
	}

	public IfcDistributionChamberElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDistributionChamberElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

