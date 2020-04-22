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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("de606da2-a6cd-4560-a4c7-0e89276bc4ca")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface
{
	@Description("The direction of the extrusion.")
	@DataMember(Order = 0)
	@Required()
	@Guid("0f7fc3fd-9211-4ce1-8cc9-408ea774da47")
	@JacksonXmlProperty(isAttribute=false, localName = "ExtrudedDirection")
	private IfcDirection extrudedDirection;

	@Description("The depth of the extrusion, it determines the parameterization.")
	@DataMember(Order = 1)
	@Required()
	@Guid("4a50c089-187a-47a1-bae2-528540dc9218")
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	private double depth;


	public IfcSurfaceOfLinearExtrusion()
	{
	}

	public IfcSurfaceOfLinearExtrusion(IfcProfileDef sweptCurve, IfcDirection extrudedDirection, double depth)
	{
		super(sweptCurve);
		this.extrudedDirection = extrudedDirection;
		this.depth = depth;
	}

	public IfcDirection getExtrudedDirection() {
		return this.extrudedDirection;
	}

	public void setExtrudedDirection(IfcDirection extrudedDirection) {
		this.extrudedDirection = extrudedDirection;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public IfcVector getExtrusionAxis() {
		return null;
	}


}

