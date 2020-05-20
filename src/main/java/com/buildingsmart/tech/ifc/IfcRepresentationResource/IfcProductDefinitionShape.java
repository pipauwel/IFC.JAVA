// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("ba246ca4-84c8-436f-8964-9d288e492ad4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProductDefinitionShape extends IfcProductRepresentation implements IfcProductRepresentationSelect
{
	@Description("The <em>IfcProductDefinitionShape</em> shall be used to provide a representation for a single instance of <em>IfcProduct</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE New inverse attribute.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Inverse relationship cardinality relaxed to be 1:N.</blockquote>")
	@InverseProperty(InverseProp = "representation", Range = "IfcProduct")
	@Guid("1ff74e69-c8f5-4180-bc2e-a643526f8098")
	@MinLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcProduct")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "shapeOfProduct")*/
	@JsonIgnore
	private Set<IfcProduct> shapeOfProduct;

	@Description("Reference to the shape aspect that represents part of the shape or its feature distinctively.")
	@InverseProperty(InverseProp = "partOfProductDefinitionShape", Range = "IfcShapeAspect")
	@Guid("4332ba90-64b3-4707-a15d-96b41a63195a")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcShapeAspect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasShapeAspects")
	private Set<IfcShapeAspect> hasShapeAspects;


	public IfcProductDefinitionShape()
	{
	}

	public IfcProductDefinitionShape(IfcRepresentation[] representations)
	{
		super(representations);
	}

	public Set<IfcProduct> getShapeOfProduct() {
		return this.shapeOfProduct;
	}

	public Set<IfcShapeAspect> getHasShapeAspects() {
		return this.hasShapeAspects;
	}


}

