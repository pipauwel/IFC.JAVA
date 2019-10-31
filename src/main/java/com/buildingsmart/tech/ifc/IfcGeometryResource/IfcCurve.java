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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcConic;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcLine;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcOffsetCurve2D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcOffsetCurve3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurfaceCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;

@Guid("e39241f5-7436-4f04-91f5-7a80393f242d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundedCurve.class, name = "IfcBoundedCurve"), @JsonSubTypes.Type(value = IfcConic.class, name = "IfcConic"), @JsonSubTypes.Type(value = IfcLine.class, name = "IfcLine"), @JsonSubTypes.Type(value = IfcOffsetCurve2D.class, name = "IfcOffsetCurve2D"), @JsonSubTypes.Type(value = IfcOffsetCurve3D.class, name = "IfcOffsetCurve3D"), @JsonSubTypes.Type(value = IfcPcurve.class, name = "IfcPcurve"), @JsonSubTypes.Type(value = IfcSurfaceCurve.class, name = "IfcSurfaceCurve")})
public abstract class IfcCurve extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect
{

	public IfcCurve()
	{
	}

	public int getDim() {
		return 0;
	}


}

