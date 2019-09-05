// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cb0b2f54-1b67-43b1-bfc6-07a44a44a16e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowLiningProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@JacksonXmlProperty(isAttribute=true, localName = "LiningDepth")
	@Description("Depth of the window lining (dimension measured perpendicular to window elevation plane).")
	@Guid("5f11ca78-fd39-49fd-aa05-39f48444916b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure liningDepth;

	@JacksonXmlProperty(isAttribute=true, localName = "LiningThickness")
	@Description("Thickness of the window lining as explained in the figure above. If <em>LiningThickness</em> value is 0. (zero) it denotes a window without a lining (all other lining parameters shall be set to NIL in this case). If the <em>LiningThickness</em> is NIL it denotes that the value is not available.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type modified to be <em>IfcNonNegativeLengthMeasure</em>.  </blockquote>")
	@Guid("098f93e9-146f-47d3-b18c-1f220d0ab695")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure liningThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "TransomThickness")
	@Description("Thickness of the transom (horizontal separator of window panels within a window), measured parallel to the window elevation plane. The transom is part of the lining and the transom depth is assumed to be identical to the lining depth.  If the <em>TransomThickness</em> is set to zero (and the <em>TransomOffset</em> set to a positive length), then the window is divided vertically without a physical divider.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type changed to <em>IfcNonNegativeLengthMeasure</em>.</blockquote>")
	@Guid("a8f96736-8189-438d-b44f-d45154a2cac4")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure transomThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "MullionThickness")
	@Description("Thickness of the mullion (vertical separator of window panels within a window), measured parallel to the window elevation plane. The mullion is part of the lining and the mullion depth is assumed to be identical to the lining depth.   If the <em>MullionThickness</em> is set to zero (and the <em>MullionOffset</em> set to a positive length), then the window is divided horizontally without a physical divider.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type changed to <em>IfcNonNegativeLengthMeasure</em>.</blockquote>")
	@Guid("293ce108-6384-4825-b1ee-d82d4bd2c090")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure mullionThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FirstTransomOffset")
	@Description("Offset of the transom centerline, measured along the z-axis of the window placement co-ordinate system. An offset value = 0.5 indicates that the transom is positioned in the middle of the window.")
	@Guid("ec1322a2-cf54-4c11-a299-e788cb2e37ad")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure firstTransomOffset;

	@JacksonXmlProperty(isAttribute=true, localName = "SecondTransomOffset")
	@Description("Offset of the transom centerline for the second transom, measured along the x-axis of the window placement co-ordinate system. An offset value = 0.666 indicates that the second transom is positioned at two/third of the window.")
	@Guid("cbc74d4c-21bb-43b8-b467-73cea9bcb9c2")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure secondTransomOffset;

	@JacksonXmlProperty(isAttribute=true, localName = "FirstMullionOffset")
	@Description("Offset of the mullion centerline, measured along the x-axis of the window placement co-ordinate system. An offset value = 0.5 indicates that the mullion is positioned in the middle of the window.")
	@Guid("e022da46-8cf7-401d-a027-52fbdca3cfa5")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure firstMullionOffset;

	@JacksonXmlProperty(isAttribute=true, localName = "SecondMullionOffset")
	@Description("Offset of the mullion centerline for the second mullion, measured along the x-axis of the window placement co-ordinate system. An offset value = 0.666 indicates that the second mullion is positioned at two/third of the window.")
	@Guid("8bbdec77-bf94-47da-8eb4-aa38a336dece")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure secondMullionOffset;

	@JacksonXmlProperty(isAttribute=false, localName = "ShapeAspectStyle")
	@Description("Optional link to a shape aspect definition, which points to the part of the geometric representation of the window style, which is used to represent the lining.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@Guid("1cafc84f-dbdc-4763-87f3-c9c4b4162f98")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect shapeAspectStyle;

	@JacksonXmlProperty(isAttribute=true, localName = "LiningOffset")
	@Description("Offset of the window lining. The offset is given as distance along the y axis of the local placement (perpendicular to the window plane).  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the entity definition.</blockquote>")
	@Guid("3fa30327-8c18-4ddc-8dbd-d8c94edd50b3")
	private double liningOffset;

	@JacksonXmlProperty(isAttribute=true, localName = "LiningToPanelOffsetX")
	@Description("Offset between the lining and the window panel measured along the x-axis of the local placement. Should be smaller or equal to the <em>LiningThickness</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the entity definition.</blockquote>")
	@Guid("2badc725-2305-4494-8b1f-8407472ba375")
	private double liningToPanelOffsetX;

	@JacksonXmlProperty(isAttribute=true, localName = "LiningToPanelOffsetY")
	@Description("Offset between the lining and the window panel measured along the y-axis of the local placement. Should be smaller or equal to the <em>IfcWindowPanelProperties.PanelThickness</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the entity definition.</blockquote>")
	@Guid("a60c6e61-b449-48ad-a001-b9afee248533")
	private double liningToPanelOffsetY;


	public IfcWindowLiningProperties()
	{
	}

	public IfcWindowLiningProperties(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getLiningDepth() {
		return this.liningDepth;
	}

	public void setLiningDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure liningDepth) {
		this.liningDepth = liningDepth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getLiningThickness() {
		return this.liningThickness;
	}

	public void setLiningThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure liningThickness) {
		this.liningThickness = liningThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getTransomThickness() {
		return this.transomThickness;
	}

	public void setTransomThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure transomThickness) {
		this.transomThickness = transomThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getMullionThickness() {
		return this.mullionThickness;
	}

	public void setMullionThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure mullionThickness) {
		this.mullionThickness = mullionThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getFirstTransomOffset() {
		return this.firstTransomOffset;
	}

	public void setFirstTransomOffset(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure firstTransomOffset) {
		this.firstTransomOffset = firstTransomOffset;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getSecondTransomOffset() {
		return this.secondTransomOffset;
	}

	public void setSecondTransomOffset(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure secondTransomOffset) {
		this.secondTransomOffset = secondTransomOffset;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getFirstMullionOffset() {
		return this.firstMullionOffset;
	}

	public void setFirstMullionOffset(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure firstMullionOffset) {
		this.firstMullionOffset = firstMullionOffset;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getSecondMullionOffset() {
		return this.secondMullionOffset;
	}

	public void setSecondMullionOffset(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure secondMullionOffset) {
		this.secondMullionOffset = secondMullionOffset;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}

	public double getLiningOffset() {
		return this.liningOffset;
	}

	public void setLiningOffset(double liningOffset) {
		this.liningOffset = liningOffset;
	}

	public double getLiningToPanelOffsetX() {
		return this.liningToPanelOffsetX;
	}

	public void setLiningToPanelOffsetX(double liningToPanelOffsetX) {
		this.liningToPanelOffsetX = liningToPanelOffsetX;
	}

	public double getLiningToPanelOffsetY() {
		return this.liningToPanelOffsetY;
	}

	public void setLiningToPanelOffsetY(double liningToPanelOffsetY) {
		this.liningToPanelOffsetY = liningToPanelOffsetY;
	}


}

