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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit;

@Guid("27535f79-e61d-421d-a55b-ea63de53cc7b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDerivedUnitElement
{
	@Description("The fixed quantity which is used as the mathematical factor.")
	@Required()
	@Guid("43187a82-81d5-4095-a894-4b7a7268ae37")
	@JacksonXmlProperty(isAttribute=false, localName = "Unit")
	private IfcNamedUnit unit;

	@Description("The power that is applied to the unit attribute.")
	@Required()
	@Guid("99e67ac1-2fb7-4cd9-9ef4-f99ea7d0f0e3")
	@JacksonXmlProperty(isAttribute=true, localName = "Exponent")
	private long exponent;


	public IfcDerivedUnitElement()
	{
	}

	public IfcDerivedUnitElement(IfcNamedUnit unit, long exponent)
	{
		this.unit = unit;
		this.exponent = exponent;
	}

	public IfcNamedUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcNamedUnit unit) {
		this.unit = unit;
	}

	public long getExponent() {
		return this.exponent;
	}

	public void setExponent(long exponent) {
		this.exponent = exponent;
	}


}

