// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcOccupant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("463dbc90-5ef6-4411-b9c2-71144e8ed08d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcOccupant.class, name = "IfcOccupant"))
public class IfcActor extends IfcObject
{
	@Description("Information about the actor.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1f0b24bd-108b-4dfd-b2f7-4ca3197d54e3")
	@JacksonXmlProperty(isAttribute=true, localName = "theActor")
	private IfcActorSelect theActor;

	@Description("Reference to the relationship that associates the actor to an object.")
	@InverseProperty(InverseProp = "relatingActor", Range = "IfcRelAssignsToActor")
	@Guid("aad58398-0599-4d60-aa99-4b0921c95159")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToActor")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isActingUpon")*/
	@JsonIgnore
	private Set<IfcRelAssignsToActor> isActingUpon;


	public IfcActor()
	{
	}

	public IfcActor(String globalId, IfcActorSelect theActor)
	{
		super(globalId);
		this.theActor = theActor;
	}

	public IfcActorSelect getTheActor() {
		return this.theActor;
	}

	public void setTheActor(IfcActorSelect theActor) {
		this.theActor = theActor;
	}

	public Set<IfcRelAssignsToActor> getIsActingUpon() {
		return this.isActingUpon;
	}


}

