// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("f5095cfb-b085-4d65-82d7-98a1958e8fca")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFacetedBrepWithVoids extends IfcFacetedBrep
{
	@Description("Set of closed shells defining voids within the solid.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8dc8167e-935a-434f-b223-97e3c9d2b1ac")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcClosedShell")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "voids")
	private Set<IfcClosedShell> voids;


	public IfcFacetedBrepWithVoids()
	{
	}

	public IfcFacetedBrepWithVoids(IfcClosedShell outer, IfcClosedShell[] voids)
	{
		super(outer);
		this.voids = new HashSet<>(Arrays.asList(voids));
	}

	public Set<IfcClosedShell> getVoids() {
		return this.voids;
	}


}

