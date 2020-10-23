// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("1de4c14b-c3b0-4dab-9526-6208b17404f9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSolidModel.class, name = "IfcSolidModel"),
        @JsonSubTypes.Type(value = IfcHalfSpaceSolid.class, name = "IfcHalfSpaceSolid"),
        @JsonSubTypes.Type(value = IfcBooleanResult.class, name = "IfcBooleanResult"),
        @JsonSubTypes.Type(value = IfcCsgPrimitive3D.class, name = "IfcCsgPrimitive3D"),
        @JsonSubTypes.Type(value = IfcTessellatedFaceSet.class, name = "IfcTessellatedFaceSet")})
public interface IfcBooleanOperand {


}
