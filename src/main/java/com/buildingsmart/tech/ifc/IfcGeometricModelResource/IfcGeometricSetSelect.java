// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("cdeabfac-137c-4475-97a5-4e5e68c74ee9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPoint.class, name = "IfcPoint"),
        @JsonSubTypes.Type(value = IfcCurve.class, name = "IfcCurve"),
        @JsonSubTypes.Type(value = IfcSurface.class, name = "IfcSurface")})
public interface IfcGeometricSetSelect {

    @JsonIgnore
    int Dim = 0;

    @JsonIgnore
    public default int getDim() {
        return Dim;
    }

}
