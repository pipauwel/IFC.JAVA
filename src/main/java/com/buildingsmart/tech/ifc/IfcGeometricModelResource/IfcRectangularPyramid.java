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

@Guid("1ad16494-b844-40aa-bd8c-42b28ea6cf30")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangularPyramid extends IfcCsgPrimitive3D
{
	@JacksonXmlProperty(isAttribute=true, localName = "XLength")
	@Description("The length of the base measured along the placement X axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[1]</em>.")
	@Required()
	@Guid("6ee25ec0-9aa1-4206-8c9c-e0d5e6634d02")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xLength;

	@JacksonXmlProperty(isAttribute=true, localName = "YLength")
	@Description("The length of the base measured along the placement Y axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[2]</em>.")
	@Required()
	@Guid("89841464-6302-4f14-9183-315dcb0d7dc4")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yLength;

	@JacksonXmlProperty(isAttribute=true, localName = "Height")
	@Description("The height of the apex above the plane of the base, measured in the direction of the placement Z axis, the <em>SELF\\IfcCsgPrimitive3D.Position.P[2]</em>.")
	@Required()
	@Guid("8a3db941-ccad-4bec-86c4-b5a54eeda96f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height;


	public IfcRectangularPyramid()
	{
	}

	public IfcRectangularPyramid(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xLength, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yLength, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height)
	{
		super(position);
		this.xLength = xLength;
		this.yLength = yLength;
		this.height = height;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getXLength() {
		return this.xLength;
	}

	public void setXLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xLength) {
		this.xLength = xLength;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getYLength() {
		return this.yLength;
	}

	public void setYLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yLength) {
		this.yLength = yLength;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height) {
		this.height = height;
	}


}

