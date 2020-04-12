// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("4e0d2a97-7485-4958-a7af-66da7c2d8c31")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralCurveMemberVarying extends IfcStructuralCurveMember
{

	public IfcStructuralCurveMemberVarying()
	{
	}

	public IfcStructuralCurveMemberVarying(String globalId, IfcStructuralCurveMemberTypeEnum predefinedType, IfcDirection axis)
	{
		super(globalId, predefinedType, axis);
	}


}

