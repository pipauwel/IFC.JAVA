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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirToAirHeatRecoveryTypeEnum;

@Guid("85f459a0-3831-4b34-b397-56bb368682cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirToAirHeatRecoveryType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of air to air heat recovery device.")
	@Required()
	@Guid("c4ddd349-e565-4ef2-94a5-74133269b028")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAirToAirHeatRecoveryTypeEnum predefinedType;


	public IfcAirToAirHeatRecoveryType()
	{
	}

	public IfcAirToAirHeatRecoveryType(String globalId, IfcAirToAirHeatRecoveryTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAirToAirHeatRecoveryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirToAirHeatRecoveryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

