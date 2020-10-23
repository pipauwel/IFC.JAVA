// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("a2354718-4c92-40a9-b220-50e7c23e5faf")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPostalAddress.class, name = "IfcPostalAddress"), @JsonSubTypes.Type(value = IfcTelecomAddress.class, name = "IfcTelecomAddress")})
public abstract class IfcAddress implements com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect
{
	@Description("Identifies the logical location of the address.")
	@DataMember(Order = 0)
	@Guid("6717ebb1-12ab-48aa-9124-de2c4c2117b5")
	@JacksonXmlProperty(isAttribute=true, localName = "purpose")
	private IfcAddressTypeEnum purpose;

	@Description("Text that relates the nature of the address.")
	@DataMember(Order = 1)
	@Guid("4e2e9f3c-9dd8-48fe-b139-72e2861e6d26")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Allows for specification of user specific purpose of the address beyond the   enumeration values provided by Purpose attribute of type IfcAddressTypeEnum.   When a value is provided for attribute UserDefinedPurpose, in parallel the   attribute Purpose shall have enumeration value USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("4d473e59-c1ff-46d0-bc94-ddf22c5761c6")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedPurpose")
	private IfcLabel userDefinedPurpose;

	@Description("The inverse relationship to Person to whom address is associated.")
	@InverseProperty(InverseProp = "addresses", Range = "IfcPerson")
	@Guid("a2566a22-ad93-4b14-92e4-7c905751de4a")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcPerson")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ofPerson")*/
	@JsonIgnore
	private Set<IfcPerson> ofPerson;

	@Description("The inverse relationship to Organization to whom address is associated.")
	@InverseProperty(InverseProp = "addresses", Range = "IfcOrganization")
	@Guid("049b4ec2-3343-44d9-98fb-a8366b4313c7")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcOrganization")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ofOrganization")*/
	@JsonIgnore
	private Set<IfcOrganization> ofOrganization;


	public IfcAddress()
	{
	}

	public IfcAddressTypeEnum getPurpose() {
		return this.purpose;
	}

	public void setPurpose(IfcAddressTypeEnum purpose) {
		this.purpose = purpose;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcLabel getUserDefinedPurpose() {
		return this.userDefinedPurpose;
	}

	public void setUserDefinedPurpose(IfcLabel userDefinedPurpose) {
		this.userDefinedPurpose = userDefinedPurpose;
	}

	public Set<IfcPerson> getOfPerson() {
		return this.ofPerson;
	}

	public Set<IfcOrganization> getOfOrganization() {
		return this.ofOrganization;
	}


}

