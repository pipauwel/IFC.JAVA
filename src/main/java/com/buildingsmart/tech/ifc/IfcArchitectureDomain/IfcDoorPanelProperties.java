// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9cba168e-4c79-497b-9481-9b26b7aa86d4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorPanelProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Depth of the door panel, measured perpendicular to the plane of the door leaf.")
	@DataMember(Order = 0)
	@Guid("60db7d64-ad51-4907-abb9-1e37b03e6ef5")
	@JacksonXmlProperty(isAttribute=false, localName = "panelDepth")
	private IfcPositiveLengthMeasure panelDepth;

	@Description("The <em>PanelOperation</em> defines the way of operation of that panel. The <em>PanelOperation</em> of the door panel has to correspond with the <em>OperationType</em> of the <em>IfcDoorStyle</em> by which it is referenced.")
	@DataMember(Order = 1)
	@Required()
	@Guid("653eed18-68d7-4612-8bdf-6873cf96ca54")
	@JacksonXmlProperty(isAttribute=true, localName = "panelOperation")
	private IfcDoorPanelOperationEnum panelOperation;

	@Description("Width of this panel, given as ratio relative to the total clear opening width of the door. If omited, it defaults to 1. A value has to be provided for all doors with <em>OperationType</em>'s at <em>IfcDoorStyle</em> defining a door with more then one panel.")
	@DataMember(Order = 2)
	@Guid("5ac6ab35-7be7-4433-9f2a-95d15dfb9753")
	@JacksonXmlProperty(isAttribute=false, localName = "panelWidth")
	private IfcNormalisedRatioMeasure panelWidth;

	@Description("Position of this panel within the door. The <em>PanelPosition</em> of the door panel has to correspond with the <em>OperationType</em> of the <em>IfcDoorStyle</em> by which it is referenced.")
	@DataMember(Order = 3)
	@Required()
	@Guid("dc262691-0151-4a09-8981-de18a10127ae")
	@JacksonXmlProperty(isAttribute=true, localName = "panelPosition")
	private IfcDoorPanelPositionEnum panelPosition;

	@Description("Pointer to the shape aspect, if given. The shape aspect reflects the part of the door shape, which represents the door panel.  <blockquote class=\"deprecated\">DEPRECATION&nbsp; The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@DataMember(Order = 4)
	@Guid("4c01c2bd-ea29-4104-bd4f-963e2032e958")
	@JacksonXmlProperty(isAttribute=false, localName = "shapeAspectStyle")
	private IfcShapeAspect shapeAspectStyle;


	public IfcDoorPanelProperties()
	{
	}

	public IfcDoorPanelProperties(String globalId, IfcDoorPanelOperationEnum panelOperation, IfcDoorPanelPositionEnum panelPosition)
	{
		super(globalId);
		this.panelOperation = panelOperation;
		this.panelPosition = panelPosition;
	}

	public IfcPositiveLengthMeasure getPanelDepth() {
		return this.panelDepth;
	}

	public void setPanelDepth(IfcPositiveLengthMeasure panelDepth) {
		this.panelDepth = panelDepth;
	}

	public IfcDoorPanelOperationEnum getPanelOperation() {
		return this.panelOperation;
	}

	public void setPanelOperation(IfcDoorPanelOperationEnum panelOperation) {
		this.panelOperation = panelOperation;
	}

	public IfcNormalisedRatioMeasure getPanelWidth() {
		return this.panelWidth;
	}

	public void setPanelWidth(IfcNormalisedRatioMeasure panelWidth) {
		this.panelWidth = panelWidth;
	}

	public IfcDoorPanelPositionEnum getPanelPosition() {
		return this.panelPosition;
	}

	public void setPanelPosition(IfcDoorPanelPositionEnum panelPosition) {
		this.panelPosition = panelPosition;
	}

	public IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}


}

