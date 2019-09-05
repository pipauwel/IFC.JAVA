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

@Guid("c5e6f97d-9889-46a6-bcbb-63e9cbb0b1c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("Web lengths, see illustration above (= h).")
	@Required()
	@Guid("ba4784da-d4b1-4f22-a835-28f21fb95c57")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeWidth")
	@Description("Flange lengths, see illustration above (= b).")
	@Required()
	@Guid("6ed7052b-c662-42bc-a3fa-7e12a958e215")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "WebThickness")
	@Description("Constant wall thickness of web (= ts).")
	@Required()
	@Guid("e0f4c060-66bc-4d98-acca-d3b51e211075")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeThickness")
	@Description("Constant wall thickness of flange (= tg).")
	@Required()
	@Guid("df89c02a-ade3-42be-bfae-01bf68430794")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FilletRadius")
	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("1594be10-83da-4e4b-9659-4f3415565953")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeEdgeRadius")
	@Description("Edge radius according the above illustration (= r2).")
	@Guid("23604099-5595-4772-b498-58cf6d21ba2c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure flangeEdgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "WebEdgeRadius")
	@Description("Edge radius according the above illustration (= r3).")
	@Guid("55533e11-7b3e-42ed-97af-eec943eb0c3e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure webEdgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "WebSlope")
	@Description("Slope of flange of the profile.")
	@Guid("00b0c529-097f-4762-b409-70a3fac704e0")
	private double webSlope;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	@Description("Slope of web of the profile.")
	@Guid("c048d2db-273d-41a9-b441-b903590d3eac")
	private double flangeSlope;


	public IfcTShapeProfileDef()
	{
	}

	public IfcTShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness)
	{
		super(profileType);
		this.depth = depth;
		this.flangeWidth = flangeWidth;
		this.webThickness = webThickness;
		this.flangeThickness = flangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFlangeWidth() {
		return this.flangeWidth;
	}

	public void setFlangeWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth) {
		this.flangeWidth = flangeWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness) {
		this.webThickness = webThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFlangeThickness() {
		return this.flangeThickness;
	}

	public void setFlangeThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness) {
		this.flangeThickness = flangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getFlangeEdgeRadius() {
		return this.flangeEdgeRadius;
	}

	public void setFlangeEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure flangeEdgeRadius) {
		this.flangeEdgeRadius = flangeEdgeRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getWebEdgeRadius() {
		return this.webEdgeRadius;
	}

	public void setWebEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure webEdgeRadius) {
		this.webEdgeRadius = webEdgeRadius;
	}

	public double getWebSlope() {
		return this.webSlope;
	}

	public void setWebSlope(double webSlope) {
		this.webSlope = webSlope;
	}

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

