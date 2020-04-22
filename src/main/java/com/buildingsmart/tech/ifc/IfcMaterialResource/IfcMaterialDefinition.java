// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialConstituent;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialConstituentSet;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfile;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet;

@Guid("b31f0891-e60f-4cc1-9b3b-9bbae1fde79c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterial.class, name = "IfcMaterial"), @JsonSubTypes.Type(value = IfcMaterialConstituent.class, name = "IfcMaterialConstituent"), @JsonSubTypes.Type(value = IfcMaterialConstituentSet.class, name = "IfcMaterialConstituentSet"), @JsonSubTypes.Type(value = IfcMaterialLayer.class, name = "IfcMaterialLayer"), @JsonSubTypes.Type(value = IfcMaterialLayerSet.class, name = "IfcMaterialLayerSet"), @JsonSubTypes.Type(value = IfcMaterialProfile.class, name = "IfcMaterialProfile"), @JsonSubTypes.Type(value = IfcMaterialProfileSet.class, name = "IfcMaterialProfileSet")})
public abstract class IfcMaterialDefinition implements IfcMaterialSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Use of the <em>IfcMaterialDefinition</em> subtypes within the material association of an element occurrence or element type. The association is established by the <em>IfcRelAssociatesMaterial</em> relationship.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "RelatingMaterial", Range = "IfcRelAssociatesMaterial")
	@Guid("b1ec3680-78e2-4c73-915a-89a294a334a7")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesMaterial")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "AssociatedTo")
	private Set<IfcRelAssociatesMaterial> associatedTo;

	@Description("Reference to external references, e.g. library, classification, or document information, that are associated to the material.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "RelatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("d28dbc0d-d8f5-445d-8f01-e84587f1ef49")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasExternalReferences")
	private Set<IfcExternalReferenceRelationship> hasExternalReferences;

	@Description("Material properties assigned to instances of subtypes of <em>IfcMaterialDefinition</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been added.</blockquote>")
	@InverseProperty(InverseProp = "Material", Range = "IfcMaterialProperties")
	@Guid("d60a2049-8e83-46d1-9e06-029c5163fab4")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasProperties")
	private Set<IfcMaterialProperties> hasProperties;


	public IfcMaterialDefinition()
	{
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

