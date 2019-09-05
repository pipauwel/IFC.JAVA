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

@Guid("69ad77b0-c3d0-4a22-bdb8-a46a12871aa3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFont extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcCurveStyleFontSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name that may be assigned with the curve font.")
	@Guid("f3035910-9ab1-4acd-b0f1-6741b0b648b1")
	private String name;

	@Description("A list of curve font pattern entities, that contains the simple patterns used for drawing curves. The patterns are applied in the order they occur in the list.")
	@Required()
	@MinLength(1)
	@Guid("785fa854-1775-4850-a22b-d63225b3b864")
	private List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern> patternList = new ArrayList<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern>();


	public IfcCurveStyleFont()
	{
	}

	public IfcCurveStyleFont(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern[] patternList)
	{
		this.patternList = new ArrayList<>(Arrays.asList(patternList));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern> getPatternList() {
		return this.patternList;
	}


}

