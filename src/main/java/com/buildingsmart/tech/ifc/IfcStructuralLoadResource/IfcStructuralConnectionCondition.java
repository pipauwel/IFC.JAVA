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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcFailureConnectionCondition;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcSlippageConnectionCondition;

@Guid("ea3beaa7-301b-4f86-8c4f-4356baa1c79f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFailureConnectionCondition.class, name = "IfcFailureConnectionCondition"), @JsonSubTypes.Type(value = IfcSlippageConnectionCondition.class, name = "IfcSlippageConnectionCondition")})
public abstract class IfcStructuralConnectionCondition
{
	@Description("Optionally defines a name for this connection condition.")
	@DataMember(Order = 0)
	@Guid("a1bcf73e-6ba2-4b5b-bcda-3b3e613a4703")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;


	public IfcStructuralConnectionCondition()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

