// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("606bfe59-169d-4543-89a1-60d81d609835")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolyLoop extends IfcLoop
{
	@Description("List of points defining the loop. There are no repeated points in the list.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5e26e14f-8764-4e28-93e9-b88049eac2d2")
	@MinLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "polygon")
	private List<IfcCartesianPoint> polygon;


	public IfcPolyLoop()
	{
	}

	public IfcPolyLoop(IfcCartesianPoint[] polygon)
	{
		this.polygon = new ArrayList<>(Arrays.asList(polygon));
	}

	public List<IfcCartesianPoint> getPolygon() {
		return this.polygon;
	}


}

