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
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint;

@Guid("77f373d7-e77d-410a-a47e-47b03b73fc39")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVertexPoint extends IfcVertex implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcPointOrVertexPoint
{
	@Description("The geometric point, which defines the position in geometric space of the vertex.")
	@Required()
	@Guid("908edc85-594d-4aa2-bec6-a352ddd90a08")
	@JacksonXmlProperty(isAttribute=false, localName = "VertexGeometry")
	private IfcPoint vertexGeometry;


	public IfcVertexPoint()
	{
	}

	public IfcVertexPoint(IfcPoint vertexGeometry)
	{
		this.vertexGeometry = vertexGeometry;
	}

	public IfcPoint getVertexGeometry() {
		return this.vertexGeometry;
	}

	public void setVertexGeometry(IfcPoint vertexGeometry) {
		this.vertexGeometry = vertexGeometry;
	}


}

