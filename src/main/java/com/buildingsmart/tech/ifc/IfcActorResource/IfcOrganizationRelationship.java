// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7d18a179-a00b-491f-937b-dcc94942b9ce")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrganizationRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingOrganization")
	@Description("Organization which is the relating part of the relationship between organizations.")
	@Required()
	@Guid("6942a3a9-9978-476a-8476-de4c734c3086")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization relatingOrganization;

	@Description("The other, possibly dependent, organizations which are the related parts of the relationship between organizations.")
	@Required()
	@MinLength(1)
	@Guid("daa9c417-c4bd-4262-82ed-c9a9676f0e18")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization> relatedOrganizations = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization>();


	public IfcOrganizationRelationship()
	{
	}

	public IfcOrganizationRelationship(com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization relatingOrganization, com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization[] relatedOrganizations)
	{
		this.relatingOrganization = relatingOrganization;
		this.relatedOrganizations = new HashSet<>(Arrays.asList(relatedOrganizations));
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization getRelatingOrganization() {
		return this.relatingOrganization;
	}

	public void setRelatingOrganization(com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization relatingOrganization) {
		this.relatingOrganization = relatingOrganization;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization> getRelatedOrganizations() {
		return this.relatedOrganizations;
	}


}

