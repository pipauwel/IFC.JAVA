// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ece4dd99-11bc-4dbb-b170-998764abc239")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentInformation extends IfcExternalInformation implements IfcDocumentSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("Identifier that uniquely identifies a document.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute renamed from <em>DocumentId</em>.  </blockquote>")
	@Required()
	@Guid("fdc5fbd6-5bb9-4f9c-b478-d0ed07773f1f")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("File name or document name assigned by owner.")
	@Required()
	@Guid("f308e9ce-8a5e-4408-b3c5-c20a7b5ee6de")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Description of document and its content.")
	@Guid("1c47a9d6-a070-4fe8-b9f9-02166afad5fe")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "Location")
	@Description("Resource identifier or locator, provided as URI, URN or URL, of the document information for online references.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the place of the removed attribute <em>DocumentReferences</em>.  </blockquote>")
	@Guid("494ea53e-4ee5-4c89-a31e-0732cd47caa0")
	private String location;

	@JacksonXmlProperty(isAttribute=true, localName = "Purpose")
	@Description("Purpose for this document.")
	@Guid("fa3fb19b-ade1-49bb-a0e9-41dc3a6a9a5f")
	private String purpose;

	@JacksonXmlProperty(isAttribute=true, localName = "IntendedUse")
	@Description("Intended use for this document.")
	@Guid("0575ec79-04c4-4e71-addf-9dce898e9c47")
	private String intendedUse;

	@JacksonXmlProperty(isAttribute=true, localName = "Scope")
	@Description("Scope for this document.")
	@Guid("7ab8afff-250a-44d3-8895-cfcb053690f0")
	private String scope;

	@JacksonXmlProperty(isAttribute=true, localName = "Revision")
	@Description("Document revision designation.")
	@Guid("9ed3c975-1786-4e96-b1fa-20975a8ba03f")
	private String revision;

	@Description("Information about the person and/or organization acknowledged as the 'owner' of this document. In some contexts, the document owner determines who has access to or editing right to the document.")
	@Guid("367ff740-dff6-404a-99c1-be90ed51e36e")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect documentOwner;

	@Description("The persons and/or organizations who have created this document or contributed to it.")
	@MinLength(1)
	@Guid("fc5bb815-364c-4a26-8200-68836084fc25")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect> editors = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect>();

	@JacksonXmlProperty(isAttribute=true, localName = "CreationTime")
	@Description("Date and time stamp when the document was originally created.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDateTime</em>, the date time string according to ISO8601.</blockquote>")
	@Guid("6741b5b9-5fc6-4d0d-9d0b-735b3a4b1c71")
	private String creationTime;

	@JacksonXmlProperty(isAttribute=true, localName = "LastRevisionTime")
	@Description("Date and time stamp when this document version was created.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDateTime</em>, the date time string according to ISO8601.</blockquote>")
	@Guid("92c6d656-53f9-42d6-b541-130b4d316672")
	private String lastRevisionTime;

	@JacksonXmlProperty(isAttribute=true, localName = "ElectronicFormat")
	@Description("Describes the media type used in various internet protocols, also referred to as \"Content-type\", or \"MIME-type (Multipurpose Internet Mail Extension), of the document being referenced. It is composed of (at least) two parts, a type and a subtype.  <blockquote class=\"note\">NOTE&nbsp; The iana (Internet Assigned Numbers Authority) published the media types. </blockquote>  <blockquote class=\"example\">EXAMPLE&nbsp;  'image/png' denotes an image type of png (Portable Network Graphics) subtype,   'application/pdf' denotes an application specific type of pdf (Portable Document Format) subtype   </blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The data type has been changed from entity data type to <em>IfcIdentifier</em>.  </blockquote>")
	@Guid("fe0f622f-5a17-47b2-b996-a8c4d6b55c46")
	private String electronicFormat;

	@JacksonXmlProperty(isAttribute=true, localName = "ValidFrom")
	@Description("Date when the document becomes valid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDate</em>, the date string according to ISO8601.</blockquote>")
	@Guid("260e8ab8-7a90-4161-bcac-6b2489ad061d")
	private String validFrom;

	@JacksonXmlProperty(isAttribute=true, localName = "ValidUntil")
	@Description("Date until which the document remains valid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDate</em>, the date string according to ISO8601.</blockquote>")
	@Guid("e572dd75-4081-4bab-bde6-f0ac7f237d08")
	private String validUntil;

	@JacksonXmlProperty(isAttribute=true, localName = "Confidentiality")
	@Description("The level of confidentiality of the document.")
	@Guid("ac2eb5cd-ebea-4b73-a63c-bfa90f00eeb5")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentConfidentialityEnum confidentiality;

	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	@Description("The current status of the document. Examples of status values that might be used for a document information status include:<BR>  - DRAFT<BR>  - FINAL DRAFT<BR>  - FINAL<BR>  - REVISION")
	@Guid("203167c2-5361-4ade-bec8-aca347ca45b4")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentStatusEnum status;

	@Description("The document information with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("999d5137-72f3-4f77-84c9-a46462336d47")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument> documentInfoForObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument>();

	@Description("The document references to which the document applies")
	@Guid("d8bda5e9-e1b0-4528-93ef-de597e59496e")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentReference> hasDocumentReferences = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentReference>();

	@Description("An inverse relationship from the IfcDocumentInformationRelationship to the related documents./EPM-HTML>")
	@Guid("c07ff305-e30a-4c6e-913b-81d830965461")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship> isPointedTo = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship>();

	@Description("An inverse relationship from the IfcDocumentInformationRelationship to the relating document.")
	@MaxLength(1)
	@Guid("0f32d29f-9d4e-4b4f-b971-762eaf28ea39")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship> isPointer = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship>();


	public IfcDocumentInformation()
	{
	}

	public IfcDocumentInformation(String identification, String name)
	{
		this.identification = identification;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getIntendedUse() {
		return this.intendedUse;
	}

	public void setIntendedUse(String intendedUse) {
		this.intendedUse = intendedUse;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getRevision() {
		return this.revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getDocumentOwner() {
		return this.documentOwner;
	}

	public void setDocumentOwner(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect documentOwner) {
		this.documentOwner = documentOwner;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect> getEditors() {
		return this.editors;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getLastRevisionTime() {
		return this.lastRevisionTime;
	}

	public void setLastRevisionTime(String lastRevisionTime) {
		this.lastRevisionTime = lastRevisionTime;
	}

	public String getElectronicFormat() {
		return this.electronicFormat;
	}

	public void setElectronicFormat(String electronicFormat) {
		this.electronicFormat = electronicFormat;
	}

	public String getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidUntil() {
		return this.validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentConfidentialityEnum getConfidentiality() {
		return this.confidentiality;
	}

	public void setConfidentiality(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentConfidentialityEnum confidentiality) {
		this.confidentiality = confidentiality;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentStatusEnum getStatus() {
		return this.status;
	}

	public void setStatus(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentStatusEnum status) {
		this.status = status;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument> getDocumentInfoForObjects() {
		return this.documentInfoForObjects;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentReference> getHasDocumentReferences() {
		return this.hasDocumentReferences;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship> getIsPointedTo() {
		return this.isPointedTo;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformationRelationship> getIsPointer() {
		return this.isPointer;
	}


}

