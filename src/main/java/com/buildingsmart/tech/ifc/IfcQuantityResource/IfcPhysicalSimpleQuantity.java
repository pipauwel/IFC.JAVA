// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

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
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityArea;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityCount;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityLength;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityTime;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityVolume;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcQuantityWeight;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity;

@Guid("cd63ae14-6967-4acf-b92c-2b33caddf894")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcQuantityArea.class, name = "IfcQuantityArea"), @JsonSubTypes.Type(value = IfcQuantityCount.class, name = "IfcQuantityCount"), @JsonSubTypes.Type(value = IfcQuantityLength.class, name = "IfcQuantityLength"), @JsonSubTypes.Type(value = IfcQuantityTime.class, name = "IfcQuantityTime"), @JsonSubTypes.Type(value = IfcQuantityVolume.class, name = "IfcQuantityVolume"), @JsonSubTypes.Type(value = IfcQuantityWeight.class, name = "IfcQuantityWeight")})
public abstract class IfcPhysicalSimpleQuantity extends IfcPhysicalQuantity
{
	@Description("Optional assignment of a unit. If no unit is given, then the global unit assignment, as established at the IfcProject, applies to the quantity measures.")
	@DataMember(Order = 0)
	@Guid("94c0bba1-d905-41ef-9cd3-5fa3a8ffaf50")
	@JacksonXmlProperty(isAttribute=false, localName = "Unit")
	private IfcNamedUnit unit;


	public IfcPhysicalSimpleQuantity()
	{
	}

	public IfcPhysicalSimpleQuantity(String name)
	{
		super(name);
	}

	public IfcNamedUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcNamedUnit unit) {
		this.unit = unit;
	}


}

