// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b36052ed-896b-48e8-b655-a1b4cb67f826")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterial extends IfcMaterialDefinition
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name of the material.   <blockquote class=\"example\">EXAMPLE A view definition may require <em>Material.Name</em> to uniquely specify e.g. concrete or steel grade, in which case the attribute Material.Category could take the value 'Concrete' or 'Steel'. </blockquote>    <blockquote class=\"note\">  NOTE&nbsp; Material grade may have different meaning in different view definitions, e.g. strength grade for structural design and analysis, or visible appearance grade in architectural application. Also, more elaborate material grade definition may be associated as classification via inverse attribute <em>HasExternalReferences</em>.  </blockquote>")
	@Required()
	@Guid("b6883bdf-1f6e-4067-b785-e3f69c39dd13")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Definition of the material in more descriptive terms than given by attributes <em>Name</em> or <em>Category</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.</blockquote>")
	@Guid("b3710d03-ea05-40f7-8d3a-049eeb34dc83")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "Category")
	@Description("Definition of the category (group or type) of material, in more general terms than given by attribute <em>Name</em>.    <blockquote class=\"example\">EXAMPLE A view definition may require each <em>Material.Name</em> to be unique, e.g. for each concrete or steel grade used in a project, in which case <em>Material.Category</em> could take the values 'Concrete' or 'Steel'.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.</blockquote>")
	@Guid("71f2628a-7d92-42dc-8cae-f750d95d60d0")
	private String category;

	@JacksonXmlProperty(isAttribute=false, localName = "HasRepresentation")
	@Description("Reference to the <em>IfcMaterialDefinitionRepresentation</em> that provides presentation information to a representation common to this material in style definitions.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>HasRepresentation</em> has been added.</blockquote>")
	@MaxLength(1)
	@Guid("7807052f-f464-49e8-8e1f-76be0f2e6d53")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMaterialDefinitionRepresentation> hasRepresentation = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMaterialDefinitionRepresentation>();

	@Description("Reference to a material relationship indicating that this material is a part (or constituent) in a material composite.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@Guid("fad3b164-50b4-446a-be5d-7f148ddf544d")
	private Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship> isRelatedWith = new HashSet<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship>();

	@Description("Reference to a material relationship indicating that this material composite has parts (or constituents).  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@MaxLength(1)
	@Guid("dee9726c-471e-4e55-8ed6-2fa143b0f671")
	private Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship> relatesTo = new HashSet<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship>();


	public IfcMaterial()
	{
	}

	public IfcMaterial(String name)
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMaterialDefinitionRepresentation> getHasRepresentation() {
		return this.hasRepresentation;
	}

	public Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship> getIsRelatedWith() {
		return this.isRelatedWith;
	}

	public Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship> getRelatesTo() {
		return this.relatesTo;
	}


}

