// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("bbccdc9f-9360-4171-b9a9-3e552ea7289a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcConnectionCurveGeometry.class, name = "IfcConnectionCurveGeometry"), @JsonSubTypes.Type(value = IfcConnectionPointGeometry.class, name = "IfcConnectionPointGeometry"), @JsonSubTypes.Type(value = IfcConnectionSurfaceGeometry.class, name = "IfcConnectionSurfaceGeometry"), @JsonSubTypes.Type(value = IfcConnectionVolumeGeometry.class, name = "IfcConnectionVolumeGeometry")})
public abstract class IfcConnectionGeometry
{

	public IfcConnectionGeometry()
	{
	}


}

