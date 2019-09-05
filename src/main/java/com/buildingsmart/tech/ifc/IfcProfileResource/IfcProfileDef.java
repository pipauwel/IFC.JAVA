// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6721f13a-680a-41f0-b994-52e18d901eb5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProfileDef implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "ProfileType")
	@Description("Defines the type of geometry into which this profile definition shall be resolved, either a curve or a surface area. In case of curve the profile should be referenced by a swept surface, in case of area the profile should be referenced by a swept area solid.")
	@Required()
	@Guid("c31d0cfe-9eec-49ef-8912-0879d1a77343")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType;

	@JacksonXmlProperty(isAttribute=true, localName = "ProfileName")
	@Description("Human-readable name of the profile, for example according to a standard profile table. As noted above, machine-readable standardized profile designations should be provided in <em>IfcExternalReference.ItemReference</em>.")
	@Guid("411500e4-ab55-4fe8-bbf9-3a329ea5b1c7")
	private String profileName;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the profile.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute</blockquote>")
	@Guid("5384e4ff-9e84-45c1-bd5f-b6e037852b2e")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReference = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasProperties")
	@Description("Additional properties of the profile, for example mechanical properties.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute</blockquote>")
	@Guid("68f7e99c-a629-41eb-9442-f3ad71ab2ea7")
	private Set<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileProperties> hasProperties = new HashSet<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileProperties>();


	public IfcProfileDef()
	{
	}

	public IfcProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType)
	{
		this.profileType = profileType;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum getProfileType() {
		return this.profileType;
	}

	public void setProfileType(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType) {
		this.profileType = profileType;
	}

	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileProperties> getHasProperties() {
		return this.hasProperties;
	}


}

