// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort;

@Guid("6763c7ee-edf0-48d2-a207-bc8e7ec8f122")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsPorts extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to the first port that is connected by the objectified relationship.")
	@Required()
	@Guid("efe1eb66-54da-4f86-91e0-b7d9358e3d45")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingPort")
	private IfcPort relatingPort;

	@Description("Reference to the second port that is connected by the objectified relationship.")
	@Required()
	@Guid("54345254-9eba-473c-8fa3-db57ed133bb0")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedPort")
	private IfcPort relatedPort;

	@Description("Defines the element that realizes a port connection relationship.")
	@Guid("1fdb9b03-71b4-4ec2-a92f-d2854c96a18d")
	@JacksonXmlProperty(isAttribute=false, localName = "RealizingElement")
	private IfcElement realizingElement;


	public IfcRelConnectsPorts()
	{
	}

	public IfcRelConnectsPorts(String globalId, IfcPort relatingPort, IfcPort relatedPort)
	{
		super(globalId);
		this.relatingPort = relatingPort;
		this.relatedPort = relatedPort;
	}

	public IfcPort getRelatingPort() {
		return this.relatingPort;
	}

	public void setRelatingPort(IfcPort relatingPort) {
		this.relatingPort = relatingPort;
	}

	public IfcPort getRelatedPort() {
		return this.relatedPort;
	}

	public void setRelatedPort(IfcPort relatedPort) {
		this.relatedPort = relatedPort;
	}

	public IfcElement getRealizingElement() {
		return this.realizingElement;
	}

	public void setRealizingElement(IfcElement realizingElement) {
		this.realizingElement = realizingElement;
	}


}

