// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("9719f52b-2f51-4db0-9908-f63426ac8fc8")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcRelationship extends IfcRoot
{

	public IfcRelationship()
	{
	}

	public IfcRelationship(String globalId)
	{
		super(globalId);
	}


}

