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

@Guid("6763c7ee-edf0-48d2-a207-bc8e7ec8f122")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsPorts extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingPort")
	@Description("Reference to the first port that is connected by the objectified relationship.")
	@Required()
	@Guid("efe1eb66-54da-4f86-91e0-b7d9358e3d45")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatedPort")
	@Description("Reference to the second port that is connected by the objectified relationship.")
	@Required()
	@Guid("54345254-9eba-473c-8fa3-db57ed133bb0")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatedPort;

	@JacksonXmlProperty(isAttribute=false, localName = "RealizingElement")
	@Description("Defines the element that realizes a port connection relationship.")
	@Guid("1fdb9b03-71b4-4ec2-a92f-d2854c96a18d")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement realizingElement;


	public IfcRelConnectsPorts()
	{
	}

	public IfcRelConnectsPorts(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatedPort)
	{
		super(globalId);
		this.relatingPort = relatingPort;
		this.relatedPort = relatedPort;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort getRelatingPort() {
		return this.relatingPort;
	}

	public void setRelatingPort(com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatingPort) {
		this.relatingPort = relatingPort;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort getRelatedPort() {
		return this.relatedPort;
	}

	public void setRelatedPort(com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort relatedPort) {
		this.relatedPort = relatedPort;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRealizingElement() {
		return this.realizingElement;
	}

	public void setRealizingElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement realizingElement) {
		this.realizingElement = realizingElement;
	}


}

