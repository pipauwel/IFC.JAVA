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

@Guid("b9435164-1687-4e0f-8afc-85feadf601cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcBSplineCurve extends IfcBoundedCurve
{
	@JacksonXmlProperty(isAttribute=true, localName = "Degree")
	@Description("The algebraic degree of the basis functions.")
	@Required()
	@Guid("9215ef5b-0c61-4dd2-97ed-6c70dc669532")
	private int degree;

	@Description("The list of control points for the curve.")
	@Required()
	@MinLength(2)
	@Guid("49ee485c-b8e8-460a-877e-a0df0214a5b9")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> controlPointsList = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint>();

	@JacksonXmlProperty(isAttribute=true, localName = "CurveForm")
	@Description("Used to identify particular types of curve; it is for information only.")
	@Required()
	@Guid("533eaddc-7020-4be6-bd8d-f8f6c4d72442")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm curveForm;

	@JacksonXmlProperty(isAttribute=true, localName = "ClosedCurve")
	@Description("Indication of whether the curve is closed; it is for information only.")
	@Required()
	@Guid("01035261-65db-467b-ad2b-1c4d21786723")
	private Boolean closedCurve;

	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	@Description("Indication whether the curve self-intersects or not; it is for information only.")
	@Required()
	@Guid("35b37f03-d9bc-4662-8c51-80a08918556a")
	private Boolean selfIntersect;


	public IfcBSplineCurve()
	{
	}

	public IfcBSplineCurve(int degree, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] controlPointsList, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm curveForm, Boolean closedCurve, Boolean selfIntersect)
	{
		this.degree = degree;
		this.controlPointsList = new ArrayList<>(Arrays.asList(controlPointsList));
		this.curveForm = curveForm;
		this.closedCurve = closedCurve;
		this.selfIntersect = selfIntersect;
	}

	public int getDegree() {
		return this.degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> getControlPointsList() {
		return this.controlPointsList;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm getCurveForm() {
		return this.curveForm;
	}

	public void setCurveForm(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm curveForm) {
		this.curveForm = curveForm;
	}

	public Boolean getClosedCurve() {
		return this.closedCurve;
	}

	public void setClosedCurve(Boolean closedCurve) {
		this.closedCurve = closedCurve;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getUpperIndexOnControlPoints() {
		return 0;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getControlPoints() {
		return null;
	}


}

