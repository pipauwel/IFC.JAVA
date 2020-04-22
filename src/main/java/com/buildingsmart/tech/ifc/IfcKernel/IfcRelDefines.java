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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByTemplate;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByType;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;

@Guid("536d8fc9-61a4-49d3-aa33-691cafdb8f60")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
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

