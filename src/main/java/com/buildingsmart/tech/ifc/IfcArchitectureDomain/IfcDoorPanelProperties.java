// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

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
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorPanelOperationEnum;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorPanelPositionEnum;

@Guid("9cba168e-4c79-497b-9481-9b26b7aa86d4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorPanelProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Depth of the door panel, measured perpendicular to the plane of the door leaf.")
	@DataMember(Order = 0)
	@Guid("60db7d64-ad51-4907-abb9-1e37b03e6ef5")
	@JacksonXmlProperty(isAttribute=false, localName = "PanelDepth")
	private double panelDepth; //IfcPositiveLengthMeasure

	@Description("The <em>PanelOperation</em> defines the way of operation of that panel. The <em>PanelOperation</em> of the door panel has to correspond with the <em>OperationType</em> of the <em>IfcDoorStyle</em> by which it is referenced.")
	@DataMember(Order = 1)
	@Required()
	@Guid("653eed18-68d7-4612-8bdf-6873cf96ca54")
	@JacksonXmlProperty(isAttribute=true, localName = "PanelOperation")
	private IfcDoorPanelOperationEnum panelOperation;

	@Description("Width of this panel, given as ratio relative to the total clear opening width of the door. If omited, it defaults to 1. A value has to be provided for all doors with <em>OperationType</em>'s at <em>IfcDoorStyle</em> defining a door with more then one panel.")
	@DataMember(Order = 2)
	@Guid("5ac6ab35-7be7-4433-9f2a-95d15dfb9753")
	@JacksonXmlProperty(isAttribute=false, localName = "PanelWidth")
	private double panelWidth; //IfcNormalisedRatioMeasure

	@Description("Position of this panel within the door. The <em>PanelPosition</em> of the door panel has to correspond with the <em>OperationType</em> of the <em>IfcDoorStyle</em> by which it is referenced.")
	@DataMember(Order = 3)
	@Required()
	@Guid("dc262691-0151-4a09-8981-de18a10127ae")
	@JacksonXmlProperty(isAttribute=true, localName = "PanelPosition")
	private IfcDoorPanelPositionEnum panelPosition;

	@Description("Pointer to the shape aspect, if given. The shape aspect reflects the part of the door shape, which represents the door panel.  <blockquote class=\"deprecated\">DEPRECATION&nbsp; The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@DataMember(Order = 4)
	@Guid("4c01c2bd-ea29-4104-bd4f-963e2032e958")
	@JacksonXmlProperty(isAttribute=false, localName = "ShapeAspectStyle")
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

	public double getPanelDepth() {
		return this.panelDepth;
	}

	public void setPanelDepth(double panelDepth) {
		this.panelDepth = panelDepth;
	}

	public IfcDoorPanelOperationEnum getPanelOperation() {
		return this.panelOperation;
	}

	public void setPanelOperation(IfcDoorPanelOperationEnum panelOperation) {
		this.panelOperation = panelOperation;
	}

	public double getPanelWidth() {
		return this.panelWidth;
	}

	public void setPanelWidth(double panelWidth) {
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

