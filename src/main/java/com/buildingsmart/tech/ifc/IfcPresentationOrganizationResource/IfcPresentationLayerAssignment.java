// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1021fba4-3bfe-4e0a-b0b5-662a3498c052")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPresentationLayerAssignment
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name of the layer.")
	@Required()
	@Guid("87af29d2-be1e-4b15-b9ad-c509d2b4f7fa")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Additional description of the layer.")
	@Guid("8a982d79-1717-4d47-928c-6f0d31346142")
	private String description;

	@Description("The set of layered items, which are assigned to this layer.")
	@Required()
	@MinLength(1)
	@Guid("e05d7922-970e-4100-b3e7-bd5a77d73c09")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem> assignedItems = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem>();

	@JacksonXmlProperty(isAttribute=true, localName = "Identifier")
	@Description("An (internal) identifier assigned to the layer.")
	@Guid("c3bbf33f-c067-4501-bfe8-2c9da90c9b22")
	private String identifier;


	public IfcPresentationLayerAssignment()
	{
	}

	public IfcPresentationLayerAssignment(String name, com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem[] assignedItems)
	{
		this.name = name;
		this.assignedItems = new HashSet<>(Arrays.asList(assignedItems));
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

	public Set<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem> getAssignedItems() {
		return this.assignedItems;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


}

