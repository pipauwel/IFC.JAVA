// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6cc49723-24d6-446e-b2cc-fef52a6229c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcBSplineSurface extends IfcBoundedSurface
{
	@JacksonXmlProperty(isAttribute=true, localName = "UDegree")
	@Description("Algebraic degree of basis functions in <em>u</em>.")
	@Required()
	@Guid("fa4795fe-5b45-439d-8feb-3e45270923c0")
	private int uDegree;

	@JacksonXmlProperty(isAttribute=true, localName = "VDegree")
	@Description("Algebraic degree of basis functions in <em>v</em>.")
	@Required()
	@Guid("519ed324-1b3a-4f12-b23a-87603ec0d73b")
	private int vDegree;

	@JacksonXmlProperty(isAttribute=false, localName = "ControlPointsList")
	@Description("This is a list of lists of control points.")
	@Required()
	@MinLength(2)
	@Guid("bc33338e-2b58-4a61-b633-ccf5c80fe59b")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> controlPointsList = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint>();

	@JacksonXmlProperty(isAttribute=true, localName = "SurfaceForm")
	@Description("Indicator of special surface types.")
	@Required()
	@Guid("1a4a38ca-a512-42d4-94f7-13932a6fc328")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm surfaceForm;

	@JacksonXmlProperty(isAttribute=true, localName = "UClosed")
	@Description("Indication of whether the surface is closed in the <em>u</em> direction; this is for information only.")
	@Required()
	@Guid("f2d1928f-a5de-487f-a35f-907192690a47")
	private Boolean uClosed;

	@JacksonXmlProperty(isAttribute=true, localName = "VClosed")
	@Description("Indication of whether the surface is closed in the <em>v</em> direction; this is for information only.")
	@Required()
	@Guid("b71632d8-d689-4f75-a1da-1192c00c2f21")
	private Boolean vClosed;

	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	@Description("Flag to indicate whether, or not, surface is self-intersecting; this is for information only.")
	@Required()
	@Guid("c4e7537e-84c5-49f8-9096-5fb6efa3c248")
	private Boolean selfIntersect;


	public IfcBSplineSurface()
	{
	}

	public IfcBSplineSurface(int uDegree, int vDegree, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] controlPointsList, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm surfaceForm, Boolean uClosed, Boolean vClosed, Boolean selfIntersect)
	{
		this.uDegree = uDegree;
		this.vDegree = vDegree;
		this.controlPointsList = new ArrayList<>(Arrays.asList(controlPointsList));
		this.surfaceForm = surfaceForm;
		this.uClosed = uClosed;
		this.vClosed = vClosed;
		this.selfIntersect = selfIntersect;
	}

	public int getUDegree() {
		return this.uDegree;
	}

	public void setUDegree(int uDegree) {
		this.uDegree = uDegree;
	}

	public int getVDegree() {
		return this.vDegree;
	}

	public void setVDegree(int vDegree) {
		this.vDegree = vDegree;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> getControlPointsList() {
		return this.controlPointsList;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm getSurfaceForm() {
		return this.surfaceForm;
	}

	public void setSurfaceForm(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm surfaceForm) {
		this.surfaceForm = surfaceForm;
	}

	public Boolean getUClosed() {
		return this.uClosed;
	}

	public void setUClosed(Boolean uClosed) {
		this.uClosed = uClosed;
	}

	public Boolean getVClosed() {
		return this.vClosed;
	}

	public void setVClosed(Boolean vClosed) {
		this.vClosed = vClosed;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getUUpper() {
		return 0;
	}

	public int getVUpper() {
		return 0;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getControlPoints() {
		return null;
	}


}

