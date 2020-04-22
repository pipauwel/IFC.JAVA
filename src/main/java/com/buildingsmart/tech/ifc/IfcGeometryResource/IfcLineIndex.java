// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0590099d-fe4d-40ba-ae80-71803e5902d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLineIndex implements IfcSegmentIndexSelect {
	public double value; //IfcPositiveInteger

	public IfcLineIndex() {
	}

	public IfcLineIndex(double value) {
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

