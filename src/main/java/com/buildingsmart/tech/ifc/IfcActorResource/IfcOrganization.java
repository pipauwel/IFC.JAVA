// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("93c06606-4886-4b0b-9ed6-d883d74c46fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrganization implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("Identification of the organization.")
	@Guid("69df2c90-db0e-4770-8b56-979b8b047e1e")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The word, or group of words, by which the organization is referred to.")
	@Required()
	@Guid("c166f087-4894-4a21-a9e9-d97eb1819fdf")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Text that relates the nature of the organization.")
	@Guid("25df158d-5646-41da-ab00-0278fd97465f")
	private String description;

	@Description("Roles played by the organization.")
	@MinLength(1)
	@Guid("0d1eb7de-a748-4032-b4dc-41db568b69e9")
	private List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> roles = new ArrayList<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole>();

	@Description("Postal and telecom addresses of an organization.  <blockquote class=\"note\">NOTE&nbsp; There may be several addresses related to an organization.</blockquote>")
	@MinLength(1)
	@Guid("5539929c-db61-4891-a291-4994f62113a2")
	private List<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress> addresses = new ArrayList<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress>();

	@Description("The inverse relationship for relationship RelatedOrganizations of IfcOrganizationRelationship.")
	@Guid("59988b08-ea6e-488b-b72b-2dcc2c2d9d0a")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship> isRelatedBy = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship>();

	@Description("The inverse relationship for relationship RelatingOrganization of IfcOrganizationRelationship.")
	@Guid("4bad5ffe-b272-41b1-93f8-a45a33946e83")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship> relates = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship>();

	@Description("Inverse relationship to IfcPersonAndOrganization relationships in which IfcOrganization is engaged.")
	@Guid("5555917c-f7e2-4872-9d55-b2e5ae11442d")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization> engages = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization>();


	public IfcOrganization()
	{
	}

	public IfcOrganization(String name)
	{
		this.name = name;
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> getRoles() {
		return this.roles;
	}

	public List<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress> getAddresses() {
		return this.addresses;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship> getIsRelatedBy() {
		return this.isRelatedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship> getRelates() {
		return this.relates;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization> getEngages() {
		return this.engages;
	}


}

