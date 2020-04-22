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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice;

@Guid("531f610d-c46c-4d89-b0a1-27b05c101607")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHumidifier extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("4eb23e5a-4e31-4444-9ad3-91a4ae38c6e8")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcHumidifierTypeEnum predefinedType;


	public IfcHumidifier()
	{
	}

	public IfcHumidifier(String globalId)
	{
		super(globalId);
	}

	public IfcHumidifierTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcHumidifierTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

