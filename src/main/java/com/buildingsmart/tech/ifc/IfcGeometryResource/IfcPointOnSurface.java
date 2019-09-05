// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a7b0a4ed-3952-415a-b428-67b95e5273cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPointOnSurface extends IfcPoint
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	@Description("The surface to which the parameter values relate.")
	@Required()
	@Guid("3415acd6-19b0-4948-8be2-d4f419ace10a")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface;

	@JacksonXmlProperty(isAttribute=true, localName = "PointParameterU")
	@Description("The first parameter value of the point location.")
	@Required()
	@Guid("62ebc5bd-a118-4934-ba4c-12ee902e0f49")
	private double pointParameterU;

	@JacksonXmlProperty(isAttribute=true, localName = "PointParameterV")
	@Description("The second parameter value of the point location.")
	@Required()
	@Guid("8e50f05b-a118-43a2-89da-73538af766d3")
	private double pointParameterV;


	public IfcPointOnSurface()
	{
	}

	public IfcPointOnSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface, double pointParameterU, double pointParameterV)
	{
		this.basisSurface = basisSurface;
		this.pointParameterU = pointParameterU;
		this.pointParameterV = pointParameterV;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public double getPointParameterU() {
		return this.pointParameterU;
	}

	public void setPointParameterU(double pointParameterU) {
		this.pointParameterU = pointParameterU;
	}

	public double getPointParameterV() {
		return this.pointParameterV;
	}

	public void setPointParameterV(double pointParameterV) {
		this.pointParameterV = pointParameterV;
	}

	public int getDim() {
		return 0;
	}


}

