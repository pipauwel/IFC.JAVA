// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("b95f48a3-6b56-4eb3-90bf-c76eea036d6f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSeamCurve extends IfcSurfaceCurve
{

	public IfcSeamCurve()
	{
	}

	public IfcSeamCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve curve3D, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve[] associatedGeometry, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation masterRepresentation)
	{
		super(curve3D, associatedGeometry, masterRepresentation);
	}


}

