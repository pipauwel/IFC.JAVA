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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerTypeEnum;

@Guid("b7c407fd-4201-4501-a40d-db22371e0cd8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHeatExchangerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the basic types of heat exchanger (e.g., plate, shell and tube, etc.).")
	@Required()
	@Guid("d9f9c23d-4ba6-4171-867c-a1831a73633f")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcHeatExchangerTypeEnum predefinedType;


	public IfcHeatExchangerType()
	{
	}

	public IfcHeatExchangerType(String globalId, IfcHeatExchangerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcHeatExchangerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcHeatExchangerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

