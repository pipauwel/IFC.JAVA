// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("a00e8863-dd67-4f4b-8e83-2c3ee0290740")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcBuildingElement extends IfcElement
{

	public IfcBuildingElement()
	{
	}

	public IfcBuildingElement(String globalId)
	{
		super(globalId);
	}


}

