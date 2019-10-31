// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

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
import com.buildingsmart.tech.ifc.IfcActorResource.IfcRoleEnum;

@Guid("82b7f4e9-c9c0-41a2-a7e4-2b02f8a377c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActorRole implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("The name of the role played by an actor. If the Role has value USERDEFINED, then  the user defined role shall be provided as a value of the attribute UserDefinedRole.")
	@Required()
	@Guid("cab76dc4-0eb3-4fab-9579-656cd9b52302")
	@JacksonXmlProperty(isAttribute=true, localName = "Role")
	private IfcRoleEnum role;

	@Description("Allows for specification of user defined roles beyond the   enumeration values provided by Role attribute of type IfcRoleEnum.   When a value is provided for attribute UserDefinedRole in parallel   the attribute Role shall have enumeration value USERDEFINED.")
	@Guid("7d1b62b5-eb50-44cb-8ecf-5821f8991f32")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedRole")
	private String userDefinedRole;

	@Description("A textual description relating the nature of the role played by an actor.")
	@Guid("0529bf63-9322-4740-ad36-2cc861f6082b")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the actor role.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("0c0b8207-2077-4ad5-a65b-49eaccdf4a62")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;


	public IfcActorRole()
	{
	}

	public IfcActorRole(IfcRoleEnum role)
	{
		this.role = role;
	}

	public IfcRoleEnum getRole() {
		return this.role;
	}

	public void setRole(IfcRoleEnum role) {
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

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

