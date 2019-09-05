// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a0cbcd65-91d4-42a9-ba31-58d592875aa7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrientedEdge extends IfcEdge
{
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeElement")
	@Description("Edge entity used to construct this oriented edge.")
	@Required()
	@Guid("c7122e72-f5c7-4ed0-97e7-f3feadf775d9")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge edgeElement;

	@JacksonXmlProperty(isAttribute=true, localName = "Orientation")
	@Description("BOOLEAN, If TRUE the topological orientation as used coincides with the orientation from start vertex to end vertex of the edge element. If FALSE otherwise.")
	@Required()
	@Guid("6fa9df70-e436-49e6-860f-f18263e0e214")
	private Boolean orientation;


	public IfcOrientedEdge()
	{
	}

	public IfcOrientedEdge(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeStart, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeEnd, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge edgeElement, Boolean orientation)
	{
		super(edgeStart, edgeEnd);
		this.edgeElement = edgeElement;
		this.orientation = orientation;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge getEdgeElement() {
		return this.edgeElement;
	}

	public void setEdgeElement(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge edgeElement) {
		this.edgeElement = edgeElement;
	}

	public Boolean getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Boolean orientation) {
		this.orientation = orientation;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex getEdgeStart() {
		return null;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex getEdgeEnd() {
		return null;
	}


}

