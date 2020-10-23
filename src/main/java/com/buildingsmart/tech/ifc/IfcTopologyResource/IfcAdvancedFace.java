// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("6c23b448-71b0-4236-9351-383aca8d452c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAdvancedFace extends IfcFaceSurface
{

	public IfcAdvancedFace()
	{
	}

	public IfcAdvancedFace(IfcFaceBound[] bounds, IfcSurface faceSurface, IfcBoolean sameSense)
	{
		super(bounds, faceSurface, sameSense);
	}


}

