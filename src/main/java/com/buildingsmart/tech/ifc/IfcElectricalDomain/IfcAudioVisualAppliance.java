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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal;

@Guid("d4cea3d5-466c-4f2b-99e8-9c0c621d5d69")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAudioVisualAppliance extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@Guid("2aa5eecb-56b9-4686-816e-ae3aa1e44546")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAudioVisualApplianceTypeEnum predefinedType;


	public IfcAudioVisualAppliance()
	{
	}

	public IfcAudioVisualAppliance(String globalId)
	{
		super(globalId);
	}

	public IfcAudioVisualApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAudioVisualApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

