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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcConversionBasedUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit;

@Guid("cadb7794-f1ab-4438-a35f-0ba4b280d962")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConversionBasedUnitWithOffset extends IfcConversionBasedUnit
{
	@Description("A positive or negative offset to add after the inherited <em>ConversionFactor</em> was applied.")
	@Required()
	@Guid("ca7d00b4-28a4-4681-9281-b88a0635d93c")
	@JacksonXmlProperty(isAttribute=true, localName = "ConversionOffset")
	private double conversionOffset;


	public IfcConversionBasedUnitWithOffset()
	{
	}

	public IfcConversionBasedUnitWithOffset(IfcDimensionalExponents dimensions, IfcUnitEnum unitType, String name, IfcMeasureWithUnit conversionFactor, double conversionOffset)
	{
		super(dimensions, unitType, name, conversionFactor);
		this.conversionOffset = conversionOffset;
	}

	public double getConversionOffset() {
		return this.conversionOffset;
	}

	public void setConversionOffset(double conversionOffset) {
		this.conversionOffset = conversionOffset;
	}


}

