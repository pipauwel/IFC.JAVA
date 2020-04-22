// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

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
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties;

@Guid("1e012790-9138-46ab-b075-8f853dffbdf8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcementDefinitionProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Descriptive type name applied to reinforcement definition properties.")
	@DataMember(Order = 0)
	@Guid("77446882-b749-4123-99cb-a09d014508a9")
	@JacksonXmlProperty(isAttribute=true, localName = "DefinitionType")
	private String definitionType;

	@Description("The list of section reinforcement properties attached to the reinforcement definition properties.")
	@DataMember(Order = 1)
	@Required()
	@Guid("19ef4829-4f78-41bc-8ab5-0fcf0641ab61")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcSectionReinforcementProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ReinforcementSectionDefinitions")
	private List<IfcSectionReinforcementProperties> reinforcementSectionDefinitions;


	public IfcReinforcementDefinitionProperties()
	{
	}

	public IfcReinforcementDefinitionProperties(String globalId, IfcSectionReinforcementProperties[] reinforcementSectionDefinitions)
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

	public List<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
		return this.reinforcementSectionDefinitions;
	}


}

