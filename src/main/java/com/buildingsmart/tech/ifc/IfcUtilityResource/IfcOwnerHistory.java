// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6ef8f949-8689-4582-bbae-9259e7c2d559")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOwnerHistory
{
	@JacksonXmlProperty(isAttribute=false, localName = "OwningUser")
	@Description("Direct reference to the end user who currently \"owns\" this object. Note that IFC includes the concept of ownership transfer from one user to another and therefore distinguishes between the Owning User and Creating User.")
	@Required()
	@Guid("6cfcdb94-5c37-4ad5-a156-a9253abf000b")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization owningUser;

	@JacksonXmlProperty(isAttribute=false, localName = "OwningApplication")
	@Description("Direct reference to the application which currently \"owns\" this object on behalf of the owning user of the application. Note that IFC includes the concept of ownership transfer from one application to another and therefore distinguishes between the Owning Application and Creating Application.")
	@Required()
	@Guid("313e24f2-1770-4142-a154-4fa5a9f412a1")
	private com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication owningApplication;

	@JacksonXmlProperty(isAttribute=true, localName = "State")
	@Description("Enumeration that defines the current access state of the object.")
	@Guid("87eb8e3b-53d4-484e-96d0-6679f05c16a4")
	private com.buildingsmart.tech.ifc.IfcUtilityResource.IfcStateEnum state;

	@JacksonXmlProperty(isAttribute=true, localName = "ChangeAction")
	@Description("Enumeration that defines the actions associated with changes made to the object.")
	@Guid("d7091627-4214-4138-a242-e352fecf5106")
	private com.buildingsmart.tech.ifc.IfcUtilityResource.IfcChangeActionEnum changeAction;

	@JacksonXmlProperty(isAttribute=true, localName = "LastModifiedDate")
	@Description("Date and Time expressed in UTC (Universal Time Coordinated, formerly Greenwich Mean Time or GMT) at which the last modification was made by LastModifyingUser and LastModifyingApplication.")
	@Guid("baa5cff9-e806-4374-9847-36815a46c2bb")
	private int lastModifiedDate;

	@JacksonXmlProperty(isAttribute=false, localName = "LastModifyingUser")
	@Description("User who carried out the last modification using LastModifyingApplication.")
	@Guid("496aebe5-e9a5-40c0-bd10-29750cbba3da")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization lastModifyingUser;

	@JacksonXmlProperty(isAttribute=false, localName = "LastModifyingApplication")
	@Description("Application used to make the last modification.")
	@Guid("5f65c380-d809-4fa5-bd22-2e8ba56edfc8")
	private com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication lastModifyingApplication;

	@JacksonXmlProperty(isAttribute=true, localName = "CreationDate")
	@Description("The date and time expressed in UTC (Universal Time Coordinated, formerly Greenwich Mean Time or GMT) when first created by the original OwningApplication. Once defined this value remains unchanged through the lifetime of the entity.")
	@Required()
	@Guid("6797cdbc-3f8e-4e99-a976-fab71013a3bf")
	private int creationDate;


	public IfcOwnerHistory()
	{
	}

	public IfcOwnerHistory(com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization owningUser, com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication owningApplication, int creationDate)
	{
		this.owningUser = owningUser;
		this.owningApplication = owningApplication;
		this.creationDate = creationDate;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization getOwningUser() {
		return this.owningUser;
	}

	public void setOwningUser(com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization owningUser) {
		this.owningUser = owningUser;
	}

	public com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication getOwningApplication() {
		return this.owningApplication;
	}

	public void setOwningApplication(com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication owningApplication) {
		this.owningApplication = owningApplication;
	}

	public com.buildingsmart.tech.ifc.IfcUtilityResource.IfcStateEnum getState() {
		return this.state;
	}

	public void setState(com.buildingsmart.tech.ifc.IfcUtilityResource.IfcStateEnum state) {
		this.state = state;
	}

	public com.buildingsmart.tech.ifc.IfcUtilityResource.IfcChangeActionEnum getChangeAction() {
		return this.changeAction;
	}

	public void setChangeAction(com.buildingsmart.tech.ifc.IfcUtilityResource.IfcChangeActionEnum changeAction) {
		this.changeAction = changeAction;
	}

	public int getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(int lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization getLastModifyingUser() {
		return this.lastModifyingUser;
	}

	public void setLastModifyingUser(com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization lastModifyingUser) {
		this.lastModifyingUser = lastModifyingUser;
	}

	public com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication getLastModifyingApplication() {
		return this.lastModifyingApplication;
	}

	public void setLastModifyingApplication(com.buildingsmart.tech.ifc.IfcUtilityResource.IfcApplication lastModifyingApplication) {
		this.lastModifyingApplication = lastModifyingApplication;
	}

	public int getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}


}

