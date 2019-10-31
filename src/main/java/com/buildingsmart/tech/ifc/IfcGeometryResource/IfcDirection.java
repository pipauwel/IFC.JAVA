// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;

@Guid("c9a6fe1f-b072-45ab-ba40-8c1f8c01e132")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDirection extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridPlacementDirectionSelect, IfcVectorOrDirection
{
	@Description("The components in the direction of X axis (DirectionRatios[1]), of Y axis (DirectionRatios[2]), and of Z axis (DirectionRatios[3])")
	@Required()
	@Guid("c10df008-c6c7-4ceb-8a7b-e5696975a354")
	@MinLength(2)
	@MaxLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "DirectionRatios")
	private List<Double> directionRatios;


	public IfcDirection()
	{
	}

	public IfcDirection(Double[] directionRatios)
	{
		this.directionRatios = new ArrayList<>(Arrays.asList(directionRatios));
	}

	public List<Double> getDirectionRatios() {
		return this.directionRatios;
	}

	public int getDim() {
		return 0;
	}


}

