// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("463dbc90-5ef6-4411-b9c2-71144e8ed08d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActor extends IfcObject
{
	@Description("Information about the actor.")
	@Required()
	@Guid("1f0b24bd-108b-4dfd-b2f7-4ca3197d54e3")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect theActor;

	@Description("Reference to the relationship that associates the actor to an object.")
	@Guid("aad58398-0599-4d60-aa99-4b0921c95159")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToActor> isActingUpon = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToActor>();


	public IfcActor()
	{
	}

	public IfcActor(String globalId, com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect theActor)
	{
		super(globalId);
		this.theActor = theActor;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getTheActor() {
		return this.theActor;
	}

	public void setTheActor(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect theActor) {
		this.theActor = theActor;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToActor> getIsActingUpon() {
		return this.isActingUpon;
	}


}

