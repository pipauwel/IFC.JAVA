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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRationalBSplineCurveWithKnots;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType;

@Guid("5cf374d3-9550-4d89-8870-9e50d9d4d7f6")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRationalBSplineCurveWithKnots.class, name = "IfcRationalBSplineCurveWithKnots"))
public class IfcBSplineCurveWithKnots extends IfcBSplineCurve
{
	@Description("The multiplicities of the knots. This list defines the number of times each knot in the knots list is to be repeated in constructing the knot array.")
	@Required()
	@Guid("4dae82bb-9535-43aa-a1a7-baf777ce6fda")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Integer")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "KnotMultiplicities")
	private List<Integer> knotMultiplicities;

	@Description("The list of distinct knots used to define the B-spline basis functions.")
	@Required()
	@Guid("44c6204a-ed46-49b4-a5ef-200b9dd80f13")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Knots")
	private List<Double> knots;

	@Description("The description of the knot type. This is for information only.")
	@Required()
	@Guid("fe56ab5c-8a68-43ab-820c-5c7f6d9f1111")
	@JacksonXmlProperty(isAttribute=true, localName = "KnotSpec")
	private IfcKnotType knotSpec;


	public IfcBSplineCurveWithKnots()
	{
	}

	public IfcBSplineCurveWithKnots(int degree, IfcCartesianPoint[] controlPointsList, IfcBSplineCurveForm curveForm, Boolean closedCurve, Boolean selfIntersect, Integer[] knotMultiplicities, Double[] knots, IfcKnotType knotSpec)
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

	public IfcKnotType getKnotSpec() {
		return this.knotSpec;
	}

	public void setKnotSpec(IfcKnotType knotSpec) {
		this.knotSpec = knotSpec;
	}

	public int getUpperIndexOnKnots() {
		return 0;
	}


}

