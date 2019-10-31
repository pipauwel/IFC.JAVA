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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHumidifierTypeEnum;

@Guid("f1983b1d-26af-43f3-ba7a-06e90feb52c8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHumidifierType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of humidifier.")
	@Required()
	@Guid("db14e4f6-f176-4771-81a6-cda2bc555751")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcHumidifierTypeEnum predefinedType;


	public IfcHumidifierType()
	{
	}

	public IfcHumidifierType(String globalId, IfcHumidifierTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcHumidifierTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcHumidifierTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

