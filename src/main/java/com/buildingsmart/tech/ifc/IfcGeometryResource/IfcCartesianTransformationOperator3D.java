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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator3DnonUniform;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("137f3407-b6b9-4752-b668-e9e574a1b3fd")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCartesianTransformationOperator3DnonUniform.class, name = "IfcCartesianTransformationOperator3DnonUniform"))
public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator
{
	@Description("The exact direction of U[3], the derived Z axis direction.")
	@DataMember(Order = 0)
	@Guid("42759c76-3cfb-44fb-9a58-78c6f7c1c245")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis3")
	private IfcDirection axis3;


	public IfcCartesianTransformationOperator3D()
	{
	}

	public IfcCartesianTransformationOperator3D(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public IfcDirection getAxis3() {
		return this.axis3;
	}

	public void setAxis3(IfcDirection axis3) {
		this.axis3 = axis3;
	}

	public List<IfcDirection> getU() {
		return null;
	}


}

