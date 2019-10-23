// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ed1b8d59-300e-45f5-b8df-fd0e833a761e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes( @JsonSubTypes.Type(value = com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement.class, name = "IfcSpatialElement"))
public abstract class IfcProduct extends IfcObject implements IfcProductSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "ObjectPlacement")
	@Description("Placement of the product in space, the placement can either be absolute (relative to the world coordinate system), relative (relative to the object placement of another product), or constraint (e.g. relative to grid axes). It is determined by the various subtypes of IfcObjectPlacement, which includes the axis placement information to determine the  transformation for the object coordinate system.")
	@Guid("d2d0a44a-3717-40dd-8034-5278124028b2")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement objectPlacement;

	@JacksonXmlProperty(isAttribute=false, localName = "Representation")
	@Description("Reference to the representations of the product, being either a representation (IfcProductRepresentation) or as a special case a shape representations (IfcProductDefinitionShape). The product definition shape provides for multiple geometric representations of the shape property of the object within the same object coordinate system, defined by the object placement.")
	@Guid("dc4c6d0f-4308-4e92-8224-93d3b8194102")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation representation;

	@Description("Reference to the <em>IfcRelAssignsToProduct</em> relationship, by which other products, processes, controls, resources or actors (as subtypes of <em>IfcObjectDefinition</em>) can be related to this product.")
	@Guid("4672f05f-d72b-42d4-880c-01367391c23f")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct> referencedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct>();


	public IfcProduct()
	{
	}

	public IfcProduct(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement getObjectPlacement() {
		return this.objectPlacement;
	}

	public void setObjectPlacement(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement objectPlacement) {
		this.objectPlacement = objectPlacement;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation getRepresentation() {
		return this.representation;
	}

	public void setRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation representation) {
		this.representation = representation;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct> getReferencedBy() {
		return this.referencedBy;
	}


}

