// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcParameterValue;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("3f24b989-aa9e-461e-b6d2-1dd3dabb466b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRationalBSplineCurveWithKnots extends IfcBSplineCurveWithKnots
{
	@Description("The supplied values of the weights.")
	@DataMember(Order = 0)
	@Required()
	@Guid("04f8a0e1-3151-4303-acd6-e6f73ec881c3")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcReal")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "weightsData")
	private List<IfcReal> weightsData;


	public IfcRationalBSplineCurveWithKnots()
	{
	}

	public IfcRationalBSplineCurveWithKnots(IfcInteger degree, IfcCartesianPoint[] controlPointsList, IfcBSplineCurveForm curveForm, IfcLogical closedCurve, IfcLogical selfIntersect, IfcInteger[] knotMultiplicities, IfcParameterValue[] knots, IfcKnotType knotSpec, IfcReal[] weightsData)
	{
		super(degree, controlPointsList, curveForm, closedCurve, selfIntersect, knotMultiplicities, knots, knotSpec);
		this.weightsData = new ArrayList<>(Arrays.asList(weightsData));
	}

	public List<IfcReal> getWeightsData() {
		return this.weightsData;
	}

	@JsonIgnore
	public Double getWeights() {
		//TODO
		//	Weights:=IfcListToArray(WeightsData,0,SELF\IfcBSplineCurve.UpperIndexOnControlPoints)
		return 0.0;
	}


}

