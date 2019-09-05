// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcApprovalResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("76476d02-0061-4539-81cf-c606a2acbe13")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcApproval implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identifier")
	@Description("A computer interpretable identifier by which the approval is known.")
	@Guid("a1fa1c90-f7b0-4cc3-ac7c-310cb59dc8ea")
	private String identifier;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("A human readable name given to an approval.")
	@Guid("97065098-5b7a-4f0a-9047-84618567b028")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("A general textual description of a design, work task, plan, etc. that is being approved for.")
	@Guid("acec49a4-4798-47ce-b95a-36d2041a421d")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "TimeOfApproval")
	@Description("Date and time when the result of the approval process is produced.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute data type changed to <em>IfcDateTime</em> using ISO 8601 representation, renamed from ApprovalDateTime and made OPTIONAL.</blockquote>")
	@Guid("998d7843-2f2d-4e56-a224-6d334af4ac2e")
	private String timeOfApproval;

	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	@Description("The result or current status of the approval, e.g. Requested, Processed, Approved, Not Approved.")
	@Guid("2ee053bf-3553-49ee-9fd8-f253b1eafb26")
	private String status;

	@JacksonXmlProperty(isAttribute=true, localName = "Level")
	@Description("Level of the approval e.g. Draft v.s. Completed design.")
	@Guid("201d349a-9ee9-4d16-a6de-17dc2f6d4e9d")
	private String level;

	@JacksonXmlProperty(isAttribute=true, localName = "Qualifier")
	@Description("Textual description of special constraints or conditions for the approval.")
	@Guid("bbe34628-1287-4cd0-96f2-310cf5177c72")
	private String qualifier;

	@Description("The actor that is acting in the role specified at <em>IfcOrganization</em> or individually at <em>IfcPerson</em> and requesting an approval.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute for approval request replacing IfcApprovalActorRelationship (being deleted).</blockquote>")
	@Guid("4b0f76d0-86d3-4da8-aa4a-be82b503cabb")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect requestingApproval;

	@Description("The actor that is acting in the role specified at <em>IfcOrganization</em> or individually at <em>IfcPerson</em> and giving an approval.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute for approval provision replacing IfcApprovalActorRelationship (being deleted).</blockquote>")
	@Guid("56400bef-4db8-4c65-ad92-c61fc8ee4850")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect givingApproval;

	@Description("Reference to external references, e.g. library, classification, or document information, that are associated to the Approval.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("8cd1b95c-03b1-4fbd-bb5e-86213dc0d6d2")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReferences = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();

	@Description("Reference to the <em>IfcRelAssociatesApproval</em> instances associating this approval to objects (subtypes of <em>IfcRoot</em>")
	@Guid("1803bd98-5411-4c09-9660-d1c5beb99533")
	private Set<com.buildingsmart.tech.ifc.IfcControlExtension.IfcRelAssociatesApproval> approvedObjects = new HashSet<com.buildingsmart.tech.ifc.IfcControlExtension.IfcRelAssociatesApproval>();

	@Description("The set of relationships by which resource objects that are are approved by this approval are known.")
	@Guid("7c6e96b1-7bc8-42fb-b828-eac53994c387")
	private Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship> approvedResources = new HashSet<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship>();

	@Description("The set of relationships by which this approval is related to others.")
	@Guid("cf2deea0-6ee1-4f94-a3f9-d149fa54d64e")
	private Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship> isRelatedWith = new HashSet<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship>();

	@Description("The set of relationships by which other approvals are related to this one.")
	@Guid("65d560d3-2883-4606-a81c-802b6c633550")
	private Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship> relates = new HashSet<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship>();


	public IfcApproval()
	{
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
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

	public String getTimeOfApproval() {
		return this.timeOfApproval;
	}

	public void setTimeOfApproval(String timeOfApproval) {
		this.timeOfApproval = timeOfApproval;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getQualifier() {
		return this.qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getRequestingApproval() {
		return this.requestingApproval;
	}

	public void setRequestingApproval(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect requestingApproval) {
		this.requestingApproval = requestingApproval;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getGivingApproval() {
		return this.givingApproval;
	}

	public void setGivingApproval(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect givingApproval) {
		this.givingApproval = givingApproval;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<com.buildingsmart.tech.ifc.IfcControlExtension.IfcRelAssociatesApproval> getApprovedObjects() {
		return this.approvedObjects;
	}

	public Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship> getApprovedResources() {
		return this.approvedResources;
	}

	public Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship> getIsRelatedWith() {
		return this.isRelatedWith;
	}

	public Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApprovalRelationship> getRelates() {
		return this.relates;
	}


}

