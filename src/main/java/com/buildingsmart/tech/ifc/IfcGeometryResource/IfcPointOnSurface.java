// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcParameterValue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a7b0a4ed-3952-415a-b428-67b95e5273cd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPointOnSurface extends IfcPoint
{
	@Description("The surface to which the parameter values relate.")
	@DataMember(Order = 0)
	@Required()
	@Guid("3415acd6-19b0-4948-8be2-d4f419ace10a")
	@JacksonXmlProperty(isAttribute=false, localName = "basisSurface")
	private IfcSurface basisSurface;

	@Description("The first parameter value of the point location.")
	@DataMember(Order = 1)
	@Required()
	@Guid("62ebc5bd-a118-4934-ba4c-12ee902e0f49")
	@JacksonXmlProperty(isAttribute=false, localName = "pointParameterU")
	private IfcParameterValue pointParameterU;

	@Description("The second parameter value of the point location.")
	@DataMember(Order = 2)
	@Required()
	@Guid("8e50f05b-a118-43a2-89da-73538af766d3")
	@JacksonXmlProperty(isAttribute=false, localName = "pointParameterV")
	private IfcParameterValue pointParameterV;


	public IfcPointOnSurface()
	{
	}

	public IfcPointOnSurface(IfcSurface basisSurface, IfcParameterValue pointParameterU, IfcParameterValue pointParameterV)
	{
		this.basisSurface = basisSurface;
		this.pointParameterU = pointParameterU;
		this.pointParameterV = pointParameterV;
	}

	public IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public IfcParameterValue getPointParameterU() {
		return this.pointParameterU;
	}

	public void setPointParameterU(IfcParameterValue pointParameterU) {
		this.pointParameterU = pointParameterU;
	}

	public IfcParameterValue getPointParameterV() {
		return this.pointParameterV;
	}

	public void setPointParameterV(IfcParameterValue pointParameterV) {
		this.pointParameterV = pointParameterV;
	}

	@JsonIgnore
	public int getDim() {
		//Dim:=BasisSurface.Dim
		return basisSurface.getDim();
	}


}

