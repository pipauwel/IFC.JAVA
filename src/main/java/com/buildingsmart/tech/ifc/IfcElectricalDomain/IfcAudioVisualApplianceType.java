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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualApplianceTypeEnum;

@Guid("2e0e9b45-760d-49af-bb15-c4011d0a4e76")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAudioVisualApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of audio-visual appliance from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("5174e2c3-82a6-43e1-a485-103834820e30")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAudioVisualApplianceTypeEnum predefinedType;


	public IfcAudioVisualApplianceType()
	{
	}

	public IfcAudioVisualApplianceType(String globalId, IfcAudioVisualApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAudioVisualApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAudioVisualApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

