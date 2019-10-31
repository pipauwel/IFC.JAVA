// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontSelect;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;

@Guid("9425eabf-9005-4536-ab59-ff8756b189e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFontAndScaling extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcCurveFontOrScaledCurveFontSelect
{
	@Description("Name that may be assigned with the scaling of a curve font.")
	@Guid("102deb25-5be7-4b30-87d6-7d766394da0f")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("The curve font to be scaled.")
	@Required()
	@Guid("387b5a7f-e66e-460e-bbdb-7aef07475f14")
	@JacksonXmlProperty(isAttribute=true, localName = "CurveFont")
	private IfcCurveStyleFontSelect curveFont;

	@Description("The scale factor.")
	@Required()
	@Guid("4b64232e-b6ee-4e8f-b6e2-925e172f2dcf")
	@JacksonXmlProperty(isAttribute=false, localName = "CurveFontScaling")
	private IfcPositiveRatioMeasure curveFontScaling;


	public IfcCurveStyleFontAndScaling()
	{
	}

	public IfcCurveStyleFontAndScaling(IfcCurveStyleFontSelect curveFont, IfcPositiveRatioMeasure curveFontScaling)
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

	public IfcCurveStyleFontSelect getCurveFont() {
		return this.curveFont;
	}

	public void setCurveFont(IfcCurveStyleFontSelect curveFont) {
		this.curveFont = curveFont;
	}

	public IfcPositiveRatioMeasure getCurveFontScaling() {
		return this.curveFontScaling;
	}

	public void setCurveFontScaling(IfcPositiveRatioMeasure curveFontScaling) {
		this.curveFontScaling = curveFontScaling;
	}


}

