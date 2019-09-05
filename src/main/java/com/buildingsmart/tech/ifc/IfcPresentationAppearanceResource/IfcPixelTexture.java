// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("13c24361-dbc0-44fd-93e3-7772371d47b4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPixelTexture extends IfcSurfaceTexture
{
	@JacksonXmlProperty(isAttribute=true, localName = "Width")
	@Description("The number of pixels in width (S) direction.")
	@Required()
	@Guid("c1053d5b-168b-4e18-b506-7f86295a5034")
	private int width;

	@JacksonXmlProperty(isAttribute=true, localName = "Height")
	@Description("The number of pixels in height (T) direction.")
	@Required()
	@Guid("a3532256-2664-419d-969d-74405b430ee1")
	private int height;

	@JacksonXmlProperty(isAttribute=true, localName = "ColourComponents")
	@Description("Indication whether the pixel values contain a 1, 2, 3, or 4 colour component.")
	@Required()
	@Guid("08c0022b-a713-47e4-9ab3-dd65531b1ddd")
	private int colourComponents;

	@JacksonXmlProperty(isAttribute=true, localName = "Pixel")
	@Description("Flat list of hexadecimal values, each describing one pixel by 1, 2, 3, or 4 components.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The data type has been changed from STRING to BINARY.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("1a84a3b7-3dbb-4e1d-8775-f1a24ef74498")
	private List<Byte[]> pixel = new ArrayList<Byte[]>();


	public IfcPixelTexture()
	{
	}

	public IfcPixelTexture(Boolean repeatS, Boolean repeatT, int width, int height, int colourComponents, Byte[][] pixel)
	{
		super(repeatS, repeatT);
		this.width = width;
		this.height = height;
		this.colourComponents = colourComponents;
		this.pixel = new ArrayList<>(Arrays.asList(pixel));
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getColourComponents() {
		return this.colourComponents;
	}

	public void setColourComponents(int colourComponents) {
		this.colourComponents = colourComponents;
	}

	public List<Byte[]> getPixel() {
		return this.pixel;
	}


}

