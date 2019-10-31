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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("27c04622-ab3d-4d08-9084-d06304e17b81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolyline extends IfcBoundedCurve
{
	@Description("The points defining the polyline.")
	@Required()
	@Guid("0ab3bcf4-dfb0-4e1f-9ab9-dbdc31e393fa")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Points")
	private List<IfcCartesianPoint> points;


	public IfcPolyline()
	{
	}

	public IfcPolyline(IfcCartesianPoint[] points)
	{
		this.points = new ArrayList<>(Arrays.asList(points));
	}

	public List<IfcCartesianPoint> getPoints() {
		return this.points;
	}


}

