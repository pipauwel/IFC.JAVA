// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b0708265-0f85-4d96-a7f6-caf74b3bb754")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundingBox extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "Corner")
	@Description("Location of the bottom left corner (having the minimum values).")
	@Required()
	@Guid("2cf15f87-1f5d-450a-8cc2-6561dde29597")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint corner;

	@JacksonXmlProperty(isAttribute=true, localName = "XDim")
	@Description("Length attribute (measured along the edge parallel to the X Axis)")
	@Required()
	@Guid("ac286f3a-4c71-42ad-bca4-e89e98d10b7e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim;

	@JacksonXmlProperty(isAttribute=true, localName = "YDim")
	@Description("Width attribute (measured along the edge parallel to the Y Axis)")
	@Required()
	@Guid("941f838c-8426-4b28-a96a-ea74f02966e4")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim;

	@JacksonXmlProperty(isAttribute=true, localName = "ZDim")
	@Description("Height attribute (measured along the edge parallel to the Z Axis).")
	@Required()
	@Guid("2a330725-d6a9-4a8d-b1db-a105d8b900d5")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure zDim;


	public IfcBoundingBox()
	{
	}

	public IfcBoundingBox(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint corner, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure zDim)
	{
		this.corner = corner;
		this.xDim = xDim;
		this.yDim = yDim;
		this.zDim = zDim;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getCorner() {
		return this.corner;
	}

	public void setCorner(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint corner) {
		this.corner = corner;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getXDim() {
		return this.xDim;
	}

	public void setXDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim) {
		this.xDim = xDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getYDim() {
		return this.yDim;
	}

	public void setYDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getZDim() {
		return this.zDim;
	}

	public void setZDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure zDim) {
		this.zDim = zDim;
	}

	public int getDim() {
		return 0;
	}


}

