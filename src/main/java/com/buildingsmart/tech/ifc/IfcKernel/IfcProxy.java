// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProduct;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectTypeEnum;

@Guid("71ecd3f4-0c37-4779-a722-9dddefe6a6bf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProxy extends IfcProduct
{
	@Description("High level (and only) semantic meaning attached to the IfcProxy, defining the basic construct type behind the Proxy, e.g. Product or Process.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7c83d5c4-1b38-400e-8d64-cbbcb8893211")
	@JacksonXmlProperty(isAttribute=true, localName = "ProxyType")
	private IfcObjectTypeEnum proxyType;

	@Description("The tag (or label) identifier at the particular instance of a product, e.g. the serial number, or the position number. It is the identifier at the occurrence level.")
	@DataMember(Order = 1)
	@Guid("d45cbd31-dd92-4820-9238-63d0fd345dc6")
	@JacksonXmlProperty(isAttribute=true, localName = "Tag")
	private String tag;


	public IfcProxy()
	{
	}

	public IfcProxy(String globalId, IfcObjectTypeEnum proxyType)
	{
		super(globalId);
		this.proxyType = proxyType;
	}

	public IfcObjectTypeEnum getProxyType() {
		return this.proxyType;
	}

	public void setProxyType(IfcObjectTypeEnum proxyType) {
		this.proxyType = proxyType;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}


}

