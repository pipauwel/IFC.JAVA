// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;

@Guid("5ba3d9c4-0d1c-4b36-8793-f7b820c9de94")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureVertex extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The first Coordinate[1] is the S, the second Coordinate[2] is the T parameter value.")
	@Required()
	@Guid("4d6ab645-16b0-46e8-be95-4e9421d52a42")
	@MinLength(2)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Coordinates")
	private List<Double> coordinates;


	public IfcTextureVertex()
	{
	}

	public IfcTextureVertex(Double[] coordinates)
	{
		this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
	}

	public List<Double> getCoordinates() {
		return this.coordinates;
	}


}

