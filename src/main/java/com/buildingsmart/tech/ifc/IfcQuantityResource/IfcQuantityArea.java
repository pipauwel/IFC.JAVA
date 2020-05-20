// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcAreaMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bb60eefd-5d19-4646-9795-6bda10980402")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityArea extends IfcPhysicalSimpleQuantity
{
	@Description("Area measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("01ac60b8-6a0e-4713-b657-70c3f0bb6c39")
	@JacksonXmlProperty(isAttribute=false, localName = "areaValue")
	private IfcAreaMeasure areaValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("52ac3915-b8c7-4adc-8d09-a872b27e4d0e")
	@JacksonXmlProperty(isAttribute=false, localName = "formula")
	private IfcLabel formula;


	public IfcQuantityArea()
	{
	}

	public IfcQuantityArea(IfcLabel name, IfcAreaMeasure areaValue)
	{
		super(name);
		this.areaValue = areaValue;
	}

	public IfcAreaMeasure getAreaValue() {
		return this.areaValue;
	}

	public void setAreaValue(IfcAreaMeasure areaValue) {
		this.areaValue = areaValue;
	}

	public IfcLabel getFormula() {
		return this.formula;
	}

	public void setFormula(IfcLabel formula) {
		this.formula = formula;
	}


}

