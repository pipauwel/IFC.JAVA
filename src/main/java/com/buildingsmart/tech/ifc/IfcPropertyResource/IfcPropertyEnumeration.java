// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("95f63d3d-7d92-449b-89e3-626dfacc0648")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyEnumeration extends IfcPropertyAbstraction
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name of this enumeration.")
	@Required()
	@Guid("e64d7c48-2084-49bc-97e3-b1caa44a5567")
	private String name;

	@Description("List of values that form the enumeration.")
	@Required()
	@MinLength(1)
	@Guid("4de323e5-9f21-42b4-bb59-93e3f65054fe")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> enumerationValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();

	@Description("Unit for the enumerator values, if not given, the default value for the measure type (given by the TYPE of nominal value) is used as defined by the global unit assignment at IfcProject.")
	@Guid("49677ec8-ed2f-47c0-9fc4-ff28957e44c6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit;


	public IfcPropertyEnumeration()
	{
	}

	public IfcPropertyEnumeration(String name, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue[] enumerationValues)
	{
		this.name = name;
		this.enumerationValues = new ArrayList<>(Arrays.asList(enumerationValues));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getEnumerationValues() {
		return this.enumerationValues;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit) {
		this.unit = unit;
	}


}

