// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("7902e064-e935-455c-850f-6c663485e7cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShellBasedSurfaceModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Required()
	@MinLength(1)
	@Guid("6a1da254-4732-409e-83fe-738087426efd")
	private Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcShell> sbsmBoundary = new HashSet<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcShell>();


	public IfcShellBasedSurfaceModel()
	{
	}

	public IfcShellBasedSurfaceModel(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcShell[] sbsmBoundary)
	{
		this.sbsmBoundary = new HashSet<>(Arrays.asList(sbsmBoundary));
	}

	public Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcShell> getSbsmBoundary() {
		return this.sbsmBoundary;
	}

	public int getDim() {
		return 0;
	}


}

