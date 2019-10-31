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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCommunicationsApplianceTypeEnum;

@Guid("738a14dd-d304-4b4f-86aa-f9fe0990a0fa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCommunicationsApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of communications  appliance from which the type required may be set.</p>")
	@Required()
	@Guid("00c121f1-a734-4e9a-bfc7-577ebb3b646f")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCommunicationsApplianceTypeEnum predefinedType;


	public IfcCommunicationsApplianceType()
	{
	}

	public IfcCommunicationsApplianceType(String globalId, IfcCommunicationsApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCommunicationsApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCommunicationsApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

