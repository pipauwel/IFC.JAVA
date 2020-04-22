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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSweptSurface;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement;

@Guid("89fd5813-f37e-4602-a4ad-8cdb9bf8869c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceOfRevolution extends IfcSweptSurface
{
	@Description("A point on the axis of revolution and the direction of the axis of revolution.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f5ca3d78-4e7d-4f00-8f91-e7bad20ebeb5")
	@JacksonXmlProperty(isAttribute=false, localName = "AxisPosition")
	private IfcAxis1Placement axisPosition;


	public IfcSurfaceOfRevolution()
	{
	}

	public IfcSurfaceOfRevolution(IfcProfileDef sweptCurve, IfcAxis1Placement axisPosition)
	{
		super(sweptCurve);
		this.axisPosition = axisPosition;
	}

	public IfcAxis1Placement getAxisPosition() {
		return this.axisPosition;
	}

	public void setAxisPosition(IfcAxis1Placement axisPosition) {
		this.axisPosition = axisPosition;
	}

	public IfcLine getAxisLine() {
		return null;
	}


}

