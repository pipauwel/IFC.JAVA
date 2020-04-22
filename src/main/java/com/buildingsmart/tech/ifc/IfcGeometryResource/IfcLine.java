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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector;

@Guid("28220f1d-2ef9-48f4-9aa6-198f7af996d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLine extends IfcCurve
{
	@Description("The location of the <em>IfcLine</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("efe6be19-11b9-4b75-9821-ae20d1d465ad")
	@JacksonXmlProperty(isAttribute=false, localName = "Pnt")
	private IfcCartesianPoint pnt;

	@Description("The direction of the <em>IfcLine</em>, the magnitude and units of <em>Dir</em> affect the parameterization of the line.")
	@DataMember(Order = 1)
	@Required()
	@Guid("da76faa5-1c45-41b8-80ce-79d00d362cd1")
	@JacksonXmlProperty(isAttribute=false, localName = "Dir")
	private IfcVector dir;


	public IfcLine()
	{
	}

	public IfcLine(IfcCartesianPoint pnt, IfcVector dir)
	{
		this.pnt = pnt;
		this.dir = dir;
	}

	public IfcCartesianPoint getPnt() {
		return this.pnt;
	}

	public void setPnt(IfcCartesianPoint pnt) {
		this.pnt = pnt;
	}

	public IfcVector getDir() {
		return this.dir;
	}

	public void setDir(IfcVector dir) {
		this.dir = dir;
	}


}

