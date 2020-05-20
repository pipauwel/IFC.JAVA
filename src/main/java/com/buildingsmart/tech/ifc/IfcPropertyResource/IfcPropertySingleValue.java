// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6283d4e3-23ff-4d09-b4a2-a0fb4f925aed")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySingleValue extends IfcSimpleProperty
{
	@Description("Value and measure type of this property.   <blockquote class=\"note\">NOTE&nbsp; By virtue of the defined data type, that is selected from the SELECT <em>IfcValue</em>, the appropriate unit can be found within the <em>IfcUnitAssignment</em>, defined for the project if no value for the unit attribute is given.</blockquote>  <blockquote class=\"note\">IFC2x3 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("17155b9a-60a6-4a80-afd5-b35efea8f4ab")
	@JacksonXmlProperty(isAttribute=true, localName = "nominalValue")
	private IfcValue nominalValue;

	@Description("Unit for the nominal value, if not given, the default value for the measure type (given by the TYPE of nominal value) is used as defined by the global unit assignment at IfcProject.")
	@DataMember(Order = 1)
	@Guid("bc0834af-0f38-4cb7-b5b2-e586cecb1355")
	@JacksonXmlProperty(isAttribute=true, localName = "unit")
	private IfcUnit unit;


	public IfcPropertySingleValue()
	{
	}

	public IfcPropertySingleValue(IfcIdentifier name)
	{
		super(name);
	}

	public IfcValue getNominalValue() {
		return this.nominalValue;
	}

	public void setNominalValue(IfcValue nominalValue) {
		this.nominalValue = nominalValue;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}


}

