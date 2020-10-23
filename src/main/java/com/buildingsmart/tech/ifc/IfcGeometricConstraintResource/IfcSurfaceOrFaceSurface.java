// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcFaceBasedSurfaceModel;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceSurface;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("ffffd83f-8f15-441c-a96e-3757e927a482")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSurface.class, name = "IfcSurface"),
        @JsonSubTypes.Type(value = IfcFaceSurface.class, name = "IfcFaceSurface"),
        @JsonSubTypes.Type(value = IfcFaceBasedSurfaceModel.class, name = "IfcFaceBasedSurfaceModel")})
public interface IfcSurfaceOrFaceSurface {

}
