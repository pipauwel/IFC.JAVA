// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyle;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillAreaStyle;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyle;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextStyle;

@Guid("ab926025-a25c-40a8-9608-000b0b34210c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCurveStyle.class, name = "IfcCurveStyle"), @JsonSubTypes.Type(value = IfcFillAreaStyle.class, name = "IfcFillAreaStyle"), @JsonSubTypes.Type(value = IfcSurfaceStyle.class, name = "IfcSurfaceStyle"), @JsonSubTypes.Type(value = IfcTextStyle.class, name = "IfcTextStyle")})
public abstract class IfcPresentationStyle implements IfcStyleAssignmentSelect
{
	@Description("Name of the presentation style.")
	@Guid("3f4d5bf7-968b-43d1-b8db-e25988629fc7")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;


	public IfcPresentationStyle()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

