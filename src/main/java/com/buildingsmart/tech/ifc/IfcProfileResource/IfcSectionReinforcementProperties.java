// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("1a1fbaec-082a-40cf-b33c-8bd3fe79b8e5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionReinforcementProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@Description("The start position in longitudinal direction for the section reinforcement properties.")
	@DataMember(Order = 0)
	@Required()
	@Guid("bca4994a-8c29-49d3-98b5-1020732acfe8")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalStartPosition")
	private IfcLengthMeasure longitudinalStartPosition;

	@Description("The end position in longitudinal direction for the section reinforcement properties.")
	@DataMember(Order = 1)
	@Required()
	@Guid("2a03291a-7edc-4bdd-a393-13751700cd3c")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalEndPosition")
	private IfcLengthMeasure longitudinalEndPosition;

	@Description("The position for the section reinforcement properties in transverse direction.")
	@DataMember(Order = 2)
	@Guid("589f3281-5c3c-44ad-98fd-491fcdcadce2")
	@JacksonXmlProperty(isAttribute=false, localName = "transversePosition")
	private IfcLengthMeasure transversePosition;

	@Description("The role, purpose or usage of the reinforcement, i.e. the kind of loads and stresses it is intended to carry, defined for the section reinforcement properties.")
	@DataMember(Order = 3)
	@Required()
	@Guid("4dad372f-bc97-4103-b68d-2bfd2f650b68")
	@JacksonXmlProperty(isAttribute=true, localName = "reinforcementRole")
	private IfcReinforcingBarRoleEnum reinforcementRole;

	@Description("Definition of the cross section profile and longitudinal section type.")
	@DataMember(Order = 4)
	@Required()
	@Guid("79631f01-30ec-44b1-a579-ff40a0af46c4")
	@JacksonXmlProperty(isAttribute=false, localName = "sectionDefinition")
	private IfcSectionProperties sectionDefinition;

	@Description("The set of reinforcment properties attached to a section reinforcement properties definition.")
	@DataMember(Order = 5)
	@Required()
	@Guid("122ebe19-91ac-4bee-8b58-fa8a8e0f26f8")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcReinforcementBarProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "crossSectionReinforcementDefinitions")
	private Set<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions;


	public IfcSectionReinforcementProperties()
	{
	}

	public IfcSectionReinforcementProperties(IfcLengthMeasure longitudinalStartPosition, IfcLengthMeasure longitudinalEndPosition, IfcReinforcingBarRoleEnum reinforcementRole, IfcSectionProperties sectionDefinition, IfcReinforcementBarProperties[] crossSectionReinforcementDefinitions)
	{
		this.longitudinalStartPosition = longitudinalStartPosition;
		this.longitudinalEndPosition = longitudinalEndPosition;
		this.reinforcementRole = reinforcementRole;
		this.sectionDefinition = sectionDefinition;
		this.crossSectionReinforcementDefinitions = new HashSet<>(Arrays.asList(crossSectionReinforcementDefinitions));
	}

	public IfcLengthMeasure getLongitudinalStartPosition() {
		return this.longitudinalStartPosition;
	}

	public void setLongitudinalStartPosition(IfcLengthMeasure longitudinalStartPosition) {
		this.longitudinalStartPosition = longitudinalStartPosition;
	}

	public IfcLengthMeasure getLongitudinalEndPosition() {
		return this.longitudinalEndPosition;
	}

	public void setLongitudinalEndPosition(IfcLengthMeasure longitudinalEndPosition) {
		this.longitudinalEndPosition = longitudinalEndPosition;
	}

	public IfcLengthMeasure getTransversePosition() {
		return this.transversePosition;
	}

	public void setTransversePosition(IfcLengthMeasure transversePosition) {
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

