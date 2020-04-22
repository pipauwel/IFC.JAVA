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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeRepresentation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcTopologyRepresentation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;

@Guid("96fc3c5f-dd42-4a80-aea3-295fbe743fa9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcShapeRepresentation.class, name = "IfcShapeRepresentation"), @JsonSubTypes.Type(value = IfcTopologyRepresentation.class, name = "IfcTopologyRepresentation")})
public abstract class IfcShapeModel extends IfcRepresentation
{
	@Description("Reference to the shape aspect, for which it is the shape representation.")
	@InverseProperty(InverseProp = "ShapeRepresentations", Range = "IfcShapeAspect")
	@Guid("917251e4-e944-4d8c-adbb-eecf72e4e71c")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcShapeAspect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "OfShapeAspect")
	private Set<IfcShapeAspect> ofShapeAspect;


	public IfcShapeModel()
	{
	}

	public IfcShapeModel(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}

	public Set<IfcShapeAspect> getOfShapeAspect() {
		return this.ofShapeAspect;
	}


}

