// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("71827db2-742f-4dc0-bf75-f01994ba5b74")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcLightSourceAmbient.class, name = "IfcLightSourceAmbient"), @JsonSubTypes.Type(value = IfcLightSourceDirectional.class, name = "IfcLightSourceDirectional"), @JsonSubTypes.Type(value = IfcLightSourceGoniometric.class, name = "IfcLightSourceGoniometric"), @JsonSubTypes.Type(value = IfcLightSourcePositional.class, name = "IfcLightSourcePositional")})
public abstract class IfcLightSource extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The name given to the light source in presentation.")
	@DataMember(Order = 0)
	@Guid("150164ef-7d33-445f-8a1b-2d529f61d7a4")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Definition from ISO/CD 10303-46:1992: Based on the current lighting model, the colour of the light to be used for shading.  Definition from VRML97 - ISO/IEC 14772-1:1997: The color field specifies the spectral color properties of both the direct and ambient light emission as an RGB value.")
	@DataMember(Order = 1)
	@Required()
	@Guid("ff1fa3ae-d82f-44c4-803a-3710bb57144d")
	@JacksonXmlProperty(isAttribute=false, localName = "lightColour")
	private IfcColourRgb lightColour;

	@Description("Definition from VRML97 - ISO/IEC 14772-1:1997: The ambientIntensity specifies the intensity of the ambient emission from the light. Light intensity may range from 0.0 (no light emission) to 1.0 (full intensity).")
	@DataMember(Order = 2)
	@Guid("55499aa0-2d76-4bb7-8ffb-ddb32a56f629")
	@JacksonXmlProperty(isAttribute=false, localName = "ambientIntensity")
	private IfcNormalisedRatioMeasure ambientIntensity;

	@Description("Definition from VRML97 - ISO/IEC 14772-1:1997: The intensity field specifies the brightness of the direct emission from the ligth. Light intensity may range from 0.0 (no light emission) to 1.0 (full intensity).")
	@DataMember(Order = 3)
	@Guid("118472c5-0afa-48b6-a33a-dcada5d71a1f")
	@JacksonXmlProperty(isAttribute=false, localName = "intensity")
	private IfcNormalisedRatioMeasure intensity;


	public IfcLightSource()
	{
	}

	public IfcLightSource(IfcColourRgb lightColour)
	{
		this.lightColour = lightColour;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcColourRgb getLightColour() {
		return this.lightColour;
	}

	public void setLightColour(IfcColourRgb lightColour) {
		this.lightColour = lightColour;
	}

	public IfcNormalisedRatioMeasure getAmbientIntensity() {
		return this.ambientIntensity;
	}

	public void setAmbientIntensity(IfcNormalisedRatioMeasure ambientIntensity) {
		this.ambientIntensity = ambientIntensity;
	}

	public IfcNormalisedRatioMeasure getIntensity() {
		return this.intensity;
	}

	public void setIntensity(IfcNormalisedRatioMeasure intensity) {
		this.intensity = intensity;
	}


}

