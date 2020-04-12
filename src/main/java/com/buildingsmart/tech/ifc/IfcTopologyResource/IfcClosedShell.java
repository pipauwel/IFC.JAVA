// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("01f6c44b-bfef-48bb-9d8e-476e51d90d2a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcClosedShell extends IfcConnectedFaceSet implements IfcShell, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSolidOrShell
{

	public IfcClosedShell()
	{
	}

	public IfcClosedShell(IfcFace[] cfsFaces)
	{
		super(cfsFaces);
	}


}

