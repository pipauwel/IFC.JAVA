// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("77f373d7-e77d-410a-a47e-47b03b73fc39")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVertexPoint extends IfcVertex implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcPointOrVertexPoint
{
	@Description("The geometric point, which defines the position in geometric space of the vertex.")
	@DataMember(Order = 0)
	@Required()
	@Guid("908edc85-594d-4aa2-bec6-a352ddd90a08")
	@JacksonXmlProperty(isAttribute=false, localName = "vertexGeometry")
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

