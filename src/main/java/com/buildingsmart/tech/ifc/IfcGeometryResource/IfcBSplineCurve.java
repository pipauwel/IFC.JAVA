// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("b9435164-1687-4e0f-8afc-85feadf601cd")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBSplineCurveWithKnots.class, name = "IfcBSplineCurveWithKnots"))
public abstract class IfcBSplineCurve extends IfcBoundedCurve
{
	@Description("The algebraic degree of the basis functions.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9215ef5b-0c61-4dd2-97ed-6c70dc669532")
	@JacksonXmlProperty(isAttribute=false, localName = "degree")
	private IfcInteger degree;

	@Description("The list of control points for the curve.")
	@DataMember(Order = 1)
	@Required()
	@Guid("49ee485c-b8e8-460a-877e-a0df0214a5b9")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "controlPointsList")
	private List<IfcCartesianPoint> controlPointsList;

	@Description("Used to identify particular types of curve; it is for information only.")
	@DataMember(Order = 2)
	@Required()
	@Guid("533eaddc-7020-4be6-bd8d-f8f6c4d72442")
	@JacksonXmlProperty(isAttribute=true, localName = "curveForm")
	private IfcBSplineCurveForm curveForm;

	@Description("Indication of whether the curve is closed; it is for information only.")
	@DataMember(Order = 3)
	@Required()
	@Guid("01035261-65db-467b-ad2b-1c4d21786723")
	@JacksonXmlProperty(isAttribute=true, localName = "closedCurve")
	private IfcLogical closedCurve;

	@Description("Indication whether the curve self-intersects or not; it is for information only.")
	@DataMember(Order = 4)
	@Required()
	@Guid("35b37f03-d9bc-4662-8c51-80a08918556a")
	@JacksonXmlProperty(isAttribute=true, localName = "selfIntersect")
	private IfcLogical selfIntersect;


	public IfcBSplineCurve()
	{
	}

	public IfcBSplineCurve(IfcInteger degree, IfcCartesianPoint[] controlPointsList, IfcBSplineCurveForm curveForm, IfcLogical closedCurve, IfcLogical selfIntersect)
	{
		this.degree = degree;
		this.controlPointsList = new ArrayList<>(Arrays.asList(controlPointsList));
		this.curveForm = curveForm;
		this.closedCurve = closedCurve;
		this.selfIntersect = selfIntersect;
	}

	public IfcInteger getDegree() {
		return this.degree;
	}

	public void setDegree(IfcInteger degree) {
		this.degree = degree;
	}

	public List<IfcCartesianPoint> getControlPointsList() {
		return this.controlPointsList;
	}

	public IfcBSplineCurveForm getCurveForm() {
		return this.curveForm;
	}

	public void setCurveForm(IfcBSplineCurveForm curveForm) {
		this.curveForm = curveForm;
	}

	public IfcLogical getClosedCurve() {
		return this.closedCurve;
	}

	public void setClosedCurve(IfcLogical closedCurve) {
		this.closedCurve = closedCurve;
	}

	public IfcLogical getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(IfcLogical selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getUpperIndexOnControlPoints() {
		return 0;
	}

	public IfcCartesianPoint getControlPoints() {
		return null;
	}


}

