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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("86ef7edf-f099-47aa-977b-0bc982b8db88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEdgeCurve extends IfcEdge implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve
{
	@Description("The curve which defines the shape and spatial location of the edge. This curve may be unbounded and is implicitly trimmed by the vertices of the edge; this defines the edge domain. Multiple edges can reference the same curve.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5cdae291-5fb5-4980-bb06-4373b159e076")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeGeometry")
	private IfcCurve edgeGeometry;

	@Description("This logical flag indicates whether (TRUE), or not (FALSE) the senses of the edge and the curve defining the edge geometry are the same. The sense of an edge is from the edge start vertex to the edge end vertex; the sense of a curve is in the direction of increasing parameter.")
	@DataMember(Order = 1)
	@Required()
	@Guid("12a92453-5480-4793-989a-273e604a2079")
	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	private Boolean sameSense;


	public IfcEdgeCurve()
	{
	}

	public IfcEdgeCurve(IfcVertex edgeStart, IfcVertex edgeEnd, IfcCurve edgeGeometry, Boolean sameSense)
	{
		super(edgeStart, edgeEnd);
		this.edgeGeometry = edgeGeometry;
		this.sameSense = sameSense;
	}

	public IfcCurve getEdgeGeometry() {
		return this.edgeGeometry;
	}

	public void setEdgeGeometry(IfcCurve edgeGeometry) {
		this.edgeGeometry = edgeGeometry;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}


}

