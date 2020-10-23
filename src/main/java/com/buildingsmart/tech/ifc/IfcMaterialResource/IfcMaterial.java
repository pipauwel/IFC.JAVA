// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMaterialDefinitionRepresentation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;
import java.util.UUID;

@Guid("b36052ed-896b-48e8-b655-a1b4cb67f826")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcMaterial extends IfcMaterialDefinition
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("Name of the material.   <blockquote class=\"example\">EXAMPLE A view definition may require <em>Material.Name</em> to uniquely specify e.g. concrete or steel grade, in which case the attribute Material.Category could take the value 'Concrete' or 'Steel'. </blockquote>    <blockquote class=\"note\">  NOTE&nbsp; Material grade may have different meaning in different view definitions, e.g. strength grade for structural design and analysis, or visible appearance grade in architectural application. Also, more elaborate material grade definition may be associated as classification via inverse attribute <em>HasExternalReferences</em>.  </blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("b6883bdf-1f6e-4067-b785-e3f69c39dd13")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Definition of the material in more descriptive terms than given by attributes <em>Name</em> or <em>Category</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("b3710d03-ea05-40f7-8d3a-049eeb34dc83")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Definition of the category (group or type) of material, in more general terms than given by attribute <em>Name</em>.    <blockquote class=\"example\">EXAMPLE A view definition may require each <em>Material.Name</em> to be unique, e.g. for each concrete or steel grade used in a project, in which case <em>Material.Category</em> could take the values 'Concrete' or 'Steel'.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.</blockquote>")
	@DataMember(Order = 2)
	@Guid("71f2628a-7d92-42dc-8cae-f750d95d60d0")
	@JacksonXmlProperty(isAttribute=false, localName = "category")
	private IfcLabel category;

	@Description("Reference to the <em>IfcMaterialDefinitionRepresentation</em> that provides presentation information to a representation common to this material in style definitions.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>HasRepresentation</em> has been added.</blockquote>")
	@InverseProperty(InverseProp = "representedMaterial", Range = "IfcMaterialDefinitionRepresentation")
	@Guid("7807052f-f464-49e8-8e1f-76be0f2e6d53")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialDefinitionRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasRepresentation")
	private Set<IfcMaterialDefinitionRepresentation> hasRepresentation;

	@Description("Reference to a material relationship indicating that this material is a part (or constituent) in a material composite.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "relatedMaterials", Range = "IfcMaterialRelationship")
	@Guid("fad3b164-50b4-446a-be5d-7f148ddf544d")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isRelatedWith")*/
	@JsonIgnore
	private Set<IfcMaterialRelationship> isRelatedWith;

	@Description("Reference to a material relationship indicating that this material composite has parts (or constituents).  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "relatingMaterial", Range = "IfcMaterialRelationship")
	@Guid("dee9726c-471e-4e55-8ed6-2fa143b0f671")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatesTo")
	private Set<IfcMaterialRelationship> relatesTo;


	public IfcMaterial()
	{
		this.globalId = UUID.randomUUID();
	}

	public IfcMaterial(IfcLabel name)
	{
		this.name = name;
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
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

	public IfcLabel getCategory() {
		return this.category;
	}

	public void setCategory(IfcLabel category) {
		this.category = category;
	}

	public Set<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
		return this.hasRepresentation;
	}

	public Set<IfcMaterialRelationship> getIsRelatedWith() {
		return this.isRelatedWith;
	}

	public Set<IfcMaterialRelationship> getRelatesTo() {
		return this.relatesTo;
	}


}

