// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("992fb4f8-e3be-4df1-8101-f866b2fa8617")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPhysicalComplexQuantity.class, name = "IfcPhysicalComplexQuantity"), @JsonSubTypes.Type(value = IfcPhysicalSimpleQuantity.class, name = "IfcPhysicalSimpleQuantity")})
public abstract class IfcPhysicalQuantity implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Name of the element quantity or measure. The name attribute has to be made recognizable by further agreements.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6e61090c-7c36-4a29-84d9-f1404b4270d3")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Further explanation that might be given to the quantity.")
	@DataMember(Order = 1)
	@Guid("2d43b17c-5432-4535-8b22-c8c08aee6cbf")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the quantity.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("27b2b843-28a6-42e2-bb25-b4fdcb625898")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReferences")
	private Set<IfcExternalReferenceRelationship> hasExternalReferences;

	@Description("Reference to a physical complex quantity in which the physical quantity may be contained.")
	@InverseProperty(InverseProp = "hasQuantities", Range = "IfcPhysicalComplexQuantity")
	@Guid("e3118983-d5ed-4e50-9a48-f842a13ce296")
	@MaxLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcPhysicalComplexQuantity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfComplex")*/
	@JsonIgnore
	private Set<IfcPhysicalComplexQuantity> partOfComplex;


	public IfcPhysicalQuantity()
	{
	}

	public IfcPhysicalQuantity(IfcLabel name)
	{
		this.name = name;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<IfcPhysicalComplexQuantity> getPartOfComplex() {
		return this.partOfComplex;
	}


}

