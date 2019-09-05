// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("82b7f4e9-c9c0-41a2-a7e4-2b02f8a377c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActorRole implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Role")
	@Description("The name of the role played by an actor. If the Role has value USERDEFINED, then  the user defined role shall be provided as a value of the attribute UserDefinedRole.")
	@Required()
	@Guid("cab76dc4-0eb3-4fab-9579-656cd9b52302")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcRoleEnum role;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedRole")
	@Description("Allows for specification of user defined roles beyond the   enumeration values provided by Role attribute of type IfcRoleEnum.   When a value is provided for attribute UserDefinedRole in parallel   the attribute Role shall have enumeration value USERDEFINED.")
	@Guid("7d1b62b5-eb50-44cb-8ecf-5821f8991f32")
	private String userDefinedRole;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("A textual description relating the nature of the role played by an actor.")
	@Guid("0529bf63-9322-4740-ad36-2cc861f6082b")
	private String description;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the actor role.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("0c0b8207-2077-4ad5-a65b-49eaccdf4a62")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReference = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();


	public IfcActorRole()
	{
	}

	public IfcActorRole(com.buildingsmart.tech.ifc.IfcActorResource.IfcRoleEnum role)
	{
		this.role = role;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcRoleEnum getRole() {
		return this.role;
	}

	public void setRole(com.buildingsmart.tech.ifc.IfcActorResource.IfcRoleEnum role) {
		this.role = role;
	}

	public String getUserDefinedRole() {
		return this.userDefinedRole;
	}

	public void setUserDefinedRole(String userDefinedRole) {
		this.userDefinedRole = userDefinedRole;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

