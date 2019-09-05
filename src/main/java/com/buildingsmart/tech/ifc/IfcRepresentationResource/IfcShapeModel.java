// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("96fc3c5f-dd42-4a80-aea3-295fbe743fa9")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcShapeModel extends IfcRepresentation
{
	@Description("Reference to the shape aspect, for which it is the shape representation.")
	@MaxLength(1)
	@Guid("917251e4-e944-4d8c-adbb-eecf72e4e71c")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> ofShapeAspect = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect>();


	public IfcShapeModel()
	{
	}

	public IfcShapeModel(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> getOfShapeAspect() {
		return this.ofShapeAspect;
	}


}

