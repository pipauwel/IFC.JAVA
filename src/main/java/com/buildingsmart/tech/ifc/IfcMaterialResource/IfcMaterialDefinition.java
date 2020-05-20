// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelAssociatesMaterial;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;
import java.util.UUID;

@Guid("b31f0891-e60f-4cc1-9b3b-9bbae1fde79c")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterial.class, name = "IfcMaterial"), @JsonSubTypes.Type(value = IfcMaterialConstituent.class, name = "IfcMaterialConstituent"), @JsonSubTypes.Type(value = IfcMaterialConstituentSet.class, name = "IfcMaterialConstituentSet"), @JsonSubTypes.Type(value = IfcMaterialLayer.class, name = "IfcMaterialLayer"), @JsonSubTypes.Type(value = IfcMaterialLayerSet.class, name = "IfcMaterialLayerSet"), @JsonSubTypes.Type(value = IfcMaterialProfile.class, name = "IfcMaterialProfile"), @JsonSubTypes.Type(value = IfcMaterialProfileSet.class, name = "IfcMaterialProfileSet")})
public abstract class IfcMaterialDefinition implements IfcMaterialSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("Use of the <em>IfcMaterialDefinition</em> subtypes within the material association of an element occurrence or element type. The association is established by the <em>IfcRelAssociatesMaterial</em> relationship.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "relatingMaterial", Range = "IfcRelAssociatesMaterial")
	@Guid("b1ec3680-78e2-4c73-915a-89a294a334a7")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesMaterial")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "associatedTo")*/
	@JsonIgnore
	private Set<IfcRelAssociatesMaterial> associatedTo;

	@Description("Reference to external references, e.g. library, classification, or document information, that are associated to the material.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("d28dbc0d-d8f5-445d-8f01-e84587f1ef49")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReferences")
	private Set<IfcExternalReferenceRelationship> hasExternalReferences;

	@Description("Material properties assigned to instances of subtypes of <em>IfcMaterialDefinition</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "material", Range = "IfcMaterialProperties")
	@Guid("d60a2049-8e83-46d1-9e06-029c5163fab4")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasProperties")
	private Set<IfcMaterialProperties> hasProperties;


	public IfcMaterialDefinition()
	{
		this.globalId = UUID.randomUUID();
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
	}

	public Set<IfcRelAssociatesMaterial> getAssociatedTo() {
		return this.associatedTo;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<IfcMaterialProperties> getHasProperties() {
		return this.hasProperties;
	}


}

