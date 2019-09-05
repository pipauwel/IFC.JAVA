// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("52b0207c-cc6a-42c8-a632-c3d63a70b2a5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPersonAndOrganization implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "ThePerson")
	@Description("The person who is related to the organization.")
	@Required()
	@Guid("02df37f6-0641-446d-a277-937e200b8a23")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson thePerson;

	@JacksonXmlProperty(isAttribute=false, localName = "TheOrganization")
	@Description("The organization to which the person is related.")
	@Required()
	@Guid("2d901b29-feea-479c-95e0-a3a68bbb5975")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization theOrganization;

	@Description("Roles played by the person within the context of an organization.  These may differ from the roles in <em>ThePerson.Roles</em> which may be asserted without organizational context.")
	@MinLength(1)
	@Guid("56c46a00-0a80-42b4-977c-40d83aa30982")
	private List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> roles = new ArrayList<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole>();


	public IfcPersonAndOrganization()
	{
	}

	public IfcPersonAndOrganization(com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson thePerson, com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization theOrganization)
	{
		this.thePerson = thePerson;
		this.theOrganization = theOrganization;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson getThePerson() {
		return this.thePerson;
	}

	public void setThePerson(com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson thePerson) {
		this.thePerson = thePerson;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization getTheOrganization() {
		return this.theOrganization;
	}

	public void setTheOrganization(com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization theOrganization) {
		this.theOrganization = theOrganization;
	}

	public List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> getRoles() {
		return this.roles;
	}


}

