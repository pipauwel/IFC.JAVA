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

@Guid("c3b0db60-6c85-4fba-9efe-5d2a04a9e3d3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirToAirHeatRecovery extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@Guid("8bf12e55-5171-4fd6-be19-5780bdb84f49")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAirToAirHeatRecoveryTypeEnum predefinedType;


	public IfcAirToAirHeatRecovery()
	{
	}

	public IfcAirToAirHeatRecovery(String globalId)
	{
		super(globalId);
	}

	public IfcAirToAirHeatRecoveryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirToAirHeatRecoveryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

