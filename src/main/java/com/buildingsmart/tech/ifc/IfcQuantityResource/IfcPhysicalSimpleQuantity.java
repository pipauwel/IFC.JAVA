// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cd63ae14-6967-4acf-b92c-2b33caddf894")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcQuantityArea.class, name = "IfcQuantityArea"), @JsonSubTypes.Type(value = IfcQuantityCount.class, name = "IfcQuantityCount"), @JsonSubTypes.Type(value = IfcQuantityLength.class, name = "IfcQuantityLength"), @JsonSubTypes.Type(value = IfcQuantityTime.class, name = "IfcQuantityTime"), @JsonSubTypes.Type(value = IfcQuantityVolume.class, name = "IfcQuantityVolume"), @JsonSubTypes.Type(value = IfcQuantityWeight.class, name = "IfcQuantityWeight")})
public abstract class IfcPhysicalSimpleQuantity extends IfcPhysicalQuantity
{
	@Description("Optional assignment of a unit. If no unit is given, then the global unit assignment, as established at the IfcProject, applies to the quantity measures.")
	@DataMember(Order = 0)
	@Guid("94c0bba1-d905-41ef-9cd3-5fa3a8ffaf50")
	@JacksonXmlProperty(isAttribute=false, localName = "unit")
	private IfcNamedUnit unit;


	public IfcPhysicalSimpleQuantity()
	{
	}

	public IfcPhysicalSimpleQuantity(IfcLabel name)
	{
		super(name);
	}

	public IfcNamedUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcNamedUnit unit) {
		this.unit = unit;
	}


}

