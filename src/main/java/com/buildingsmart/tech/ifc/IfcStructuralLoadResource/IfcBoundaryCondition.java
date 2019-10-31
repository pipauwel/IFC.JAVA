// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryEdgeCondition;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryFaceCondition;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryNodeCondition;

@Guid("d1fbb09c-b03d-4abb-97d2-0ded2403dd38")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundaryEdgeCondition.class, name = "IfcBoundaryEdgeCondition"), @JsonSubTypes.Type(value = IfcBoundaryFaceCondition.class, name = "IfcBoundaryFaceCondition"), @JsonSubTypes.Type(value = IfcBoundaryNodeCondition.class, name = "IfcBoundaryNodeCondition")})
public abstract class IfcBoundaryCondition
{
	@Description("Optionally defines a name for this boundary condition.")
	@Guid("80e193a9-cfc3-4d5e-ba4a-f2e6dd418ac8")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;


	public IfcBoundaryCondition()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

