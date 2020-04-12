// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("e21bb052-877a-4087-b7fe-777b1b835f72")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralLoadLinearForce.class, name = "IfcStructuralLoadLinearForce"), @JsonSubTypes.Type(value = IfcStructuralLoadPlanarForce.class, name = "IfcStructuralLoadPlanarForce"), @JsonSubTypes.Type(value = IfcStructuralLoadSingleDisplacement.class, name = "IfcStructuralLoadSingleDisplacement"), @JsonSubTypes.Type(value = IfcStructuralLoadSingleForce.class, name = "IfcStructuralLoadSingleForce"), @JsonSubTypes.Type(value = IfcStructuralLoadTemperature.class, name = "IfcStructuralLoadTemperature")})
public abstract class IfcStructuralLoadStatic extends IfcStructuralLoadOrResult
{

	public IfcStructuralLoadStatic()
	{
	}


}

