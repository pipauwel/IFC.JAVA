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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController;

@Guid("2b00b91e-76da-42f7-9746-994039edb1c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDamper extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("a66e6586-fecb-44b3-b66d-1455e7cf9842")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDamperTypeEnum predefinedType;


	public IfcDamper()
	{
	}

	public IfcDamper(String globalId)
	{
		super(globalId);
	}

	public IfcDamperTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDamperTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

