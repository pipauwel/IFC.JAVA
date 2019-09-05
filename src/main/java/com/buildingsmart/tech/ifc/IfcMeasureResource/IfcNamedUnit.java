// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("feff0f85-92ea-4f67-8748-661f27621758")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcNamedUnit implements IfcUnit
{
	@JacksonXmlProperty(isAttribute=false, localName = "Dimensions")
	@Description("The dimensional exponents of the SI base units by which the named unit is defined.")
	@Required()
	@Guid("55ff10f6-6fd1-45cd-a53c-2707349993cb")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents dimensions;

	@JacksonXmlProperty(isAttribute=true, localName = "UnitType")
	@Description("The type of the unit.")
	@Required()
	@Guid("9621fcc5-c1bf-463f-9fa4-c55d0fe7849e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum unitType;


	public IfcNamedUnit()
	{
	}

	public IfcNamedUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents dimensions, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum unitType)
	{
		this.dimensions = dimensions;
		this.unitType = unitType;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents dimensions) {
		this.dimensions = dimensions;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum getUnitType() {
		return this.unitType;
	}

	public void setUnitType(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum unitType) {
		this.unitType = unitType;
	}


}

