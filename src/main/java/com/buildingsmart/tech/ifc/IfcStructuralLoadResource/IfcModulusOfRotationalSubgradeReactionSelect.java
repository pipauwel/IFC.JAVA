// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcModulusOfRotationalSubgradeReactionMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("317f2b3b-e9d3-4027-9bb8-aaa491ecbd44")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoolean.class, name = "IfcBoolean"),
        @JsonSubTypes.Type(value = IfcModulusOfRotationalSubgradeReactionMeasure.class, name = "IfcModulusOfRotationalSubgradeReactionMeasure")})
public interface IfcModulusOfRotationalSubgradeReactionSelect {

}
