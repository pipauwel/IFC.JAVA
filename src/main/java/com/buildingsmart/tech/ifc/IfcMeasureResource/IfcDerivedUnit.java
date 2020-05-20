// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("2923468f-7a3d-4521-9900-c76a41447138")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDerivedUnit implements IfcUnit
{
	@Description("The group of units and their exponents that define the derived unit.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e72142b9-ee3d-4bf3-8cbc-1a1c4506f9d8")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDerivedUnitElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "elements")
	private Set<IfcDerivedUnitElement> elements;

	@Description("Name of the derived unit chosen from an enumeration of derived unit types for use in IFC models.")
	@DataMember(Order = 1)
	@Required()
	@Guid("df3cb14f-4bb8-4ed8-a79c-92221b2c5710")
	@JacksonXmlProperty(isAttribute=true, localName = "unitType")
	private IfcDerivedUnitEnum unitType;

	@DataMember(Order = 2)
	@Guid("ad069c40-59ef-46b3-ba34-ad6fd730e7dc")
	@JacksonXmlProperty(isAttribute=true, localName = "userDefinedType")
	private String userDefinedType;


	public IfcDerivedUnit()
	{
	}

	public IfcDerivedUnit(IfcDerivedUnitElement[] elements, IfcDerivedUnitEnum unitType)
	{
		this.elements = new HashSet<>(Arrays.asList(elements));
		this.unitType = unitType;
	}

	public Set<IfcDerivedUnitElement> getElements() {
		return this.elements;
	}

	public IfcDerivedUnitEnum getUnitType() {
		return this.unitType;
	}

	public void setUnitType(IfcDerivedUnitEnum unitType) {
		this.unitType = unitType;
	}

	public String getUserDefinedType() {
		return this.userDefinedType;
	}

	public void setUserDefinedType(String userDefinedType) {
		this.userDefinedType = userDefinedType;
	}

	public IfcDimensionalExponents getDimensions() {
		return null;
	}


}

