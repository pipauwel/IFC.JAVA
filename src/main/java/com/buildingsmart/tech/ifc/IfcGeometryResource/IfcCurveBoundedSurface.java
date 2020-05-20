// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("8606dc84-8a2a-415b-8415-b98039c064b8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveBoundedSurface extends IfcBoundedSurface
{
	@Description("The surface to be bounded.")
	@DataMember(Order = 0)
	@Required()
	@Guid("3fb78b2a-7501-4109-b62b-eb4d6ef23c20")
	@JacksonXmlProperty(isAttribute=false, localName = "basisSurface")
	private IfcSurface basisSurface;

	@Description("The outer boundary of the surface.")
	@DataMember(Order = 1)
	@Required()
	@Guid("8cb2201d-35ec-4b4f-9f5a-a1f51db9cb99")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcBoundaryCurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "boundaries")
	private Set<IfcBoundaryCurve> boundaries;

	@DataMember(Order = 2)
	@Required()
	@Guid("9c449e17-4401-4cd1-920d-3ad8685ac7a3")
	@JacksonXmlProperty(isAttribute=false, localName = "implicitOuter")
	private IfcBoolean implicitOuter;


	public IfcCurveBoundedSurface()
	{
	}

	public IfcCurveBoundedSurface(IfcSurface basisSurface, IfcBoundaryCurve[] boundaries, IfcBoolean implicitOuter)
	{
		this.basisSurface = basisSurface;
		this.boundaries = new HashSet<>(Arrays.asList(boundaries));
		this.implicitOuter = implicitOuter;
	}

	public IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public Set<IfcBoundaryCurve> getBoundaries() {
		return this.boundaries;
	}

	public IfcBoolean getImplicitOuter() {
		return this.implicitOuter;
	}

	public void setImplicitOuter(IfcBoolean implicitOuter) {
		this.implicitOuter = implicitOuter;
	}


}

