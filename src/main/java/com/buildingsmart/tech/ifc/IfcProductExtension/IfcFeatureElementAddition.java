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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcProjectionElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElement;

@Guid("818c820c-139e-4825-96bc-6c16e6f606d4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcProjectionElement.class, name = "IfcProjectionElement"))
public abstract class IfcFeatureElementAddition extends IfcFeatureElement
{
	@Description("Reference to the <em>IfcRelProjectsElement</em> relationship that uses this <em>IfcFeatureElementAddition</em> to create a volume addition at an element. The <em>IfcFeatureElementAddition</em> can only be used to create a single addition at a single element using Boolean addition operation.")
	@InverseProperty(InverseProp = "RelatedFeatureElement", Range = "IfcRelProjectsElement")
	@Guid("916482f1-a6fe-4d2a-86b0-8f9c6796f946")
	@JacksonXmlProperty(isAttribute=false, localName = "ProjectsElements")
	private IfcRelProjectsElement projectsElements;


	public IfcFeatureElementAddition()
	{
	}

	public IfcFeatureElementAddition(String globalId)
	{
		super(globalId);
	}

	public IfcRelProjectsElement getProjectsElements() {
		return this.projectsElements;
	}

	public void setProjectsElements(IfcRelProjectsElement projectsElements) {
		this.projectsElements = projectsElements;
	}


}

