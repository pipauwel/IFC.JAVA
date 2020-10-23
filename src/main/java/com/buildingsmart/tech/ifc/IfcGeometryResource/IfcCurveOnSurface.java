// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("60c201d8-3bb0-405e-b8ca-0c7f16a230ec")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCompositeCurveOnSurface.class, name = "IfcCompositeCurveOnSurface"),
        @JsonSubTypes.Type(value = IfcPcurve.class, name = "IfcPcurve"),
        @JsonSubTypes.Type(value = IfcSurfaceCurve.class, name = "IfcSurfaceCurve")})
public interface IfcCurveOnSurface {

}
