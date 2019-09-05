// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("78a1fa33-c4d1-4c69-9137-f32a6c56f59e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceAmbient extends IfcLightSource
{

	public IfcLightSourceAmbient()
	{
	}

	public IfcLightSourceAmbient(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour)
	{
		super(lightColour);
	}


}

