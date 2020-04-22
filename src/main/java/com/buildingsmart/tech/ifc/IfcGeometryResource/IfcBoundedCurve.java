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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcIndexedPolyCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPolyline;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTrimmedCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("50c7ada8-807a-46d9-a1cb-b9794c9a22e5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBSplineCurve.class, name = "IfcBSplineCurve"), @JsonSubTypes.Type(value = IfcCompositeCurve.class, name = "IfcCompositeCurve"), @JsonSubTypes.Type(value = IfcIndexedPolyCurve.class, name = "IfcIndexedPolyCurve"), @JsonSubTypes.Type(value = IfcPolyline.class, name = "IfcPolyline"), @JsonSubTypes.Type(value = IfcTrimmedCurve.class, name = "IfcTrimmedCurve")})
public abstract class IfcBoundedCurve extends IfcCurve implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve
{

	public IfcBoundedCurve()
	{
	}


}

