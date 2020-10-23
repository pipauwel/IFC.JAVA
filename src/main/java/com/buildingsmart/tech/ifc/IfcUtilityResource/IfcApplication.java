// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("88190cb4-3569-4c42-9b7d-8778145e179e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcApplication
{
	@Description("Name of the application developer.")
	@DataMember(Order = 0)
	@Required()
	@Guid("3cc88833-4284-48e3-8942-9a3a7eb58407")
	@JacksonXmlProperty(isAttribute=false, localName = "applicationDeveloper")
	private IfcOrganization applicationDeveloper;

	@Description("The version number of this software as specified by the developer of the application.")
	@DataMember(Order = 1)
	@Required()
	@Guid("77ef51fd-a0e6-444c-aa70-72ffc5b971c7")
	@JacksonXmlProperty(isAttribute=false, localName = "version")
	private IfcLabel version;

	@Description("The full name of the application as specified by the application developer.")
	@DataMember(Order = 2)
	@Required()
	@Guid("56e2f124-d545-40e2-b5d1-027b21693f30")
	@JacksonXmlProperty(isAttribute=false, localName = "applicationFullName")
	private IfcLabel applicationFullName;

	@Description("Short identifying name for the application.")
	@DataMember(Order = 3)
	@Required()
	@Guid("1a43cdd1-0847-4fa0-b2ae-f0918196357c")
	@JacksonXmlProperty(isAttribute=false, localName = "applicationIdentifier")
	private IfcIdentifier applicationIdentifier;


	public IfcApplication()
	{
	}

	public IfcApplication(IfcOrganization applicationDeveloper, IfcLabel version, IfcLabel applicationFullName, IfcIdentifier applicationIdentifier)
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

	public IfcLabel getVersion() {
		return this.version;
	}

	public void setVersion(IfcLabel version) {
		this.version = version;
	}

	public IfcLabel getApplicationFullName() {
		return this.applicationFullName;
	}

	public void setApplicationFullName(IfcLabel applicationFullName) {
		this.applicationFullName = applicationFullName;
	}

	public IfcIdentifier getApplicationIdentifier() {
		return this.applicationIdentifier;
	}

	public void setApplicationIdentifier(IfcIdentifier applicationIdentifier) {
		this.applicationIdentifier = applicationIdentifier;
	}


}

