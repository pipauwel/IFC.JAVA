// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElement;

@Guid("55cbca4f-814f-47b4-890b-000cd85993b7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendonAnchor extends IfcReinforcingElement
{
	@Description("Kind of tendon anchor.")
	@Guid("a8c7ef8a-9db8-4a89-9908-adcec769bb8f")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTendonAnchorTypeEnum predefinedType;


	public IfcTendonAnchor()
	{
	}

	public IfcTendonAnchor(String globalId)
	{
		super(globalId);
	}

	public IfcTendonAnchorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTendonAnchorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

