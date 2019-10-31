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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;

@Guid("4ee02ebb-86ec-4872-a4ca-287681002e36")
@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
//@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelAggregates.class, name = "IfcRelAggregates"), @JsonSubTypes.Type(value = IfcRelNests.class, name = "IfcRelNests"), @JsonSubTypes.Type(value = IfcRelProjectsElement.class, name = "IfcRelProjectsElement"), @JsonSubTypes.Type(value = IfcRelVoidsElement.class, name = "IfcRelVoidsElement")})
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

