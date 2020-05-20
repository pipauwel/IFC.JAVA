// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("c715b91e-2c57-4166-9e0b-694da8b97ac6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcContextDependentUnit extends IfcNamedUnit implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("The word, or group of words, by which the context dependent unit is referred to.")
	@DataMember(Order = 0)
	@Required()
	@Guid("0bce538b-be29-4366-95f9-9fd28f48cd0a")
	@JacksonXmlProperty(isAttribute=true, localName = "name")
	private String name;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the context dependent unit.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("a99f218c-3a41-42f7-bdd8-070f81d72e23")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;


	public IfcContextDependentUnit()
	{
	}

	public IfcContextDependentUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType, String name)
	{
		super(dimensions, unitType);
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

