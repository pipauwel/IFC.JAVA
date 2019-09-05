// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("8db6f32f-4084-4717-8dfb-ad3400beaf4c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLinearAction extends IfcStructuralCurveAction
{

	public IfcStructuralLinearAction()
	{
	}

	public IfcStructuralLinearAction(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal, predefinedType);
	}


}

