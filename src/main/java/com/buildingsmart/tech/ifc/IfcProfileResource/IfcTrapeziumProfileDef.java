// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9e129693-172e-4ea1-b3bb-cb7763385cb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "BottomXDim")
	@Description("The extent of the bottom line measured along the implicit x-axis.")
	@Required()
	@Guid("06671d06-7136-4a10-9e6d-0074885e3d3d")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomXDim;

	@JacksonXmlProperty(isAttribute=true, localName = "TopXDim")
	@Description("The extent of the top line measured along the implicit x-axis.")
	@Required()
	@Guid("f95d733f-0777-4572-911e-2d21de75244e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topXDim;

	@JacksonXmlProperty(isAttribute=true, localName = "YDim")
	@Description("The extent of the distance between the parallel bottom and top lines measured along the implicit y-axis.")
	@Required()
	@Guid("9834941e-4f3b-4ab2-b863-4ffde5ecf1db")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim;

	@JacksonXmlProperty(isAttribute=true, localName = "TopXOffset")
	@Description("Offset from the beginning of the top line to the bottom line, measured along the implicit x-axis.")
	@Required()
	@Guid("f08d6341-732e-4061-ad6f-2c819465aa62")
	private double topXOffset;


	public IfcTrapeziumProfileDef()
	{
	}

	public IfcTrapeziumProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomXDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topXDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim, double topXOffset)
	{
		super(profileType);
		this.bottomXDim = bottomXDim;
		this.topXDim = topXDim;
		this.yDim = yDim;
		this.topXOffset = topXOffset;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getBottomXDim() {
		return this.bottomXDim;
	}

	public void setBottomXDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomXDim) {
		this.bottomXDim = bottomXDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getTopXDim() {
		return this.topXDim;
	}

	public void setTopXDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure topXDim) {
		this.topXDim = topXDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getYDim() {
		return this.yDim;
	}

	public void setYDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}

	public double getTopXOffset() {
		return this.topXOffset;
	}

	public void setTopXOffset(double topXOffset) {
		this.topXOffset = topXOffset;
	}


}

