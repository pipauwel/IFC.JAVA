// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("909fff33-8f74-4be4-83bc-536e4ed2404f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBSplineSurface.class, name = "IfcBSplineSurface"), @JsonSubTypes.Type(value = IfcCurveBoundedPlane.class, name = "IfcCurveBoundedPlane"), @JsonSubTypes.Type(value = IfcCurveBoundedSurface.class, name = "IfcCurveBoundedSurface"), @JsonSubTypes.Type(value = IfcRectangularTrimmedSurface.class, name = "IfcRectangularTrimmedSurface")})
public abstract class IfcBoundedSurface extends IfcSurface
{

	public IfcBoundedSurface()
	{
	}


}

