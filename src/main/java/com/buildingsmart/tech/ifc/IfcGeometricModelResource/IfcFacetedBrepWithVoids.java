// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f5095cfb-b085-4d65-82d7-98a1958e8fca")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFacetedBrepWithVoids extends IfcFacetedBrep
{
	@Description("Set of closed shells defining voids within the solid.")
	@Required()
	@MinLength(1)
	@Guid("8dc8167e-935a-434f-b223-97e3c9d2b1ac")
	private Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell> voids = new HashSet<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell>();


	public IfcFacetedBrepWithVoids()
	{
	}

	public IfcFacetedBrepWithVoids(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell[] voids)
	{
		super(outer);
		this.voids = new HashSet<>(Arrays.asList(voids));
	}

	public Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell> getVoids() {
		return this.voids;
	}


}

