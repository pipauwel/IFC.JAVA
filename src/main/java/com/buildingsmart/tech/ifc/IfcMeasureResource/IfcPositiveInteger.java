// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("b8fda749-c537-47d2-8f9c-2a65f3604a3d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPositiveInteger implements IfcSimpleValue {
	public int value;

	public IfcPositiveInteger() {
	}

	public IfcPositiveInteger(int value) {
		this();
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

