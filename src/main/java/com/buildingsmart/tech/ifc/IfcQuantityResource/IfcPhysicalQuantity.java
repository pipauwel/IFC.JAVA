// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("992fb4f8-e3be-4df1-8101-f866b2fa8617")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPhysicalQuantity implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name of the element quantity or measure. The name attribute has to be made recognizable by further agreements.")
	@Required()
	@Guid("6e61090c-7c36-4a29-84d9-f1404b4270d3")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Further explanation that might be given to the quantity.")
	@Guid("2d43b17c-5432-4535-8b22-c8c08aee6cbf")
	private String description;

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the quantity.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("27b2b843-28a6-42e2-bb25-b4fdcb625898")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReferences = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();

	@Description("Reference to a physical complex quantity in which the physical quantity may be contained.")
	@MaxLength(1)
	@Guid("e3118983-d5ed-4e50-9a48-f842a13ce296")
	private Set<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalComplexQuantity> partOfComplex = new HashSet<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalComplexQuantity>();


	public IfcPhysicalQuantity()
	{
	}

	public IfcPhysicalQuantity(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalComplexQuantity> getPartOfComplex() {
		return this.partOfComplex;
	}


}

