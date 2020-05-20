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

@Guid("e5472b11-5ad6-482e-a790-fd5b136c2bf4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBlock extends IfcCsgPrimitive3D
{
	@Description("The size of the block along the placement X axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[1]</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8524c9a0-4ea2-406f-8c5c-4d8be7462fd9")
	@JacksonXmlProperty(isAttribute=false, localName = "xLength")
	private IfcPositiveLengthMeasure xLength;

	@Description("The size of the block along the placement Y axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[2]</em>.")
	@DataMember(Order = 1)
	@Required()
	@Guid("0075f1fb-dc1f-42c9-a9aa-0f34040ddcaf")
	@JacksonXmlProperty(isAttribute=false, localName = "yLength")
	private IfcPositiveLengthMeasure yLength;

	@Description("The size of the block along the placement Z axis. It is provided by the inherited axis placement through <em>SELF\\IfcCsgPrimitive3D.Position.P[3]</em>.")
	@DataMember(Order = 2)
	@Required()
	@Guid("8958170c-b178-4ff8-adc8-466b1cc2d436")
	@JacksonXmlProperty(isAttribute=false, localName = "zLength")
	private IfcPositiveLengthMeasure zLength;


	public IfcBlock()
	{
	}

	public IfcBlock(IfcAxis2Placement3D position, IfcPositiveLengthMeasure xLength, IfcPositiveLengthMeasure yLength, IfcPositiveLengthMeasure zLength)
	{
		super(position);
		this.xLength = xLength;
		this.yLength = yLength;
		this.zLength = zLength;
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

	public IfcPositiveLengthMeasure getZLength() {
		return this.zLength;
	}

	public void setZLength(IfcPositiveLengthMeasure zLength) {
		this.zLength = zLength;
	}


}

