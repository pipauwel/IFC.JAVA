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
import com.buildingsmart.tech.ifc.IfcActorResource.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalInformation;

@Guid("ece4dd99-11bc-4dbb-b170-998764abc239")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentInformation extends IfcExternalInformation implements IfcDocumentSelect
{
	@Description("Identifier that uniquely identifies a document.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute renamed from <em>DocumentId</em>.  </blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("fdc5fbd6-5bb9-4f9c-b478-d0ed07773f1f")
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	private String identification;

	@Description("File name or document name assigned by owner.")
	@DataMember(Order = 1)
	@Required()
	@Guid("f308e9ce-8a5e-4408-b3c5-c20a7b5ee6de")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Description of document and its content.")
	@DataMember(Order = 2)
	@Guid("1c47a9d6-a070-4fe8-b9f9-02166afad5fe")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Resource identifier or locator, provided as URI, URN or URL, of the document information for online references.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the place of the removed attribute <em>DocumentReferences</em>.  </blockquote>")
	@DataMember(Order = 3)
	@Guid("494ea53e-4ee5-4c89-a31e-0732cd47caa0")
	@JacksonXmlProperty(isAttribute=true, localName = "Location")
	private String location;

	@Description("Purpose for this document.")
	@DataMember(Order = 4)
	@Guid("fa3fb19b-ade1-49bb-a0e9-41dc3a6a9a5f")
	@JacksonXmlProperty(isAttribute=true, localName = "Purpose")
	private String purpose;

	@Description("Intended use for this document.")
	@DataMember(Order = 5)
	@Guid("0575ec79-04c4-4e71-addf-9dce898e9c47")
	@JacksonXmlProperty(isAttribute=true, localName = "IntendedUse")
	private String intendedUse;

	@Description("Scope for this document.")
	@DataMember(Order = 6)
	@Guid("7ab8afff-250a-44d3-8895-cfcb053690f0")
	@JacksonXmlProperty(isAttribute=true, localName = "Scope")
	private String scope;

	@Description("Document revision designation.")
	@DataMember(Order = 7)
	@Guid("9ed3c975-1786-4e96-b1fa-20975a8ba03f")
	@JacksonXmlProperty(isAttribute=true, localName = "Revision")
	private String revision;

	@Description("Information about the person and/or organization acknowledged as the 'owner' of this document. In some contexts, the document owner determines who has access to or editing right to the document.")
	@DataMember(Order = 8)
	@Guid("367ff740-dff6-404a-99c1-be90ed51e36e")
	@JacksonXmlProperty(isAttribute=true, localName = "DocumentOwner")
	private IfcActorSelect documentOwner;

	@Description("The persons and/or organizations who have created this document or contributed to it.")
	@DataMember(Order = 9)
	@Guid("fc5bb815-364c-4a26-8200-68836084fc25")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcActorSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Editors")
	private Set<IfcActorSelect> editors;

	@Description("Date and time stamp when the document was originally created.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDateTime</em>, the date time string according to ISO8601.</blockquote>")
	@DataMember(Order = 10)
	@Guid("6741b5b9-5fc6-4d0d-9d0b-735b3a4b1c71")
	@JacksonXmlProperty(isAttribute=true, localName = "CreationTime")
	private String creationTime;

	@Description("Date and time stamp when this document version was created.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDateTime</em>, the date time string according to ISO8601.</blockquote>")
	@DataMember(Order = 11)
	@Guid("92c6d656-53f9-42d6-b541-130b4d316672")
	@JacksonXmlProperty(isAttribute=true, localName = "LastRevisionTime")
	private String lastRevisionTime;

	@Description("Describes the media type used in various internet protocols, also referred to as \"Content-type\", or \"MIME-type (Multipurpose Internet Mail Extension), of the document being referenced. It is composed of (at least) two parts, a type and a subtype.  <blockquote class=\"note\">NOTE&nbsp; The iana (Internet Assigned Numbers Authority) published the media types. </blockquote>  <blockquote class=\"example\">EXAMPLE&nbsp;  'image/png' denotes an image type of png (Portable Network Graphics) subtype,   'application/pdf' denotes an application specific type of pdf (Portable Document Format) subtype   </blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The data type has been changed from entity data type to <em>IfcIdentifier</em>.  </blockquote>")
	@DataMember(Order = 12)
	@Guid("fe0f622f-5a17-47b2-b996-a8c4d6b55c46")
	@JacksonXmlProperty(isAttribute=true, localName = "ElectronicFormat")
	private String electronicFormat;

	@Description("Date when the document becomes valid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDate</em>, the date string according to ISO8601.</blockquote>")
	@DataMember(Order = 13)
	@Guid("260e8ab8-7a90-4161-bcac-6b2489ad061d")
	@JacksonXmlProperty(isAttribute=true, localName = "ValidFrom")
	private String validFrom;

	@Description("Date until which the document remains valid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDate</em>, the date string according to ISO8601.</blockquote>")
	@DataMember(Order = 14)
	@Guid("e572dd75-4081-4bab-bde6-f0ac7f237d08")
	@JacksonXmlProperty(isAttribute=true, localName = "ValidUntil")
	private String validUntil;

	@Description("The level of confidentiality of the document.")
	@DataMember(Order = 15)
	@Guid("ac2eb5cd-ebea-4b73-a63c-bfa90f00eeb5")
	@JacksonXmlProperty(isAttribute=true, localName = "Confidentiality")
	private IfcDocumentConfidentialityEnum confidentiality;

	@Description("The current status of the document. Examples of status values that might be used for a document information status include:<BR>  - DRAFT<BR>  - FINAL DRAFT<BR>  - FINAL<BR>  - REVISION")
	@DataMember(Order = 16)
	@Guid("203167c2-5361-4ade-bec8-aca347ca45b4")
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	private IfcDocumentStatusEnum status;

	@Description("The document information with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "RelatingDocument", Range = "IfcRelAssociatesDocument")
	@Guid("999d5137-72f3-4f77-84c9-a46462336d47")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesDocument")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "DocumentInfoForObjects")
	private Set<IfcRelAssociatesDocument> documentInfoForObjects;

	@Description("The document references to which the document applies")
	@InverseProperty(InverseProp = "ReferencedDocument", Range = "IfcDocumentReference")
	@Guid("d8bda5e9-e1b0-4528-93ef-de597e59496e")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDocumentReference")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasDocumentReferences")
	private Set<IfcDocumentReference> hasDocumentReferences;

	@Description("An inverse relationship from the IfcDocumentInformationRelationship to the related documents./EPM-HTML>")
	@InverseProperty(InverseProp = "RelatedDocuments", Range = "IfcDocumentInformationRelationship")
	@Guid("c07ff305-e30a-4c6e-913b-81d830965461")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDocumentInformationRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "IsPointedTo")
	private Set<IfcDocumentInformationRelationship> isPointedTo;

	@Description("An inverse relationship from the IfcDocumentInformationRelationship to the relating document.")
	@InverseProperty(InverseProp = "RelatingDocument", Range = "IfcDocumentInformationRelationship")
	@Guid("0f32d29f-9d4e-4b4f-b971-762eaf28ea39")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDocumentInformationRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "IsPointer")
	private Set<IfcDocumentInformationRelationship> isPointer;


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

	public IfcActorSelect getDocumentOwner() {
		return this.documentOwner;
	}

	public void setDocumentOwner(IfcActorSelect documentOwner) {
		this.documentOwner = documentOwner;
	}

	public Set<IfcActorSelect> getEditors() {
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

	public IfcDocumentConfidentialityEnum getConfidentiality() {
		return this.confidentiality;
	}

	public void setConfidentiality(IfcDocumentConfidentialityEnum confidentiality) {
		this.confidentiality = confidentiality;
	}

	public IfcDocumentStatusEnum getStatus() {
		return this.status;
	}

	public void setStatus(IfcDocumentStatusEnum status) {
		this.status = status;
	}

	public Set<IfcRelAssociatesDocument> getDocumentInfoForObjects() {
		return this.documentInfoForObjects;
	}

	public Set<IfcDocumentReference> getHasDocumentReferences() {
		return this.hasDocumentReferences;
	}

	public Set<IfcDocumentInformationRelationship> getIsPointedTo() {
		return this.isPointedTo;
	}

	public Set<IfcDocumentInformationRelationship> getIsPointer() {
		return this.isPointer;
	}


}

