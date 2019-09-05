// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8606dc84-8a2a-415b-8415-b98039c064b8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveBoundedSurface extends IfcBoundedSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	@Description("The surface to be bounded.")
	@Required()
	@Guid("3fb78b2a-7501-4109-b62b-eb4d6ef23c20")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface;

	@Description("The outer boundary of the surface.")
	@Required()
	@MinLength(1)
	@Guid("8cb2201d-35ec-4b4f-9f5a-a1f51db9cb99")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundaryCurve> boundaries = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundaryCurve>();

	@JacksonXmlProperty(isAttribute=true, localName = "ImplicitOuter")
	@Required()
	@Guid("9c449e17-4401-4cd1-920d-3ad8685ac7a3")
	private Boolean implicitOuter;


	public IfcCurveBoundedSurface()
	{
	}

	public IfcCurveBoundedSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundaryCurve[] boundaries, Boolean implicitOuter)
	{
		this.basisSurface = basisSurface;
		this.boundaries = new HashSet<>(Arrays.asList(boundaries));
		this.implicitOuter = implicitOuter;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundaryCurve> getBoundaries() {
		return this.boundaries;
	}

	public Boolean getImplicitOuter() {
		return this.implicitOuter;
	}

	public void setImplicitOuter(Boolean implicitOuter) {
		this.implicitOuter = implicitOuter;
	}


}

