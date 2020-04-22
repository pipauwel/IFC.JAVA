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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFlowMeterTypeEnum;

@Guid("daef9a4b-19fd-4e45-9d4d-4a12b58209b5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFlowMeterType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("Defines the type of flow meter.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a2740dc9-c1bc-4df2-8270-bdab521192a4")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFlowMeterTypeEnum predefinedType;


	public IfcFlowMeterType()
	{
	}

	public IfcFlowMeterType(String globalId, IfcFlowMeterTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFlowMeterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFlowMeterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

