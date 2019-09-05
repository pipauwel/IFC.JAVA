// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0e028f37-2eed-4719-aeca-ab2f49f35a63")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPositiveRatioMeasure implements IfcMeasureValue, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect {
	public double value;

	public IfcPositiveRatioMeasure() {
	}

	public IfcPositiveRatioMeasure(double value) {
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

