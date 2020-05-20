// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("69ad77b0-c3d0-4a22-bdb8-a46a12871aa3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFont extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcCurveStyleFontSelect
{
	@Description("Name that may be assigned with the curve font.")
	@DataMember(Order = 0)
	@Guid("f3035910-9ab1-4acd-b0f1-6741b0b648b1")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("A list of curve font pattern entities, that contains the simple patterns used for drawing curves. The patterns are applied in the order they occur in the list.")
	@DataMember(Order = 1)
	@Required()
	@Guid("785fa854-1775-4850-a22b-d63225b3b864")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCurveStyleFontPattern")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "patternList")
	private List<IfcCurveStyleFontPattern> patternList;


	public IfcCurveStyleFont()
	{
	}

	public IfcCurveStyleFont(IfcCurveStyleFontPattern[] patternList)
	{
		this.patternList = new ArrayList<>(Arrays.asList(patternList));
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public List<IfcCurveStyleFontPattern> getPatternList() {
		return this.patternList;
	}


}

