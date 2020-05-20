// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("2c8e3dda-8168-4443-97ee-c5d8cd46e7bf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDraughtingPreDefinedCurveFont extends IfcPreDefinedCurveFont
{

	public IfcDraughtingPreDefinedCurveFont()
	{
	}

	public IfcDraughtingPreDefinedCurveFont(IfcLabel name)
	{
		super(name);
	}


}

