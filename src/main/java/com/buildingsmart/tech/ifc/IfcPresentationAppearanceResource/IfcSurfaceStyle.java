// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("359b755a-e87c-418d-bb14-8b2fd007e3ba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@Description("An indication of which side of the surface to apply the style.")
	@DataMember(Order = 0)
	@Required()
	@Guid("71fe440e-530e-4206-b288-06ae88a7976e")
	@JacksonXmlProperty(isAttribute=true, localName = "side")
	private IfcSurfaceSide side;

	@Description("A collection of different surface styles.")
	@DataMember(Order = 1)
	@Required()
	@Guid("7501c93b-df89-434a-a8f8-9720a08bb372")
	@MinLength(1)
	@MaxLength(5)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcSurfaceStyleElementSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "styles")
	private Set<IfcSurfaceStyleElementSelect> styles;


	public IfcSurfaceStyle()
	{
	}

	public IfcSurfaceStyle(IfcSurfaceSide side, IfcSurfaceStyleElementSelect[] styles)
	{
		this.side = side;
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public IfcSurfaceSide getSide() {
		return this.side;
	}

	public void setSide(IfcSurfaceSide side) {
		this.side = side;
	}

	public Set<IfcSurfaceStyleElementSelect> getStyles() {
		return this.styles;
	}


}

