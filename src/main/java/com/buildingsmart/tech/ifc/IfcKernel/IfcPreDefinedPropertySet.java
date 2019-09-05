// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("b276a793-d698-4c1d-a456-0ea51f41d25e")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPreDefinedPropertySet extends IfcPropertySetDefinition
{

	public IfcPreDefinedPropertySet()
	{
	}

	public IfcPreDefinedPropertySet(String globalId)
	{
		super(globalId);
	}


}

