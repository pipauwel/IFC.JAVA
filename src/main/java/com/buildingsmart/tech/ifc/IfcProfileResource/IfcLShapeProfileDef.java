// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ac8317b8-fdef-4d3d-afd6-b168298be8c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("Leg length, see illustration above (= h). Same as the overall depth.")
	@Required()
	@Guid("d5f893a9-ac59-4b4f-877f-7f4ef879bbf0")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;

	@JacksonXmlProperty(isAttribute=true, localName = "Width")
	@Description("Leg length, see illustration above (= b). Same as the overall width. This attribute is formally optional for historic reasons only. Whenever the width is known, it shall be provided by value.")
	@Guid("d2e9f2de-1ffc-4a89-a7dc-52f8b85b3609")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure width;

	@JacksonXmlProperty(isAttribute=true, localName = "Thickness")
	@Description("Constant wall thickness of profile, see illustration above (= ts).")
	@Required()
	@Guid("82f849f8-efde-409e-b7bb-1a7d7f324a78")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FilletRadius")
	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("4153f801-e907-4df3-a212-ad28a2c2d3c6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "EdgeRadius")
	@Description("Edge radius according the above illustration (= r2).")
	@Guid("ff960210-e1c0-4437-a69a-ae63d0150b47")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure edgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "LegSlope")
	@Description("Slope of the inner face of each leg of the profile.")
	@Guid("f8fb3118-9133-499a-94d2-0a52853a0287")
	private double legSlope;


	public IfcLShapeProfileDef()
	{
	}

	public IfcLShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness)
	{
		super(profileType);
		this.depth = depth;
		this.thickness = thickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWidth() {
		return this.width;
	}

	public void setWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure width) {
		this.width = width;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getLegSlope() {
		return this.legSlope;
	}

	public void setLegSlope(double legSlope) {
		this.legSlope = legSlope;
	}


}

