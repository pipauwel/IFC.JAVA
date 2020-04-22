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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceTypeEnum;

@Guid("9033d16a-1bb0-406c-9981-e63ec50621cc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSolarDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@DataMember(Order = 0)
	@Required()
	@Guid("80cc3e27-6f15-4cca-b8f0-45f6c9290f75")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSolarDeviceTypeEnum predefinedType;


	public IfcSolarDeviceType()
	{
	}

	public IfcSolarDeviceType(String globalId, IfcSolarDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSolarDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSolarDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

