// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Guid("ebb1e658-5b55-4231-9e88-68b1c85889f8")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialDefinitionRepresentation.class, name = "IfcMaterialDefinitionRepresentation"), @JsonSubTypes.Type(value = IfcProductDefinitionShape.class, name = "IfcProductDefinitionShape")})
public abstract class IfcProductRepresentation
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("The word or group of words by which the product representation is known.")
	@DataMember(Order = 0)
	@Guid("f47b1b8e-d821-4937-b8de-911c6c320a28")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("The word or group of words that characterize the product representation. It can be used to add additional meaning to the name of the product representation.")
	@DataMember(Order = 1)
	@Guid("0d99362e-99b1-4477-801c-27e86defe648")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Contained list of representations (including shape representations). Each member defines a valid representation of a particular type within a particular representation context.")
	@DataMember(Order = 2)
	@Required()
	@Guid("77687142-9fb0-4bc9-ace5-e6f4b7ed1f47")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "representations")
	private List<IfcRepresentation> representations;


	public IfcProductRepresentation()
	{
		this.globalId = UUID.randomUUID();
	}

	public IfcProductRepresentation(IfcRepresentation[] representations)
	{
		this();
		this.representations = new ArrayList<>(Arrays.asList(representations));
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public List<IfcRepresentation> getRepresentations() {
		return this.representations;
	}


}

