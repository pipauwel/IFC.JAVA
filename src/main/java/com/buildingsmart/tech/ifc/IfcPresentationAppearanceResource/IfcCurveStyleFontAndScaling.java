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

@Guid("9425eabf-9005-4536-ab59-ff8756b189e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFontAndScaling extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcCurveFontOrScaledCurveFontSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name that may be assigned with the scaling of a curve font.")
	@Guid("102deb25-5be7-4b30-87d6-7d766394da0f")
	private String name;

	@Description("The curve font to be scaled.")
	@Required()
	@Guid("387b5a7f-e66e-460e-bbdb-7aef07475f14")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontSelect curveFont;

	@JacksonXmlProperty(isAttribute=true, localName = "CurveFontScaling")
	@Description("The scale factor.")
	@Required()
	@Guid("4b64232e-b6ee-4e8f-b6e2-925e172f2dcf")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure curveFontScaling;


	public IfcCurveStyleFontAndScaling()
	{
	}

	public IfcCurveStyleFontAndScaling(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontSelect curveFont, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure curveFontScaling)
	{
		this.curveFont = curveFont;
		this.curveFontScaling = curveFontScaling;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontSelect getCurveFont() {
		return this.curveFont;
	}

	public void setCurveFont(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontSelect curveFont) {
		this.curveFont = curveFont;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getCurveFontScaling() {
		return this.curveFontScaling;
	}

	public void setCurveFontScaling(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure curveFontScaling) {
		this.curveFontScaling = curveFontScaling;
	}


}

