// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cd63ae14-6967-4acf-b92c-2b33caddf894")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPhysicalSimpleQuantity extends IfcPhysicalQuantity
{
	@JacksonXmlProperty(isAttribute=false, localName = "Unit")
	@Description("Optional assignment of a unit. If no unit is given, then the global unit assignment, as established at the IfcProject, applies to the quantity measures.")
	@Guid("94c0bba1-d905-41ef-9cd3-5fa3a8ffaf50")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit unit;


	public IfcPhysicalSimpleQuantity()
	{
	}

	public IfcPhysicalSimpleQuantity(String name)
	{
		super(name);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit getUnit() {
		return this.unit;
	}

	public void setUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit unit) {
		this.unit = unit;
	}


}

