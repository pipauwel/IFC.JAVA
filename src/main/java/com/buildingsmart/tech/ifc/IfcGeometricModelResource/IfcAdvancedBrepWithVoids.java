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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcAdvancedBrep;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell;

@Guid("e6acb3a9-e21b-4936-936f-c5e1059a8929")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAdvancedBrepWithVoids extends IfcAdvancedBrep
{
	@DataMember(Order = 0)
	@Required()
	@Guid("b1d3d0d2-7d07-4d41-b0d2-f91d38f1b867")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcClosedShell")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Voids")
	private Set<IfcClosedShell> voids;


	public IfcAdvancedBrepWithVoids()
	{
	}

	public IfcAdvancedBrepWithVoids(IfcClosedShell outer, IfcClosedShell[] voids)
	{
		super(outer);
		this.voids = new HashSet<>(Arrays.asList(voids));
	}

	public Set<IfcClosedShell> getVoids() {
		return this.voids;
	}


}

