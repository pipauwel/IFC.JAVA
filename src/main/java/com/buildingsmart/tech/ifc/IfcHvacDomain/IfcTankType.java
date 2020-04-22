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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTankTypeEnum;

@Guid("540199dc-befa-4477-9a3c-18a376ec1a11")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTankType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType
{
	@Description("Defines the type of tank.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5b6ea321-df4c-44d0-b5b1-4fb2fe31c4d5")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTankTypeEnum predefinedType;


	public IfcTankType()
	{
	}

	public IfcTankType(String globalId, IfcTankTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTankTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTankTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

