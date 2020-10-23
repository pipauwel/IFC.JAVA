// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("388e833a-1b3c-4462-8e69-376d83bdcbb7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcColourRgb extends IfcColourSpecification implements IfcColourOrFactor
{
	@Description("The intensity of the red colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f661324a-8271-4245-9e58-ffc0cf863c82")
	@JacksonXmlProperty(isAttribute=false, localName = "red")
	private IfcNormalisedRatioMeasure red;

	@Description("The intensity of the green colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("ebc33f4b-fed6-40ff-a92e-a20b033a4a88")
	@JacksonXmlProperty(isAttribute=false, localName = "green")
	private IfcNormalisedRatioMeasure green;

	@Description("The intensity of the blue colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("bbdfea63-6f7b-4237-ae70-f0252c880d09")
	@JacksonXmlProperty(isAttribute=false, localName = "blue")
	private IfcNormalisedRatioMeasure blue;


	public IfcColourRgb()
	{
	}

	public IfcColourRgb(IfcNormalisedRatioMeasure red, IfcNormalisedRatioMeasure green, IfcNormalisedRatioMeasure blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public IfcNormalisedRatioMeasure getRed() {
		return this.red;
	}

	public void setRed(IfcNormalisedRatioMeasure red) {
		this.red = red;
	}

	public IfcNormalisedRatioMeasure getGreen() {
		return this.green;
	}

	public void setGreen(IfcNormalisedRatioMeasure green) {
		this.green = green;
	}

	public IfcNormalisedRatioMeasure getBlue() {
		return this.blue;
	}

	public void setBlue(IfcNormalisedRatioMeasure blue) {
		this.blue = blue;
	}


}

