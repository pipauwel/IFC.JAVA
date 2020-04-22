// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorLiningProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorPanelProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcPermeableCoveringProperties;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcementDefinitionProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowLiningProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelProperties;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition;

@Guid("b276a793-d698-4c1d-a456-0ea51f41d25e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDoorLiningProperties.class, name = "IfcDoorLiningProperties"), @JsonSubTypes.Type(value = IfcDoorPanelProperties.class, name = "IfcDoorPanelProperties"), @JsonSubTypes.Type(value = IfcPermeableCoveringProperties.class, name = "IfcPermeableCoveringProperties"), @JsonSubTypes.Type(value = IfcReinforcementDefinitionProperties.class, name = "IfcReinforcementDefinitionProperties"), @JsonSubTypes.Type(value = IfcWindowLiningProperties.class, name = "IfcWindowLiningProperties"), @JsonSubTypes.Type(value = IfcWindowPanelProperties.class, name = "IfcWindowPanelProperties")})
public abstract class IfcPreDefinedPropertySet extends IfcPropertySetDefinition
{

	public IfcPreDefinedPropertySet()
	{
	}

	public IfcPreDefinedPropertySet(String globalId)
	{
		super(globalId);
	}


}

