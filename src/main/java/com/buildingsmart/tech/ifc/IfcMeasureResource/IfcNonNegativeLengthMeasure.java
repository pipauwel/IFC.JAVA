// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("c561b140-ae11-4c30-a795-c1dddbbb9710")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcNonNegativeLengthMeasure extends IfcLengthMeasure implements IfcMeasureValue {

    public IfcNonNegativeLengthMeasure()
    {
        super();
    }

    public IfcNonNegativeLengthMeasure(Double value)
    {
        super(value);
    }
}


