// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgPrimitive3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("211a7b82-6217-476c-8ecd-feaed2e8b2b9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCone extends IfcCsgPrimitive3D
{
	@Description("The distance between the base of the cone and the apex.")
	@Required()
	@Guid("a0b36efe-1934-4e3b-80dd-4b67e80b840f")
	@JacksonXmlProperty(isAttribute=false, localName = "Height")
	private IfcPositiveLengthMeasure height;

	@Description("The radius of the cone at the base.")
	@Required()
	@Guid("96023c2d-7a04-412b-9320-9a31d8e31a05")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomRadius")
	private IfcPositiveLengthMeasure bottomRadius;


	public IfcRightCircularCone()
	{
	}

	public IfcRightCircularCone(IfcAxis2Placement3D position, IfcPositiveLengthMeasure height, IfcPositiveLengthMeasure bottomRadius)
	{
		super(position);
		this.height = height;
		this.bottomRadius = bottomRadius;
	}

	public IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(IfcPositiveLengthMeasure height) {
		this.height = height;
	}

	public IfcPositiveLengthMeasure getBottomRadius() {
		return this.bottomRadius;
	}

	public void setBottomRadius(IfcPositiveLengthMeasure bottomRadius) {
		this.bottomRadius = bottomRadius;
	}


}

