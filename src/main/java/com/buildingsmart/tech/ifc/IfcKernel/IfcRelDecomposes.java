// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("4ee02ebb-86ec-4872-a4ca-287681002e36")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelAggregates.class, name = "IfcRelAggregates"), @JsonSubTypes.Type(value = IfcRelNests.class, name = "IfcRelNests"), @JsonSubTypes.Type(value = IfcRelProjectsElement.class, name = "IfcRelProjectsElement"), @JsonSubTypes.Type(value = IfcRelVoidsElement.class, name = "IfcRelVoidsElement")})
public abstract class IfcRelDecomposes extends IfcRelationship
{

	public IfcRelDecomposes()
	{
	}

	public IfcRelDecomposes(String globalId)
	{
		super(globalId);
	}


}

