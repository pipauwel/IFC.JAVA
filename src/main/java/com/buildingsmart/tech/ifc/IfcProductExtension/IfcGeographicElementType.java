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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcGeographicElementTypeEnum;

@Guid("5f98c5aa-abaf-476a-b395-6e07f22724fc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeographicElementType extends IfcElementType
{
	@Description("Predefined types to define the particular type of the geographic element. There may be property set definitions available for each predefined type.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7de7050a-ee4b-401d-bdb3-71681626e5e7")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcGeographicElementTypeEnum predefinedType;


	public IfcGeographicElementType()
	{
	}

	public IfcGeographicElementType(String globalId, IfcGeographicElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcGeographicElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcGeographicElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

