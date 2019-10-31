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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnitTypeEnum;

@Guid("be726344-2f10-4ab4-a207-182e7e7b5334")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceTrippingUnitType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of protective device tripping unit types from which the type required may be set.</p>")
	@Required()
	@Guid("5c70a7c4-6daf-4b81-93e6-b7e4e61be9d7")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType;


	public IfcProtectiveDeviceTrippingUnitType()
	{
	}

	public IfcProtectiveDeviceTrippingUnitType(String globalId, IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProtectiveDeviceTrippingUnitTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

