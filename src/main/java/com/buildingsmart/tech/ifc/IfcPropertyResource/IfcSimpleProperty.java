// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

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
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyBoundedValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyEnumeratedValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyListValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyReferenceValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertySingleValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyTableValue;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty;

@Guid("6754d0f9-1ae8-4653-bbab-f9aa6b1e5206")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPropertyBoundedValue.class, name = "IfcPropertyBoundedValue"), @JsonSubTypes.Type(value = IfcPropertyEnumeratedValue.class, name = "IfcPropertyEnumeratedValue"), @JsonSubTypes.Type(value = IfcPropertyListValue.class, name = "IfcPropertyListValue"), @JsonSubTypes.Type(value = IfcPropertyReferenceValue.class, name = "IfcPropertyReferenceValue"), @JsonSubTypes.Type(value = IfcPropertySingleValue.class, name = "IfcPropertySingleValue"), @JsonSubTypes.Type(value = IfcPropertyTableValue.class, name = "IfcPropertyTableValue")})
public abstract class IfcSimpleProperty extends IfcProperty
{

	public IfcSimpleProperty()
	{
	}

	public IfcSimpleProperty(String name)
	{
		super(name);
	}


}

