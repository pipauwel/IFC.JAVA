// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcElementarySurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("48f9b867-ec04-4a55-9138-f52b74f1b60e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcToroidalSurface extends IfcElementarySurface
{
	@Description("The major radius of the torus.")
	@Required()
	@Guid("6d516f41-e0c1-4436-9ba8-bdc235df5f75")
	@JacksonXmlProperty(isAttribute=false, localName = "MajorRadius")
	private IfcPositiveLengthMeasure majorRadius;

	@Description("The minor radius of the torus.")
	@Required()
	@Guid("996fe0f6-341c-4dda-9436-f345cfac480f")
	@JacksonXmlProperty(isAttribute=false, localName = "MinorRadius")
	private IfcPositiveLengthMeasure minorRadius;


	public IfcToroidalSurface()
	{
	}

	public IfcToroidalSurface(IfcAxis2Placement3D position, IfcPositiveLengthMeasure majorRadius, IfcPositiveLengthMeasure minorRadius)
	{
		super(position);
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	public IfcPositiveLengthMeasure getMajorRadius() {
		return this.majorRadius;
	}

	public void setMajorRadius(IfcPositiveLengthMeasure majorRadius) {
		this.majorRadius = majorRadius;
	}

	public IfcPositiveLengthMeasure getMinorRadius() {
		return this.minorRadius;
	}

	public void setMinorRadius(IfcPositiveLengthMeasure minorRadius) {
		this.minorRadius = minorRadius;
	}


}

