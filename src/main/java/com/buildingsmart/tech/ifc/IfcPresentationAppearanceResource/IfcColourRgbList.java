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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure;

@Guid("02b8b9ac-609f-4e13-8a54-94743a93eebf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcColourRgbList extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("List of colours defined by the red, green, blue components. All values are provided as a ratio of 0.0 &le; <i>value</i> &le; 1.0. When using 8bit for each colour channel, a value of 0.0 equals 0, a value of 1.0 equals 255, and values between are interpolated.")
	@Required()
	@Guid("711ff0f4-b696-4f47-8b2d-4c5df0a1d1fb")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcNormalisedRatioMeasure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ColourList")
	private List<IfcNormalisedRatioMeasure> colourList;


	public IfcColourRgbList()
	{
	}

	public IfcColourRgbList(IfcNormalisedRatioMeasure[] colourList)
	{
		this.colourList = new ArrayList<>(Arrays.asList(colourList));
	}

	public List<IfcNormalisedRatioMeasure> getColourList() {
		return this.colourList;
	}


}

