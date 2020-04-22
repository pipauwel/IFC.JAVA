// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementAssemblyTypeEnum;

@Guid("cf32f5f3-9164-4283-8a8d-cfbf1a4bcc3e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElementAssemblyType extends IfcElementType
{
	@Description("Predefined types to define the particular type of the transport element. There may be property set definitions available for each predefined type.")
	@DataMember(Order = 0)
	@Required()
	@Guid("45aa3a72-bdd4-4e5b-b2d9-27b82bc19e4d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcElementAssemblyTypeEnum predefinedType;


	public IfcElementAssemblyType()
	{
	}

	public IfcElementAssemblyType(String globalId, IfcElementAssemblyTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElementAssemblyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

