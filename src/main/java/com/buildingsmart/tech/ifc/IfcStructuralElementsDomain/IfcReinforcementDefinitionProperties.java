// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1e012790-9138-46ab-b075-8f853dffbdf8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcementDefinitionProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@JacksonXmlProperty(isAttribute=true, localName = "DefinitionType")
	@Description("Descriptive type name applied to reinforcement definition properties.")
	@Guid("77446882-b749-4123-99cb-a09d014508a9")
	private String definitionType;

	@Description("The list of section reinforcement properties attached to the reinforcement definition properties.")
	@Required()
	@MinLength(1)
	@Guid("19ef4829-4f78-41bc-8ab5-0fcf0641ab61")
	private List<com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties> reinforcementSectionDefinitions = new ArrayList<com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties>();


	public IfcReinforcementDefinitionProperties()
	{
	}

	public IfcReinforcementDefinitionProperties(String globalId, com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties[] reinforcementSectionDefinitions)
	{
		super(globalId);
		this.reinforcementSectionDefinitions = new ArrayList<>(Arrays.asList(reinforcementSectionDefinitions));
	}

	public String getDefinitionType() {
		return this.definitionType;
	}

	public void setDefinitionType(String definitionType) {
		this.definitionType = definitionType;
	}

	public List<com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
		return this.reinforcementSectionDefinitions;
	}


}

