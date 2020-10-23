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

@Guid("27535f79-e61d-421d-a55b-ea63de53cc7b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDerivedUnitElement
{
	@Description("The fixed quantity which is used as the mathematical factor.")
	@DataMember(Order = 0)
	@Required()
	@Guid("43187a82-81d5-4095-a894-4b7a7268ae37")
	@JacksonXmlProperty(isAttribute=false, localName = "unit")
	private IfcNamedUnit unit;

	@Description("The power that is applied to the unit attribute.")
	@DataMember(Order = 1)
	@Required()
	@Guid("99e67ac1-2fb7-4cd9-9ef4-f99ea7d0f0e3")
	@JacksonXmlProperty(isAttribute=true, localName = "exponent")
	private Integer exponent;


	public IfcDerivedUnitElement()
	{
	}

	public IfcDerivedUnitElement(IfcNamedUnit unit, Integer exponent)
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

	public Integer getExponent() {
		return this.exponent;
	}

	public void setExponent(Integer exponent) {
		this.exponent = exponent;
	}


}

