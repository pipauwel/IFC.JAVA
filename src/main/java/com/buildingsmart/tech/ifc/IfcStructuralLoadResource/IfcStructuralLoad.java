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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadConfiguration;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult;

@Guid("9f70562a-7269-4def-b7a9-f818ed6ce0cb")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralLoadConfiguration.class, name = "IfcStructuralLoadConfiguration"), @JsonSubTypes.Type(value = IfcStructuralLoadOrResult.class, name = "IfcStructuralLoadOrResult")})
public abstract class IfcStructuralLoad
{
	@Description("Optionally defines a name for this load.")
	@Guid("01e55eb4-7ae4-4ce0-8763-839611198171")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;


	public IfcStructuralLoad()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

