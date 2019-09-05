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

@Guid("fee86dc6-fa63-40dc-b7c9-cde3957f7e9e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGeometricSet extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The geometric elements which make up the geometric set, these may be points, curves or surfaces; but are required to be of the same coordinate space dimensionality.")
	@Required()
	@MinLength(1)
	@Guid("2fbfb910-86f0-40a1-bc8c-23b799cd1b0c")
	private Set<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect> elements = new HashSet<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect>();


	public IfcGeometricSet()
	{
	}

	public IfcGeometricSet(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect[] elements)
	{
		this.elements = new HashSet<>(Arrays.asList(elements));
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect> getElements() {
		return this.elements;
	}

	public int getDim() {
		return 0;
	}


}

