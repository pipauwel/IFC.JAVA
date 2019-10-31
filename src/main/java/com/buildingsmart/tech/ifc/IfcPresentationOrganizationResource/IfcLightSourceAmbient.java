// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightSource;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;

@Guid("78a1fa33-c4d1-4c69-9137-f32a6c56f59e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceAmbient extends IfcLightSource
{

	public IfcLightSourceAmbient()
	{
	}

	public IfcLightSourceAmbient(IfcColourRgb lightColour)
	{
		super(lightColour);
	}


}

