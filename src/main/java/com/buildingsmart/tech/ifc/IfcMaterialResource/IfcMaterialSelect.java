// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("a93907b4-ef59-4f01-b47a-6ca30ea1b3df")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialUsageDefinition.class, name = "IfcMaterialUsageDefinition"),
        @JsonSubTypes.Type(value = IfcMaterialDefinition.class, name = "IfcMaterialDefinition"),
        @JsonSubTypes.Type(value = IfcMaterialDefinition.class, name = "IfcMaterialList")})
public interface IfcMaterialSelect {

}
