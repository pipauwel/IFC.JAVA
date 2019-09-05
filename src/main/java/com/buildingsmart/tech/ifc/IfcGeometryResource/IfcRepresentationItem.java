// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e783d84d-d19b-4cf7-a863-f851642523f8")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcRepresentationItem implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem
{
	@Description("Assignment of the representation item to a single or multiple layer(s). The <em>LayerAssignments</em> can override a <em>LayerAssignments</em> of the <em>IfcRepresentation</em> it is used  within the list of <em>Items</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>LayerAssignments</em> has been added.</blockquote>   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute <em>LayerAssignment</em> has  been restricted to max 1. Upward compatibility for file based exchange is guaranteed. </blockquote>")
	@MaxLength(1)
	@Guid("dfe686aa-bc7f-4a2e-a98a-a1bff75b1212")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment> layerAssignment = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment>();

	@JacksonXmlProperty(isAttribute=false, localName = "StyledByItem")
	@Description("Reference to the <em>IfcStyledItem</em> that provides presentation information to the representation, e.g. a curve style, including colour and thickness to a geometric curve.    <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute <em>StyledByItem</em> has been added.</blockquote>")
	@MaxLength(1)
	@Guid("77b7e734-9703-41d6-82ec-f7dcfb179cba")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem> styledByItem = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem>();


	public IfcRepresentationItem()
	{
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerAssignment> getLayerAssignment() {
		return this.layerAssignment;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem> getStyledByItem() {
		return this.styledByItem;
	}


}

