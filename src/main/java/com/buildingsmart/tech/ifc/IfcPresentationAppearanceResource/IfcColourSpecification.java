// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3990e833-3ae0-4169-a1b9-a5baf4a50755")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcColourRgb.class, name = "IfcColourRgb"))
public abstract class IfcColourSpecification extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcColour
{
	@Description("Optional name given to a particular colour specification in addition to the colour components (like the RGB values).  <blockquote class=\"example\">EXAMPLE&nbsp; Names of a industry colour classification, such as RAL.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; Attribute added.</blockquote>")
	@DataMember(Order = 0)
	@Guid("0a39aac4-ff7b-41fa-81e3-803fdd402107")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcColourSpecification()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

