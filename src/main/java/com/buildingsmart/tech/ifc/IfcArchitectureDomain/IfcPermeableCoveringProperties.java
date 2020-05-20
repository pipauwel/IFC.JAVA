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

@Guid("86f03acb-40b6-4eb7-a6ab-18cd8f7ffd58")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPermeableCoveringProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Types of permeable covering operations. Also used to assign standard symbolic presentations according to national building standards.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d25e0b5d-75ea-46c6-be93-b62ae8176148")
	@JacksonXmlProperty(isAttribute=true, localName = "operationType")
	private IfcPermeableCoveringOperationEnum operationType;

	@Description("Position of this permeable covering panel within the overall window or door type.")
	@DataMember(Order = 1)
	@Required()
	@Guid("5a9b407a-77e2-4226-997d-13494bdf88da")
	@JacksonXmlProperty(isAttribute=true, localName = "panelPosition")
	private IfcWindowPanelPositionEnum panelPosition;

	@Description("Depth of panel frame (used to include the permeable covering), measured from front face to back face horizontally (i.e. perpendicular to the window or door (elevation) plane.")
	@DataMember(Order = 2)
	@Guid("5c7ce082-5be9-41a8-8db7-aebe3981c7f7")
	@JacksonXmlProperty(isAttribute=false, localName = "frameDepth")
	private IfcPositiveLengthMeasure frameDepth;

	@Description("Width of panel frame (used to include the permeable covering), measured from inside of panel (at permeable covering) to outside of panel (at lining), i.e. parallel to the window or door (elevation) plane.")
	@DataMember(Order = 3)
	@Guid("007a1b22-400e-417c-bd21-04defdf8d6a2")
	@JacksonXmlProperty(isAttribute=false, localName = "frameThickness")
	private IfcPositiveLengthMeasure frameThickness;

	@Description("Optional link to a shape aspect definition, which points to the part of the geometric representation of the window style, which is used to represent the permeable covering.")
	@DataMember(Order = 4)
	@Guid("3abd4ff6-1434-4858-abfe-4011d23b9dd9")
	@JacksonXmlProperty(isAttribute=false, localName = "shapeAspectStyle")
	private IfcShapeAspect shapeAspectStyle;


	public IfcPermeableCoveringProperties()
	{
	}

	public IfcPermeableCoveringProperties(String globalId, IfcPermeableCoveringOperationEnum operationType, IfcWindowPanelPositionEnum panelPosition)
	{
		super(globalId);
		this.operationType = operationType;
		this.panelPosition = panelPosition;
	}

	public IfcPermeableCoveringOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcPermeableCoveringOperationEnum operationType) {
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

