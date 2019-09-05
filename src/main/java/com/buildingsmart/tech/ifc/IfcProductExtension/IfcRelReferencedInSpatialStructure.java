// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("6efcded0-4fa6-4c52-82e9-d250dbb9bcb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelReferencedInSpatialStructure extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Set of products, which are referenced within this level of the spatial structure hierarchy.  <blockquote class=\"note\">NOTE&nbsp; Referenced elements are contained elsewhere within the spatial structure, they are referenced additionally by this spatial structure element, e.g., because they span several stories.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("435af73c-0c42-4a56-8312-c9b5ddf240fa")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> relatedElements = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct>();

	@JsonIgnore
	@Description("Spatial structure element, within which the element is referenced. Any element can be contained within zero, one or many elements of the project spatial and zoning structure.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>RelatingStructure</em> as been promoted to the new supertype <em>IfcSpatialElement</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("8f9271fa-45d6-475e-a698-053883f165f4")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement relatingStructure;


	public IfcRelReferencedInSpatialStructure()
	{
	}

	public IfcRelReferencedInSpatialStructure(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcProduct[] relatedElements, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement relatingStructure)
	{
		super(globalId);
		this.relatedElements = new HashSet<>(Arrays.asList(relatedElements));
		this.relatingStructure = relatingStructure;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> getRelatedElements() {
		return this.relatedElements;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement getRelatingStructure() {
		return this.relatingStructure;
	}

	public void setRelatingStructure(com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement relatingStructure) {
		this.relatingStructure = relatingStructure;
	}


}

