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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPumpTypeEnum;

@Guid("fd42c2cc-cf4e-429b-adc8-a92410ba4fcb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPumpType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType
{
	@Description("Defines the type of pump typically used in building services.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8be7377a-5007-4096-a894-874194c70a00")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPumpTypeEnum predefinedType;


	public IfcPumpType()
	{
	}

	public IfcPumpType(String globalId, IfcPumpTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPumpTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPumpTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

