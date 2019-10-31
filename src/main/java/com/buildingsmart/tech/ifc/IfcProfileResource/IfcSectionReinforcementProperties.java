// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarRoleEnum;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties;

@Guid("1a1fbaec-082a-40cf-b33c-8bd3fe79b8e5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionReinforcementProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@Description("The start position in longitudinal direction for the section reinforcement properties.")
	@Required()
	@Guid("bca4994a-8c29-49d3-98b5-1020732acfe8")
	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalStartPosition")
	private double longitudinalStartPosition;

	@Description("The end position in longitudinal direction for the section reinforcement properties.")
	@Required()
	@Guid("2a03291a-7edc-4bdd-a393-13751700cd3c")
	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalEndPosition")
	private double longitudinalEndPosition;

	@Description("The position for the section reinforcement properties in transverse direction.")
	@Guid("589f3281-5c3c-44ad-98fd-491fcdcadce2")
	@JacksonXmlProperty(isAttribute=true, localName = "TransversePosition")
	private double transversePosition;

	@Description("The role, purpose or usage of the reinforcement, i.e. the kind of loads and stresses it is intended to carry, defined for the section reinforcement properties.")
	@Required()
	@Guid("4dad372f-bc97-4103-b68d-2bfd2f650b68")
	@JacksonXmlProperty(isAttribute=true, localName = "ReinforcementRole")
	private IfcReinforcingBarRoleEnum reinforcementRole;

	@Description("Definition of the cross section profile and longitudinal section type.")
	@Required()
	@Guid("79631f01-30ec-44b1-a579-ff40a0af46c4")
	@JacksonXmlProperty(isAttribute=false, localName = "SectionDefinition")
	private IfcSectionProperties sectionDefinition;

	@Description("The set of reinforcment properties attached to a section reinforcement properties definition.")
	@Required()
	@Guid("122ebe19-91ac-4bee-8b58-fa8a8e0f26f8")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcReinforcementBarProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "CrossSectionReinforcementDefinitions")
	private Set<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions;


	public IfcSectionReinforcementProperties()
	{
	}

	public IfcSectionReinforcementProperties(double longitudinalStartPosition, double longitudinalEndPosition, IfcReinforcingBarRoleEnum reinforcementRole, IfcSectionProperties sectionDefinition, IfcReinforcementBarProperties[] crossSectionReinforcementDefinitions)
	{
		this.longitudinalStartPosition = longitudinalStartPosition;
		this.longitudinalEndPosition = longitudinalEndPosition;
		this.reinforcementRole = reinforcementRole;
		this.sectionDefinition = sectionDefinition;
		this.crossSectionReinforcementDefinitions = new HashSet<>(Arrays.asList(crossSectionReinforcementDefinitions));
	}

	public double getLongitudinalStartPosition() {
		return this.longitudinalStartPosition;
	}

	public void setLongitudinalStartPosition(double longitudinalStartPosition) {
		this.longitudinalStartPosition = longitudinalStartPosition;
	}

	public double getLongitudinalEndPosition() {
		return this.longitudinalEndPosition;
	}

	public void setLongitudinalEndPosition(double longitudinalEndPosition) {
		this.longitudinalEndPosition = longitudinalEndPosition;
	}

	public double getTransversePosition() {
		return this.transversePosition;
	}

	public void setTransversePosition(double transversePosition) {
		this.transversePosition = transversePosition;
	}

	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return this.reinforcementRole;
	}

	public void setReinforcementRole(IfcReinforcingBarRoleEnum reinforcementRole) {
		this.reinforcementRole = reinforcementRole;
	}

	public IfcSectionProperties getSectionDefinition() {
		return this.sectionDefinition;
	}

	public void setSectionDefinition(IfcSectionProperties sectionDefinition) {
		this.sectionDefinition = sectionDefinition;
	}

	public Set<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		return this.crossSectionReinforcementDefinitions;
	}


}

