// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("240944f4-46be-4656-ab86-736f96b1dc40")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcBuildingElementType extends IfcElementType
{

	public IfcBuildingElementType()
	{
	}

	public IfcBuildingElementType(String globalId)
	{
		super(globalId);
	}


}

