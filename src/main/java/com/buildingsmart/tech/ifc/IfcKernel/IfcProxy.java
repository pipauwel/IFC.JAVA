// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("71ecd3f4-0c37-4779-a722-9dddefe6a6bf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProxy extends IfcProduct
{
	@JacksonXmlProperty(isAttribute=true, localName = "ProxyType")
	@Description("High level (and only) semantic meaning attached to the IfcProxy, defining the basic construct type behind the Proxy, e.g. Product or Process.")
	@Required()
	@Guid("7c83d5c4-1b38-400e-8d64-cbbcb8893211")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcObjectTypeEnum proxyType;

	@JacksonXmlProperty(isAttribute=true, localName = "Tag")
	@Description("The tag (or label) identifier at the particular instance of a product, e.g. the serial number, or the position number. It is the identifier at the occurrence level.")
	@Guid("d45cbd31-dd92-4820-9238-63d0fd345dc6")
	private String tag;


	public IfcProxy()
	{
	}

	public IfcProxy(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObjectTypeEnum proxyType)
	{
		super(globalId);
		this.proxyType = proxyType;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcObjectTypeEnum getProxyType() {
		return this.proxyType;
	}

	public void setProxyType(com.buildingsmart.tech.ifc.IfcKernel.IfcObjectTypeEnum proxyType) {
		this.proxyType = proxyType;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}


}

