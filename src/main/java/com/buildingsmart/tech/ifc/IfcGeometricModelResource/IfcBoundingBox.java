// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("b0708265-0f85-4d96-a7f6-caf74b3bb754")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundingBox extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("Location of the bottom left corner (having the minimum values).")
	@Required()
	@Guid("2cf15f87-1f5d-450a-8cc2-6561dde29597")
	@JacksonXmlProperty(isAttribute=false, localName = "Corner")
	private IfcCartesianPoint corner;

	@Description("Length attribute (measured along the edge parallel to the X Axis)")
	@Required()
	@Guid("ac286f3a-4c71-42ad-bca4-e89e98d10b7e")
	@JacksonXmlProperty(isAttribute=false, localName = "XDim")
	private IfcPositiveLengthMeasure xDim;

	@Description("Width attribute (measured along the edge parallel to the Y Axis)")
	@Required()
	@Guid("941f838c-8426-4b28-a96a-ea74f02966e4")
	@JacksonXmlProperty(isAttribute=false, localName = "YDim")
	private IfcPositiveLengthMeasure yDim;

	@Description("Height attribute (measured along the edge parallel to the Z Axis).")
	@Required()
	@Guid("2a330725-d6a9-4a8d-b1db-a105d8b900d5")
	@JacksonXmlProperty(isAttribute=false, localName = "ZDim")
	private IfcPositiveLengthMeasure zDim;


	public IfcBoundingBox()
	{
	}

	public IfcBoundingBox(IfcCartesianPoint corner, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim, IfcPositiveLengthMeasure zDim)
	{
		this.corner = corner;
		this.xDim = xDim;
		this.yDim = yDim;
		this.zDim = zDim;
	}

	public IfcCartesianPoint getCorner() {
		return this.corner;
	}

	public void setCorner(IfcCartesianPoint corner) {
		this.corner = corner;
	}

	public IfcPositiveLengthMeasure getXDim() {
		return this.xDim;
	}

	public void setXDim(IfcPositiveLengthMeasure xDim) {
		this.xDim = xDim;
	}

	public IfcPositiveLengthMeasure getYDim() {
		return this.yDim;
	}

	public void setYDim(IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}

	public IfcPositiveLengthMeasure getZDim() {
		return this.zDim;
	}

	public void setZDim(IfcPositiveLengthMeasure zDim) {
		this.zDim = zDim;
	}

	public int getDim() {
		return 0;
	}


}

