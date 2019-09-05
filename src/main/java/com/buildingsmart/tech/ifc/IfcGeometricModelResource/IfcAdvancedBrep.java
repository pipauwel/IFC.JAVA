// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f05cf3b5-4402-4abe-a157-0c8a1f819929")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAdvancedBrep extends IfcManifoldSolidBrep
{

	public IfcAdvancedBrep()
	{
	}

	public IfcAdvancedBrep(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer)
	{
		super(outer);
	}


}

