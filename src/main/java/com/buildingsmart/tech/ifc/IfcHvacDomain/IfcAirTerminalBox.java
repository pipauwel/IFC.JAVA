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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController;

@Guid("5c94650b-db68-4716-a299-3069c0a7a43b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirTerminalBox extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("5a851e83-1420-4838-b101-36c0f6996d1d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAirTerminalBoxTypeEnum predefinedType;


	public IfcAirTerminalBox()
	{
	}

	public IfcAirTerminalBox(String globalId)
	{
		super(globalId);
	}

	public IfcAirTerminalBoxTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirTerminalBoxTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

