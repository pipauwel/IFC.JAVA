// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9e129693-172e-4ea1-b3bb-cb7763385cb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef
{
	@Description("The extent of the bottom line measured along the implicit x-axis.")
	@DataMember(Order = 0)
	@Required()
	@Guid("06671d06-7136-4a10-9e6d-0074885e3d3d")
	@JacksonXmlProperty(isAttribute=false, localName = "bottomXDim")
	private IfcPositiveLengthMeasure bottomXDim;

	@Description("The extent of the top line measured along the implicit x-axis.")
	@DataMember(Order = 1)
	@Required()
	@Guid("f95d733f-0777-4572-911e-2d21de75244e")
	@JacksonXmlProperty(isAttribute=false, localName = "topXDim")
	private IfcPositiveLengthMeasure topXDim;

	@Description("The extent of the distance between the parallel bottom and top lines measured along the implicit y-axis.")
	@DataMember(Order = 2)
	@Required()
	@Guid("9834941e-4f3b-4ab2-b863-4ffde5ecf1db")
	@JacksonXmlProperty(isAttribute=false, localName = "yDim")
	private IfcPositiveLengthMeasure yDim;

	@Description("Offset from the beginning of the top line to the bottom line, measured along the implicit x-axis.")
	@DataMember(Order = 3)
	@Required()
	@Guid("f08d6341-732e-4061-ad6f-2c819465aa62")
	@JacksonXmlProperty(isAttribute=false, localName = "topXOffset")
	private IfcLengthMeasure topXOffset;


	public IfcTrapeziumProfileDef()
	{
	}

	public IfcTrapeziumProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure bottomXDim, IfcPositiveLengthMeasure topXDim,
								  IfcPositiveLengthMeasure yDim, IfcLengthMeasure topXOffset)
	{
		super(profileType);
		this.bottomXDim = bottomXDim;
		this.topXDim = topXDim;
		this.yDim = yDim;
		this.topXOffset = topXOffset;
	}

	public IfcPositiveLengthMeasure getBottomXDim() {
		return this.bottomXDim;
	}

	public void setBottomXDim(IfcPositiveLengthMeasure bottomXDim) {
		this.bottomXDim = bottomXDim;
	}

	public IfcPositiveLengthMeasure getTopXDim() {
		return this.topXDim;
	}

	public void setTopXDim(IfcPositiveLengthMeasure topXDim) {
		this.topXDim = topXDim;
	}

	public IfcPositiveLengthMeasure getYDim() {
		return this.yDim;
	}

	public void setYDim(IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}

	public IfcLengthMeasure getTopXOffset() {
		return this.topXOffset;
	}

	public void setTopXOffset(IfcLengthMeasure topXOffset) {
		this.topXOffset = topXOffset;
	}


}

