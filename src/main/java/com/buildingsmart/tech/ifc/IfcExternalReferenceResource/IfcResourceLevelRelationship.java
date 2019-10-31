// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

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
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcCurrencyRelationship;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship;

@Guid("9a3e1026-c1d1-44fe-ab77-8497972584e4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcApprovalRelationship.class, name = "IfcApprovalRelationship"), @JsonSubTypes.Type(value = IfcCurrencyRelationship.class, name = "IfcCurrencyRelationship"), @JsonSubTypes.Type(value = IfcDocumentInformationRelationship.class, name = "IfcDocumentInformationRelationship"), @JsonSubTypes.Type(value = IfcExternalReferenceRelationship.class, name = "IfcExternalReferenceRelationship"), @JsonSubTypes.Type(value = IfcMaterialRelationship.class, name = "IfcMaterialRelationship"), @JsonSubTypes.Type(value = IfcOrganizationRelationship.class, name = "IfcOrganizationRelationship"), @JsonSubTypes.Type(value = IfcPropertyDependencyRelationship.class, name = "IfcPropertyDependencyRelationship"), @JsonSubTypes.Type(value = IfcResourceApprovalRelationship.class, name = "IfcResourceApprovalRelationship"), @JsonSubTypes.Type(value = IfcResourceConstraintRelationship.class, name = "IfcResourceConstraintRelationship")})
public abstract class IfcResourceLevelRelationship
{
	@Description("A name used to identify or qualify the relationship.")
	@Guid("f0cbdaa5-9876-4222-b747-25988a127a3b")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("A description that may apply additional information about the relationship.")
	@Guid("909d74c0-6108-4484-9321-b93293f4f356")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;


	public IfcResourceLevelRelationship()
	{
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


}

