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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcOuterBoundaryCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveOnSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment;

@Guid("cfe5f36c-5489-4523-98cb-705240b9ba86")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcOuterBoundaryCurve.class, name = "IfcOuterBoundaryCurve"))
public class IfcBoundaryCurve extends IfcCompositeCurveOnSurface
{

	public IfcBoundaryCurve()
	{
	}

	public IfcBoundaryCurve(IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		super(segments, selfIntersect);
	}


}

