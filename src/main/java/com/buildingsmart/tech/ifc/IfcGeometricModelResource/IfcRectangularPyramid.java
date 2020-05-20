// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1ad16494-b844-40aa-bd8c-42b28ea6cf30")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangularPyramid extends IfcCsgPrimitive3D
{
	@Description("The length of the base measured along the placement X axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[1]</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6ee25ec0-9aa1-4206-8c9c-e0d5e6634d02")
	@JacksonXmlProperty(isAttribute=false, localName = "xLength")
	private IfcPositiveLengthMeasure xLength;

	@Description("The length of the base measured along the placement Y axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[2]</em>.")
	@DataMember(Order = 1)
	@Required()
	@Guid("89841464-6302-4f14-9183-315dcb0d7dc4")
	@JacksonXmlProperty(isAttribute=false, localName = "yLength")
	private IfcPositiveLengthMeasure yLength;

	@Description("The height of the apex above the plane of the base, measured in the direction of the placement Z axis, the <em>SELF\\IfcCsgPrimitive3D.Position.P[2]</em>.")
	@DataMember(Order = 2)
	@Required()
	@Guid("8a3db941-ccad-4bec-86c4-b5a54eeda96f")
	@JacksonXmlProperty(isAttribute=false, localName = "height")
	private IfcPositiveLengthMeasure height;


	public IfcRectangularPyramid()
	{
	}

	public IfcRectangularPyramid(IfcAxis2Placement3D position, IfcPositiveLengthMeasure xLength, IfcPositiveLengthMeasure yLength, IfcPositiveLengthMeasure height)
	{
		super(position);
		this.xLength = xLength;
		this.yLength = yLength;
		this.height = height;
	}

	public IfcPositiveLengthMeasure getXLength() {
		return this.xLength;
	}

	public void setXLength(IfcPositiveLengthMeasure xLength) {
		this.xLength = xLength;
	}

	public IfcPositiveLengthMeasure getYLength() {
		return this.yLength;
	}

	public void setYLength(IfcPositiveLengthMeasure yLength) {
		this.yLength = yLength;
	}

	public IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(IfcPositiveLengthMeasure height) {
		this.height = height;
	}


}

