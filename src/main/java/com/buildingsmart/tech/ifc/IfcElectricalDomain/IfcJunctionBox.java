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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting;

@Guid("15740639-43f5-4ce5-88d8-fe78d6a98f3c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcJunctionBox extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@Guid("8b9b6ddd-65f0-4293-b930-a9a80d0d7606")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcJunctionBoxTypeEnum predefinedType;


	public IfcJunctionBox()
	{
	}

	public IfcJunctionBox(String globalId)
	{
		super(globalId);
	}

	public IfcJunctionBoxTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcJunctionBoxTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

