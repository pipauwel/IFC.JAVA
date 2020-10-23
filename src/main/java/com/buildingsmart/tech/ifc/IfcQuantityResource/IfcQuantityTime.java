// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcTimeMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f137f056-3756-4b10-8243-deee1ffa7d9d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityTime extends IfcPhysicalSimpleQuantity
{
	@Description("Time measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("24cb0119-3880-4176-ba50-7333569bbfd3")
	@JacksonXmlProperty(isAttribute=false, localName = "timeValue")
	private IfcTimeMeasure timeValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("e063afe0-3eff-4106-abe3-927c705df3c1")
	@JacksonXmlProperty(isAttribute=false, localName = "formula")
	private IfcLabel formula;


	public IfcQuantityTime()
	{
	}

	public IfcQuantityTime(IfcLabel name, IfcTimeMeasure timeValue)
	{
		super(name);
		this.timeValue = timeValue;
	}

	public IfcTimeMeasure getTimeValue() {
		return this.timeValue;
	}

	public void setTimeValue(IfcTimeMeasure timeValue) {
		this.timeValue = timeValue;
	}

	public IfcLabel getFormula() {
		return this.formula;
	}

	public void setFormula(IfcLabel formula) {
		this.formula = formula;
	}


}

