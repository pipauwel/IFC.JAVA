// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("fb656ee5-6639-4cdf-b4c7-660220b1e753")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPreDefinedColour extends IfcPreDefinedItem implements IfcColour
{

	public IfcPreDefinedColour()
	{
	}

	public IfcPreDefinedColour(String name)
	{
		super(name);
	}


}

