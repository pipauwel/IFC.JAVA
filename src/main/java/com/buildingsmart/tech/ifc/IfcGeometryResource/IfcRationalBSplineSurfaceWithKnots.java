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

@Guid("fa4d0f85-ebcc-4a94-aa4d-e9876009463c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRationalBSplineSurfaceWithKnots extends IfcBSplineSurfaceWithKnots
{
	@Description("The weights associated with the control points in the rational case.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1140f72c-ae94-41b6-956b-58e9cb40cb9d")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcReal")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "weightsData")
	private List<IfcReal> weightsData;


	public IfcRationalBSplineSurfaceWithKnots()
	{
	}

	public IfcRationalBSplineSurfaceWithKnots(IfcInteger uDegree, IfcInteger vDegree, List<List<IfcCartesianPoint>> controlPointsList,
											  IfcBSplineSurfaceForm surfaceForm, IfcLogical uClosed, IfcLogical vClosed, IfcLogical selfIntersect,
											  IfcInteger[] uMultiplicities, IfcInteger[] vMultiplicities, IfcParameterValue[] uKnots,
											  IfcParameterValue[] vKnots,
											  IfcKnotType knotSpec, IfcReal[] weightsData)
	{
		super(uDegree, vDegree, controlPointsList, surfaceForm, uClosed, vClosed, selfIntersect, uMultiplicities, vMultiplicities, uKnots, vKnots, knotSpec);
		this.weightsData = new ArrayList<>(Arrays.asList(weightsData));
	}

	public List<IfcReal> getWeightsData() {
		return this.weightsData;
	}

	@JsonIgnore
	public Double getWeights() {
		//TODO
		//	Weights:=IfcMakeArrayOfArray(WeightsData,0,UUpper,0,VUpper)
		return 0.0;
	}


}

