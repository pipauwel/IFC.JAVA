// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("71ff2a67-6250-4d5e-9756-9ffa2c51aec5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArcIndex implements IfcSegmentIndexSelect {
	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger value;

	public IfcArcIndex() {
	}

	public IfcArcIndex(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger value) {
		this();
		this.value = value;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger getValue() {
		return this.value;
	}

	public void setValue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger value) {
		this.value = value;
	}
}

