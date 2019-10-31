// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdgeCurve;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcSubedge;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcTopologicalRepresentationItem;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex;

@Guid("47c088c9-be86-473f-a8d3-cfc2f822e52d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEdgeCurve.class, name = "IfcEdgeCurve"), @JsonSubTypes.Type(value = IfcOrientedEdge.class, name = "IfcOrientedEdge"), @JsonSubTypes.Type(value = IfcSubedge.class, name = "IfcSubedge")})
public class IfcEdge extends IfcTopologicalRepresentationItem
{
	@Description("Start point (vertex) of the edge.")
	@Required()
	@Guid("80c0d5f0-b497-4154-978f-adf7ca3ada45")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeStart")
	private IfcVertex edgeStart;

	@Description("End point (vertex) of the edge. The same vertex can be used for both EdgeStart and EdgeEnd.")
	@Required()
	@Guid("e751fb52-dd63-46a8-8e2f-9f1b44e78f86")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeEnd")
	private IfcVertex edgeEnd;


	public IfcEdge()
	{
	}

	public IfcEdge(IfcVertex edgeStart, IfcVertex edgeEnd)
	{
		this.edgeStart = edgeStart;
		this.edgeEnd = edgeEnd;
	}

	public IfcVertex getEdgeStart() {
		return this.edgeStart;
	}

	public void setEdgeStart(IfcVertex edgeStart) {
		this.edgeStart = edgeStart;
	}

	public IfcVertex getEdgeEnd() {
		return this.edgeEnd;
	}

	public void setEdgeEnd(IfcVertex edgeEnd) {
		this.edgeEnd = edgeEnd;
	}


}

