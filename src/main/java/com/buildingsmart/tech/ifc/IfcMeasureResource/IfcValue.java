// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("f68c7711-a24f-4f76-9bad-5c2ae98a849b")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMeasureValue.class, name = "IfcMeasureValue"),
        @JsonSubTypes.Type(value = IfcSimpleValue.class, name = "IfcSimpleValue"),
        @JsonSubTypes.Type(value = IfcDerivedMeasureValue.class, name = "IfcDerivedMeasureValue")})
@JsonIgnoreProperties(ignoreUnknown=true)
public interface IfcValue extends com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect {

}
