// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("44ff2ba0-d8b9-466c-9dba-d297766c680f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMirroredProfileDef extends IfcDerivedProfileDef
{

	public IfcMirroredProfileDef()
	{
	}

	public IfcMirroredProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef parentProfile, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D _operator)
	{
		super(profileType, parentProfile, _operator);
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D getOperator() {
		return null;
	}


}

