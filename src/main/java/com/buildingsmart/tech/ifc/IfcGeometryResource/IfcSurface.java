// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("831d6ea9-533c-4e2e-89ce-3769c22c7190")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundedSurface.class, name = "IfcBoundedSurface"), @JsonSubTypes.Type(value = IfcElementarySurface.class, name = "IfcElementarySurface"), @JsonSubTypes.Type(value = IfcSweptSurface.class, name = "IfcSweptSurface")})
public abstract class IfcSurface extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSurfaceOrFaceSurface
{

	public IfcSurface()
	{
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}


}

