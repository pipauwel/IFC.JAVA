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

@Guid("ee55f63f-35e6-4be8-a374-c3e1d4aa9d1c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityCount extends IfcPhysicalSimpleQuantity
{
	@Description("Count measure value of this quantity.")
	@Required()
	@Guid("c99711b7-fd92-47cc-8140-90c5c2bef60e")
	@JacksonXmlProperty(isAttribute=true, localName = "CountValue")
	private int countValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@Guid("9ce02ae9-f66b-4467-b9f1-0b08497326e8")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityCount()
	{
	}

	public IfcQuantityCount(String name, int countValue)
	{
		super(name);
		this.countValue = countValue;
	}

	public int getCountValue() {
		return this.countValue;
	}

	public void setCountValue(int countValue) {
		this.countValue = countValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

