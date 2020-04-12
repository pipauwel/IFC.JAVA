// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("96ba50e5-1f39-4b66-81ea-83538ffc193d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralLoadStatic.class, name = "IfcStructuralLoadStatic"), @JsonSubTypes.Type(value = IfcSurfaceReinforcementArea.class, name = "IfcSurfaceReinforcementArea")})
public abstract class IfcStructuralLoadOrResult extends IfcStructuralLoad
{

	public IfcStructuralLoadOrResult()
	{
	}


}

