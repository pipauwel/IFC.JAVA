// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9a3e1026-c1d1-44fe-ab77-8497972584e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("A name used to identify or qualify the relationship.")
	@Guid("f0cbdaa5-9876-4222-b747-25988a127a3b")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("A description that may apply additional information about the relationship.")
	@Guid("909d74c0-6108-4484-9321-b93293f4f356")
	private String description;


	public IfcResourceLevelRelationship()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

