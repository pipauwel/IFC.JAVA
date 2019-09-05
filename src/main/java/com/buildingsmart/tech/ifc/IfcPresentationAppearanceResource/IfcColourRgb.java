// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("388e833a-1b3c-4462-8e69-376d83bdcbb7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcColourRgb extends IfcColourSpecification implements IfcColourOrFactor
{
	@JacksonXmlProperty(isAttribute=true, localName = "Red")
	@Description("The intensity of the red colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@Required()
	@Guid("f661324a-8271-4245-9e58-ffc0cf863c82")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure red;

	@JacksonXmlProperty(isAttribute=true, localName = "Green")
	@Description("The intensity of the green colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@Required()
	@Guid("ebc33f4b-fed6-40ff-a92e-a20b033a4a88")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure green;

	@JacksonXmlProperty(isAttribute=true, localName = "Blue")
	@Description("The intensity of the blue colour component.  <blockquote class=\"note\">NOTE&nbsp; The colour component value is given within the range of 0..1, and not within the range of 0..255 as otherwise usual.</blockquote>")
	@Required()
	@Guid("bbdfea63-6f7b-4237-ae70-f0252c880d09")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure blue;


	public IfcColourRgb()
	{
	}

	public IfcColourRgb(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure red, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure green, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getRed() {
		return this.red;
	}

	public void setRed(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure red) {
		this.red = red;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getGreen() {
		return this.green;
	}

	public void setGreen(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure green) {
		this.green = green;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getBlue() {
		return this.blue;
	}

	public void setBlue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure blue) {
		this.blue = blue;
	}


}

