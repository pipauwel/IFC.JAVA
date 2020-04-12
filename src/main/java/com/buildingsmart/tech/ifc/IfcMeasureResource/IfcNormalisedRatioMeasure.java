// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("3bb00789-25bf-4fc4-a8fa-d4282e28b0bc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcNormalisedRatioMeasure implements com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor, IfcMeasureValue, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect {
	public double value;

	public IfcNormalisedRatioMeasure() {
	}

	public IfcNormalisedRatioMeasure(double value) {
		this();
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}

