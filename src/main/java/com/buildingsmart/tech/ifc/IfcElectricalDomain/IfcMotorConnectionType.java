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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionTypeEnum;

@Guid("ec824845-e28c-4abc-a57a-8c95bf556dc8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMotorConnectionType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("<p>Identifies the predefined types of motor connection from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("a52dfeef-c83c-4a8b-9038-f20e8c8d2567")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcMotorConnectionTypeEnum predefinedType;


	public IfcMotorConnectionType()
	{
	}

	public IfcMotorConnectionType(String globalId, IfcMotorConnectionTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcMotorConnectionTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMotorConnectionTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

