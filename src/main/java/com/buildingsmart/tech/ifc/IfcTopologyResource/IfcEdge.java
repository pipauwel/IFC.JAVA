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

@Guid("47c088c9-be86-473f-a8d3-cfc2f822e52d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEdge extends IfcTopologicalRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeStart")
	@Description("Start point (vertex) of the edge.")
	@Required()
	@Guid("80c0d5f0-b497-4154-978f-adf7ca3ada45")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeStart;

	@JacksonXmlProperty(isAttribute=false, localName = "EdgeEnd")
	@Description("End point (vertex) of the edge. The same vertex can be used for both EdgeStart and EdgeEnd.")
	@Required()
	@Guid("e751fb52-dd63-46a8-8e2f-9f1b44e78f86")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeEnd;


	public IfcEdge()
	{
	}

	public IfcEdge(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeStart, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeEnd)
	{
		this.edgeStart = edgeStart;
		this.edgeEnd = edgeEnd;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex getEdgeStart() {
		return this.edgeStart;
	}

	public void setEdgeStart(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeStart) {
		this.edgeStart = edgeStart;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex getEdgeEnd() {
		return this.edgeEnd;
	}

	public void setEdgeEnd(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeEnd) {
		this.edgeEnd = edgeEnd;
	}


}

