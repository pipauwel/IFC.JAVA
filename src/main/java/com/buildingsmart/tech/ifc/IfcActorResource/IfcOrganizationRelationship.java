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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization;

@Guid("7d18a179-a00b-491f-937b-dcc94942b9ce")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrganizationRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("Organization which is the relating part of the relationship between organizations.")
	@Required()
	@Guid("6942a3a9-9978-476a-8476-de4c734c3086")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingOrganization")
	private IfcOrganization relatingOrganization;

	@Description("The other, possibly dependent, organizations which are the related parts of the relationship between organizations.")
	@Required()
	@Guid("daa9c417-c4bd-4262-82ed-c9a9676f0e18")
	@MinLength(1)
	@JsonIgnore
	private Set<IfcOrganization> relatedOrganizations;


	public IfcOrganizationRelationship()
	{
	}

	public IfcOrganizationRelationship(IfcOrganization relatingOrganization, IfcOrganization[] relatedOrganizations)
	{
		this.relatingOrganization = relatingOrganization;
		this.relatedOrganizations = new HashSet<>(Arrays.asList(relatedOrganizations));
	}

	public IfcOrganization getRelatingOrganization() {
		return this.relatingOrganization;
	}

	public void setRelatingOrganization(IfcOrganization relatingOrganization) {
		this.relatingOrganization = relatingOrganization;
	}

	public Set<IfcOrganization> getRelatedOrganizations() {
		return this.relatedOrganizations;
	}


}

