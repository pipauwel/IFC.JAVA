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

@Guid("91a67370-1792-470c-855a-3bb193e960ea")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryEquipment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("d539b3ab-a9b3-46f5-8d41-4a5a38a2bc2a")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcUnitaryEquipmentTypeEnum predefinedType;


	public IfcUnitaryEquipment()
	{
	}

	public IfcUnitaryEquipment(String globalId)
	{
		super(globalId);
	}

	public IfcUnitaryEquipmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryEquipmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

