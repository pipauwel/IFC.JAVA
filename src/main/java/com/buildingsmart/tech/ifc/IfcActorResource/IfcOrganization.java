// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

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
import com.buildingsmart.tech.ifc.IfcActorResource.*;

@Guid("93c06606-4886-4b0b-9ed6-d883d74c46fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrganization implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Identification of the organization.")
	@DataMember(Order = 0)
	@Guid("69df2c90-db0e-4770-8b56-979b8b047e1e")
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	private String identification;

	@Description("The word, or group of words, by which the organization is referred to.")
	@DataMember(Order = 1)
	@Required()
	@Guid("c166f087-4894-4a21-a9e9-d97eb1819fdf")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Text that relates the nature of the organization.")
	@DataMember(Order = 2)
	@Guid("25df158d-5646-41da-ab00-0278fd97465f")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Roles played by the organization.")
	@DataMember(Order = 3)
	@Guid("0d1eb7de-a748-4032-b4dc-41db568b69e9")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcActorRole")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Roles")
	private List<IfcActorRole> roles;

	@Description("Postal and telecom addresses of an organization.  <blockquote class=\"note\">NOTE&nbsp; There may be several addresses related to an organization.</blockquote>")
	@DataMember(Order = 4)
	@Guid("5539929c-db61-4891-a291-4994f62113a2")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAddress")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Addresses")
	private List<IfcAddress> addresses;

	@Description("The inverse relationship for relationship RelatedOrganizations of IfcOrganizationRelationship.")
	@InverseProperty(InverseProp = "RelatedOrganizations", Range = "IfcOrganizationRelationship")
	@Guid("59988b08-ea6e-488b-b72b-2dcc2c2d9d0a")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcOrganizationRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "IsRelatedBy")
	private Set<IfcOrganizationRelationship> isRelatedBy;

	@Description("The inverse relationship for relationship RelatingOrganization of IfcOrganizationRelationship.")
	@InverseProperty(InverseProp = "RelatingOrganization", Range = "IfcOrganizationRelationship")
	@Guid("4bad5ffe-b272-41b1-93f8-a45a33946e83")
	@JsonIgnore
	private Set<IfcOrganizationRelationship> relates;

	@Description("Inverse relationship to IfcPersonAndOrganization relationships in which IfcOrganization is engaged.")
	@InverseProperty(InverseProp = "TheOrganization", Range = "IfcPersonAndOrganization")
	@Guid("5555917c-f7e2-4872-9d55-b2e5ae11442d")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPersonAndOrganization")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Engages")
	@JsonIgnore
	private Set<IfcPersonAndOrganization> engages;


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

	public List<IfcActorRole> getRoles() {
		return this.roles;
	}

	public List<IfcAddress> getAddresses() {
		return this.addresses;
	}

	public Set<IfcOrganizationRelationship> getIsRelatedBy() {
		return this.isRelatedBy;
	}

	public Set<IfcOrganizationRelationship> getRelates() {
		return this.relates;
	}

	public Set<IfcPersonAndOrganization> getEngages() {
		return this.engages;
	}


}

