// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f4aaef0e-c0aa-4a75-9bad-670fdf12d4e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowPanelProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Types of window panel operations. Also used to assign standard symbolic presentations according to national building standards.")
	@DataMember(Order = 0)
	@Required()
	@Guid("33dbee10-d91a-4bec-9c65-60b5a130376c")
	@JacksonXmlProperty(isAttribute=true, localName = "operationType")
	private IfcWindowPanelOperationEnum operationType;

	@Description("Position of this panel within the overall window style.")
	@DataMember(Order = 1)
	@Required()
	@Guid("ed81b5ba-ad8b-4a14-942e-bbe59ab8f65e")
	@JacksonXmlProperty(isAttribute=true, localName = "panelPosition")
	private IfcWindowPanelPositionEnum panelPosition;

	@Description("Depth of panel frame, measured from front face to back face horizontally (i.e. perpendicular to the window (elevation) plane.")
	@DataMember(Order = 2)
	@Guid("19f2e6ca-8d92-4ec8-a726-c4d44a0d2853")
	@JacksonXmlProperty(isAttribute=false, localName = "frameDepth")
	private IfcPositiveLengthMeasure frameDepth;

	@Description("Width of panel frame, measured from inside of panel (at glazing) to outside of panel (at lining), i.e. parallel to the window (elevation) plane.")
	@DataMember(Order = 3)
	@Guid("27ea5ee4-1d5f-49c7-b4d6-d708649bb38a")
	@JacksonXmlProperty(isAttribute=false, localName = "frameThickness")
	private IfcPositiveLengthMeasure frameThickness;

	@Description("Optional link to a shape aspect definition, which points to the part of the geometric representation of the window style, which is used to represent the panel.  <blockquote class=\"deprecated\">DEPRECATION&nbsp; The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@DataMember(Order = 4)
	@Guid("30f9cacc-5e45-4f58-97ac-de69bd4490e0")
	@JacksonXmlProperty(isAttribute=false, localName = "shapeAspectStyle")
	private IfcShapeAspect shapeAspectStyle;


	public IfcWindowPanelProperties()
	{
	}

	public IfcWindowPanelProperties(String globalId, IfcWindowPanelOperationEnum operationType, IfcWindowPanelPositionEnum panelPosition)
	{
		super(globalId);
		this.operationType = operationType;
		this.panelPosition = panelPosition;
	}

	public IfcWindowPanelOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcWindowPanelOperationEnum operationType) {
		this.operationType = operationType;
	}

	public IfcWindowPanelPositionEnum getPanelPosition() {
		return this.panelPosition;
	}

	public void setPanelPosition(IfcWindowPanelPositionEnum panelPosition) {
		this.panelPosition = panelPosition;
	}

	public IfcPositiveLengthMeasure getFrameDepth() {
		return this.frameDepth;
	}

	public void setFrameDepth(IfcPositiveLengthMeasure frameDepth) {
		this.frameDepth = frameDepth;
	}

	public IfcPositiveLengthMeasure getFrameThickness() {
		return this.frameThickness;
	}

	public void setFrameThickness(IfcPositiveLengthMeasure frameThickness) {
		this.frameThickness = frameThickness;
	}

	public IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}


}

