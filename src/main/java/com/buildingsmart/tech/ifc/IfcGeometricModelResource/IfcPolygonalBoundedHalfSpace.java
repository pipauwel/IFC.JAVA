// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("65e9d30b-d646-47b9-a5b5-e3d5e4d6323c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("<p>Definition of the position coordinate system for the bounding polyline <STRIKE>and the base surface</STRIKE>.</p>")
	@Required()
	@Guid("512ffcfa-0a74-4a77-a54d-02c512a55ac9")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position;

	@JacksonXmlProperty(isAttribute=false, localName = "PolygonalBoundary")
	@Description("Two-dimensional <strike>polyline</strike> bounded curve, defined in the xy plane of the position coordinate system.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The attribute type has been changed from <em>IfcPolyline</em> to its supertype <em>IfcBoundedCurve</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("4e5eaaf9-5a26-4560-a6b2-29a59c914215")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve polygonalBoundary;


	public IfcPolygonalBoundedHalfSpace()
	{
	}

	public IfcPolygonalBoundedHalfSpace(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface baseSurface, Boolean agreementFlag, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve polygonalBoundary)
	{
		super(baseSurface, agreementFlag);
		this.position = position;
		this.polygonalBoundary = polygonalBoundary;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position) {
		this.position = position;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve getPolygonalBoundary() {
		return this.polygonalBoundary;
	}

	public void setPolygonalBoundary(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve polygonalBoundary) {
		this.polygonalBoundary = polygonalBoundary;
	}


}

