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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcDiscreteAccessoryTypeEnum;

@Guid("fdfd0f31-eb16-42ce-a2d2-b2fccafaab2b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDiscreteAccessoryType extends IfcElementComponentType
{
	@Description("Subtype of discrete accessory")
	@DataMember(Order = 0)
	@Required()
	@Guid("33ce9836-a43e-4601-8cf5-efa4054adb49")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDiscreteAccessoryTypeEnum predefinedType;


	public IfcDiscreteAccessoryType()
	{
	}

	public IfcDiscreteAccessoryType(String globalId, IfcDiscreteAccessoryTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDiscreteAccessoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDiscreteAccessoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

