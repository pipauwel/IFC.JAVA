// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Set;

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
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcShapeAspect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ofShapeAspect")*/
	@JsonIgnore
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

