// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9cc2c277-dce2-45a4-83ff-50f25a31ece8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSIUnit extends IfcNamedUnit
{
	@JacksonXmlProperty(isAttribute=true, localName = "Prefix")
	@Description("The SI Prefix for defining decimal multiples and submultiples of the unit.")
	@Guid("c6aeb01b-30d3-4137-9930-4aceeb9c4a67")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIPrefix prefix;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The word, or group of words, by which the SI unit is referred to.    <blockquote class=\"note\">NOTE&nbsp; Even though the SI system's base unit for mass is kilogram, the <em>IfcSIUnit</em> for mass is gram if no <em>Prefix</em> is asserted.</blockquote>")
	@Required()
	@Guid("9bd1e5c7-5ab3-4539-b399-fadb389a68f6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnitName name;


	public IfcSIUnit()
	{
	}

	public IfcSIUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents dimensions, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum unitType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnitName name)
	{
		super(dimensions, unitType);
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIPrefix getPrefix() {
		return this.prefix;
	}

	public void setPrefix(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIPrefix prefix) {
		this.prefix = prefix;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnitName getName() {
		return this.name;
	}

	public void setName(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSIUnitName name) {
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents getDimensions() {
		return null;
	}


}

