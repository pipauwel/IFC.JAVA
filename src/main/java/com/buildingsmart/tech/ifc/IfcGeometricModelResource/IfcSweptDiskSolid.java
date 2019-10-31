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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptDiskSolidPolygonal;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSolidModel;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("4140e5e6-6e10-487d-80b0-738ba2b7bedb")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcSweptDiskSolidPolygonal.class, name = "IfcSweptDiskSolidPolygonal"))
public class IfcSweptDiskSolid extends IfcSolidModel
{
	@Description("The curve used to define the sweeping operation. The solid is generated by sweeping a circular disk along the <em>Directrix</em>.")
	@Required()
	@Guid("3e93ea11-2d9f-4011-8826-4222ac737696")
	@JacksonXmlProperty(isAttribute=false, localName = "Directrix")
	private IfcCurve directrix;

	@Description("The <em>Radius</em> of the circular disk to be swept along the <em>directrix</em>. Denotes the outer radius, if an <em>InnerRadius</em> is applied.")
	@Required()
	@Guid("b6637ef9-cdaa-47f9-820d-37b6666212c5")
	@JacksonXmlProperty(isAttribute=false, localName = "Radius")
	private IfcPositiveLengthMeasure radius;

	@Description("This attribute is optional, if present it defines the radius of a circular hole in the centre of the disk.")
	@Guid("1c03cb39-4ce4-40cb-8e6d-61b748f473f6")
	@JacksonXmlProperty(isAttribute=false, localName = "InnerRadius")
	private IfcPositiveLengthMeasure innerRadius;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation commences. <font color=\"#0000ff\">If no value is provided the start of the sweeping operation is at the start of the <em>Directrix</em>.</font>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("1e37f4af-9aa9-4fd7-9f75-1fa5b3af2a7b")
	@JacksonXmlProperty(isAttribute=true, localName = "StartParam")
	private double startParam;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation ends. <font color=\"#0000ff\">If no value is provided the end of the sweeping operation is at the end of the <em>Directrix</em>.</font>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("c33ba8e5-28f6-4a8b-a2a1-7020ac0ff4f1")
	@JacksonXmlProperty(isAttribute=true, localName = "EndParam")
	private double endParam;


	public IfcSweptDiskSolid()
	{
	}

	public IfcSweptDiskSolid(IfcCurve directrix, IfcPositiveLengthMeasure radius)
	{
		this.directrix = directrix;
		this.radius = radius;
	}

	public IfcCurve getDirectrix() {
		return this.directrix;
	}

	public void setDirectrix(IfcCurve directrix) {
		this.directrix = directrix;
	}

	public IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}

	public IfcPositiveLengthMeasure getInnerRadius() {
		return this.innerRadius;
	}

	public void setInnerRadius(IfcPositiveLengthMeasure innerRadius) {
		this.innerRadius = innerRadius;
	}

	public double getStartParam() {
		return this.startParam;
	}

	public void setStartParam(double startParam) {
		this.startParam = startParam;
	}

	public double getEndParam() {
		return this.endParam;
	}

	public void setEndParam(double endParam) {
		this.endParam = endParam;
	}


}
