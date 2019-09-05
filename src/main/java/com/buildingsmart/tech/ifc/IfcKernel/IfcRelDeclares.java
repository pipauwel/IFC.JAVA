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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f38b268f-5cb1-42c3-81e3-89081e6b0528")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDeclares extends IfcRelationship
{
	@JsonIgnore
	@Description("Reference to the <em>IfcProject</em> to which additional information is assigned.")
	@Required()
	@Guid("7212f0e4-c36c-4f03-81cb-8220441d3691")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcContext relatingContext;

	@Description("Set of object or property definitions that are assigned to a context and to which the unit and representation context definitions of that context apply.")
	@Required()
	@MinLength(1)
	@Guid("9d9ced1f-f4f3-407a-9b0d-78385692a1a9")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect> relatedDefinitions = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect>();


	public IfcRelDeclares()
	{
	}

	public IfcRelDeclares(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcContext relatingContext, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedDefinitions)
	{
		super(globalId);
		this.relatingContext = relatingContext;
		this.relatedDefinitions = new HashSet<>(Arrays.asList(relatedDefinitions));
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcContext getRelatingContext() {
		return this.relatingContext;
	}

	public void setRelatingContext(com.buildingsmart.tech.ifc.IfcKernel.IfcContext relatingContext) {
		this.relatingContext = relatingContext;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect> getRelatedDefinitions() {
		return this.relatedDefinitions;
	}


}

