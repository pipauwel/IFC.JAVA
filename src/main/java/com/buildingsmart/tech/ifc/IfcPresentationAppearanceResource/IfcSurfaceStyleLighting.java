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

@Guid("5c51bae3-8ace-443a-9e9b-d416bb389d95")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleLighting extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "DiffuseTransmissionColour")
	@Description("The degree of diffusion of the transmitted light. In the case of completely transparent materials there is no diffusion. The greater the diffusing power, the smaller the direct component of the transmitted light, up to the point where only diffuse light is produced. A value of 1 means totally diffuse for that colour part of the light.  <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@Required()
	@Guid("ef4c74ec-f03f-4567-a490-c9c5a67e7c49")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseTransmissionColour;

	@JacksonXmlProperty(isAttribute=false, localName = "DiffuseReflectionColour")
	@Description("The degree of diffusion of the reflected light. In the case of specular surfaces there is no diffusion. The greater the diffusing power of the reflecting surface, the smaller the specular component of the reflected light, up to the point where only diffuse light is produced. A value of 1 means totally diffuse for that colour part of the light.   <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@Required()
	@Guid("0379917f-0cc5-464f-800d-f7bb8344e052")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseReflectionColour;

	@JacksonXmlProperty(isAttribute=false, localName = "TransmissionColour")
	@Description("Describes how the light falling on a body is totally or partially transmitted.   <blockquote class=\"note\">The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@Required()
	@Guid("d7953e7b-4523-44fa-b6ec-ed820e7701df")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb transmissionColour;

	@JacksonXmlProperty(isAttribute=false, localName = "ReflectanceColour")
	@Description("A coefficient that determines the extent that the light falling onto a surface is fully or partially reflected.   <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@Required()
	@Guid("9727ff89-6fb4-4540-a342-02dc3cbc547c")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb reflectanceColour;


	public IfcSurfaceStyleLighting()
	{
	}

	public IfcSurfaceStyleLighting(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseTransmissionColour, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseReflectionColour, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb transmissionColour, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb reflectanceColour)
	{
		this.diffuseTransmissionColour = diffuseTransmissionColour;
		this.diffuseReflectionColour = diffuseReflectionColour;
		this.transmissionColour = transmissionColour;
		this.reflectanceColour = reflectanceColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getDiffuseTransmissionColour() {
		return this.diffuseTransmissionColour;
	}

	public void setDiffuseTransmissionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseTransmissionColour) {
		this.diffuseTransmissionColour = diffuseTransmissionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getDiffuseReflectionColour() {
		return this.diffuseReflectionColour;
	}

	public void setDiffuseReflectionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb diffuseReflectionColour) {
		this.diffuseReflectionColour = diffuseReflectionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getTransmissionColour() {
		return this.transmissionColour;
	}

	public void setTransmissionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb transmissionColour) {
		this.transmissionColour = transmissionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getReflectanceColour() {
		return this.reflectanceColour;
	}

	public void setReflectanceColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb reflectanceColour) {
		this.reflectanceColour = reflectanceColour;
	}


}

