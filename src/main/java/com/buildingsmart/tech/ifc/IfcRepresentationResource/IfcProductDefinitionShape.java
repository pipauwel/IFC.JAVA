// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ba246ca4-84c8-436f-8964-9d288e492ad4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProductDefinitionShape extends IfcProductRepresentation implements IfcProductRepresentationSelect
{
	@Description("The <em>IfcProductDefinitionShape</em> shall be used to provide a representation for a single instance of <em>IfcProduct</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE New inverse attribute.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Inverse relationship cardinality relaxed to be 1:N.</blockquote>")
	@MinLength(1)
	@Guid("1ff74e69-c8f5-4180-bc2e-a643526f8098")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> shapeOfProduct = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasShapeAspects")
	@Description("Reference to the shape aspect that represents part of the shape or its feature distinctively.")
	@Guid("4332ba90-64b3-4707-a15d-96b41a63195a")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> hasShapeAspects = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect>();


	public IfcProductDefinitionShape()
	{
	}

	public IfcProductDefinitionShape(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation[] representations)
	{
		super(representations);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> getShapeOfProduct() {
		return this.shapeOfProduct;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> getHasShapeAspects() {
		return this.hasShapeAspects;
	}


}

