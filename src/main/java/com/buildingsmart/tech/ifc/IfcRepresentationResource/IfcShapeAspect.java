// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLogical;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("d0b09671-0848-4353-9710-4312d56ffea7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShapeAspect
{
	@Description("List of <strike>shape</strike> representations. Each member defines a valid representation of a particular type within a particular representation context as being an aspect (or part) of a product definition.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The data type has been changed from <em>IfcShapeRepresentation</em> to <em>IfcShapeModel</em> with upward compatibility </blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("db755f10-d8c8-4854-b571-b705ca239039")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcShapeModel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "shapeRepresentations")
	private List<IfcShapeModel> shapeRepresentations;

	@Description("The word or group of words by which the shape aspect is known. It is a tag to indicate the particular semantic of a component within the product definition shape, used to provide meaning. Example: use the tag \"Glazing\" to define which component of a window shape defines the glazing area.")
	@DataMember(Order = 1)
	@Guid("112f0471-a832-43b6-afd9-1fea94b60438")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("The word or group of words that characterize the shape aspect. It can be used to add additional meaning to the name of the aspect.")
	@DataMember(Order = 2)
	@Guid("efe2ecf9-35ff-4806-aad2-4ed933ead852")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("An indication that the shape aspect is on the physical boundary of the product definition shape. If the value of this attribute is TRUE, it shall be asserted that the shape aspect being identified is on such a boundary. If the value is FALSE, it shall be asserted that the shape aspect being identified is not on such a boundary. If the value is UNKNOWN, it shall be asserted that it is not known whether or not the shape aspect being identified is on such a boundary.   ---  EXAMPLE: Would be FALSE for a center line, identified as shape aspect; would be TRUE for a cantilever.  ---")
	@DataMember(Order = 3)
	@Required()
	@Guid("05efefab-4927-4846-a3f1-e28bff9478de")
	@JacksonXmlProperty(isAttribute=false, localName = "productDefinitional")
	private IfcLogical productDefinitional;

	@Description("Reference to the <em>IfcProductDefinitionShape</em> or the <em>IfcRepresentationMap</em> of which this shape is an aspect.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type modified to be <em>IfcProductRepresentationSelect</em> allowing the assignment also to <em>IfcRepresentationMap</em>.  </blockquote>")
	@DataMember(Order = 4)
	@Guid("26d2bffa-08ab-4f51-8c1b-5240f92fc434")
	@JsonIgnore
	private IfcProductRepresentationSelect partOfProductDefinitionShape;


	public IfcShapeAspect()
	{
	}

	public IfcShapeAspect(IfcShapeModel[] shapeRepresentations, IfcLogical productDefinitional)
	{
		this.shapeRepresentations = new ArrayList<>(Arrays.asList(shapeRepresentations));
		this.productDefinitional = productDefinitional;
	}

	public List<IfcShapeModel> getShapeRepresentations() {
		return this.shapeRepresentations;
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

	public IfcLogical getProductDefinitional() {
		return this.productDefinitional;
	}

	public void setProductDefinitional(IfcLogical productDefinitional) {
		this.productDefinitional = productDefinitional;
	}

	public IfcProductRepresentationSelect getPartOfProductDefinitionShape() {
		return this.partOfProductDefinitionShape;
	}

	public void setPartOfProductDefinitionShape(IfcProductRepresentationSelect partOfProductDefinitionShape) {
		this.partOfProductDefinitionShape = partOfProductDefinitionShape;
	}


}

