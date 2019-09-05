// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("300d59f2-14b1-4472-b5a4-8cf798c02341")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcCartesianPointList extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{

	public IfcCartesianPointList()
	{
	}

	public int getDim() {
		return 0;
	}


}

