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

@Guid("cfe5f36c-5489-4523-98cb-705240b9ba86")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcOuterBoundaryCurve.class, name = "IfcOuterBoundaryCurve"))
public class IfcBoundaryCurve extends IfcCompositeCurveOnSurface
{

	public IfcBoundaryCurve()
	{
	}

	public IfcBoundaryCurve(IfcCompositeCurveSegment[] segments, IfcLogical selfIntersect)
	{
		super(segments, selfIntersect);
	}


}

