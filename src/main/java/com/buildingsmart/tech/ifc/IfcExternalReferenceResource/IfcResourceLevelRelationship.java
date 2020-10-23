// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganizationRelationship;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcCurrencyRelationship;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialRelationship;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9a3e1026-c1d1-44fe-ab77-8497972584e4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcApprovalRelationship.class, name = "IfcApprovalRelationship"), @JsonSubTypes.Type(value = IfcCurrencyRelationship.class, name = "IfcCurrencyRelationship"), @JsonSubTypes.Type(value = IfcDocumentInformationRelationship.class, name = "IfcDocumentInformationRelationship"), @JsonSubTypes.Type(value = IfcExternalReferenceRelationship.class, name = "IfcExternalReferenceRelationship"), @JsonSubTypes.Type(value = IfcMaterialRelationship.class, name = "IfcMaterialRelationship"), @JsonSubTypes.Type(value = IfcOrganizationRelationship.class, name = "IfcOrganizationRelationship"), @JsonSubTypes.Type(value = IfcPropertyDependencyRelationship.class, name = "IfcPropertyDependencyRelationship"), @JsonSubTypes.Type(value = IfcResourceApprovalRelationship.class, name = "IfcResourceApprovalRelationship"), @JsonSubTypes.Type(value = IfcResourceConstraintRelationship.class, name = "IfcResourceConstraintRelationship")})
public abstract class IfcResourceLevelRelationship
{
	@Description("A name used to identify or qualify the relationship.")
	@DataMember(Order = 0)
	@Guid("f0cbdaa5-9876-4222-b747-25988a127a3b")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("A description that may apply additional information about the relationship.")
	@DataMember(Order = 1)
	@Guid("909d74c0-6108-4484-9321-b93293f4f356")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;


	public IfcResourceLevelRelationship()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}


}

