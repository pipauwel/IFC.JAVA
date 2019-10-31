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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("da40a055-7f34-44ae-85cb-40b20d82ae5a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCartesianTransformationOperator2D.class, name = "IfcCartesianTransformationOperator2D"), @JsonSubTypes.Type(value = IfcCartesianTransformationOperator3D.class, name = "IfcCartesianTransformationOperator3D")})
public abstract class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem
{
	@Description("The direction used to determine U[1], the derived X axis direction.")
	@Guid("77d3a933-8ecd-40ec-a018-58dcd07018c7")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis1")
	private IfcDirection axis1;

	@Description("The direction used to determine U[2], the derived Y axis direction.")
	@Guid("c87eb32c-c021-4fa9-888e-27a2a2d49f73")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis2")
	private IfcDirection axis2;

	@Description("The required translation, specified as a cartesian point. The actual translation included in the transformation is from the geometric origin to the local origin.")
	@Required()
	@Guid("c81e6d3a-d622-4443-a670-a2c528ea33dc")
	@JacksonXmlProperty(isAttribute=false, localName = "LocalOrigin")
	private IfcCartesianPoint localOrigin;

	@Description("The scaling value specified for the transformation.")
	@Guid("3240216d-4df6-4546-a6f0-58d59fa41159")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale")
	private double scale;


	public IfcCartesianTransformationOperator()
	{
	}

	public IfcCartesianTransformationOperator(IfcCartesianPoint localOrigin)
	{
		this.localOrigin = localOrigin;
	}

	public IfcDirection getAxis1() {
		return this.axis1;
	}

	public void setAxis1(IfcDirection axis1) {
		this.axis1 = axis1;
	}

	public IfcDirection getAxis2() {
		return this.axis2;
	}

	public void setAxis2(IfcDirection axis2) {
		this.axis2 = axis2;
	}

	public IfcCartesianPoint getLocalOrigin() {
		return this.localOrigin;
	}

	public void setLocalOrigin(IfcCartesianPoint localOrigin) {
		this.localOrigin = localOrigin;
	}

	public double getScale() {
		return this.scale;
	}

	public void setScale(double scale) {
		this.scale = scale;
	}

	public double getScl() {
		return 0.0;
	}

	public int getDim() {
		return 0;
	}


}

