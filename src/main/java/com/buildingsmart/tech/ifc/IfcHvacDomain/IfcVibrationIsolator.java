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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent;

@Guid("422d8476-9b6c-4321-9f99-2f6340f87108")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVibrationIsolator extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent
{
	@Guid("c48ed4dc-cc29-4b6b-ad43-262290a082ae")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcVibrationIsolatorTypeEnum predefinedType;


	public IfcVibrationIsolator()
	{
	}

	public IfcVibrationIsolator(String globalId)
	{
		super(globalId);
	}

	public IfcVibrationIsolatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcVibrationIsolatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

