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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureTypeEnum;

@Guid("a34fc9d6-d1c8-402c-817e-feb3a9c9e7a1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightFixtureType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of light fixture from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f92d5dcc-4b10-49bd-8a04-920f36d9d350")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcLightFixtureTypeEnum predefinedType;


	public IfcLightFixtureType()
	{
	}

	public IfcLightFixtureType(String globalId, IfcLightFixtureTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcLightFixtureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLightFixtureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

