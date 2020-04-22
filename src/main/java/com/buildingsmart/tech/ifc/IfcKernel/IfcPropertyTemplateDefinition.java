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
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyTemplate;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyDefinition;

@Guid("0935fc73-9d2c-4777-a78c-13e931da9996")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPropertySetTemplate.class, name = "IfcPropertySetTemplate"), @JsonSubTypes.Type(value = IfcPropertyTemplate.class, name = "IfcPropertyTemplate")})
public abstract class IfcPropertyTemplateDefinition extends IfcPropertyDefinition
{

	public IfcPropertyTemplateDefinition()
	{
	}

	public IfcPropertyTemplateDefinition(String globalId)
	{
		super(globalId);
	}


}

