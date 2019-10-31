// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyAbstraction;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;

@Guid("95f63d3d-7d92-449b-89e3-626dfacc0648")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyEnumeration extends IfcPropertyAbstraction
{
	@Description("Name of this enumeration.")
	@Required()
	@Guid("e64d7c48-2084-49bc-97e3-b1caa44a5567")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("List of values that form the enumeration.")
	@Required()
	@Guid("4de323e5-9f21-42b4-bb59-93e3f65054fe")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "EnumerationValues")
	private List<IfcValue> enumerationValues;

	@Description("Unit for the enumerator values, if not given, the default value for the measure type (given by the TYPE of nominal value) is used as defined by the global unit assignment at IfcProject.")
	@Guid("49677ec8-ed2f-47c0-9fc4-ff28957e44c6")
	@JacksonXmlProperty(isAttribute=true, localName = "Unit")
	private IfcUnit unit;


	public IfcPropertyEnumeration()
	{
	}

	public IfcPropertyEnumeration(String name, IfcValue[] enumerationValues)
	{
		this.name = name;
		this.enumerationValues = new ArrayList<>(Arrays.asList(enumerationValues));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IfcValue> getEnumerationValues() {
		return this.enumerationValues;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}


}

