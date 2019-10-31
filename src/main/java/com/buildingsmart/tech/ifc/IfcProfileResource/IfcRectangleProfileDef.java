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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcRectangleHollowProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcRoundedRectangleProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcParameterizedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("76426990-f6c8-4462-b489-68361df1c390")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRectangleHollowProfileDef.class, name = "IfcRectangleHollowProfileDef"), @JsonSubTypes.Type(value = IfcRoundedRectangleProfileDef.class, name = "IfcRoundedRectangleProfileDef")})
public class IfcRectangleProfileDef extends IfcParameterizedProfileDef
{
	@Description("The extent of the rectangle in the direction of the x-axis.")
	@Required()
	@Guid("cc30f80d-efff-497d-a442-14ef5a82594e")
	@JacksonXmlProperty(isAttribute=false, localName = "XDim")
	private IfcPositiveLengthMeasure xDim;

	@Description("The extent of the rectangle in the direction of the y-axis.")
	@Required()
	@Guid("8675ebcb-7de8-4598-8952-7776657d7a52")
	@JacksonXmlProperty(isAttribute=false, localName = "YDim")
	private IfcPositiveLengthMeasure yDim;


	public IfcRectangleProfileDef()
	{
	}

	public IfcRectangleProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim)
	{
		super(profileType);
		this.xDim = xDim;
		this.yDim = yDim;
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


}

