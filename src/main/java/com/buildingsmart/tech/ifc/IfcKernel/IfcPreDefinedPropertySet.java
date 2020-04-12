// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorLiningProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcDoorPanelProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcPermeableCoveringProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowLiningProperties;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelProperties;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcementDefinitionProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("b276a793-d698-4c1d-a456-0ea51f41d25e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
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

