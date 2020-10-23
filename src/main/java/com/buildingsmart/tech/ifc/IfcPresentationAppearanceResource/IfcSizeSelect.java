// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("09895874-48ae-4872-a788-8c4e2d089281")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcValue.class, name = "IfcValue"),
        @JsonSubTypes.Type(value = IfcNormalisedRatioMeasure.class, name = "IfcNormalisedRatioMeasure"),
        @JsonSubTypes.Type(value = IfcRatioMeasure.class, name = "IfcRatioMeasure"),
        @JsonSubTypes.Type(value = IfcLengthMeasure.class, name = "IfcLengthMeasure"),
        @JsonSubTypes.Type(value = IfcDescriptiveMeasure.class, name = "IfcDescriptiveMeasure"),
        @JsonSubTypes.Type(value = IfcPositiveLengthMeasure.class, name = "IfcPositiveLengthMeasure"),
        @JsonSubTypes.Type(value = IfcPositiveRatioMeasure.class, name = "IfcPositiveRatioMeasure")})
public interface IfcSizeSelect {

}
