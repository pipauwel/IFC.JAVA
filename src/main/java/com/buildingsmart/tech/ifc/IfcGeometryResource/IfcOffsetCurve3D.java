// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("993ba75f-6b94-4c8c-b4c4-ba41608e3dc4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOffsetCurve3D extends IfcCurve
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisCurve")
	@Description("The curve that is being offset.")
	@Required()
	@Guid("ceac1059-777f-4fab-a439-4fe198b2a7b1")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve;

	@JacksonXmlProperty(isAttribute=true, localName = "Distance")
	@Description("The distance of the offset curve from the basis curve. The distance may be positive, negative or zero.")
	@Required()
	@Guid("875036b8-1aba-4de6-9e1d-c77a4f761fcb")
	private double distance;

	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	@Description("An indication of whether the offset curve self-intersects, this is for information only.")
	@Required()
	@Guid("7b5fafd0-453a-4ce8-b2d4-06ba1b08a15b")
	private Boolean selfIntersect;

	@JacksonXmlProperty(isAttribute=false, localName = "RefDirection")
	@Description("The direction used to define the direction of the offset curve 3d from the basis curve.")
	@Required()
	@Guid("5a018675-aaa2-4e06-8c88-1c7f4e8c0012")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection refDirection;


	public IfcOffsetCurve3D()
	{
	}

	public IfcOffsetCurve3D(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve, double distance, Boolean selfIntersect, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection refDirection)
	{
		this.basisCurve = basisCurve;
		this.distance = distance;
		this.selfIntersect = selfIntersect;
		this.refDirection = refDirection;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve) {
		this.basisCurve = basisCurve;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getRefDirection() {
		return this.refDirection;
	}

	public void setRefDirection(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection refDirection) {
		this.refDirection = refDirection;
	}


}

