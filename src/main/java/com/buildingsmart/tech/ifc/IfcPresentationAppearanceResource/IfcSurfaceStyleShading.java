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

@Guid("4d15ed6e-2d9b-4101-a12a-055e03cab045")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleShading extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "SurfaceColour")
	@Description("The colour used to render the surface. The surface colour for visualisation is defined by specifying the intensity of red, green and blue.")
	@Required()
	@Guid("a2fe2d3a-9a84-4326-9016-dae00e0d0af9")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb surfaceColour;

	@JacksonXmlProperty(isAttribute=true, localName = "Transparency")
	@Description("The transparency field specifies how \"clear\" an object is, with 1.0 being completely transparent, and 0.0 completely opaque. If not given, the value 0.0 (opaque) is assumed.  <blockquote class=\"note\">NOTE&nbsp; The definition of 1 being transparent and 0 being opaque is the opposite of the definition in alpha channels, where 0.0 is completely transparent and 1.0 is completely opaque. This definition is due to upward compatibility to previous versions of this standard in different to the definition in <i>IfcIndexedColourMap</i>.</blockquote>")
	@Guid("3ced60f5-17d8-4093-a16a-d36cdad0806d")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure transparency;


	public IfcSurfaceStyleShading()
	{
	}

	public IfcSurfaceStyleShading(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb surfaceColour)
	{
		this.surfaceColour = surfaceColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getSurfaceColour() {
		return this.surfaceColour;
	}

	public void setSurfaceColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb surfaceColour) {
		this.surfaceColour = surfaceColour;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getTransparency() {
		return this.transparency;
	}

	public void setTransparency(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure transparency) {
		this.transparency = transparency;
	}


}

