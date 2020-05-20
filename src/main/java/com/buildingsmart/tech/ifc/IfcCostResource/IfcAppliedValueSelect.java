// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcCostResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcReference;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Guid("24072442-9a47-4e97-ba45-6a5cb86a46af")
@JsonIgnoreProperties(ignoreUnknown=true)
/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")*/
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMeasureWithUnit.class, name = "IfcMeasureWithUnit"),
        @JsonSubTypes.Type(value = IfcValue.class, name = "IfcValue"),
        @JsonSubTypes.Type(value = IfcReference.class, name = "IfcReference")})
public interface IfcAppliedValueSelect {

}
