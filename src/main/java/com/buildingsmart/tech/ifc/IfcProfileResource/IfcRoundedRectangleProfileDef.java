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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcRectangleProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("0c3d81f9-c173-4e51-8063-1ab1f071f67a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef
{
	@Description("Radius of the circular arcs by which all four corners of the rectangle are equally rounded.")
	@Required()
	@Guid("afc5aaa4-0bee-4503-bf30-a7540e19281c")
	@JacksonXmlProperty(isAttribute=false, localName = "RoundingRadius")
	private IfcPositiveLengthMeasure roundingRadius;


	public IfcRoundedRectangleProfileDef()
	{
	}

	public IfcRoundedRectangleProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim, IfcPositiveLengthMeasure roundingRadius)
	{
		super(profileType, xDim, yDim);
		this.roundingRadius = roundingRadius;
	}

	public IfcPositiveLengthMeasure getRoundingRadius() {
		return this.roundingRadius;
	}

	public void setRoundingRadius(IfcPositiveLengthMeasure roundingRadius) {
		this.roundingRadius = roundingRadius;
	}


}

