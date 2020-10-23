// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Guid("08136c24-2758-4351-a3d0-7b40b8a7c5ad")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSubTypes({@JsonSubTypes.Type(value = IfcInteger.class, name = "IfcInteger"),
        @JsonSubTypes.Type(value = IfcReal.class, name = "IfcReal"),
        @JsonSubTypes.Type(value = IfcBoolean.class, name = "IfcBoolean"),
        @JsonSubTypes.Type(value = IfcIdentifier.class, name = "IfcIdentifier"),
        @JsonSubTypes.Type(value = IfcText.class, name = "IfcText"),
        @JsonSubTypes.Type(value = IfcLabel.class, name = "IfcLabel"),
        @JsonSubTypes.Type(value = IfcLogical.class, name = "IfcLogical"),
        @JsonSubTypes.Type(value = IfcDateTime.class, name = "IfcDateTime"),
        @JsonSubTypes.Type(value = IfcDate.class, name = "IfcDate"),
        @JsonSubTypes.Type(value = IfcTime.class, name = "IfcTime"),
        @JsonSubTypes.Type(value = IfcDuration.class, name = "IfcDuration"),
        @JsonSubTypes.Type(value = IfcTimeStamp.class, name = "IfcTimeStamp"),
        @JsonSubTypes.Type(value = IfcPositiveInteger.class, name = "IfcPositiveInteger"),
        @JsonSubTypes.Type(value = IfcBinary.class, name = "IfcBinary")})
public interface IfcSimpleValue extends IfcValue {

}
