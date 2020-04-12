// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("f7222de3-ebea-4122-b900-08a34b4b8fbc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcReinforcementBarProperties.class, name = "IfcReinforcementBarProperties"), @JsonSubTypes.Type(value = IfcSectionProperties.class, name = "IfcSectionProperties"), @JsonSubTypes.Type(value = IfcSectionReinforcementProperties.class, name = "IfcSectionReinforcementProperties")})
public abstract class IfcPreDefinedProperties extends IfcPropertyAbstraction
{

	public IfcPreDefinedProperties()
	{
	}


}

