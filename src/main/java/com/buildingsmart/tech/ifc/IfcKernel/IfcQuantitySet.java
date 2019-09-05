// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("011bed99-0d3a-482a-9af3-2830d9e3e183")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcQuantitySet extends IfcPropertySetDefinition
{

	public IfcQuantitySet()
	{
	}

	public IfcQuantitySet(String globalId)
	{
		super(globalId);
	}


}

