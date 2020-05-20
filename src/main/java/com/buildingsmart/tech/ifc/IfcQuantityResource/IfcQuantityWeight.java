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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMassMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b2c313f2-5299-4b30-b6d0-a7ea6fbf1b83")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityWeight extends IfcPhysicalSimpleQuantity
{
	@Description("Mass measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7e543a81-ddf5-4f31-b2dc-5a8af9e5a77d")
	@JacksonXmlProperty(isAttribute=false, localName = "weightValue")
	private IfcMassMeasure weightValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("a1fad3f8-8a38-45db-9ab4-754238b3e2ca")
	@JacksonXmlProperty(isAttribute=false, localName = "formula")
	private IfcLabel formula;


	public IfcQuantityWeight()
	{
	}

	public IfcQuantityWeight(IfcLabel name, IfcMassMeasure weightValue)
	{
		super(name);
		this.weightValue = weightValue;
	}

	public IfcMassMeasure getWeightValue() {
		return this.weightValue;
	}

	public void setWeightValue(IfcMassMeasure weightValue) {
		this.weightValue = weightValue;
	}

	public IfcLabel getFormula() {
		return this.formula;
	}

	public void setFormula(IfcLabel formula) {
		this.formula = formula;
	}


}

