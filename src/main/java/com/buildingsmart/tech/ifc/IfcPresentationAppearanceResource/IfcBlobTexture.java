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

@Guid("6f3625b4-6b27-4ac2-8c49-34b2079baf0c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBlobTexture extends IfcSurfaceTexture
{
	@JacksonXmlProperty(isAttribute=true, localName = "RasterFormat")
	@Description("The format of the <em>RasterCode</em> often using a compression.")
	@Required()
	@Guid("cc5e35b1-16ee-455a-aece-ce1cd7148396")
	private String rasterFormat;

	@JacksonXmlProperty(isAttribute=true, localName = "RasterCode")
	@Description("Blob, given as a single binary, to capture the texture within one popular file (compression) format. The file format is provided by the <em>RasterFormat</em> attribute.")
	@Required()
	@Guid("d73b45d5-03ef-42a4-80f8-40956c1ed197")
	private Byte[] rasterCode;


	public IfcBlobTexture()
	{
	}

	public IfcBlobTexture(Boolean repeatS, Boolean repeatT, String rasterFormat, Byte[] rasterCode)
	{
		super(repeatS, repeatT);
		this.rasterFormat = rasterFormat;
		this.rasterCode = rasterCode;
	}

	public String getRasterFormat() {
		return this.rasterFormat;
	}

	public void setRasterFormat(String rasterFormat) {
		this.rasterFormat = rasterFormat;
	}

	public Byte[] getRasterCode() {
		return this.rasterCode;
	}

	public void setRasterCode(Byte[] rasterCode) {
		this.rasterCode = rasterCode;
	}


}

