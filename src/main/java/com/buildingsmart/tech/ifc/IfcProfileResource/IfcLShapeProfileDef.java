// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcParameterizedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("ac8317b8-fdef-4d3d-afd6-b168298be8c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Leg length, see illustration above (= h). Same as the overall depth.")
	@Required()
	@Guid("d5f893a9-ac59-4b4f-877f-7f4ef879bbf0")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Leg length, see illustration above (= b). Same as the overall width. This attribute is formally optional for historic reasons only. Whenever the width is known, it shall be provided by value.")
	@Guid("d2e9f2de-1ffc-4a89-a7dc-52f8b85b3609")
	@JacksonXmlProperty(isAttribute=false, localName = "Width")
	private IfcPositiveLengthMeasure width;

	@Description("Constant wall thickness of profile, see illustration above (= ts).")
	@Required()
	@Guid("82f849f8-efde-409e-b7bb-1a7d7f324a78")
	@JacksonXmlProperty(isAttribute=false, localName = "Thickness")
	private IfcPositiveLengthMeasure thickness;

	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("4153f801-e907-4df3-a212-ad28a2c2d3c6")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private IfcNonNegativeLengthMeasure filletRadius;

	@Description("Edge radius according the above illustration (= r2).")
	@Guid("ff960210-e1c0-4437-a69a-ae63d0150b47")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeRadius")
	private IfcNonNegativeLengthMeasure edgeRadius;

	@Description("Slope of the inner face of each leg of the profile.")
	@Guid("f8fb3118-9133-499a-94d2-0a52853a0287")
	@JacksonXmlProperty(isAttribute=true, localName = "LegSlope")
	private double legSlope;


	public IfcLShapeProfileDef()
	{
	}

	public IfcLShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure thickness)
	{
		super(profileType);
		this.depth = depth;
		this.thickness = thickness;
	}

	public IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public IfcPositiveLengthMeasure getWidth() {
		return this.width;
	}

	public void setWidth(IfcPositiveLengthMeasure width) {
		this.width = width;
	}

	public IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}

	public IfcNonNegativeLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(IfcNonNegativeLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}

	public IfcNonNegativeLengthMeasure getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(IfcNonNegativeLengthMeasure edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getLegSlope() {
		return this.legSlope;
	}

	public void setLegSlope(double legSlope) {
		this.legSlope = legSlope;
	}


}

