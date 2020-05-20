// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("6721f13a-680a-41f0-b994-52e18d901eb5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcArbitraryClosedProfileDef.class, name = "IfcArbitraryClosedProfileDef"), @JsonSubTypes.Type(value = IfcArbitraryOpenProfileDef.class, name = "IfcArbitraryOpenProfileDef"), @JsonSubTypes.Type(value = IfcCompositeProfileDef.class, name = "IfcCompositeProfileDef"), @JsonSubTypes.Type(value = IfcDerivedProfileDef.class, name = "IfcDerivedProfileDef"), @JsonSubTypes.Type(value = IfcParameterizedProfileDef.class, name = "IfcParameterizedProfileDef")})
public class IfcProfileDef implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Defines the type of geometry into which this profile definition shall be resolved, either a curve or a surface area. In case of curve the profile should be referenced by a swept surface, in case of area the profile should be referenced by a swept area solid.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c31d0cfe-9eec-49ef-8912-0879d1a77343")
	@JacksonXmlProperty(isAttribute=true, localName = "profileType")
	private IfcProfileTypeEnum profileType;

	@Description("Human-readable name of the profile, for example according to a standard profile table. As noted above, machine-readable standardized profile designations should be provided in <em>IfcExternalReference.ItemReference</em>.")
	@DataMember(Order = 1)
	@Guid("411500e4-ab55-4fe8-bbf9-3a329ea5b1c7")
	@JacksonXmlProperty(isAttribute=false, localName = "profileName")
	private IfcLabel profileName;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the profile.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("5384e4ff-9e84-45c1-bd5f-b6e037852b2e")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;

	@Description("Additional properties of the profile, for example mechanical properties.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute</blockquote>")
	@InverseProperty(InverseProp = "profileDefinition", Range = "IfcProfileProperties")
	@Guid("68f7e99c-a629-41eb-9442-f3ad71ab2ea7")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProfileProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasProperties")
	private Set<IfcProfileProperties> hasProperties;


	public IfcProfileDef()
	{
	}

	public IfcProfileDef(IfcProfileTypeEnum profileType)
	{
		this.profileType = profileType;
	}

	public IfcProfileTypeEnum getProfileType() {
		return this.profileType;
	}

	public void setProfileType(IfcProfileTypeEnum profileType) {
		this.profileType = profileType;
	}

	public IfcLabel getProfileName() {
		return this.profileName;
	}

	public void setProfileName(IfcLabel profileName) {
		this.profileName = profileName;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}

	public Set<IfcProfileProperties> getHasProperties() {
		return this.hasProperties;
	}


}

