// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ac8317b8-fdef-4d3d-afd6-b168298be8c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Leg length, see illustration above (= h). Same as the overall depth.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d5f893a9-ac59-4b4f-877f-7f4ef879bbf0")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private double depth; //IfcPositiveLengthMeasure

	@Description("Leg length, see illustration above (= b). Same as the overall width. This attribute is formally optional for historic reasons only. Whenever the width is known, it shall be provided by value.")
	@DataMember(Order = 1)
	@Guid("d2e9f2de-1ffc-4a89-a7dc-52f8b85b3609")
	@JacksonXmlProperty(isAttribute=false, localName = "Width")
	private double width; //IfcPositiveLengthMeasure

	@Description("Constant wall thickness of profile, see illustration above (= ts).")
	@DataMember(Order = 2)
	@Required()
	@Guid("82f849f8-efde-409e-b7bb-1a7d7f324a78")
	@JacksonXmlProperty(isAttribute=false, localName = "Thickness")
	private double thickness; //IfcPositiveLengthMeasure

	@Description("Fillet radius according the above illustration (= r1).")
	@DataMember(Order = 3)
	@Guid("4153f801-e907-4df3-a212-ad28a2c2d3c6")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private double filletRadius; //IfcNonNegativeLengthMeasure

	@Description("Edge radius according the above illustration (= r2).")
	@DataMember(Order = 4)
	@Guid("ff960210-e1c0-4437-a69a-ae63d0150b47")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeRadius")
	private double edgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of the inner face of each leg of the profile.")
	@DataMember(Order = 5)
	@Guid("f8fb3118-9133-499a-94d2-0a52853a0287")
	@JacksonXmlProperty(isAttribute=true, localName = "LegSlope")
	private double legSlope;


	public IfcLShapeProfileDef()
	{
	}

	public IfcLShapeProfileDef(IfcProfileTypeEnum profileType, double depth, double thickness)
	{
		super(profileType);
		this.depth = depth;
		this.thickness = thickness;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getThickness() {
		return this.thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public double getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(double filletRadius) {
		this.filletRadius = filletRadius;
	}

	public double getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(double edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getLegSlope() {
		return this.legSlope;
	}

	public void setLegSlope(double legSlope) {
		this.legSlope = legSlope;
	}


}

