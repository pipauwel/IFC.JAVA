// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMaterialDefinitionRepresentation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductDefinitionShape;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation;

@Guid("ebb1e658-5b55-4231-9e88-68b1c85889f8")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialDefinitionRepresentation.class, name = "IfcMaterialDefinitionRepresentation"), @JsonSubTypes.Type(value = IfcProductDefinitionShape.class, name = "IfcProductDefinitionShape")})
public abstract class IfcProductRepresentation
{
	@Description("The word or group of words by which the product representation is known.")
	@DataMember(Order = 0)
	@Guid("f47b1b8e-d821-4937-b8de-911c6c320a28")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("The word or group of words that characterize the product representation. It can be used to add additional meaning to the name of the product representation.")
	@DataMember(Order = 1)
	@Guid("0d99362e-99b1-4477-801c-27e86defe648")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Contained list of representations (including shape representations). Each member defines a valid representation of a particular type within a particular representation context.")
	@DataMember(Order = 2)
	@Required()
	@Guid("77687142-9fb0-4bc9-ace5-e6f4b7ed1f47")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Representations")
	private List<IfcRepresentation> representations;


	public IfcProductRepresentation()
	{
	}

	public IfcProductRepresentation(IfcRepresentation[] representations)
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

	public List<IfcRepresentation> getRepresentations() {
		return this.representations;
	}


}

