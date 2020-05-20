// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcParameterValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("5cf374d3-9550-4d89-8870-9e50d9d4d7f6")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRationalBSplineCurveWithKnots.class, name = "IfcRationalBSplineCurveWithKnots"))
public class IfcBSplineCurveWithKnots extends IfcBSplineCurve
{
	@Description("The multiplicities of the knots. This list defines the number of times each knot in the knots list is to be repeated in constructing the knot array.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4dae82bb-9535-43aa-a1a7-baf777ce6fda")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "knotMultiplicities")
	private List<IfcInteger> knotMultiplicities;

	@Description("The list of distinct knots used to define the B-spline basis functions.")
	@DataMember(Order = 1)
	@Required()
	@Guid("44c6204a-ed46-49b4-a5ef-200b9dd80f13")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcParameterValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "knots")
	private List<IfcParameterValue> knots;

	@Description("The description of the knot type. This is for information only.")
	@DataMember(Order = 2)
	@Required()
	@Guid("fe56ab5c-8a68-43ab-820c-5c7f6d9f1111")
	@JacksonXmlProperty(isAttribute=true, localName = "knotSpec")
	private IfcKnotType knotSpec;


	public IfcBSplineCurveWithKnots()
	{
	}

	public IfcBSplineCurveWithKnots(IfcInteger degree, IfcCartesianPoint[] controlPointsList, IfcBSplineCurveForm curveForm, IfcLogical closedCurve, IfcLogical selfIntersect, IfcInteger[] knotMultiplicities, IfcParameterValue[] knots, IfcKnotType knotSpec)
	{
		super(degree, controlPointsList, curveForm, closedCurve, selfIntersect);
		this.knotMultiplicities = new ArrayList<>(Arrays.asList(knotMultiplicities));
		this.knots = new ArrayList<>(Arrays.asList(knots));
		this.knotSpec = knotSpec;
	}

	public List<IfcInteger> getKnotMultiplicities() {
		return this.knotMultiplicities;
	}

	public List<IfcParameterValue> getKnots() {
		return this.knots;
	}

	public IfcKnotType getKnotSpec() {
		return this.knotSpec;
	}

	public void setKnotSpec(IfcKnotType knotSpec) {
		this.knotSpec = knotSpec;
	}

	@JsonIgnore
	public int getUpperIndexOnKnots() {
		//UpperIndexOnKnots
		//:=SIZEOF(Knots)
		return knots.size();
	}


}

