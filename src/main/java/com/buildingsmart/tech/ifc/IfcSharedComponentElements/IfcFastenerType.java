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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcFastenerTypeEnum;

@Guid("572e4980-73f9-469a-bc9e-520a82f27b85")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFastenerType extends IfcElementComponentType
{
	@Description("Subtype of fastener")
	@DataMember(Order = 0)
	@Required()
	@Guid("338cf347-65d8-4519-b97e-d487b305360c")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFastenerTypeEnum predefinedType;


	public IfcFastenerType()
	{
	}

	public IfcFastenerType(String globalId, IfcFastenerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

