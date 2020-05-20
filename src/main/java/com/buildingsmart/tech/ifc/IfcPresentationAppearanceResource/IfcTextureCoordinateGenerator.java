// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("0fa823f7-9891-4859-929d-fe07f0663bb1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureCoordinateGenerator extends IfcTextureCoordinate
{
	@Description("The <em>Mode</em> attribute describes the algorithm used to compute texture coordinates.  <blockquote class=\"note\">NOTE&nbsp; The applicable values for the <em>Mode</em> attribute are determined by view definitions or implementer agreements. It is recommended to use the modes described in ISO/IES 19775-1.2:2008 X3D Architecture and base components Edition 2, Part 1. See <a href=\"http://www.web3d.org/x3d/specifications/ISO-IEC-19775-1.2-X3D-AbstractSpecification/Part01/components/texturing.html#TextureCoordinateGenerator\">18.4.8 TextureCoordinateGenerator</a> for recommended values.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("7881c0af-c083-42e5-bef6-981a56c60790")
	@JacksonXmlProperty(isAttribute=false, localName = "mode")
	private IfcLabel mode;

	@Description("The parameters used as arguments by the function as specified by <em>Mode</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp: Data type restricted to REAL.</blockquote>")
	@DataMember(Order = 1)
	@Guid("6756099b-f4ef-4408-857e-ae08f1604202")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "parameter")
	private List<IfcReal> parameter;


	public IfcTextureCoordinateGenerator()
	{
	}

	public IfcTextureCoordinateGenerator(IfcSurfaceTexture[] maps, IfcLabel mode)
	{
		super(maps);
		this.mode = mode;
	}

	public IfcLabel getMode() {
		return this.mode;
	}

	public void setMode(IfcLabel mode) {
		this.mode = mode;
	}

	public List<IfcReal> getParameter() {
		return this.parameter;
	}


}

