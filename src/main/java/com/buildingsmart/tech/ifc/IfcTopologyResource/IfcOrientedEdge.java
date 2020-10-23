// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a0cbcd65-91d4-42a9-ba31-58d592875aa7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrientedEdge extends IfcEdge
{
	@Description("Edge entity used to construct this oriented edge.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c7122e72-f5c7-4ed0-97e7-f3feadf775d9")
	@JacksonXmlProperty(isAttribute=false, localName = "edgeElement")
	private IfcEdge edgeElement;

	@Description("BOOLEAN, If TRUE the topological orientation as used coincides with the orientation from start vertex to end vertex of the edge element. If FALSE otherwise.")
	@DataMember(Order = 1)
	@Required()
	@Guid("6fa9df70-e436-49e6-860f-f18263e0e214")
	@JacksonXmlProperty(isAttribute=false, localName = "orientation")
	private IfcBoolean orientation;


	public IfcOrientedEdge()
	{
	}

	public IfcOrientedEdge(IfcVertex edgeStart, IfcVertex edgeEnd, IfcEdge edgeElement, IfcBoolean orientation)
	{
		super(edgeStart, edgeEnd);
		this.edgeElement = edgeElement;
		this.orientation = orientation;
	}

	public IfcEdge getEdgeElement() {
		return this.edgeElement;
	}

	public void setEdgeElement(IfcEdge edgeElement) {
		this.edgeElement = edgeElement;
	}

	public IfcBoolean getOrientation() {
		return this.orientation;
	}

	public void setOrientation(IfcBoolean orientation) {
		this.orientation = orientation;
	}

	public IfcVertex getEdgeStart() {
		//TODO
		// EdgeStart:=IfcBooleanChoose (Orientation, EdgeElement.EdgeStart, EdgeElement.EdgeEnd)
		return null;
	}

	public IfcVertex getEdgeEnd() {
		//TODO
		// EdgeEnd:=IfcBooleanChoose (Orientation, EdgeElement.EdgeEnd, EdgeElement.EdgeStart)
		return null;
	}


}

