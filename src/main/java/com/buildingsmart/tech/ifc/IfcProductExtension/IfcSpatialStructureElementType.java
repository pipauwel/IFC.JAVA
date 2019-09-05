// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("89b1d186-ab55-4cd1-888c-3e1a0b84d6f7")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSpatialStructureElementType extends IfcSpatialElementType
{

	public IfcSpatialStructureElementType()
	{
	}

	public IfcSpatialStructureElementType(String globalId)
	{
		super(globalId);
	}


}

