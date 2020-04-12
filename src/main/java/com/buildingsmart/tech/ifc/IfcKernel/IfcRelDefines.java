// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("536d8fc9-61a4-49d3-aa33-691cafdb8f60")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelDefinesByObject.class, name = "IfcRelDefinesByObject"), @JsonSubTypes.Type(value = IfcRelDefinesByProperties.class, name = "IfcRelDefinesByProperties"), @JsonSubTypes.Type(value = IfcRelDefinesByTemplate.class, name = "IfcRelDefinesByTemplate"), @JsonSubTypes.Type(value = IfcRelDefinesByType.class, name = "IfcRelDefinesByType")})
public abstract class IfcRelDefines extends IfcRelationship
{

	public IfcRelDefines()
	{
	}

	public IfcRelDefines(String globalId)
	{
		super(globalId);
	}


}

