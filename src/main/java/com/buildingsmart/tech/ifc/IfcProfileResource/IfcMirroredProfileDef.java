// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("44ff2ba0-d8b9-466c-9dba-d297766c680f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMirroredProfileDef extends IfcDerivedProfileDef
{

	public IfcMirroredProfileDef()
	{
	}

	public IfcMirroredProfileDef(IfcProfileTypeEnum profileType, IfcProfileDef parentProfile, IfcCartesianTransformationOperator2D _operator)
	{
		super(profileType, parentProfile, _operator);
	}

	public IfcCartesianTransformationOperator2D getOperator() {
		//TODO
		//	Operator
		// := IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcCartesianTransformationOperator( -- Axis1 IfcRepresentationItem() ||
		// IfcGeometricRepresentationItem() || IfcDirection([-1., 0.]), -- Axis2 IfcRepresentationItem() || IfcGeometricRepresentationItem() ||
		// IfcDirection([ 0., 1.]), -- LocalOrigin IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcPoint() ||
		// IfcCartesianPoint([0., 0.]), -- Scale 1.) || IfcCartesianTransformationOperator2D()
		return null;
	}


}

