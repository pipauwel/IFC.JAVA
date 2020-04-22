// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeModel;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcStyleModel;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;

@Guid("487b5a0c-6904-49ae-b622-ec42a5535b20")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcShapeModel.class, name = "IfcShapeModel"), @JsonSubTypes.Type(value = IfcStyleModel.class, name = "IfcStyleModel")})
public abstract class IfcRepresentation implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem
{
	@Description("Definition of the representation context for which the different subtypes of representation are valid.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6397c6c3-ac2a-4444-874a-e1a8248e1f7c")
	@JacksonXmlProperty(isAttribute=false, localName = "ContextOfItems")
	private IfcRepresentationContext contextOfItems;

	@Description("The optional identifier of the representation as used within a project.")
	@DataMember(Order = 1)
	@Guid("834bd505-97aa-424b-a4f3-63bbb4c9fff4")
	@JacksonXmlProperty(isAttribute=true, localName = "RepresentationIdentifier")
	private String representationIdentifier;

	@Description("The description of the type of a representation context. The representation type defines the type of geometry or topology used for representing the product representation. More information is given at the subtypes <em>IfcShapeRepresentation</em> and <em>IfcTopologyRepresentation</em>.<br>  The supported values for context type are to be specified by implementers agreements.")
	@DataMember(Order = 2)
	@Guid("6db71c93-5688-4d8a-b1f8-3d56e73ed944")
	@JacksonXmlProperty(isAttribute=true, localName = "RepresentationType")
	private String representationType;

	@Description("Set of geometric representation items that are defined for this representation.")
	@DataMember(Order = 3)
	@Required()
	@Guid("cc5827e6-652d-4ef5-b908-5305d2831319")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentationItem")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Items")
	private Set<IfcRepresentationItem> items;

	@Description("Use of the representation within an <em>IfcRepresentationMap</em>. If used, this <em>IfcRepresentation</em> may be assigned to many representations as one of its <em>Items</em> using an <em>IfcMappedItem</em>. Using <em>IfcRepresentationMap</em> is the way to share one representation (often of type <em>IfcShapeRepresentation</em>) by many products.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added</blockquote>")
	@InverseProperty(InverseProp = "MappedRepresentation", Range = "IfcRepresentationMap")
	@Guid("d66de186-3772-4637-8afe-d9fe4bf7aa65")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentationMap")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RepresentationMap")
	private Set<IfcRepresentationMap> representationMap;

	@Description("Assignment of the whole representation to a single or multiple layer(s). The <em>LayerAssigments</em> can be overridden by <em>LayerAssigments</em> of the <em>IfcRepresentationItem</em>'s within the list of <em>Items</em>.  <blockquote class=\"note\">NOTE&nbsp; Implementation agreements can restrict the maximum number of layer assignments to 1.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added</blockquote>")
	@InverseProperty(InverseProp = "AssignedItems", Range = "IfcPresentationLayerAssignment")
	@Guid("25d8e6f0-a248-4327-97e1-5cfd45416980")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPresentationLayerAssignment")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "LayerAssignments")
	private Set<IfcPresentationLayerAssignment> layerAssignments;

	@Description("Reference to the product representations to which this individual representation applies. In most cases it is the reference to one or many product shapes, to which this shape representation is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Inverse relationship cardinality relaxed to be 0:N.</blockquote>")
	@InverseProperty(InverseProp = "Representations", Range = "IfcProductRepresentation")
	@Guid("c55fb5c3-aac5-47ac-adf5-5afc03392f9b")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProductRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "OfProductRepresentation")
	private Set<IfcProductRepresentation> ofProductRepresentation;


	public IfcRepresentation()
	{
	}

	public IfcRepresentation(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		this.contextOfItems = contextOfItems;
		this.items = new HashSet<>(Arrays.asList(items));
	}

	public IfcRepresentationContext getContextOfItems() {
		return this.contextOfItems;
	}

	public void setContextOfItems(IfcRepresentationContext contextOfItems) {
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

	public Set<IfcRepresentationItem> getItems() {
		return this.items;
	}

	public Set<IfcRepresentationMap> getRepresentationMap() {
		return this.representationMap;
	}

	public Set<IfcPresentationLayerAssignment> getLayerAssignments() {
		return this.layerAssignments;
	}

	public Set<IfcProductRepresentation> getOfProductRepresentation() {
		return this.ofProductRepresentation;
	}


}

