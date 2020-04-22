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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPreDefinedColour;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPreDefinedCurveFont;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPreDefinedTextFont;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;

@Guid("24f52902-4123-41ea-bdd0-f47e6ab00191")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPreDefinedColour.class, name = "IfcPreDefinedColour"), @JsonSubTypes.Type(value = IfcPreDefinedCurveFont.class, name = "IfcPreDefinedCurveFont"), @JsonSubTypes.Type(value = IfcPreDefinedTextFont.class, name = "IfcPreDefinedTextFont")})
public abstract class IfcPreDefinedItem extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The string by which the pre defined item is identified. Allowable values for the string are declared at the level of subtypes.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b0f1937f-94b4-4988-82a9-cf7620fca2ff")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;


	public IfcPreDefinedItem()
	{
	}

	public IfcPreDefinedItem(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

