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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice;

@Guid("a31bfbd0-af30-4a94-a395-16bd8b02ae79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctSilencer extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice
{
	@DataMember(Order = 0)
	@Guid("aaa8fe96-302d-489d-8e43-b0705cec0bc4")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDuctSilencerTypeEnum predefinedType;


	public IfcDuctSilencer()
	{
	}

	public IfcDuctSilencer(String globalId)
	{
		super(globalId);
	}

	public IfcDuctSilencerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctSilencerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

