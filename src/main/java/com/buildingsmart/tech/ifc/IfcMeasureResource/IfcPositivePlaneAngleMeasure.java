// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("40cd7167-2011-405e-82f9-f6af73ed3182")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcPositivePlaneAngleMeasure
        extends IfcPlaneAngleMeasure
        implements IfcMeasureValue {

	public IfcPositivePlaneAngleMeasure() {
	    super();
	}

	public IfcPositivePlaneAngleMeasure(Double value) {
        super(value);
	}
}

