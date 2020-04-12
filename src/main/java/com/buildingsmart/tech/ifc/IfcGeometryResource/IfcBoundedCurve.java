// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("50c7ada8-807a-46d9-a1cb-b9794c9a22e5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBSplineCurve.class, name = "IfcBSplineCurve"), @JsonSubTypes.Type(value = IfcCompositeCurve.class, name = "IfcCompositeCurve"), @JsonSubTypes.Type(value = IfcIndexedPolyCurve.class, name = "IfcIndexedPolyCurve"), @JsonSubTypes.Type(value = IfcPolyline.class, name = "IfcPolyline"), @JsonSubTypes.Type(value = IfcTrimmedCurve.class, name = "IfcTrimmedCurve")})
public abstract class IfcBoundedCurve extends IfcCurve implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve
{

	public IfcBoundedCurve()
	{
	}


}

