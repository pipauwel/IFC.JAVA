// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBinary;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("13c24361-dbc0-44fd-93e3-7772371d47b4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPixelTexture extends IfcSurfaceTexture
{
	@Description("The number of pixels in width (S) direction.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c1053d5b-168b-4e18-b506-7f86295a5034")
	@JacksonXmlProperty(isAttribute=false, localName = "width")
	private IfcInteger width;

	@Description("The number of pixels in height (T) direction.")
	@DataMember(Order = 1)
	@Required()
	@Guid("a3532256-2664-419d-969d-74405b430ee1")
	@JacksonXmlProperty(isAttribute=false, localName = "height")
	private IfcInteger height;

	@Description("Indication whether the pixel values contain a 1, 2, 3, or 4 colour component.")
	@DataMember(Order = 2)
	@Required()
	@Guid("08c0022b-a713-47e4-9ab3-dd65531b1ddd")
	@JacksonXmlProperty(isAttribute=false, localName = "colourComponents")
	private IfcInteger colourComponents;

	@Description("Flat list of hexadecimal values, each describing one pixel by 1, 2, 3, or 4 components.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The data type has been changed from STRING to BINARY.</blockquote>")
	@DataMember(Order = 3)
	@Required()
	@Guid("1a84a3b7-3dbb-4e1d-8775-f1a24ef74498")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcBinary")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "pixel")
	private List<IfcBinary> pixel;


	public IfcPixelTexture()
	{
	}

	public IfcPixelTexture(IfcBoolean repeatS, IfcBoolean repeatT, IfcInteger width, IfcInteger height, IfcInteger colourComponents, List<IfcBinary> pixel)
	{
		super(repeatS, repeatT);
		this.width = width;
		this.height = height;
		this.colourComponents = colourComponents;
		this.pixel = pixel;
	}

	public IfcInteger getWidth() {
		return this.width;
	}

	public void setWidth(IfcInteger width) {
		this.width = width;
	}

	public IfcInteger getHeight() {
		return this.height;
	}

	public void setHeight(IfcInteger height) {
		this.height = height;
	}

	public IfcInteger getColourComponents() {
		return this.colourComponents;
	}

	public void setColourComponents(IfcInteger colourComponents) {
		this.colourComponents = colourComponents;
	}

	public List<IfcBinary> getPixel() {
		return this.pixel;
	}


}

