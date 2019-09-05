// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1a1fbaec-082a-40cf-b33c-8bd3fe79b8e5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionReinforcementProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalStartPosition")
	@Description("The start position in longitudinal direction for the section reinforcement properties.")
	@Required()
	@Guid("bca4994a-8c29-49d3-98b5-1020732acfe8")
	private double longitudinalStartPosition;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalEndPosition")
	@Description("The end position in longitudinal direction for the section reinforcement properties.")
	@Required()
	@Guid("2a03291a-7edc-4bdd-a393-13751700cd3c")
	private double longitudinalEndPosition;

	@JacksonXmlProperty(isAttribute=true, localName = "TransversePosition")
	@Description("The position for the section reinforcement properties in transverse direction.")
	@Guid("589f3281-5c3c-44ad-98fd-491fcdcadce2")
	private double transversePosition;

	@JacksonXmlProperty(isAttribute=true, localName = "ReinforcementRole")
	@Description("The role, purpose or usage of the reinforcement, i.e. the kind of loads and stresses it is intended to carry, defined for the section reinforcement properties.")
	@Required()
	@Guid("4dad372f-bc97-4103-b68d-2bfd2f650b68")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarRoleEnum reinforcementRole;

	@JacksonXmlProperty(isAttribute=false, localName = "SectionDefinition")
	@Description("Definition of the cross section profile and longitudinal section type.")
	@Required()
	@Guid("79631f01-30ec-44b1-a579-ff40a0af46c4")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties sectionDefinition;

	@Description("The set of reinforcment properties attached to a section reinforcement properties definition.")
	@Required()
	@MinLength(1)
	@Guid("122ebe19-91ac-4bee-8b58-fa8a8e0f26f8")
	private Set<com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties> crossSectionReinforcementDefinitions = new HashSet<com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties>();


	public IfcSectionReinforcementProperties()
	{
	}

	public IfcSectionReinforcementProperties(double longitudinalStartPosition, double longitudinalEndPosition, com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarRoleEnum reinforcementRole, com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties sectionDefinition, com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties[] crossSectionReinforcementDefinitions)
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

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarRoleEnum getReinforcementRole() {
		return this.reinforcementRole;
	}

	public void setReinforcementRole(com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcingBarRoleEnum reinforcementRole) {
		this.reinforcementRole = reinforcementRole;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties getSectionDefinition() {
		return this.sectionDefinition;
	}

	public void setSectionDefinition(com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties sectionDefinition) {
		this.sectionDefinition = sectionDefinition;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		return this.crossSectionReinforcementDefinitions;
	}


}

