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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurfaceCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPcurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPreferredSurfaceCurveRepresentation;

@Guid("2cdcc9f4-9e12-4da4-958c-a14cecfae81e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIntersectionCurve extends IfcSurfaceCurve
{

	public IfcIntersectionCurve()
	{
	}

	public IfcIntersectionCurve(IfcCurve curve3D, IfcPcurve[] associatedGeometry, IfcPreferredSurfaceCurveRepresentation masterRepresentation)
	{
		super(curve3D, associatedGeometry, masterRepresentation);
	}


}

