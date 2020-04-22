// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurveBoundedPlane;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurveBoundedSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRectangularTrimmedSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;

@Guid("909fff33-8f74-4be4-83bc-536e4ed2404f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBSplineSurface.class, name = "IfcBSplineSurface"), @JsonSubTypes.Type(value = IfcCurveBoundedPlane.class, name = "IfcCurveBoundedPlane"), @JsonSubTypes.Type(value = IfcCurveBoundedSurface.class, name = "IfcCurveBoundedSurface"), @JsonSubTypes.Type(value = IfcRectangularTrimmedSurface.class, name = "IfcRectangularTrimmedSurface")})
public abstract class IfcBoundedSurface extends IfcSurface
{

	public IfcBoundedSurface()
	{
	}


}

