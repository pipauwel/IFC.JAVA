// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3b86c373-401a-48f2-a1e3-c6a078202bf9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityVolume extends IfcPhysicalSimpleQuantity
{
	@Description("Volume measure value of this quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8ece699a-8cbf-4a26-9fc3-68778f530a8f")
	@JacksonXmlProperty(isAttribute=true, localName = "VolumeValue")
	private double volumeValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("778b2020-fecb-42a5-a31b-2d91bd0f3b61")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityVolume()
	{
	}

	public IfcQuantityVolume(String name, double volumeValue)
	{
		super(name);
		this.volumeValue = volumeValue;
	}

	public double getVolumeValue() {
		return this.volumeValue;
	}

	public void setVolumeValue(double volumeValue) {
		this.volumeValue = volumeValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

