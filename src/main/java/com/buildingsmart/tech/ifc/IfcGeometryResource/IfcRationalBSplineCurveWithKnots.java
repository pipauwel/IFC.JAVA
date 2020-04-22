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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveWithKnots;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurveForm;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType;

@Guid("3f24b989-aa9e-461e-b6d2-1dd3dabb466b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRationalBSplineCurveWithKnots extends IfcBSplineCurveWithKnots
{
	@Description("The supplied values of the weights.")
	@DataMember(Order = 0)
	@Required()
	@Guid("04f8a0e1-3151-4303-acd6-e6f73ec881c3")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "WeightsData")
	private List<Double> weightsData;


	public IfcRationalBSplineCurveWithKnots()
	{
	}

	public IfcRationalBSplineCurveWithKnots(int degree, IfcCartesianPoint[] controlPointsList, IfcBSplineCurveForm curveForm, Boolean closedCurve, Boolean selfIntersect, Integer[] knotMultiplicities, Double[] knots, IfcKnotType knotSpec, Double[] weightsData)
	{
		super(degree, controlPointsList, curveForm, closedCurve, selfIntersect, knotMultiplicities, knots, knotSpec);
		this.weightsData = new ArrayList<>(Arrays.asList(weightsData));
	}

	public List<Double> getWeightsData() {
		return this.weightsData;
	}

	public Double getWeights() {
		return 0.0;
	}


}

