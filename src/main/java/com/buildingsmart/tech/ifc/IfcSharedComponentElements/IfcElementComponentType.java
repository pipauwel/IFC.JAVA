// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("7904437f-39fd-4ac3-a04b-cd4158e276b3")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcElementComponentType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementType
{

	public IfcElementComponentType()
	{
	}

	public IfcElementComponentType(String globalId)
	{
		super(globalId);
	}


}

