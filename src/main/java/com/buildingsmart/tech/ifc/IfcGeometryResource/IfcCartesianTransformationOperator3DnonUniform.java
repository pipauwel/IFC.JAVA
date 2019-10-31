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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("283bc76c-8d97-414d-a5ef-96f76f53702f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D
{
	@Description("The scaling value specified for the transformation along the axis 2. This is normally the y scale factor.")
	@Guid("a8e81164-ed5f-4e59-a76e-ab0907154bf2")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale2")
	private double scale2;

	@Description("The scaling value specified for the transformation along the axis 3. This is normally the z scale factor.")
	@Guid("9efce9a5-63f1-44d1-bb62-a02be5a7092f")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale3")
	private double scale3;


	public IfcCartesianTransformationOperator3DnonUniform()
	{
	}

	public IfcCartesianTransformationOperator3DnonUniform(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public double getScale2() {
		return this.scale2;
	}

	public void setScale2(double scale2) {
		this.scale2 = scale2;
	}

	public double getScale3() {
		return this.scale3;
	}

	public void setScale3(double scale3) {
		this.scale3 = scale3;
	}

	public double getScl2() {
		return 0.0;
	}

	public double getScl3() {
		return 0.0;
	}


}

