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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCoolingTowerTypeEnum;

@Guid("74a69c5e-478f-401b-86d1-69b8d18930e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCoolingTowerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the typical types of cooling towers (e.g., OpenTower, ClosedTower, CrossFlow, etc.).")
	@DataMember(Order = 0)
	@Required()
	@Guid("2357962a-5d20-4f79-8146-a8ff8b9b3810")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCoolingTowerTypeEnum predefinedType;


	public IfcCoolingTowerType()
	{
	}

	public IfcCoolingTowerType(String globalId, IfcCoolingTowerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCoolingTowerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCoolingTowerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

