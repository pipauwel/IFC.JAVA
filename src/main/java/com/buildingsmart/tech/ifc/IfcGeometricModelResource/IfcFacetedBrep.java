// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcFacetedBrepWithVoids;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcManifoldSolidBrep;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell;

@Guid("0bee23f3-91ff-4b45-a475-cb0cd78a0a04")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcFacetedBrepWithVoids.class, name = "IfcFacetedBrepWithVoids"))
public class IfcFacetedBrep extends IfcManifoldSolidBrep
{

	public IfcFacetedBrep()
	{
	}

	public IfcFacetedBrep(IfcClosedShell outer)
	{
		super(outer);
	}


}

