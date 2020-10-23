// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("33ffc6a1-31d2-441f-99ed-c8775cef5eb5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextStyleForDefinedFont extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("This property describes the text color of an element (often referred to as the foreground color).")
	@DataMember(Order = 0)
	@Required()
	@Guid("a201eed1-7939-427c-994a-c80f97e60526")
	@JacksonXmlProperty(isAttribute=true, localName = "colour")
	private IfcColour colour;

	@Description("This property sets the background color of an element.")
	@DataMember(Order = 1)
	@Guid("dc717d7d-7060-4f0b-a16f-2d49b2dc6303")
	@JacksonXmlProperty(isAttribute=true, localName = "backgroundColour")
	private IfcColour backgroundColour;


	public IfcTextStyleForDefinedFont()
	{
	}

	public IfcTextStyleForDefinedFont(IfcColour colour)
	{
		this.colour = colour;
	}

	public IfcColour getColour() {
		return this.colour;
	}

	public void setColour(IfcColour colour) {
		this.colour = colour;
	}

	public IfcColour getBackgroundColour() {
		return this.backgroundColour;
	}

	public void setBackgroundColour(IfcColour backgroundColour) {
		this.backgroundColour = backgroundColour;
	}


}

