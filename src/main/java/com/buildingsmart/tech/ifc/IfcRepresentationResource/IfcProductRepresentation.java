// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ebb1e658-5b55-4231-9e88-68b1c85889f8")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcProductRepresentation
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The word or group of words by which the product representation is known.")
	@Guid("f47b1b8e-d821-4937-b8de-911c6c320a28")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("The word or group of words that characterize the product representation. It can be used to add additional meaning to the name of the product representation.")
	@Guid("0d99362e-99b1-4477-801c-27e86defe648")
	private String description;

	@Description("Contained list of representations (including shape representations). Each member defines a valid representation of a particular type within a particular representation context.")
	@Required()
	@MinLength(1)
	@Guid("77687142-9fb0-4bc9-ace5-e6f4b7ed1f47")
	private List<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation> representations = new ArrayList<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation>();


	public IfcProductRepresentation()
	{
	}

	public IfcProductRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation[] representations)
	{
		this.representations = new ArrayList<>(Arrays.asList(representations));
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

	public List<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation> getRepresentations() {
		return this.representations;
	}


}

