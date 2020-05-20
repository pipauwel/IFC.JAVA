// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("b04c081f-98f1-4a81-aa6c-88bad0e295b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFaceOuterBound extends IfcFaceBound
{

	public IfcFaceOuterBound()
	{
	}

	public IfcFaceOuterBound(IfcLoop bound, IfcBoolean orientation)
	{
		super(bound, orientation);
	}


}

