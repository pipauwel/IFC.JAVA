// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("300d59f2-14b1-4472-b5a4-8cf798c02341")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCartesianPointList2D.class, name = "IfcCartesianPointList2D"), @JsonSubTypes.Type(value = IfcCartesianPointList3D.class, name = "IfcCartesianPointList3D")})
public abstract class IfcCartesianPointList extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{

	public IfcCartesianPointList()
	{
	}

	@JsonIgnore
	public int getDim() {
		//	Dim
		//:=IfcPointListDim(SELF)
		return 0;
	}


}

