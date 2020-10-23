// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Guid("444c7a43-9f92-48d5-9ff4-acdf38ead916")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcPerson implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("Identification of the person.")
	@DataMember(Order = 0)
	@Guid("e6da2311-ed55-4407-85d6-144bff64cea2")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("The name by which the family identity of the person may be recognized.  <blockquote class=\"note\">NOTE&nbsp; Depending on geographical location and culture, family name may appear either as the first or last component of a name.</blockquote>")
	@DataMember(Order = 1)
	@Guid("e0501fe3-5ddf-4817-ae8e-0736a8375d9d")
	@JacksonXmlProperty(isAttribute=false, localName = "familyName")
	private IfcLabel familyName;

	@Description("The name by which a person is known within a family and by which he or she may be familiarly recognized.  <blockquote class=\"note\">NOTE&nbsp; Depending on geographical location and culture, given name may appear either as the first or last component of a name.</blockquote>")
	@DataMember(Order = 2)
	@Guid("ca330b42-ee3a-43ff-a9c3-54feeafe62fa")
	@JacksonXmlProperty(isAttribute=false, localName = "givenName")
	private IfcLabel givenName;

	@Description("Additional names given to a person that enable their identification apart from others who may have the same or similar family and given names.  <blockquote class=\"note\">NOTE&nbsp; Middle names are not normally used in familiar communication but may be asserted to provide additional   identification of a particular person if necessary. They may be particularly useful in situations where the person concerned has a   family name that occurs commonly in the geographical region.</blockquote>")
	@DataMember(Order = 3)
	@Guid("66e561d1-9813-4539-8dbf-68de088a59a2")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "middleNames")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "middleNames")
	private List<IfcLabel> middleNames;

	@Description("The word, or group of words, which specify the person's social and/or professional standing and appear before his/her names.")
	@DataMember(Order = 4)
	@Guid("3d6cc85d-6254-4595-b49d-c17bf042ce73")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "prefixTitles")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "prefixTitles")
	private List<IfcLabel> prefixTitles;

	@Description("The word, or group of words, which specify the person's social and/or professional standing and appear after his/her names.")
	@DataMember(Order = 5)
	@Guid("b3ec9779-b455-4f6b-bd96-a51a22ae5797")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "String")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "suffixTitles")
	private List<IfcLabel> suffixTitles;

	@Description("Roles played by the person.")
	@DataMember(Order = 6)
	@Guid("30be2207-32b0-438f-8fc7-fad9a4578bdd")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcActorRole")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "roles")
	private List<IfcActorRole> roles;

	@Description("Postal and telecommunication addresses of a person.  <blockquote class=\"note\">NOTE&nbsp; A person may have several addresses.</small></blockquote>")
	@DataMember(Order = 7)
	@Guid("8e3a5e4b-90cd-43e2-b297-f3d7912bb3c1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAddress")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "addresses")
	private List<IfcAddress> addresses;

	@JsonIgnore
	@Description("The inverse relationship to IfcPersonAndOrganization relationships in which IfcPerson is engaged.")
	@InverseProperty(InverseProp = "thePerson", Range = "IfcPersonAndOrganization")
	@Guid("72fa7a66-38ba-470c-84d5-3f99391bf4a6")
	//@JacksonXmlProperty(isAttribute = false, localName = "IfcPersonAndOrganization")
	//@JacksonXmlElementWrapper(useWrapping = true, localName = "EngagedIn")
	private Set<IfcPersonAndOrganization> engagedIn;


	public IfcPerson()
	{
		this.globalId = UUID.randomUUID();
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
	}

	public IfcIdentifier getIdentification() {
		return this.identification;
	}

	public void setIdentification(IfcIdentifier identification) {
		this.identification = identification;
	}

	public IfcLabel getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(IfcLabel familyName) {
		this.familyName = familyName;
	}

	public IfcLabel getGivenName() {
		return this.givenName;
	}

	public void setGivenName(IfcLabel givenName) {
		this.givenName = givenName;
	}

	public List<IfcLabel> getMiddleNames() {
		return this.middleNames;
	}

	public List<IfcLabel> getPrefixTitles() {
		return this.prefixTitles;
	}

	public List<IfcLabel> getSuffixTitles() {
		return this.suffixTitles;
	}

	public List<IfcActorRole> getRoles() {
		return this.roles;
	}

	public List<IfcAddress> getAddresses() {
		return this.addresses;
	}

	public Set<IfcPersonAndOrganization> getEngagedIn() {
		return this.engagedIn;
	}


}

