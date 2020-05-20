// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Set;

@Guid("1548cb11-3dfc-4d82-ac51-6413bb5ccb3d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBoundaryCurve.class, name = "IfcBoundaryCurve"))
public class IfcCompositeCurveOnSurface extends IfcCompositeCurve implements IfcCurveOnSurface
{

	public IfcCompositeCurveOnSurface()
	{
	}

	public IfcCompositeCurveOnSurface(IfcCompositeCurveSegment[] segments, IfcLogical selfIntersect)
	{
		super(segments, selfIntersect);
	}

	public Set<IfcSurface> getBasisSurface() {
		//	BasisSurface
		//:=IfcGetBasisSurface(SELF)
		return null;
	}


}

