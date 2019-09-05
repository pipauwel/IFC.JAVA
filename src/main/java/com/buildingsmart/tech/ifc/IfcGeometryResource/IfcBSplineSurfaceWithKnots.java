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

@Guid("8af578ab-a0d2-4d1e-b725-2f0d1ac24326")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface
{
	@JacksonXmlProperty(isAttribute=true, localName = "UMultiplicities")
	@Description("The multiplicities of the knots in the <em>u</em> parameter direction.")
	@Required()
	@MinLength(2)
	@Guid("01cd7da3-0cd3-4aa6-9515-d7e7c7fd48e6")
	private List<Integer> uMultiplicities = new ArrayList<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "VMultiplicities")
	@Description("The multiplicities of the knots in the <em>v</em> parameter direction.")
	@Required()
	@MinLength(2)
	@Guid("3afd3d0c-ad44-4c85-a9c9-4c1fafcca678")
	private List<Integer> vMultiplicities = new ArrayList<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "UKnots")
	@Description("The list of the distinct knots in the <em>u</em> parameter direction.")
	@Required()
	@MinLength(2)
	@Guid("20273f36-c1b4-45cd-a634-aaa034672ba4")
	private List<Double> uKnots = new ArrayList<Double>();

	@JacksonXmlProperty(isAttribute=true, localName = "VKnots")
	@Description("The list of the distinct knots in the <em>v</em> parameter direction.")
	@Required()
	@MinLength(2)
	@Guid("e5db2f6b-1239-462e-bf03-f805a9a9bf3c")
	private List<Double> vKnots = new ArrayList<Double>();

	@JacksonXmlProperty(isAttribute=true, localName = "KnotSpec")
	@Description("The description of the knot type.")
	@Required()
	@Guid("7b53cb7b-e60a-46de-9e6f-eecd7fc5c858")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec;


	public IfcBSplineSurfaceWithKnots()
	{
	}

	public IfcBSplineSurfaceWithKnots(int uDegree, int vDegree, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] controlPointsList, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm surfaceForm, Boolean uClosed, Boolean vClosed, Boolean selfIntersect, Integer[] uMultiplicities, Integer[] vMultiplicities, Double[] uKnots, Double[] vKnots, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec)
	{
		super(uDegree, vDegree, controlPointsList, surfaceForm, uClosed, vClosed, selfIntersect);
		this.uMultiplicities = new ArrayList<>(Arrays.asList(uMultiplicities));
		this.vMultiplicities = new ArrayList<>(Arrays.asList(vMultiplicities));
		this.uKnots = new ArrayList<>(Arrays.asList(uKnots));
		this.vKnots = new ArrayList<>(Arrays.asList(vKnots));
		this.knotSpec = knotSpec;
	}

	public List<Integer> getUMultiplicities() {
		return this.uMultiplicities;
	}

	public List<Integer> getVMultiplicities() {
		return this.vMultiplicities;
	}

	public List<Double> getUKnots() {
		return this.uKnots;
	}

	public List<Double> getVKnots() {
		return this.vKnots;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType getKnotSpec() {
		return this.knotSpec;
	}

	public void setKnotSpec(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcKnotType knotSpec) {
		this.knotSpec = knotSpec;
	}

	public int getKnotVUpper() {
		return 0;
	}

	public int getKnotUUpper() {
		return 0;
	}


}

