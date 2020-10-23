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

@Guid("d85e2968-6220-4d4b-9e5d-3fcf794fea60")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelContainedInSpatialStructure extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Set of products, which are contained within this level of the spatial structure hierarchy.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcElement</em> to <em>IfcProduct</em> with upward compatibility</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("6d60a348-9802-4101-89d4-2e0c5ce2ab92")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProduct")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedElements")
	private Set<IfcProduct> relatedElements;

	@Description("Spatial structure element, within which the element is contained. Any element can only be contained within one element of the project spatial structure.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>RelatingStructure</em> as been promoted to the new supertype <em>IfcSpatialElement</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("8b59fadd-0d62-4ca6-bdb3-5620e2dd2b8f")
	@JsonIgnore
	private IfcSpatialElement relatingStructure;


	public IfcRelContainedInSpatialStructure()
	{
	}

	public IfcRelContainedInSpatialStructure(String globalId, IfcProduct[] relatedElements, IfcSpatialElement relatingStructure)
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

