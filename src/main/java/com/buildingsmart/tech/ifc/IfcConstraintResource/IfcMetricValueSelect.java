// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeries;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Guid("811ac9ba-e590-4255-9d68-1c9b72181e07")
@JsonIgnoreProperties(ignoreUnknown=true)
/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")*/
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMeasureWithUnit.class, name = "IfcMeasureWithUnit"),
        @JsonSubTypes.Type(value = IfcTable.class, name = "IfcTable"),
        @JsonSubTypes.Type(value = IfcTimeSeries.class, name = "IfcTimeSeries"),
        @JsonSubTypes.Type(value = IfcAppliedValue.class, name = "IfcAppliedValue"),
        @JsonSubTypes.Type(value = IfcValue.class, name = "IfcValue"),
        @JsonSubTypes.Type(value = IfcReference.class, name = "IfcReference")})
public interface IfcMetricValueSelect {

}
