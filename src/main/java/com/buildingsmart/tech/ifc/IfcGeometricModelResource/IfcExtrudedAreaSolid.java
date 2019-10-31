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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcExtrudedAreaSolidTapered;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptAreaSolid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("f65777d3-6cb6-48f6-8a26-d79b570cdfb2")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcExtrudedAreaSolidTapered.class, name = "IfcExtrudedAreaSolidTapered"))
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid
{
	@Description("The direction in which the surface, provided by <em>SweptArea</em> is to be swept.")
	@Required()
	@Guid("aef4b8f4-190c-4dbd-a5ef-4ad2bf1d00a3")
	@JacksonXmlProperty(isAttribute=false, localName = "ExtrudedDirection")
	private IfcDirection extrudedDirection;

	@Description("The distance the surface is to be swept along the <em>ExtrudedDirection</em>.")
	@Required()
	@Guid("a0e24ce6-15a3-49a4-827b-25a7987a23f7")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private IfcPositiveLengthMeasure depth;


	public IfcExtrudedAreaSolid()
	{
	}

	public IfcExtrudedAreaSolid(IfcProfileDef sweptArea, IfcDirection extrudedDirection, IfcPositiveLengthMeasure depth)
	{
		super(sweptArea);
		this.extrudedDirection = extrudedDirection;
		this.depth = depth;
	}

	public IfcDirection getExtrudedDirection() {
		return this.extrudedDirection;
	}

	public void setExtrudedDirection(IfcDirection extrudedDirection) {
		this.extrudedDirection = extrudedDirection;
	}

	public IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}


}

