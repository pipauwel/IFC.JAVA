// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcParameterizedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("9e129693-172e-4ea1-b3bb-cb7763385cb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef
{
	@Description("The extent of the bottom line measured along the implicit x-axis.")
	@Required()
	@Guid("06671d06-7136-4a10-9e6d-0074885e3d3d")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomXDim")
	private IfcPositiveLengthMeasure bottomXDim;

	@Description("The extent of the top line measured along the implicit x-axis.")
	@Required()
	@Guid("f95d733f-0777-4572-911e-2d21de75244e")
	@JacksonXmlProperty(isAttribute=false, localName = "TopXDim")
	private IfcPositiveLengthMeasure topXDim;

	@Description("The extent of the distance between the parallel bottom and top lines measured along the implicit y-axis.")
	@Required()
	@Guid("9834941e-4f3b-4ab2-b863-4ffde5ecf1db")
	@JacksonXmlProperty(isAttribute=false, localName = "YDim")
	private IfcPositiveLengthMeasure yDim;

	@Description("Offset from the beginning of the top line to the bottom line, measured along the implicit x-axis.")
	@Required()
	@Guid("f08d6341-732e-4061-ad6f-2c819465aa62")
	@JacksonXmlProperty(isAttribute=true, localName = "TopXOffset")
	private double topXOffset;


	public IfcTrapeziumProfileDef()
	{
	}

	public IfcTrapeziumProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure bottomXDim, IfcPositiveLengthMeasure topXDim, IfcPositiveLengthMeasure yDim, double topXOffset)
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

	public double getTopXOffset() {
		return this.topXOffset;
	}

	public void setTopXOffset(double topXOffset) {
		this.topXOffset = topXOffset;
	}


}

