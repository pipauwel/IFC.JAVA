// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a2354718-4c92-40a9-b220-50e7c23e5faf")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcAddress implements com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Purpose")
	@Description("Identifies the logical location of the address.")
	@Guid("6717ebb1-12ab-48aa-9124-de2c4c2117b5")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcAddressTypeEnum purpose;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Text that relates the nature of the address.")
	@Guid("4e2e9f3c-9dd8-48fe-b139-72e2861e6d26")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedPurpose")
	@Description("Allows for specification of user specific purpose of the address beyond the   enumeration values provided by Purpose attribute of type IfcAddressTypeEnum.   When a value is provided for attribute UserDefinedPurpose, in parallel the   attribute Purpose shall have enumeration value USERDEFINED.")
	@Guid("4d473e59-c1ff-46d0-bc94-ddf22c5761c6")
	private String userDefinedPurpose;

	@Description("The inverse relationship to Person to whom address is associated.")
	@Guid("a2566a22-ad93-4b14-92e4-7c905751de4a")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> ofPerson = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson>();

	@Description("The inverse relationship to Organization to whom address is associated.")
	@Guid("049b4ec2-3343-44d9-98fb-a8366b4313c7")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization> ofOrganization = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization>();


	public IfcAddress()
	{
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcAddressTypeEnum getPurpose() {
		return this.purpose;
	}

	public void setPurpose(com.buildingsmart.tech.ifc.IfcActorResource.IfcAddressTypeEnum purpose) {
		this.purpose = purpose;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserDefinedPurpose() {
		return this.userDefinedPurpose;
	}

	public void setUserDefinedPurpose(String userDefinedPurpose) {
		this.userDefinedPurpose = userDefinedPurpose;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> getOfPerson() {
		return this.ofPerson;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization> getOfOrganization() {
		return this.ofOrganization;
	}


}

