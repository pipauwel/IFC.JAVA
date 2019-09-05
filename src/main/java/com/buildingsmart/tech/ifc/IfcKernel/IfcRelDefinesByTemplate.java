// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8ee8ef7b-68ac-46bb-8c28-b6f508eeb0ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByTemplate extends IfcRelDefines
{
	@Description("One or many property sets or quantity sets that obtain their definitions from the single property set template.")
	@Required()
	@MinLength(1)
	@Guid("9ab9894d-523d-414b-a825-be21439de42f")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition> relatedPropertySets = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition>();

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingTemplate")
	@Description("Property set template that provides the common definition of related property sets.")
	@Required()
	@Guid("56b4d519-a460-4476-b354-d80dcfeaed64")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate relatingTemplate;


	public IfcRelDefinesByTemplate()
	{
	}

	public IfcRelDefinesByTemplate(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition[] relatedPropertySets, com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate relatingTemplate)
	{
		super(globalId);
		this.relatedPropertySets = new HashSet<>(Arrays.asList(relatedPropertySets));
		this.relatingTemplate = relatingTemplate;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition> getRelatedPropertySets() {
		return this.relatedPropertySets;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate getRelatingTemplate() {
		return this.relatingTemplate;
	}

	public void setRelatingTemplate(com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate relatingTemplate) {
		this.relatingTemplate = relatingTemplate;
	}


}

