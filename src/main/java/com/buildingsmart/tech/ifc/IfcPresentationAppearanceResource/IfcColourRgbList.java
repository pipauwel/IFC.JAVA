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

@Guid("02b8b9ac-609f-4e13-8a54-94743a93eebf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcColourRgbList extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("List of colours defined by the red, green, blue components. All values are provided as a ratio of 0.0 &le; <i>value</i> &le; 1.0. When using 8bit for each colour channel, a value of 0.0 equals 0, a value of 1.0 equals 255, and values between are interpolated.")
	@Required()
	@MinLength(1)
	@Guid("711ff0f4-b696-4f47-8b2d-4c5df0a1d1fb")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure> colourList = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure>();


	public IfcColourRgbList()
	{
	}

	public IfcColourRgbList(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure[] colourList)
	{
		this.colourList = new ArrayList<>(Arrays.asList(colourList));
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure> getColourList() {
		return this.colourList;
	}


}

