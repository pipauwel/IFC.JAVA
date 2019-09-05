// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ade898d9-502a-402f-b2b5-25e8a097c9e9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsPortToElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingPort")
	@Description("Reference to an Port that is connected by the objectified relationship.")
	@Required()
	@Guid("222980d1-b080-42e0-b7b3-eb3b93435142")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatedElement")
	@Description("Reference to an <em>IfcDistributionElement</em> that has ports assigned.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Data type restricted to <em>IfcDistributionElement</em>.</blockquote>")
	@Required()
	@Guid("9169b986-1fba-4dbd-b53a-9d8e770368f5")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement relatedElement;


	public IfcRelConnectsPortToElement()
	{
	}

	public IfcRelConnectsPortToElement(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort, com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement relatedElement)
	{
		super(globalId);
		this.relatingPort = relatingPort;
		this.relatedElement = relatedElement;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort getRelatingPort() {
		return this.relatingPort;
	}

	public void setRelatingPort(com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort) {
		this.relatingPort = relatingPort;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement getRelatedElement() {
		return this.relatedElement;
	}

	public void setRelatedElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement relatedElement) {
		this.relatedElement = relatedElement;
	}


}

