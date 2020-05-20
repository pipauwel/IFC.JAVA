// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3a589d07-713f-4a7d-90a7-1b9c3b668e2b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelProjectsElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelDecomposes
{
	@Description("Element at which a projection is created by the associated <em>IfcProjectionElement</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9ca4732c-313e-419b-91c9-d6570d18f0b8")
	@JsonIgnore
	private IfcElement relatingElement;

	@Description("Reference to the <em>IfcFeatureElementAddition</em> that defines an addition to the volume of the element, by using a Boolean addition operation. An example is a projection at the associated element.")
	@DataMember(Order = 1)
	@Required()
	@Guid("c95715df-11cc-4fae-8d0b-2e578e90f0ab")
	@JacksonXmlProperty(isAttribute=false, localName = "relatedFeatureElement")
	private IfcFeatureElementAddition relatedFeatureElement;


	public IfcRelProjectsElement()
	{
	}

	public IfcRelProjectsElement(String globalId, IfcElement relatingElement, IfcFeatureElementAddition relatedFeatureElement)
	{
		super(globalId);
		this.relatingElement = relatingElement;
		this.relatedFeatureElement = relatedFeatureElement;
	}

	public IfcElement getRelatingElement() {
		return this.relatingElement;
	}

	public void setRelatingElement(IfcElement relatingElement) {
		this.relatingElement = relatingElement;
	}

	public IfcFeatureElementAddition getRelatedFeatureElement() {
		return this.relatedFeatureElement;
	}

	public void setRelatedFeatureElement(IfcFeatureElementAddition relatedFeatureElement) {
		this.relatedFeatureElement = relatedFeatureElement;
	}


}

