// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7d4b1cf1-345c-456d-9199-c2fc2e7e94f0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConversionBasedUnit extends IfcNamedUnit implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The word, or group of words, by which the conversion based unit is referred to.")
	@Required()
	@Guid("8f0badf9-2c68-49b2-9365-0e66adb20d4d")
	private String name;

	@JacksonXmlProperty(isAttribute=false, localName = "ConversionFactor")
	@Description("The physical quantity from which the converted unit is derived.")
	@Required()
	@Guid("91e5e04e-74ab-456a-9cb8-77cbbdf2cdf7")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit conversionFactor;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the conversion-based unit.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("d6118974-bfed-426c-b479-6ecff30b88a2")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReference = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();


	public IfcConversionBasedUnit()
	{
	}

	public IfcConversionBasedUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents dimensions, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum unitType, String name, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit conversionFactor)
	{
		super(dimensions, unitType);
		this.name = name;
		this.conversionFactor = conversionFactor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit getConversionFactor() {
		return this.conversionFactor;
	}

	public void setConversionFactor(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

