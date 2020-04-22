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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSwitchingDeviceTypeEnum;

@Guid("041abe9f-f73b-471c-859c-c577d975198c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSwitchingDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("<p>Identifies the predefined types of switch from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("582dead0-78cd-4f9d-8d9b-509da170be57")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSwitchingDeviceTypeEnum predefinedType;


	public IfcSwitchingDeviceType()
	{
	}

	public IfcSwitchingDeviceType(String globalId, IfcSwitchingDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSwitchingDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSwitchingDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

