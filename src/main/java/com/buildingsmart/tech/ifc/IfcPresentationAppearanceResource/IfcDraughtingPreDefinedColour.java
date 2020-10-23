// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("03e6248c-2c4c-4b92-aa0e-2d3861296a9e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDraughtingPreDefinedColour extends IfcPreDefinedColour
{

	public IfcDraughtingPreDefinedColour()
	{
	}

	public IfcDraughtingPreDefinedColour(IfcLabel name)
	{
		super(name);
	}


}

