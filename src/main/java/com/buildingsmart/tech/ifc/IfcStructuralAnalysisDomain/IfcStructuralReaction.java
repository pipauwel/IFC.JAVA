// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f0e940ad-cfed-49d8-a850-023bd268a88a")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralReaction extends IfcStructuralActivity
{

	public IfcStructuralReaction()
	{
	}

	public IfcStructuralReaction(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId, appliedLoad, globalOrLocal);
	}


}

