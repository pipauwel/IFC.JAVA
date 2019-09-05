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

@Guid("5cf374d3-9550-4d89-8870-9e50d9d4d7f6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBSplineCurveWithKnots extends IfcBSplineCurve
{
	@JacksonXmlProperty(isAttribute=true, localName = "KnotMultiplicities")
	@Description("The multiplicities of the knots. This list defines the number of times each knot in the knots list is to be repeated in constructing the knot array.")
	@Required()
	@MinLength(2)
	@Guid("4dae82bb-9535-43aa-a1a7-baf777ce6fda")
	private List<Integer> knotMultiplicities = new ArrayList<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "Knots")
	@Description("The list of distinct knots used to define the B-spline basis functions.")
	@Required()
	@MinLength(2)
	@Guid("44c6204a-ed46-49b4-a5ef-200b9dd80f13")
	private List<Double> knots = new ArrayList<Double>();

	@JacksonXmlProperty(isAttribute=true, localName = "KnotSpec")
	@Description("The description of the knot type. This is for information only.")
	@Required()
	@Guid("fe56ab5c-8a68-43ab-820c-5c7f6d9f1111")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec;


	public IfcBSplineCurveWithKnots()
	{
	}

	public IfcBSplineCurveWithKnots(int degree, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] controlPointsList, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm curveForm, Boolean closedCurve, Boolean selfIntersect, Integer[] knotMultiplicities, Double[] knots, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec)
	{
		super(degree, controlPointsList, curveForm, closedCurve, selfIntersect);
		this.knotMultiplicities = new ArrayList<>(Arrays.asList(knotMultiplicities));
		this.knots = new ArrayList<>(Arrays.asList(knots));
		this.knotSpec = knotSpec;
	}

	public List<Integer> getKnotMultiplicities() {
		return this.knotMultiplicities;
	}

	public List<Double> getKnots() {
		return this.knots;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType getKnotSpec() {
		return this.knotSpec;
	}

	public void setKnotSpec(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec) {
		this.knotSpec = knotSpec;
	}

	public int getUpperIndexOnKnots() {
		return 0;
	}


}

