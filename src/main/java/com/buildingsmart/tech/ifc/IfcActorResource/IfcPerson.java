// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("444c7a43-9f92-48d5-9ff4-acdf38ead916")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPerson implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("Identification of the person.")
	@Guid("e6da2311-ed55-4407-85d6-144bff64cea2")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "FamilyName")
	@Description("The name by which the family identity of the person may be recognized.  <blockquote class=\"note\">NOTE&nbsp; Depending on geographical location and culture, family name may appear either as the first or last component of a name.</blockquote>")
	@Guid("e0501fe3-5ddf-4817-ae8e-0736a8375d9d")
	private String familyName;

	@JacksonXmlProperty(isAttribute=true, localName = "GivenName")
	@Description("The name by which a person is known within a family and by which he or she may be familiarly recognized.  <blockquote class=\"note\">NOTE&nbsp; Depending on geographical location and culture, given name may appear either as the first or last component of a name.</blockquote>")
	@Guid("ca330b42-ee3a-43ff-a9c3-54feeafe62fa")
	private String givenName;

	@JacksonXmlProperty(isAttribute=true, localName = "MiddleNames")
	@Description("Additional names given to a person that enable their identification apart from others who may have the same or similar family and given names.  <blockquote class=\"note\">NOTE&nbsp; Middle names are not normally used in familiar communication but may be asserted to provide additional   identification of a particular person if necessary. They may be particularly useful in situations where the person concerned has a   family name that occurs commonly in the geographical region.</blockquote>")
	@MinLength(1)
	@Guid("66e561d1-9813-4539-8dbf-68de088a59a2")
	private List<String> middleNames = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "PrefixTitles")
	@Description("The word, or group of words, which specify the person's social and/or professional standing and appear before his/her names.")
	@MinLength(1)
	@Guid("3d6cc85d-6254-4595-b49d-c17bf042ce73")
	private List<String> prefixTitles = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "SuffixTitles")
	@Description("The word, or group of words, which specify the person's social and/or professional standing and appear after his/her names.")
	@MinLength(1)
	@Guid("b3ec9779-b455-4f6b-bd96-a51a22ae5797")
	private List<String> suffixTitles = new ArrayList<String>();

	@Description("Roles played by the person.")
	@MinLength(1)
	@Guid("30be2207-32b0-438f-8fc7-fad9a4578bdd")
	private List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> roles = new ArrayList<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole>();

	@Description("Postal and telecommunication addresses of a person.  <blockquote class=\"note\">NOTE&nbsp; A person may have several addresses.</small></blockquote>")
	@MinLength(1)
	@Guid("8e3a5e4b-90cd-43e2-b297-f3d7912bb3c1")
	private List<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress> addresses = new ArrayList<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress>();

	@Description("The inverse relationship to IfcPersonAndOrganization relationships in which IfcPerson is engaged.")
	@Guid("72fa7a66-38ba-470c-84d5-3f99391bf4a6")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization> engagedIn = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization>();


	public IfcPerson()
	{
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public List<String> getMiddleNames() {
		return this.middleNames;
	}

	public List<String> getPrefixTitles() {
		return this.prefixTitles;
	}

	public List<String> getSuffixTitles() {
		return this.suffixTitles;
	}

	public List<com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole> getRoles() {
		return this.roles;
	}

	public List<com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress> getAddresses() {
		return this.addresses;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization> getEngagedIn() {
		return this.engagedIn;
	}


}

