// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadStatic;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcSurfaceReinforcementArea;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;

@Guid("96ba50e5-1f39-4b66-81ea-83538ffc193d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralLoadStatic.class, name = "IfcStructuralLoadStatic"), @JsonSubTypes.Type(value = IfcSurfaceReinforcementArea.class, name = "IfcSurfaceReinforcementArea")})
public abstract class IfcStructuralLoadOrResult extends IfcStructuralLoad
{

	public IfcStructuralLoadOrResult()
	{
	}


}

