// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("244ca500-edbb-46f5-9ab8-9560710b61a4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPropertyDefinition extends IfcRoot implements IfcDefinitionSelect
{
	@MaxLength(1)
	@Guid("28b07bf7-fbb2-4391-bcc6-65fdc6c85e0c")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> hasContext = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares>();

	@Description("Reference to the relationship IfcRelAssociates and thus to those externally defined concepts, like classifications, documents, or library information, which are associated to the property definition.")
	@Guid("0e3ae573-eb5a-4df0-9bf3-6a03c15d2cd9")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates> hasAssociations = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates>();


	public IfcPropertyDefinition()
	{
	}

	public IfcPropertyDefinition(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> getHasContext() {
		return this.hasContext;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates> getHasAssociations() {
		return this.hasAssociations;
	}


}

