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

@Guid("5ba7cc3f-c0c3-42e3-bfe3-f54531a32ef7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDiscreteAccessory extends IfcElementComponent
{
	@Description("Subtype of discrete accessory.  If USERDEFINED, the type is further qualified by means of the inherited attribute <em>ObjectType</em>.  Refer to <em>IfcDiscreteAccessoryType</em> for a non-exclusive list of userdefined type designations which are applicable to <em>IfcDiscreteAccessory</em> as well.")
	@DataMember(Order = 0)
	@Guid("563130f8-4a34-4ff4-bb1f-2c739a1dfa47")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDiscreteAccessoryTypeEnum predefinedType;


	public IfcDiscreteAccessory()
	{
	}

	public IfcDiscreteAccessory(String globalId)
	{
		super(globalId);
	}

	public IfcDiscreteAccessoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDiscreteAccessoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

