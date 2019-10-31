// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementAddition;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcSurfaceFeature;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("439553ce-81d9-4bd1-8648-bcf6a5ee6ecc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFeatureElementAddition.class, name = "IfcFeatureElementAddition"), @JsonSubTypes.Type(value = IfcFeatureElementSubtraction.class, name = "IfcFeatureElementSubtraction"), @JsonSubTypes.Type(value = IfcSurfaceFeature.class, name = "IfcSurfaceFeature")})
public abstract class IfcFeatureElement extends IfcElement
{

	public IfcFeatureElement()
	{
	}

	public IfcFeatureElement(String globalId)
	{
		super(globalId);
	}


}

