// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("606bfe59-169d-4543-89a1-60d81d609835")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolyLoop extends IfcLoop
{
	@Description("List of points defining the loop. There are no repeated points in the list.")
	@Required()
	@MinLength(3)
	@Guid("5e26e14f-8764-4e28-93e9-b88049eac2d2")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> polygon = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint>();


	public IfcPolyLoop()
	{
	}

	public IfcPolyLoop(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint[] polygon)
	{
		this.polygon = new ArrayList<>(Arrays.asList(polygon));
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint> getPolygon() {
		return this.polygon;
	}


}

