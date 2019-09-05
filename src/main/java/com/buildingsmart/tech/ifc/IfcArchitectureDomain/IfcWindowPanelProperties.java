// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f4aaef0e-c0aa-4a75-9bad-670fdf12d4e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowPanelProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@JacksonXmlProperty(isAttribute=true, localName = "OperationType")
	@Description("Types of window panel operations. Also used to assign standard symbolic presentations according to national building standards.")
	@Required()
	@Guid("33dbee10-d91a-4bec-9c65-60b5a130376c")
	private com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelOperationEnum operationType;

	@JacksonXmlProperty(isAttribute=true, localName = "PanelPosition")
	@Description("Position of this panel within the overall window style.")
	@Required()
	@Guid("ed81b5ba-ad8b-4a14-942e-bbe59ab8f65e")
	private com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelPositionEnum panelPosition;

	@JacksonXmlProperty(isAttribute=true, localName = "FrameDepth")
	@Description("Depth of panel frame, measured from front face to back face horizontally (i.e. perpendicular to the window (elevation) plane.")
	@Guid("19f2e6ca-8d92-4ec8-a726-c4d44a0d2853")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure frameDepth;

	@JacksonXmlProperty(isAttribute=true, localName = "FrameThickness")
	@Description("Width of panel frame, measured from inside of panel (at glazing) to outside of panel (at lining), i.e. parallel to the window (elevation) plane.")
	@Guid("27ea5ee4-1d5f-49c7-b4d6-d708649bb38a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure frameThickness;

	@JacksonXmlProperty(isAttribute=false, localName = "ShapeAspectStyle")
	@Description("Optional link to a shape aspect definition, which points to the part of the geometric representation of the window style, which is used to represent the panel.  <blockquote class=\"deprecated\">DEPRECATION&nbsp; The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@Guid("30f9cacc-5e45-4f58-97ac-de69bd4490e0")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect shapeAspectStyle;


	public IfcWindowPanelProperties()
	{
	}

	public IfcWindowPanelProperties(String globalId, com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelOperationEnum operationType, com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelPositionEnum panelPosition)
	{
		super(globalId);
		this.operationType = operationType;
		this.panelPosition = panelPosition;
	}

	public com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelOperationEnum operationType) {
		this.operationType = operationType;
	}

	public com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelPositionEnum getPanelPosition() {
		return this.panelPosition;
	}

	public void setPanelPosition(com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelPositionEnum panelPosition) {
		this.panelPosition = panelPosition;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFrameDepth() {
		return this.frameDepth;
	}

	public void setFrameDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure frameDepth) {
		this.frameDepth = frameDepth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFrameThickness() {
		return this.frameThickness;
	}

	public void setFrameThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure frameThickness) {
		this.frameThickness = frameThickness;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}


}

