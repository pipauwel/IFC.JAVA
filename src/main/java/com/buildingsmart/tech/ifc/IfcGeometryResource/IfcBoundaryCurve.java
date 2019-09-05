// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("cfe5f36c-5489-4523-98cb-705240b9ba86")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryCurve extends IfcCompositeCurveOnSurface
{

	public IfcBoundaryCurve()
	{
	}

	public IfcBoundaryCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		super(segments, selfIntersect);
	}


}

