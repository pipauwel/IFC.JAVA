// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("a6eb852d-2266-484e-b385-16dab2770609")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBooleanClippingResult extends IfcBooleanResult
{

	public IfcBooleanClippingResult()
	{
	}

	public IfcBooleanClippingResult(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator _operator, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand firstOperand, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand secondOperand)
	{
		super(_operator, firstOperand, secondOperand);
	}


}

