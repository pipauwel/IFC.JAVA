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

@Guid("77f373d7-e77d-410a-a47e-47b03b73fc39")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVertexPoint extends IfcVertex implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcPointOrVertexPoint
{
	@JacksonXmlProperty(isAttribute=false, localName = "VertexGeometry")
	@Description("The geometric point, which defines the position in geometric space of the vertex.")
	@Required()
	@Guid("908edc85-594d-4aa2-bec6-a352ddd90a08")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint vertexGeometry;


	public IfcVertexPoint()
	{
	}

	public IfcVertexPoint(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint vertexGeometry)
	{
		this.vertexGeometry = vertexGeometry;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint getVertexGeometry() {
		return this.vertexGeometry;
	}

	public void setVertexGeometry(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint vertexGeometry) {
		this.vertexGeometry = vertexGeometry;
	}


}

