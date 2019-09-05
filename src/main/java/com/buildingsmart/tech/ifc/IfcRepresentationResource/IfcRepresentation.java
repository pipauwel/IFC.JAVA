// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("487b5a0c-6904-49ae-b622-ec42a5535b20")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcRepresentation implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "ContextOfItems")
	@Description("Definition of the representation context for which the different subtypes of representation are valid.")
	@Required()
	@Guid("6397c6c3-ac2a-4444-874a-e1a8248e1f7c")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems;

	@JacksonXmlProperty(isAttribute=true, localName = "RepresentationIdentifier")
	@Description("The optional identifier of the representation as used within a project.")
	@Guid("834bd505-97aa-424b-a4f3-63bbb4c9fff4")
	private String representationIdentifier;

	@JacksonXmlProperty(isAttribute=true, localName = "RepresentationType")
	@Description("The description of the type of a representation context. The representation type defines the type of geometry or topology used for representing the product representation. More information is given at the subtypes <em>IfcShapeRepresentation</em> and <em>IfcTopologyRepresentation</em>.<br>  The supported values for context type are to be specified by implementers agreements.")
	@Guid("6db71c93-5688-4d8a-b1f8-3d56e73ed944")
	private String representationType;

	@Description("Set of geometric representation items that are defined for this representation.")
	@Required()
	@MinLength(1)
	@Guid("cc5827e6-652d-4ef5-b908-5305d2831319")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem> items = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem>();

	@Description("Use of the representation within an <em>IfcRepresentationMap</em>. If used, this <em>IfcRepresentation</em> may be assigned to many representations as one of its <em>Items</em> using an <em>IfcMappedItem</em>. Using <em>IfcRepresentationMap</em> is the way to share one representation (often of type <em>IfcShapeRepresentation</em>) by many products.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added</blockquote>")
	@MaxLength(1)
	@Guid("d66de186-3772-4637-8afe-d9fe4bf7aa65")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap> representationMap = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap>();

	@Description("Assignment of the whole representation to a single or multiple layer(s). The <em>LayerAssigments</em> can be overridden by <em>LayerAssigments</em> of the <em>IfcRepresentationItem</em>'s within the list of <em>Items</em>.  <blockquote class=\"note\">NOTE&nbsp; Implementation agreements can restrict the maximum number of layer assignments to 1.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added</blockquote>")
	@Guid("25d8e6f0-a248-4327-97e1-5cfd45416980")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment> layerAssignments = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment>();

	@Description("Reference to the product representations to which this individual representation applies. In most cases it is the reference to one or many product shapes, to which this shape representation is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Inverse relationship cardinality relaxed to be 0:N.</blockquote>")
	@Guid("c55fb5c3-aac5-47ac-adf5-5afc03392f9b")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation> ofProductRepresentation = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation>();


	public IfcRepresentation()
	{
	}

	public IfcRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem[] items)
	{
		this.contextOfItems = contextOfItems;
		this.items = new HashSet<>(Arrays.asList(items));
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext getContextOfItems() {
		return this.contextOfItems;
	}

	public void setContextOfItems(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems) {
		this.contextOfItems = contextOfItems;
	}

	public String getRepresentationIdentifier() {
		return this.representationIdentifier;
	}

	public void setRepresentationIdentifier(String representationIdentifier) {
		this.representationIdentifier = representationIdentifier;
	}

	public String getRepresentationType() {
		return this.representationType;
	}

	public void setRepresentationType(String representationType) {
		this.representationType = representationType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem> getItems() {
		return this.items;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap> getRepresentationMap() {
		return this.representationMap;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment> getLayerAssignments() {
		return this.layerAssignments;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation> getOfProductRepresentation() {
		return this.ofProductRepresentation;
	}


}

