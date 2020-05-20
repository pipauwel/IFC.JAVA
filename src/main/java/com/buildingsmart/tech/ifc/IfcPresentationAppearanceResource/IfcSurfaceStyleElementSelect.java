// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("fc2c7f30-6c0c-4fd2-8b10-75c158637472")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSurfaceStyleShading.class, name = "IfcSurfaceStyleShading"),
        @JsonSubTypes.Type(value = IfcSurfaceStyleLighting.class, name = "IfcSurfaceStyleLighting"),
        @JsonSubTypes.Type(value = IfcSurfaceStyleWithTextures.class, name = "IfcSurfaceStyleWithTextures"),
        @JsonSubTypes.Type(value = IfcExternallyDefinedSurfaceStyle.class, name = "IfcExternallyDefinedSurfaceStyle"),
        @JsonSubTypes.Type(value = IfcSurfaceStyleRefraction.class, name = "IfcSurfaceStyleRefraction")})
public interface IfcSurfaceStyleElementSelect {

}
