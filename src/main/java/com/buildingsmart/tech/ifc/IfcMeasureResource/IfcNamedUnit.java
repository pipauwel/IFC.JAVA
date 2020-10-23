// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.UUID;

@Guid("feff0f85-92ea-4f67-8748-661f27621758")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcContextDependentUnit.class, name = "IfcContextDependentUnit"), @JsonSubTypes.Type(value = IfcConversionBasedUnit.class, name = "IfcConversionBasedUnit"), @JsonSubTypes.Type(value = IfcSIUnit.class, name = "IfcSIUnit")})
public abstract class IfcNamedUnit implements IfcUnit
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("The dimensional exponents of the SI base units by which the named unit is defined.")
	@DataMember(Order = 0)
	@Required()
	@Guid("55ff10f6-6fd1-45cd-a53c-2707349993cb")
	@JacksonXmlProperty(isAttribute=true, localName = "dimensions")
	private IfcDimensionalExponents dimensions;

	@Description("The type of the unit.")
	@DataMember(Order = 1)
	@Required()
	@Guid("9621fcc5-c1bf-463f-9fa4-c55d0fe7849e")
	@JacksonXmlProperty(isAttribute=true, localName = "unitType")
	private IfcUnitEnum unitType;


	public IfcNamedUnit()
	{
		this.globalId = UUID.randomUUID();
	}

	public IfcNamedUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType)
	{
		this();
		this.dimensions = dimensions;
		this.unitType = unitType;
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
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

