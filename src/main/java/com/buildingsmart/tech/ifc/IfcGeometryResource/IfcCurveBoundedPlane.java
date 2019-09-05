// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("49f23ea3-63e5-4868-bb6d-dc7fe2e9d879")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveBoundedPlane extends IfcBoundedSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	@Description("The surface to be bound.")
	@Required()
	@Guid("e3507105-8eae-42eb-9122-b8f9474b2507")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlane basisSurface;

	@JacksonXmlProperty(isAttribute=false, localName = "OuterBoundary")
	@Description("The outer boundary of the surface.")
	@Required()
	@Guid("d59dedb7-409b-40f2-b7f6-780fbf45198e")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary;

	@Description("An optional set of inner boundaries. They shall not intersect each other or the outer boundary.")
	@Required()
	@Guid("33e2f437-e02b-4345-af76-39640de58ff3")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> innerBoundaries = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve>();


	public IfcCurveBoundedPlane()
	{
	}

	public IfcCurveBoundedPlane(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlane basisSurface, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve[] innerBoundaries)
	{
		this.basisSurface = basisSurface;
		this.outerBoundary = outerBoundary;
		this.innerBoundaries = new HashSet<>(Arrays.asList(innerBoundaries));
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlane getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlane basisSurface) {
		this.basisSurface = basisSurface;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getOuterBoundary() {
		return this.outerBoundary;
	}

	public void setOuterBoundary(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary) {
		this.outerBoundary = outerBoundary;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

