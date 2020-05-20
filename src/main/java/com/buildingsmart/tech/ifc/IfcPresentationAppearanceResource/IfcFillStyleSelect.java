// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("724ff2c5-aa5c-4253-b27b-7b46980f86b0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFillAreaStyleHatching.class, name = "IfcFillAreaStyleHatching"),
        @JsonSubTypes.Type(value = IfcFillAreaStyleTiles.class, name = "IfcFillAreaStyleTiles"),
        @JsonSubTypes.Type(value = IfcExternallyDefinedHatchStyle.class, name = "IfcExternallyDefinedHatchStyle"),
        @JsonSubTypes.Type(value = IfcColour.class, name = "IfcColour")})
public interface IfcFillStyleSelect {

}
