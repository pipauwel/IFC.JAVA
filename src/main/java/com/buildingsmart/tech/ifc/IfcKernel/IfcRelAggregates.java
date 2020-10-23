// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("28ae0ad8-279b-405d-9aaf-cdf69a4da9d9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAggregates extends IfcRelDecomposes
{
	@Description("The object definition, either an object type or an object occurrence, that represents the aggregation. It is the whole within the whole/part relationship.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been demoted from the supertype <em>IfcRelDecomposes</em> and defines the non-ordered aggregation relationship.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f407a363-0275-4e6e-8a02-a85bd6fa688f")
	@JsonIgnore
	private IfcObjectDefinition relatingObject;

	@Description("The object definitions, either object occurrences or object types, that are being aggregated. They are defined as the parts in the whole/part relationship. No order is implied between the parts.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been demoted from the supertype <em>IfcRelDecomposes</em> and defines the non-ordered set of parts within the aggregation.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("625f25d1-b298-4499-9dab-89400c65d801")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcObjectDefinition")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedObjects")
	private Set<IfcObjectDefinition> relatedObjects;


	public IfcRelAggregates()
	{
	}

	public IfcRelAggregates(String globalId, IfcObjectDefinition relatingObject, IfcObjectDefinition[] relatedObjects)
	{
		super(globalId);
		this.relatingObject = relatingObject;
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
	}

	public IfcObjectDefinition getRelatingObject() {
		return this.relatingObject;
	}

	public void setRelatingObject(IfcObjectDefinition relatingObject) {
		this.relatingObject = relatingObject;
	}

	public Set<IfcObjectDefinition> getRelatedObjects() {
		return this.relatedObjects;
	}


}

