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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4e958bba-84fa-45d3-bf26-9b6b72632919")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityLength extends IfcPhysicalSimpleQuantity
{
	@Description("Length measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7f243ac1-2a97-4752-b2e2-8f8b9d39d18a")
	@JacksonXmlProperty(isAttribute=false, localName = "lengthValue")
	private IfcLengthMeasure lengthValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("d6cebea3-47f2-41f9-a065-db12dc729cd4")
	@JacksonXmlProperty(isAttribute=false, localName = "formula")
	private IfcLabel formula;


	public IfcQuantityLength()
	{
	}

	public IfcQuantityLength(IfcLabel name, IfcLengthMeasure lengthValue)
	{
		super(name);
		this.lengthValue = lengthValue;
	}

	public IfcLengthMeasure getLengthValue() {
		return this.lengthValue;
	}

	public void setLengthValue(IfcLengthMeasure lengthValue) {
		this.lengthValue = lengthValue;
	}

	public IfcLabel getFormula() {
		return this.formula;
	}

	public void setFormula(IfcLabel formula) {
		this.formula = formula;
	}


}

