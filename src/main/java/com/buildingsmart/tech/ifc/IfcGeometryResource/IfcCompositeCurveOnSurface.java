// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.Set;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("1548cb11-3dfc-4d82-ac51-6413bb5ccb3d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompositeCurveOnSurface extends IfcCompositeCurve implements IfcCurveOnSurface
{

	public IfcCompositeCurveOnSurface()
	{
	}

	public IfcCompositeCurveOnSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		super(segments, selfIntersect);
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface> getBasisSurface() {
		return null;
	}


}

