// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cadb7794-f1ab-4438-a35f-0ba4b280d962")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConversionBasedUnitWithOffset extends IfcConversionBasedUnit
{
	@Description("A positive or negative offset to add after the inherited <em>ConversionFactor</em> was applied.")
	@DataMember(Order = 0)
	@Required()
	@Guid("ca7d00b4-28a4-4681-9281-b88a0635d93c")
	@JacksonXmlProperty(isAttribute=true, localName = "conversionOffset")
	private Double conversionOffset;


	public IfcConversionBasedUnitWithOffset()
	{
	}

	public IfcConversionBasedUnitWithOffset(IfcDimensionalExponents dimensions, IfcUnitEnum unitType, String name, IfcMeasureWithUnit conversionFactor, Double conversionOffset)
	{
		super(dimensions, unitType, name, conversionFactor);
		this.conversionOffset = conversionOffset;
	}

	public Double getConversionOffset() {
		return this.conversionOffset;
	}

	public void setConversionOffset(Double conversionOffset) {
		this.conversionOffset = conversionOffset;
	}


}

