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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalBoxTypeEnum;

@Guid("bc242f20-3f8e-4532-91aa-3cc02ab65da4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirTerminalBoxType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("The air terminal box type.")
	@Required()
	@Guid("c02b5e63-acde-4c6c-8b33-c2027b182472")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcAirTerminalBoxTypeEnum predefinedType;


	public IfcAirTerminalBoxType()
	{
	}

	public IfcAirTerminalBoxType(String globalId, IfcAirTerminalBoxTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAirTerminalBoxTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirTerminalBoxTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

