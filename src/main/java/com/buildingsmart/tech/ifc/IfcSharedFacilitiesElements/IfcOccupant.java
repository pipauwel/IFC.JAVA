// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

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
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcActor;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;

@Guid("25ccf99a-1eaa-4b97-9f86-66335a753f92")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOccupant extends com.buildingsmart.tech.ifc.IfcKernel.IfcActor
{
	@Description("Predefined occupant types from which that required may be set.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute made optional.</blockquote>")
	@Guid("1cecbf41-1f12-4d9f-9a7e-08490eb36753")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcOccupantTypeEnum predefinedType;


	public IfcOccupant()
	{
	}

	public IfcOccupant(String globalId, IfcActorSelect theActor)
	{
		super(globalId, theActor);
	}

	public IfcOccupantTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcOccupantTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

