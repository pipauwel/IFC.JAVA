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

@Guid("1daf3ba6-e5cf-4741-8896-c9448b95f83a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCylinder extends IfcCsgPrimitive3D
{
	@Description("The distance between the planar circular faces of the cylinder.")
	@Required()
	@Guid("dcf9b582-ff9a-4dd7-8ea9-1ba2cbdc8c7b")
	@JacksonXmlProperty(isAttribute=false, localName = "Height")
	private IfcPositiveLengthMeasure height;

	@Description("The radius of the cylinder.")
	@Required()
	@Guid("fccf868b-e746-42cf-86cb-78c653cf2949")
	@JacksonXmlProperty(isAttribute=false, localName = "Radius")
	private IfcPositiveLengthMeasure radius;


	public IfcRightCircularCylinder()
	{
	}

	public IfcRightCircularCylinder(IfcAxis2Placement3D position, IfcPositiveLengthMeasure height, IfcPositiveLengthMeasure radius)
	{
		super(position);
		this.height = height;
		this.radius = radius;
	}

	public IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(IfcPositiveLengthMeasure height) {
		this.height = height;
	}

	public IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}


}

