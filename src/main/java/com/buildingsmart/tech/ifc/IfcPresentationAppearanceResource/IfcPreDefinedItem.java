// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcPreDefinedItem()
	{
	}

	public IfcPreDefinedItem(IfcLabel name)
	{
		this.name = name;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

