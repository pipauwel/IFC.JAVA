// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0a5d42f4-d5ec-40b1-9227-3fdb4692e2eb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeometricCurveSet extends IfcGeometricSet
{

	public IfcGeometricCurveSet()
	{
	}

	public IfcGeometricCurveSet(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect[] elements)
	{
		super(elements);
	}


}

