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

@Guid("fa4d0f85-ebcc-4a94-aa4d-e9876009463c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRationalBSplineSurfaceWithKnots extends IfcBSplineSurfaceWithKnots
{
	@JacksonXmlProperty(isAttribute=false, localName = "WeightsData")
	@Description("The weights associated with the control points in the rational case.")
	@Required()
	@MinLength(2)
	@Guid("1140f72c-ae94-41b6-956b-58e9cb40cb9d")
	private List<Double> weightsData = new ArrayList<Double>();


	public IfcRationalBSplineSurfaceWithKnots()
	{
	}

	public IfcRationalBSplineSurfaceWithKnots(int uDegree, int vDegree, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] controlPointsList, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm surfaceForm, Boolean uClosed, Boolean vClosed, Boolean selfIntersect, Integer[] uMultiplicities, Integer[] vMultiplicities, Double[] uKnots, Double[] vKnots, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec, Double[] weightsData)
	{
		super(uDegree, vDegree, controlPointsList, surfaceForm, uClosed, vClosed, selfIntersect, uMultiplicities, vMultiplicities, uKnots, vKnots, knotSpec);
		this.weightsData = new ArrayList<>(Arrays.asList(weightsData));
	}

	public List<Double> getWeightsData() {
		return this.weightsData;
	}

	public Double getWeights() {
		return 0.0;
	}


}

