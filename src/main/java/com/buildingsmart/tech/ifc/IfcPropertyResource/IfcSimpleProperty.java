// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("6754d0f9-1ae8-4653-bbab-f9aa6b1e5206")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSimpleProperty extends IfcProperty
{

	public IfcSimpleProperty()
	{
	}

	public IfcSimpleProperty(String name)
	{
		super(name);
	}


}

