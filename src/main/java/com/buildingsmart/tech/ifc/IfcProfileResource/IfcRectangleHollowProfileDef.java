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

@Guid("19db74b8-9bbd-4310-a2b8-d47984481a40")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef
{
	@Description("Thickness of the material.")
	@Required()
	@Guid("e469897c-3e73-451f-9c72-a373783992ba")
	@JacksonXmlProperty(isAttribute=false, localName = "WallThickness")
	private IfcPositiveLengthMeasure wallThickness;

	@Description("Inner corner radius.")
	@Guid("5aa6d217-3f48-4fbb-9145-55601b62701b")
	@JacksonXmlProperty(isAttribute=false, localName = "InnerFilletRadius")
	private IfcNonNegativeLengthMeasure innerFilletRadius;

	@Description("Outer corner radius.")
	@Guid("493f68ea-2c2e-44f2-bef4-d2c48668cc91")
	@JacksonXmlProperty(isAttribute=false, localName = "OuterFilletRadius")
	private IfcNonNegativeLengthMeasure outerFilletRadius;


	public IfcRectangleHollowProfileDef()
	{
	}

	public IfcRectangleHollowProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim, IfcPositiveLengthMeasure wallThickness)
	{
		super(profileType, xDim, yDim);
		this.wallThickness = wallThickness;
	}

	public IfcPositiveLengthMeasure getWallThickness() {
		return this.wallThickness;
	}

	public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
		this.wallThickness = wallThickness;
	}

	public IfcNonNegativeLengthMeasure getInnerFilletRadius() {
		return this.innerFilletRadius;
	}

	public void setInnerFilletRadius(IfcNonNegativeLengthMeasure innerFilletRadius) {
		this.innerFilletRadius = innerFilletRadius;
	}

	public IfcNonNegativeLengthMeasure getOuterFilletRadius() {
		return this.outerFilletRadius;
	}

	public void setOuterFilletRadius(IfcNonNegativeLengthMeasure outerFilletRadius) {
		this.outerFilletRadius = outerFilletRadius;
	}


}

