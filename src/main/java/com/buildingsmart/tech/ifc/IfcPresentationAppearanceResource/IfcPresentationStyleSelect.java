// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("cb2ecdc5-28dc-4c7e-94e1-11dbad92d4eb")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcNullStyle.class, name = "IfcNullStyle"),
        @JsonSubTypes.Type(value = IfcCurveStyle.class, name = "IfcCurveStyle"),
        @JsonSubTypes.Type(value = IfcFillAreaStyle.class, name = "IfcFillAreaStyle"),
        @JsonSubTypes.Type(value = IfcTextStyle.class, name = "IfcTextStyle"),
        @JsonSubTypes.Type(value = IfcSurfaceStyle.class, name = "IfcSurfaceStyle")})
public interface IfcPresentationStyleSelect {

}
