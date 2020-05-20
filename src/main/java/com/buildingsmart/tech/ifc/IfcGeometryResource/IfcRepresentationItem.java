// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcTopologicalRepresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("e783d84d-d19b-4cf7-a863-f851642523f8")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcGeometricRepresentationItem.class, name = "IfcGeometricRepresentationItem"),
		@JsonSubTypes.Type(value = IfcMappedItem.class, name = "IfcMappedItem"),
		@JsonSubTypes.Type(value = IfcStyledItem.class, name = "IfcStyledItem"),
		@JsonSubTypes.Type(value = IfcTopologicalRepresentationItem.class, name = "IfcTopologicalRepresentationItem")})
public abstract class IfcRepresentationItem implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem
{
	@Description("Assignment of the representation item to a single or multiple layer(s). The <em>LayerAssignments</em> can override a <em>LayerAssignments</em> of the <em>IfcRepresentation</em> it is used  within the list of <em>Items</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added.</blockquote>   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute <em>LayerAssignment</em> has  been restricted to max 1. Upward compatibility for file based exchange is guaranteed. </blockquote>")
	@InverseProperty(InverseProp = "assignedItems", Range = "IfcPresentationLayerAssignment")
	@Guid("dfe686aa-bc7f-4a2e-a98a-a1bff75b1212")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPresentationLayerAssignment")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "layerAssignment")
	private Set<IfcPresentationLayerAssignment> layerAssignment;

	@Description("Reference to the <em>IfcStyledItem</em> that provides presentation information to the representation, e.g. a curve style, including colour and thickness to a geometric curve.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>StyledByItem</em> has been added.</blockquote>")
	@InverseProperty(InverseProp = "item", Range = "IfcStyledItem")
	@Guid("77b7e734-9703-41d6-82ec-f7dcfb179cba")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStyledItem")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "styledByItem")
	private Set<IfcStyledItem> styledByItem;


	public IfcRepresentationItem()
	{
	}

	public Set<IfcPresentationLayerAssignment> getLayerAssignment() {
		return this.layerAssignment;
	}

	public Set<IfcStyledItem> getStyledByItem() {
		return this.styledByItem;
	}


}

