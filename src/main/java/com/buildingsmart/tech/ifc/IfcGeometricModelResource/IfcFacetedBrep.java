// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0bee23f3-91ff-4b45-a475-cb0cd78a0a04")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFacetedBrep extends IfcManifoldSolidBrep
{

	public IfcFacetedBrep()
	{
	}

	public IfcFacetedBrep(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer)
	{
		super(outer);
	}


}

