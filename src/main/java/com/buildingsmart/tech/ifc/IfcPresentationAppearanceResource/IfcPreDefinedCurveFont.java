// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("9d0506f4-1626-4bd0-8b81-426609d1f6c0")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPreDefinedCurveFont extends IfcPreDefinedItem implements IfcCurveStyleFontSelect
{

	public IfcPreDefinedCurveFont()
	{
	}

	public IfcPreDefinedCurveFont(String name)
	{
		super(name);
	}


}

