// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Guid("71ff2a67-6250-4d5e-9756-9ffa2c51aec5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArcIndex implements IfcSegmentIndexSelect {
	//TYPE IfcArcIndex = LIST [3:3] OF IfcPositiveInteger;
	//END_TYPE;

	public List<IfcPositiveInteger> value;

	public IfcArcIndex() {
	}

	public List<IfcPositiveInteger> getValue() {
		return this.value;
	}

	public void setValue(List<IfcPositiveInteger> value) {
		this.value = value;
	}
}

