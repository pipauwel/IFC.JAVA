// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

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
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization;

@Guid("88190cb4-3569-4c42-9b7d-8778145e179e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcApplication
{
	@Description("Name of the application developer.")
	@Required()
	@Guid("3cc88833-4284-48e3-8942-9a3a7eb58407")
	@JacksonXmlProperty(isAttribute=false, localName = "ApplicationDeveloper")
	private IfcOrganization applicationDeveloper;

	@Description("The version number of this software as specified by the developer of the application.")
	@Required()
	@Guid("77ef51fd-a0e6-444c-aa70-72ffc5b971c7")
	@JacksonXmlProperty(isAttribute=true, localName = "Version")
	private String version;

	@Description("The full name of the application as specified by the application developer.")
	@Required()
	@Guid("56e2f124-d545-40e2-b5d1-027b21693f30")
	@JacksonXmlProperty(isAttribute=true, localName = "ApplicationFullName")
	private String applicationFullName;

	@Description("Short identifying name for the application.")
	@Required()
	@Guid("1a43cdd1-0847-4fa0-b2ae-f0918196357c")
	@JacksonXmlProperty(isAttribute=true, localName = "ApplicationIdentifier")
	private String applicationIdentifier;


	public IfcApplication()
	{
	}

	public IfcApplication(IfcOrganization applicationDeveloper, String version, String applicationFullName, String applicationIdentifier)
	{
		this.applicationDeveloper = applicationDeveloper;
		this.version = version;
		this.applicationFullName = applicationFullName;
		this.applicationIdentifier = applicationIdentifier;
	}

	public IfcOrganization getApplicationDeveloper() {
		return this.applicationDeveloper;
	}

	public void setApplicationDeveloper(IfcOrganization applicationDeveloper) {
		this.applicationDeveloper = applicationDeveloper;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getApplicationFullName() {
		return this.applicationFullName;
	}

	public void setApplicationFullName(String applicationFullName) {
		this.applicationFullName = applicationFullName;
	}

	public String getApplicationIdentifier() {
		return this.applicationIdentifier;
	}

	public void setApplicationIdentifier(String applicationIdentifier) {
		this.applicationIdentifier = applicationIdentifier;
	}


}

