// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;
import java.util.UUID;

@Guid("38217e82-b534-4baa-87a6-49402ed0a52c")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcGeometricRepresentationContext.class, name = "IfcGeometricRepresentationContext"))
public abstract class IfcRepresentationContext
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("The optional identifier of the representation context as used within a project.")
	@DataMember(Order = 0)
	@Guid("98c7faf4-7709-4f0a-9ab4-c1e8c7d0f012")
	@JacksonXmlProperty(isAttribute=false, localName = "contextIdentifier")
	private IfcLabel contextIdentifier;

	@Description("The description of the type of a representation context. The supported values for context type are to be specified by implementers agreements.")
	@DataMember(Order = 1)
	@Guid("60350fff-c598-4635-a106-9b50ce5ec88c")
	@JacksonXmlProperty(isAttribute=false, localName = "contextType")
	private IfcLabel contextType;

	@Description("All shape representations that are defined in the same representation context.")
	@InverseProperty(InverseProp = "contextOfItems", Range = "IfcRepresentation")
	@Guid("1e0f4b5c-3ad8-4ee7-8998-0a6b915be556")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "representationsInContext")*/
	@JsonIgnore
	private Set<IfcRepresentation> representationsInContext;


	public IfcRepresentationContext()
	{
		this.globalId = UUID.randomUUID();
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID id) {
		this.globalId = globalId;
	}

	public IfcLabel getContextIdentifier() {
		return this.contextIdentifier;
	}

	public void setContextIdentifier(IfcLabel contextIdentifier) {
		this.contextIdentifier = contextIdentifier;
	}

	public IfcLabel getContextType() {
		return this.contextType;
	}

	public void setContextType(IfcLabel contextType) {
		this.contextType = contextType;
	}

	public Set<IfcRepresentation> getRepresentationsInContext() {
		return this.representationsInContext;
	}


}

