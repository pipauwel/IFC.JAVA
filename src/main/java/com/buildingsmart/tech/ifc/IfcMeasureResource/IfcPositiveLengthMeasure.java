// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("3a9ab3fb-6071-423b-afb3-b5d134501151")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcPositiveLengthMeasure
	extends IfcLengthMeasure
		implements IfcHatchLineDistanceSelect, IfcSizeSelect, IfcMeasureValue {

	public IfcPositiveLengthMeasure() {
		super();
	}

	public IfcPositiveLengthMeasure(Double value) {
		super(value);
	}
}

