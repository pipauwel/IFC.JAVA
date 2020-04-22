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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcVibrationIsolatorTypeEnum;

@Guid("55bfbb42-1d61-499e-857c-b1dd3128361c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVibrationIsolatorType extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType
{
	@Description("Defines the type of vibration isolator.")
	@DataMember(Order = 0)
	@Required()
	@Guid("bfcb4cfa-5d6a-4b93-967d-744c1b1bc404")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcVibrationIsolatorTypeEnum predefinedType;


	public IfcVibrationIsolatorType()
	{
	}

	public IfcVibrationIsolatorType(String globalId, IfcVibrationIsolatorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcVibrationIsolatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcVibrationIsolatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

