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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcShell;

@Guid("7902e064-e935-455c-850f-6c663485e7cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShellBasedSurfaceModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Required()
	@Guid("6a1da254-4732-409e-83fe-738087426efd")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcShell")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "SbsmBoundary")
	private Set<IfcShell> sbsmBoundary;


	public IfcShellBasedSurfaceModel()
	{
	}

	public IfcShellBasedSurfaceModel(IfcShell[] sbsmBoundary)
	{
		this.sbsmBoundary = new HashSet<>(Arrays.asList(sbsmBoundary));
	}

	public Set<IfcShell> getSbsmBoundary() {
		return this.sbsmBoundary;
	}

	public int getDim() {
		return 0;
	}


}

