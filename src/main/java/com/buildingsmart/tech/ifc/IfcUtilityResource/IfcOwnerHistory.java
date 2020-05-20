// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeStamp;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.UUID;

@Guid("6ef8f949-8689-4582-bbae-9259e7c2d559")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOwnerHistory
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("Direct reference to the end user who currently \"owns\" this object. Note that IFC includes the concept of ownership transfer from one user to another and therefore distinguishes between the Owning User and Creating User.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6cfcdb94-5c37-4ad5-a156-a9253abf000b")
	@JacksonXmlProperty(isAttribute=false, localName = "owningUser")
	private IfcPersonAndOrganization owningUser;

	@Description("Direct reference to the application which currently \"owns\" this object on behalf of the owning user of the application. Note that IFC includes the concept of ownership transfer from one application to another and therefore distinguishes between the Owning Application and Creating Application.")
	@DataMember(Order = 1)
	@Required()
	@Guid("313e24f2-1770-4142-a154-4fa5a9f412a1")
	@JacksonXmlProperty(isAttribute=false, localName = "owningApplication")
	private IfcApplication owningApplication;

	@Description("Enumeration that defines the current access state of the object.")
	@DataMember(Order = 2)
	@Guid("87eb8e3b-53d4-484e-96d0-6679f05c16a4")
	@JacksonXmlProperty(isAttribute=true, localName = "state")
	private IfcStateEnum state;

	@Description("Enumeration that defines the actions associated with changes made to the object.")
	@DataMember(Order = 3)
	@Guid("d7091627-4214-4138-a242-e352fecf5106")
	@JacksonXmlProperty(isAttribute=true, localName = "changeAction")
	private IfcChangeActionEnum changeAction;

	@Description("Date and Time expressed in UTC (Universal Time Coordinated, formerly Greenwich Mean Time or GMT) at which the last modification was made by LastModifyingUser and LastModifyingApplication.")
	@DataMember(Order = 4)
	@Guid("baa5cff9-e806-4374-9847-36815a46c2bb")
	@JacksonXmlProperty(isAttribute=false, localName = "lastModifiedDate")
	private IfcTimeStamp lastModifiedDate;

	@Description("User who carried out the last modification using LastModifyingApplication.")
	@DataMember(Order = 5)
	@Guid("496aebe5-e9a5-40c0-bd10-29750cbba3da")
	@JacksonXmlProperty(isAttribute=false, localName = "lastModifyingUser")
	private IfcPersonAndOrganization lastModifyingUser;

	@Description("Application used to make the last modification.")
	@DataMember(Order = 6)
	@Guid("5f65c380-d809-4fa5-bd22-2e8ba56edfc8")
	@JacksonXmlProperty(isAttribute=false, localName = "lastModifyingApplication")
	private IfcApplication lastModifyingApplication;

	@Description("The date and time expressed in UTC (Universal Time Coordinated, formerly Greenwich Mean Time or GMT) when first created by the original OwningApplication. Once defined this value remains unchanged through the lifetime of the entity.")
	@DataMember(Order = 7)
	@Required()
	@Guid("6797cdbc-3f8e-4e99-a976-fab71013a3bf")
	@JacksonXmlProperty(isAttribute=false, localName = "creationDate")
	private IfcTimeStamp creationDate;


	public IfcOwnerHistory()
	{
		this.globalId = UUID.randomUUID();
	}

	public IfcOwnerHistory(IfcPersonAndOrganization owningUser, IfcApplication owningApplication, IfcTimeStamp creationDate)
	{
		this();
		this.owningUser = owningUser;
		this.owningApplication = owningApplication;
		this.creationDate = creationDate;
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
	}

	public IfcPersonAndOrganization getOwningUser() {
		return this.owningUser;
	}

	public void setOwningUser(IfcPersonAndOrganization owningUser) {
		this.owningUser = owningUser;
	}

	public IfcApplication getOwningApplication() {
		return this.owningApplication;
	}

	public void setOwningApplication(IfcApplication owningApplication) {
		this.owningApplication = owningApplication;
	}

	public IfcStateEnum getState() {
		return this.state;
	}

	public void setState(IfcStateEnum state) {
		this.state = state;
	}

	public IfcChangeActionEnum getChangeAction() {
		return this.changeAction;
	}

	public void setChangeAction(IfcChangeActionEnum changeAction) {
		this.changeAction = changeAction;
	}

	public IfcTimeStamp getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(IfcTimeStamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public IfcPersonAndOrganization getLastModifyingUser() {
		return this.lastModifyingUser;
	}

	public void setLastModifyingUser(IfcPersonAndOrganization lastModifyingUser) {
		this.lastModifyingUser = lastModifyingUser;
	}

	public IfcApplication getLastModifyingApplication() {
		return this.lastModifyingApplication;
	}

	public void setLastModifyingApplication(IfcApplication lastModifyingApplication) {
		this.lastModifyingApplication = lastModifyingApplication;
	}

	public IfcTimeStamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(IfcTimeStamp creationDate) {
		this.creationDate = creationDate;
	}


}

