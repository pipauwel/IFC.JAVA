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

@Guid("a97ad274-6a1b-4db7-b4a9-46725be04471")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeWidth")
	@Description("Extent of the bottom flange, defined parallel to the x axis of the position coordinate system.")
	@Required()
	@Guid("39940baf-a873-43ec-9cc3-b7e2398aa04c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "OverallDepth")
	@Description("Total extent of the depth, defined parallel to the y axis of the position coordinate system.")
	@Required()
	@Guid("b7d473cd-17c8-4879-9f2c-f1ee6a62c153")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallDepth;

	@JacksonXmlProperty(isAttribute=true, localName = "WebThickness")
	@Description("Thickness of the web of the I-shape. The web is centred on the x-axis and the y-axis of the position coordinate system.")
	@Required()
	@Guid("0242c06a-0329-4364-a496-285cbe77d83f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeThickness")
	@Description("Flange thickness of the bottom flange.")
	@Required()
	@Guid("7d3c1e36-4f3a-43a2-8e07-a5de53359a2c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeFilletRadius")
	@Description("The fillet between the web and the bottom flange.  0 if sharp-edged, omitted if unknown.")
	@Guid("65f2415f-cc1a-40ca-b017-080cbf0a9777")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure bottomFlangeFilletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeWidth")
	@Description("Extent of the top flange, defined parallel to the x axis of the position coordinate system.")
	@Required()
	@Guid("f33b2498-9ce9-410d-be0c-52b58ab7d57a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topFlangeWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeThickness")
	@Description("Flange thickness of the top flange. This attribute is formally optional for historic reasons only. Whenever the flange thickness is known, it shall be provided by value.")
	@Guid("3390a6a3-6070-47d2-a75f-2d359b3c6ea5")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topFlangeThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeFilletRadius")
	@Description("The fillet between the web and the top flange.  0 if sharp-edged, omitted if unknown.")
	@Guid("084b5c7a-a7ff-4a3e-aedf-11d993da5b5d")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure topFlangeFilletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeEdgeRadius")
	@Description("Radius of the upper edges of the bottom flange.  0 if sharp-edged, omitted if unknown.")
	@Guid("8a9baaa0-a040-4a21-8a63-d9c19b1f1b79")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure bottomFlangeEdgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeSlope")
	@Description("Slope of the upper faces of the bottom flange.  Non-zero in case of of tapered bottom flange, 0 in case of parallel bottom flange, omitted if unknown.")
	@Guid("921600ed-fb99-48dd-a978-52712fa5b418")
	private double bottomFlangeSlope;

	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeEdgeRadius")
	@Description("Radius of the lower edges of the top flange.  0 if sharp-edged, omitted if unknown.")
	@Guid("15799c29-5d34-492e-8919-fe0f0f0159c6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure topFlangeEdgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeSlope")
	@Description("Slope of the lower faces of the top flange.  Non-zero in case of of tapered top flange, 0 in case of parallel top flange, omitted if unknown.")
	@Guid("655eed3b-029f-4cc3-be85-4ded814194bb")
	private double topFlangeSlope;


	public IfcAsymmetricIShapeProfileDef()
	{
	}

	public IfcAsymmetricIShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeWidth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallDepth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topFlangeWidth)
	{
		super(profileType);
		this.bottomFlangeWidth = bottomFlangeWidth;
		this.overallDepth = overallDepth;
		this.webThickness = webThickness;
		this.bottomFlangeThickness = bottomFlangeThickness;
		this.topFlangeWidth = topFlangeWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getBottomFlangeWidth() {
		return this.bottomFlangeWidth;
	}

	public void setBottomFlangeWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeWidth) {
		this.bottomFlangeWidth = bottomFlangeWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getOverallDepth() {
		return this.overallDepth;
	}

	public void setOverallDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallDepth) {
		this.overallDepth = overallDepth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness) {
		this.webThickness = webThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getBottomFlangeThickness() {
		return this.bottomFlangeThickness;
	}

	public void setBottomFlangeThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomFlangeThickness) {
		this.bottomFlangeThickness = bottomFlangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getBottomFlangeFilletRadius() {
		return this.bottomFlangeFilletRadius;
	}

	public void setBottomFlangeFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure bottomFlangeFilletRadius) {
		this.bottomFlangeFilletRadius = bottomFlangeFilletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getTopFlangeWidth() {
		return this.topFlangeWidth;
	}

	public void setTopFlangeWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topFlangeWidth) {
		this.topFlangeWidth = topFlangeWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getTopFlangeThickness() {
		return this.topFlangeThickness;
	}

	public void setTopFlangeThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topFlangeThickness) {
		this.topFlangeThickness = topFlangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getTopFlangeFilletRadius() {
		return this.topFlangeFilletRadius;
	}

	public void setTopFlangeFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure topFlangeFilletRadius) {
		this.topFlangeFilletRadius = topFlangeFilletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getBottomFlangeEdgeRadius() {
		return this.bottomFlangeEdgeRadius;
	}

	public void setBottomFlangeEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure bottomFlangeEdgeRadius) {
		this.bottomFlangeEdgeRadius = bottomFlangeEdgeRadius;
	}

	public double getBottomFlangeSlope() {
		return this.bottomFlangeSlope;
	}

	public void setBottomFlangeSlope(double bottomFlangeSlope) {
		this.bottomFlangeSlope = bottomFlangeSlope;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getTopFlangeEdgeRadius() {
		return this.topFlangeEdgeRadius;
	}

	public void setTopFlangeEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure topFlangeEdgeRadius) {
		this.topFlangeEdgeRadius = topFlangeEdgeRadius;
	}

	public double getTopFlangeSlope() {
		return this.topFlangeSlope;
	}

	public void setTopFlangeSlope(double topFlangeSlope) {
		this.topFlangeSlope = topFlangeSlope;
	}


}

