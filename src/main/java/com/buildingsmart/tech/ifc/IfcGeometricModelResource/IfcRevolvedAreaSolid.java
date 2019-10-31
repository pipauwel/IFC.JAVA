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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcRevolvedAreaSolidTapered;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptAreaSolid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement;

@Guid("81970f2f-c63e-4133-adaf-c74d522cb449")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRevolvedAreaSolidTapered.class, name = "IfcRevolvedAreaSolidTapered"))
public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid
{
	@Description("Axis about which revolution will take place.")
	@Required()
	@Guid("7d721792-8d9e-4a49-84d2-65251bbed28a")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis")
	private IfcAxis1Placement axis;

	@Description("The angle through which the sweep will be made. This angle is measured from the plane of the swept area provided by the XY plane of the position coordinate system.")
	@Required()
	@Guid("1119b572-18c2-4c9a-b4cf-e146b2426614")
	@JacksonXmlProperty(isAttribute=true, localName = "Angle")
	private double angle;


	public IfcRevolvedAreaSolid()
	{
	}

	public IfcRevolvedAreaSolid(IfcProfileDef sweptArea, IfcAxis1Placement axis, double angle)
	{
		super(sweptArea);
		this.axis = axis;
		this.angle = angle;
	}

	public IfcAxis1Placement getAxis() {
		return this.axis;
	}

	public void setAxis(IfcAxis1Placement axis) {
		this.axis = axis;
	}

	public double getAngle() {
		return this.angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public IfcLine getAxisLine() {
		return null;
	}


}

