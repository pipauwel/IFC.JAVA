// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("6a71ad06-e92c-4e8d-bb08-441d03da182e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCsgSolid.class, name = "IfcCsgSolid"), @JsonSubTypes.Type(value = IfcManifoldSolidBrep.class, name = "IfcManifoldSolidBrep"), @JsonSubTypes.Type(value = IfcSweptAreaSolid.class, name = "IfcSweptAreaSolid"), @JsonSubTypes.Type(value = IfcSweptDiskSolid.class, name = "IfcSweptDiskSolid")})
public abstract class IfcSolidModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSolidOrShell
{

	public IfcSolidModel()
	{
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}


}

