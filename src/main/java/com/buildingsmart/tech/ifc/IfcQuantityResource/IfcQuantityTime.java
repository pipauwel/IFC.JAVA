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
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalSimpleQuantity;

@Guid("f137f056-3756-4b10-8243-deee1ffa7d9d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityTime extends IfcPhysicalSimpleQuantity
{
	@Description("Time measure value of this quantity.")
	@Required()
	@Guid("24cb0119-3880-4176-ba50-7333569bbfd3")
	@JacksonXmlProperty(isAttribute=true, localName = "TimeValue")
	private double timeValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@Guid("e063afe0-3eff-4106-abe3-927c705df3c1")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityTime()
	{
	}

	public IfcQuantityTime(String name, double timeValue)
	{
		super(name);
		this.timeValue = timeValue;
	}

	public double getTimeValue() {
		return this.timeValue;
	}

	public void setTimeValue(double timeValue) {
		this.timeValue = timeValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

