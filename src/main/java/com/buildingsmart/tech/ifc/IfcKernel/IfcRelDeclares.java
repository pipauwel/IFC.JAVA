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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;
import com.buildingsmart.tech.ifc.IfcKernel.IfcContext;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;

@Guid("f38b268f-5cb1-42c3-81e3-89081e6b0528")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDeclares extends IfcRelationship
{
	@Description("Reference to the <em>IfcProject</em> to which additional information is assigned.")
	@Required()
	@Guid("7212f0e4-c36c-4f03-81cb-8220441d3691")
	@JsonIgnore
	private IfcContext relatingContext;

	@Description("Set of object or property definitions that are assigned to a context and to which the unit and representation context definitions of that context apply.")
	@Required()
	@Guid("9d9ced1f-f4f3-407a-9b0d-78385692a1a9")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDefinitionSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedDefinitions")
	private Set<IfcDefinitionSelect> relatedDefinitions;


	public IfcRelDeclares()
	{
	}

	public IfcRelDeclares(String globalId, IfcContext relatingContext, IfcDefinitionSelect[] relatedDefinitions)
	{
		super(globalId);
		this.relatingContext = relatingContext;
		this.relatedDefinitions = new HashSet<>(Arrays.asList(relatedDefinitions));
	}

	public IfcContext getRelatingContext() {
		return this.relatingContext;
	}

	public void setRelatingContext(IfcContext relatingContext) {
		this.relatingContext = relatingContext;
	}

	public Set<IfcDefinitionSelect> getRelatedDefinitions() {
		return this.relatedDefinitions;
	}


}

