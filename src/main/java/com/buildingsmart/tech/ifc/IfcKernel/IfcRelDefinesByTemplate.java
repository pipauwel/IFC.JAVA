// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("8ee8ef7b-68ac-46bb-8c28-b6f508eeb0ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByTemplate extends IfcRelDefines
{
	@Description("One or many property sets or quantity sets that obtain their definitions from the single property set template.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9ab9894d-523d-414b-a825-be21439de42f")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertySetDefinition")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedPropertySets")
	private Set<IfcPropertySetDefinition> relatedPropertySets;

	@Description("Property set template that provides the common definition of related property sets.")
	@DataMember(Order = 1)
	@Required()
	@Guid("56b4d519-a460-4476-b354-d80dcfeaed64")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingTemplate")
	private IfcPropertySetTemplate relatingTemplate;


	public IfcRelDefinesByTemplate()
	{
	}

	public IfcRelDefinesByTemplate(String globalId, IfcPropertySetDefinition[] relatedPropertySets, IfcPropertySetTemplate relatingTemplate)
	{
		super(globalId);
		this.relatedPropertySets = new HashSet<>(Arrays.asList(relatedPropertySets));
		this.relatingTemplate = relatingTemplate;
	}

	public Set<IfcPropertySetDefinition> getRelatedPropertySets() {
		return this.relatedPropertySets;
	}

	public IfcPropertySetTemplate getRelatingTemplate() {
		return this.relatingTemplate;
	}

	public void setRelatingTemplate(IfcPropertySetTemplate relatingTemplate) {
		this.relatingTemplate = relatingTemplate;
	}


}

