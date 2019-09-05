// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("8afd8403-af5d-435e-b2f5-590d21cb0300")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPlane extends IfcElementarySurface
{

	public IfcPlane()
	{
	}

	public IfcPlane(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position)
	{
		super(position);
	}


}

