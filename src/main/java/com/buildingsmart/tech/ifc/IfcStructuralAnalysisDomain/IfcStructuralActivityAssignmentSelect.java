// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("9f0a92c2-e06f-476c-9082-a274a4534f8c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralItem.class, name = "IfcStructuralItem"),
        @JsonSubTypes.Type(value = IfcElement.class, name = "IfcElement")})
public interface IfcStructuralActivityAssignmentSelect {

}
