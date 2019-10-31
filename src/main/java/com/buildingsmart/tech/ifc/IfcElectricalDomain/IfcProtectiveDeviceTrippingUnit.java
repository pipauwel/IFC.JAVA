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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement;

@Guid("a8488154-175e-4eda-b9b6-157a9fa9cafe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceTrippingUnit extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@Guid("6801c27d-267c-44ff-a462-840addfa2cc5")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType;


	public IfcProtectiveDeviceTrippingUnit()
	{
	}

	public IfcProtectiveDeviceTrippingUnit(String globalId)
	{
		super(globalId);
	}

	public IfcProtectiveDeviceTrippingUnitTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

