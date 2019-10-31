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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction;

@Guid("76ade710-1f8c-4677-9f36-a21e6d4c7476")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVoidingFeature extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction
{
	@Description("Qualifies the feature regarding its shape and configuration relative to the voided element.")
	@Guid("fff2ddf2-413b-4847-8afd-9e3ed847b801")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcVoidingFeatureTypeEnum predefinedType;


	public IfcVoidingFeature()
	{
	}

	public IfcVoidingFeature(String globalId)
	{
		super(globalId);
	}

	public IfcVoidingFeatureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcVoidingFeatureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

