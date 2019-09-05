// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("71827db2-742f-4dc0-bf75-f01994ba5b74")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcLightSource extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name given to the light source in presentation.")
	@Guid("150164ef-7d33-445f-8a1b-2d529f61d7a4")
	private String name;

	@JacksonXmlProperty(isAttribute=false, localName = "LightColour")
	@Description("Definition from ISO/CD 10303-46:1992: Based on the current lighting model, the colour of the light to be used for shading.  Definition from VRML97 - ISO/IEC 14772-1:1997: The color field specifies the spectral color properties of both the direct and ambient light emission as an RGB value.")
	@Required()
	@Guid("ff1fa3ae-d82f-44c4-803a-3710bb57144d")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour;

	@JacksonXmlProperty(isAttribute=true, localName = "AmbientIntensity")
	@Description("Definition from VRML97 - ISO/IEC 14772-1:1997: The ambientIntensity specifies the intensity of the ambient emission from the light. Light intensity may range from 0.0 (no light emission) to 1.0 (full intensity).")
	@Guid("55499aa0-2d76-4bb7-8ffb-ddb32a56f629")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure ambientIntensity;

	@JacksonXmlProperty(isAttribute=true, localName = "Intensity")
	@Description("Definition from VRML97 - ISO/IEC 14772-1:1997: The intensity field specifies the brightness of the direct emission from the ligth. Light intensity may range from 0.0 (no light emission) to 1.0 (full intensity).")
	@Guid("118472c5-0afa-48b6-a33a-dcada5d71a1f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure intensity;


	public IfcLightSource()
	{
	}

	public IfcLightSource(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour)
	{
		this.lightColour = lightColour;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getLightColour() {
		return this.lightColour;
	}

	public void setLightColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour) {
		this.lightColour = lightColour;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getAmbientIntensity() {
		return this.ambientIntensity;
	}

	public void setAmbientIntensity(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure ambientIntensity) {
		this.ambientIntensity = ambientIntensity;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getIntensity() {
		return this.intensity;
	}

	public void setIntensity(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure intensity) {
		this.intensity = intensity;
	}


}

