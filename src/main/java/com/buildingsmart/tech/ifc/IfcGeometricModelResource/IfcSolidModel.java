// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("6a71ad06-e92c-4e8d-bb08-441d03da182e")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSolidModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSolidOrShell
{

	public IfcSolidModel()
	{
	}

	public int getDim() {
		return 0;
	}


}

