// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("3bb00789-25bf-4fc4-a8fa-d4282e28b0bc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcNormalisedRatioMeasure extends IfcRatioMeasure implements IfcColourOrFactor, IfcSizeSelect, IfcMeasureValue {

    public IfcNormalisedRatioMeasure()
    {
        super();
    }

    public IfcNormalisedRatioMeasure(Double value)
    {
        super(value);
    }

}

