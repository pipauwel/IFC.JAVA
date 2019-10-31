// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent;

@Guid("f7f5c079-1ef8-4a9e-a64c-86800f526d37")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFastener extends IfcElementComponent
{
	@Description("Subtype of fastener")
	@Guid("662a3ac7-815a-445d-a564-413f149a45af")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFastenerTypeEnum predefinedType;


	public IfcFastener()
	{
	}

	public IfcFastener(String globalId)
	{
		super(globalId);
	}

	public IfcFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

