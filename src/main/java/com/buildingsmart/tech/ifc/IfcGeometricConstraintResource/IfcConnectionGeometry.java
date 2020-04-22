// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionCurveGeometry;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionPointGeometry;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionSurfaceGeometry;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionVolumeGeometry;

@Guid("bbccdc9f-9360-4171-b9a9-3e552ea7289a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcConnectionCurveGeometry.class, name = "IfcConnectionCurveGeometry"), @JsonSubTypes.Type(value = IfcConnectionPointGeometry.class, name = "IfcConnectionPointGeometry"), @JsonSubTypes.Type(value = IfcConnectionSurfaceGeometry.class, name = "IfcConnectionSurfaceGeometry"), @JsonSubTypes.Type(value = IfcConnectionVolumeGeometry.class, name = "IfcConnectionVolumeGeometry")})
public abstract class IfcConnectionGeometry
{

	public IfcConnectionGeometry()
	{
	}


}

