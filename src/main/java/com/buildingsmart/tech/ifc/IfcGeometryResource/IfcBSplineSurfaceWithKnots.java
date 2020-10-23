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

@Guid("8af578ab-a0d2-4d1e-b725-2f0d1ac24326")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRationalBSplineSurfaceWithKnots.class, name = "IfcRationalBSplineSurfaceWithKnots"))
public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface
{
	@Description("The multiplicities of the knots in the <em>u</em> parameter direction.")
	@DataMember(Order = 0)
	@Required()
	@Guid("01cd7da3-0cd3-4aa6-9515-d7e7c7fd48e6")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "uMultiplicity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "uMultiplicities")
	private List<IfcInteger> uMultiplicities;

	@Description("The multiplicities of the knots in the <em>v</em> parameter direction.")
	@DataMember(Order = 1)
	@Required()
	@Guid("3afd3d0c-ad44-4c85-a9c9-4c1fafcca678")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "vMultiplicity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "vMultiplicities")
	private List<IfcInteger> vMultiplicities;

	@Description("The list of the distinct knots in the <em>u</em> parameter direction.")
	@DataMember(Order = 2)
	@Required()
	@Guid("20273f36-c1b4-45cd-a634-aaa034672ba4")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "uKnot")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "uKnots")
	private List<IfcParameterValue> uKnots;

	@Description("The list of the distinct knots in the <em>v</em> parameter direction.")
	@DataMember(Order = 3)
	@Required()
	@Guid("e5db2f6b-1239-462e-bf03-f805a9a9bf3c")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "vKnot")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "vKnots")
	private List<IfcParameterValue> vKnots;

	@Description("The description of the knot type.")
	@DataMember(Order = 4)
	@Required()
	@Guid("7b53cb7b-e60a-46de-9e6f-eecd7fc5c858")
	@JacksonXmlProperty(isAttribute=true, localName = "knotSpec")
	private IfcKnotType knotSpec;


	public IfcBSplineSurfaceWithKnots()
	{
	}

	public IfcBSplineSurfaceWithKnots(IfcInteger uDegree, IfcInteger vDegree, List<List<IfcCartesianPoint>> controlPointsList, IfcBSplineSurfaceForm surfaceForm, IfcLogical uClosed, IfcLogical vClosed, IfcLogical selfIntersect, IfcInteger[] uMultiplicities, IfcInteger[] vMultiplicities, IfcParameterValue[] uKnots, IfcParameterValue[] vKnots, IfcKnotType knotSpec)
	{
		super(uDegree, vDegree, controlPointsList, surfaceForm, uClosed, vClosed, selfIntersect);
		this.uMultiplicities = new ArrayList<>(Arrays.asList(uMultiplicities));
		this.vMultiplicities = new ArrayList<>(Arrays.asList(vMultiplicities));
		this.uKnots = new ArrayList<>(Arrays.asList(uKnots));
		this.vKnots = new ArrayList<>(Arrays.asList(vKnots));
		this.knotSpec = knotSpec;
	}

	public List<IfcInteger> getUMultiplicities() {
		return this.uMultiplicities;
	}

	public List<IfcInteger> getVMultiplicities() {
		return this.vMultiplicities;
	}

	public List<IfcParameterValue> getUKnots() {
		return this.uKnots;
	}

	public List<IfcParameterValue> getVKnots() {
		return this.vKnots;
	}

	public IfcKnotType getKnotSpec() {
		return this.knotSpec;
	}

	public void setKnotSpec(IfcKnotType knotSpec) {
		this.knotSpec = knotSpec;
	}

	@JsonIgnore
	public int getKnotVUpper() {
		//KnotVUpper
		//:=SIZEOF(VKnots)
		return vKnots.size();
	}

	@JsonIgnore
	public int getKnotUUpper() {
		//KnotUUpper
		//:=SIZEOF(UKnots)
		return uKnots.size();
	}


}

