// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace;

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

