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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDevice;

@Guid("da626cac-98fb-4f4c-8d4a-c8c4bac3a68d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPump extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDevice
{
	@DataMember(Order = 0)
	@Guid("f3a4f34f-67bd-4977-b1ac-23f5004f8536")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPumpTypeEnum predefinedType;


	public IfcPump()
	{
	}

	public IfcPump(String globalId)
	{
		super(globalId);
	}

	public IfcPumpTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPumpTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

