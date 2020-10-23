// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("697bb1a2-488c-4282-8300-a66e028db272")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToActor extends IfcRelAssigns
{
	@Description("Reference to the information about the actor. It comprises the information about the person or organization and its addresses.")
	@DataMember(Order = 0)
	@Required()
	@Guid("0a6c1031-7ef4-4086-943e-b9db2389f495")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingActor")
	private IfcActor relatingActor;

	@Description("Role of the actor played within the context of the assignment to the object(s).")
	@DataMember(Order = 1)
	@Guid("d77e7175-259c-472c-a440-d1e078f46ec9")
	@JacksonXmlProperty(isAttribute=false, localName = "actingRole")
	private IfcActorRole actingRole;


	public IfcRelAssignsToActor()
	{
	}

	public IfcRelAssignsToActor(String globalId, IfcObjectDefinition[] relatedObjects, IfcActor relatingActor)
	{
		super(globalId, relatedObjects);
		this.relatingActor = relatingActor;
	}

	public IfcActor getRelatingActor() {
		return this.relatingActor;
	}

	public void setRelatingActor(IfcActor relatingActor) {
		this.relatingActor = relatingActor;
	}

	public IfcActorRole getActingRole() {
		return this.actingRole;
	}

	public void setActingRole(IfcActorRole actingRole) {
		this.actingRole = actingRole;
	}


}

