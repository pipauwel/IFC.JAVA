// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("2cdcc9f4-9e12-4da4-958c-a14cecfae81e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIntersectionCurve extends IfcSurfaceCurve
{

	public IfcIntersectionCurve()
	{
	}

	public IfcIntersectionCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve curve3D, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve[] associatedGeometry, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation masterRepresentation)
	{
		super(curve3D, associatedGeometry, masterRepresentation);
	}


}

