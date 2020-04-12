// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("08cf6c24-bc6e-48f6-9489-b299eb1c08e2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOpenShell extends IfcConnectedFaceSet implements IfcShell
{

	public IfcOpenShell()
	{
	}

	public IfcOpenShell(IfcFace[] cfsFaces)
	{
		super(cfsFaces);
	}


}

