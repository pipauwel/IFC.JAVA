// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("c561b140-ae11-4c30-a795-c1dddbbb9710")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcNonNegativeLengthMeasure implements IfcMeasureValue {
	public double value;

	public IfcNonNegativeLengthMeasure() {
	}

	public IfcNonNegativeLengthMeasure(double value) {
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

