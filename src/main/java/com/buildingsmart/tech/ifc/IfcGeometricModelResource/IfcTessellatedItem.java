// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("c36b3952-cd63-40ae-a117-5a55a623bd52")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcIndexedPolygonalFace.class, name = "IfcIndexedPolygonalFace"), @JsonSubTypes.Type(value = IfcTessellatedFaceSet.class, name = "IfcTessellatedFaceSet")})
public abstract class IfcTessellatedItem extends IfcGeometricRepresentationItem
{

	public IfcTessellatedItem()
	{
	}


}

