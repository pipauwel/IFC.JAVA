// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("66950826-279c-419b-94ba-f2cc8d28c876")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember
{

	public IfcStructuralSurfaceMemberVarying()
	{
	}

	public IfcStructuralSurfaceMemberVarying(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum predefinedType)
	{
		super(globalId, predefinedType);
	}


}

