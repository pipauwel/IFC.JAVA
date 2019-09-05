// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2923468f-7a3d-4521-9900-c76a41447138")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDerivedUnit implements IfcUnit
{
	@Description("The group of units and their exponents that define the derived unit.")
	@Required()
	@MinLength(1)
	@Guid("e72142b9-ee3d-4bf3-8cbc-1a1c4506f9d8")
	private Set<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitElement> elements = new HashSet<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitElement>();

	@JacksonXmlProperty(isAttribute=true, localName = "UnitType")
	@Description("Name of the derived unit chosen from an enumeration of derived unit types for use in IFC models.")
	@Required()
	@Guid("df3cb14f-4bb8-4ed8-a79c-92221b2c5710")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitEnum unitType;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedType")
	@Guid("ad069c40-59ef-46b3-ba34-ad6fd730e7dc")
	private String userDefinedType;


	public IfcDerivedUnit()
	{
	}

	public IfcDerivedUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitElement[] elements, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitEnum unitType)
	{
		this.elements = new HashSet<>(Arrays.asList(elements));
		this.unitType = unitType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitElement> getElements() {
		return this.elements;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitEnum getUnitType() {
		return this.unitType;
	}

	public void setUnitType(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDerivedUnitEnum unitType) {
		this.unitType = unitType;
	}

	public String getUserDefinedType() {
		return this.userDefinedType;
	}

	public void setUserDefinedType(String userDefinedType) {
		this.userDefinedType = userDefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents getDimensions() {
		return null;
	}


}

