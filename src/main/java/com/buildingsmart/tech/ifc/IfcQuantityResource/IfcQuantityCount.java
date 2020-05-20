// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcCountMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ee55f63f-35e6-4be8-a374-c3e1d4aa9d1c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityCount extends IfcPhysicalSimpleQuantity
{
	@Description("Count measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c99711b7-fd92-47cc-8140-90c5c2bef60e")
	@JacksonXmlProperty(isAttribute=false, localName = "countValue")
	private IfcCountMeasure countValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("9ce02ae9-f66b-4467-b9f1-0b08497326e8")
	@JacksonXmlProperty(isAttribute=false, localName = "formula")
	private IfcLabel formula;


	public IfcQuantityCount()
	{
	}

	public IfcQuantityCount(IfcLabel name, IfcCountMeasure countValue)
	{
		super(name);
		this.countValue = countValue;
	}

	public IfcCountMeasure getCountValue() {
		return this.countValue;
	}

	public void setCountValue(IfcCountMeasure countValue) {
		this.countValue = countValue;
	}

	public IfcLabel getFormula() {
		return this.formula;
	}

	public void setFormula(IfcLabel formula) {
		this.formula = formula;
	}


}

