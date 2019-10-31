// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcContextDependentUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcConversionBasedUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum;

@Guid("feff0f85-92ea-4f67-8748-661f27621758")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcContextDependentUnit.class, name = "IfcContextDependentUnit"), @JsonSubTypes.Type(value = IfcConversionBasedUnit.class, name = "IfcConversionBasedUnit"), @JsonSubTypes.Type(value = IfcSIUnit.class, name = "IfcSIUnit")})
public abstract class IfcNamedUnit implements IfcUnit
{
	@Description("The dimensional exponents of the SI base units by which the named unit is defined.")
	@Required()
	@Guid("55ff10f6-6fd1-45cd-a53c-2707349993cb")
	@JacksonXmlProperty(isAttribute=false, localName = "Dimensions")
	private IfcDimensionalExponents dimensions;

	@Description("The type of the unit.")
	@Required()
	@Guid("9621fcc5-c1bf-463f-9fa4-c55d0fe7849e")
	@JacksonXmlProperty(isAttribute=true, localName = "UnitType")
	private IfcUnitEnum unitType;


	public IfcNamedUnit()
	{
	}

	public IfcNamedUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType)
	{
		this.dimensions = dimensions;
		this.unitType = unitType;
	}

	public IfcDimensionalExponents getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(IfcDimensionalExponents dimensions) {
		this.dimensions = dimensions;
	}

	public IfcUnitEnum getUnitType() {
		return this.unitType;
	}

	public void setUnitType(IfcUnitEnum unitType) {
		this.unitType = unitType;
	}


}

