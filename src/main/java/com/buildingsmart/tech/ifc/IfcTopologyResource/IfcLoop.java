// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("af2d8d71-bff9-43d6-8831-2a74e2889cd0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEdgeLoop.class, name = "IfcEdgeLoop"), @JsonSubTypes.Type(value = IfcPolyLoop.class, name = "IfcPolyLoop"), @JsonSubTypes.Type(value = IfcVertexLoop.class, name = "IfcVertexLoop")})
public class IfcLoop extends IfcTopologicalRepresentationItem
{

	public IfcLoop()
	{
	}


}

