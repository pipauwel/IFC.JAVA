// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("993ba75f-6b94-4c8c-b4c4-ba41608e3dc4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOffsetCurve3D extends IfcCurve
{
	@Description("The curve that is being offset.")
	@Required()
	@Guid("ceac1059-777f-4fab-a439-4fe198b2a7b1")
	@JacksonXmlProperty(isAttribute=false, localName = "BasisCurve")
	private IfcCurve basisCurve;

	@Description("The distance of the offset curve from the basis curve. The distance may be positive, negative or zero.")
	@Required()
	@Guid("875036b8-1aba-4de6-9e1d-c77a4f761fcb")
	@JacksonXmlProperty(isAttribute=true, localName = "Distance")
	private double distance;

	@Description("An indication of whether the offset curve self-intersects, this is for information only.")
	@Required()
	@Guid("7b5fafd0-453a-4ce8-b2d4-06ba1b08a15b")
	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	private Boolean selfIntersect;

	@Description("The direction used to define the direction of the offset curve 3d from the basis curve.")
	@Required()
	@Guid("5a018675-aaa2-4e06-8c88-1c7f4e8c0012")
	@JacksonXmlProperty(isAttribute=false, localName = "RefDirection")
	private IfcDirection refDirection;


	public IfcOffsetCurve3D()
	{
	}

	public IfcOffsetCurve3D(IfcCurve basisCurve, double distance, Boolean selfIntersect, IfcDirection refDirection)
	{
		this.basisCurve = basisCurve;
		this.distance = distance;
		this.selfIntersect = selfIntersect;
		this.refDirection = refDirection;
	}

	public IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(IfcCurve basisCurve) {
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

	public IfcDirection getRefDirection() {
		return this.refDirection;
	}

	public void setRefDirection(IfcDirection refDirection) {
		this.refDirection = refDirection;
	}


}

