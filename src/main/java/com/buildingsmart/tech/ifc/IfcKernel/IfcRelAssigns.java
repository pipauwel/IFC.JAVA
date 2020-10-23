// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("458cc135-db13-40d6-ab1b-64ba222632fe")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelAssignsToActor.class, name = "IfcRelAssignsToActor"), @JsonSubTypes.Type(value = IfcRelAssignsToControl.class, name = "IfcRelAssignsToControl"), @JsonSubTypes.Type(value = IfcRelAssignsToGroup.class, name = "IfcRelAssignsToGroup"), @JsonSubTypes.Type(value = IfcRelAssignsToProcess.class, name = "IfcRelAssignsToProcess"), @JsonSubTypes.Type(value = IfcRelAssignsToProduct.class, name = "IfcRelAssignsToProduct"), @JsonSubTypes.Type(value = IfcRelAssignsToResource.class, name = "IfcRelAssignsToResource")})
public abstract class IfcRelAssigns extends IfcRelationship
{
	@Description("Related objects, which are assigned to a single object. The type of the single (or relating) object is defined in the subtypes of IfcRelAssigns.")
	@DataMember(Order = 0)
	@Required()
	@Guid("15095ee6-ca54-435a-ada1-6296bedeafc5")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcObjectDefinition")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedObjects")
	private Set<IfcObjectDefinition> relatedObjects;

	@Description("Particular type of the assignment relationship. It can constrain the applicable object types, used within the role of <em>RelatedObjects</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute is deprecated and shall no longer be used. A NIL value should always be assigned.</blockquote>")
	@DataMember(Order = 1)
	@Guid("7dd9a03b-e83d-4bde-a7cc-99502633620b")
	@JacksonXmlProperty(isAttribute=true, localName = "relatedObjectsType")
	private IfcObjectTypeEnum relatedObjectsType;


	public IfcRelAssigns()
	{
	}

	public IfcRelAssigns(String globalId, IfcObjectDefinition[] relatedObjects)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
	}

	public Set<IfcObjectDefinition> getRelatedObjects() {
		return this.relatedObjects;
	}

	public IfcObjectTypeEnum getRelatedObjectsType() {
		return this.relatedObjectsType;
	}

	public void setRelatedObjectsType(IfcObjectTypeEnum relatedObjectsType) {
		this.relatedObjectsType = relatedObjectsType;
	}


}

