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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice;

@Guid("00254f70-e0ef-4d79-91de-eade9f1c10c5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvaporativeCooler extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@Guid("5235d6fd-e834-4f07-bc90-c52223140472")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcEvaporativeCoolerTypeEnum predefinedType;


	public IfcEvaporativeCooler()
	{
	}

	public IfcEvaporativeCooler(String globalId)
	{
		super(globalId);
	}

	public IfcEvaporativeCoolerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcEvaporativeCoolerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

