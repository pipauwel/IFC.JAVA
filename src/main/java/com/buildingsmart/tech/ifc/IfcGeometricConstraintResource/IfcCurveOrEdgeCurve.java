// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdgeCurve;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("36ccfa6b-979b-4044-985f-15545c0738d7")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundedCurve.class, name = "IfcBoundedCurve"),
        @JsonSubTypes.Type(value = IfcEdgeCurve.class, name = "IfcEdgeCurve")})
public interface IfcCurveOrEdgeCurve {

}
