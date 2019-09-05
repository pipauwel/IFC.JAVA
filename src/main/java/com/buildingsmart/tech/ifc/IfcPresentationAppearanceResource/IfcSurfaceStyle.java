// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("359b755a-e87c-418d-bb14-8b2fd007e3ba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Side")
	@Description("An indication of which side of the surface to apply the style.")
	@Required()
	@Guid("71fe440e-530e-4206-b288-06ae88a7976e")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceSide side;

	@Description("A collection of different surface styles.")
	@Required()
	@MinLength(1)
	@MaxLength(5)
	@Guid("7501c93b-df89-434a-a8f8-9720a08bb372")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleElementSelect> styles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleElementSelect>();


	public IfcSurfaceStyle()
	{
	}

	public IfcSurfaceStyle(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceSide side, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleElementSelect[] styles)
	{
		this.side = side;
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceSide getSide() {
		return this.side;
	}

	public void setSide(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceSide side) {
		this.side = side;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleElementSelect> getStyles() {
		return this.styles;
	}


}

