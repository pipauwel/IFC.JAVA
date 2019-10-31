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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDecomposes;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefines;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRoot;

@Guid("9719f52b-2f51-4db0-9908-f63426ac8fc8")
@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
//@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelAssigns.class, name = "IfcRelAssigns"), @JsonSubTypes.Type(value = IfcRelAssociates.class, name = "IfcRelAssociates"), @JsonSubTypes.Type(value = IfcRelConnects.class, name = "IfcRelConnects"), @JsonSubTypes.Type(value = IfcRelDeclares.class, name = "IfcRelDeclares"), @JsonSubTypes.Type(value = IfcRelDecomposes.class, name = "IfcRelDecomposes"), @JsonSubTypes.Type(value = IfcRelDefines.class, name = "IfcRelDefines")})
public abstract class IfcRelationship extends IfcRoot
{

	public IfcRelationship()
	{
	}

	public IfcRelationship(String globalId)
	{
		super(globalId);
	}


}

