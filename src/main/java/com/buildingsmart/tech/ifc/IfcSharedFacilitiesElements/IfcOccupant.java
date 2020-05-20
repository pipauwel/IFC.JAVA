// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("25ccf99a-1eaa-4b97-9f86-66335a753f92")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOccupant extends com.buildingsmart.tech.ifc.IfcKernel.IfcActor
{
	@Description("Predefined occupant types from which that required may be set.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute made optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("1cecbf41-1f12-4d9f-9a7e-08490eb36753")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcOccupantTypeEnum predefinedType;


	public IfcOccupant()
	{
	}

	public IfcOccupant(String globalId, IfcActorSelect theActor)
	{
		super(globalId, theActor);
	}

	public IfcOccupantTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcOccupantTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

