// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("4ee02ebb-86ec-4872-a4ca-287681002e36")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcRelDecomposes extends IfcRelationship
{

	public IfcRelDecomposes()
	{
	}

	public IfcRelDecomposes(String globalId)
	{
		super(globalId);
	}


}

