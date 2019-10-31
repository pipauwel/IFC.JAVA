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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal;

@Guid("0a9974ef-6873-4eed-93ae-8bdbde6996b6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMedicalDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@Guid("bf6dacbf-d58a-4995-9f89-c8568c7b0fb3")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcMedicalDeviceTypeEnum predefinedType;


	public IfcMedicalDevice()
	{
	}

	public IfcMedicalDevice(String globalId)
	{
		super(globalId);
	}

	public IfcMedicalDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMedicalDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

