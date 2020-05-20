// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("6efcded0-4fa6-4c52-82e9-d250dbb9bcb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelReferencedInSpatialStructure extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Set of products, which are referenced within this level of the spatial structure hierarchy.  <blockquote class=\"note\">NOTE&nbsp; Referenced elements are contained elsewhere within the spatial structure, they are referenced additionally by this spatial structure element, e.g., because they span several stories.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("435af73c-0c42-4a56-8312-c9b5ddf240fa")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProduct")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedElements")
	private Set<IfcProduct> relatedElements;

	@Description("Spatial structure element, within which the element is referenced. Any element can be contained within zero, one or many elements of the project spatial and zoning structure.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>RelatingStructure</em> as been promoted to the new supertype <em>IfcSpatialElement</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("8f9271fa-45d6-475e-a698-053883f165f4")
	@JsonIgnore
	private IfcSpatialElement relatingStructure;


	public IfcRelReferencedInSpatialStructure()
	{
	}

	public IfcRelReferencedInSpatialStructure(String globalId, IfcProduct[] relatedElements, IfcSpatialElement relatingStructure)
	{
		super(globalId);
		this.relatedElements = new HashSet<>(Arrays.asList(relatedElements));
		this.relatingStructure = relatingStructure;
	}

	public Set<IfcProduct> getRelatedElements() {
		return this.relatedElements;
	}

	public IfcSpatialElement getRelatingStructure() {
		return this.relatingStructure;
	}

	public void setRelatingStructure(IfcSpatialElement relatingStructure) {
		this.relatingStructure = relatingStructure;
	}


}

