// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("dd30ecc9-e76f-48d9-b2d9-5340b2f0c0b8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPcurve extends IfcCurve implements IfcCurveOnSurface
{
	@DataMember(Order = 0)
	@Required()
	@Guid("f38fdab6-e98c-4adb-9126-c3042c4c319e")
	@JacksonXmlProperty(isAttribute=false, localName = "basisSurface")
	private IfcSurface basisSurface;

	@DataMember(Order = 1)
	@Required()
	@Guid("dc6024e0-af04-459d-857b-4eccd3401110")
	@JacksonXmlProperty(isAttribute=false, localName = "referenceCurve")
	private IfcCurve referenceCurve;


	public IfcPcurve()
	{
	}

	public IfcPcurve(IfcSurface basisSurface, IfcCurve referenceCurve)
	{
		this.basisSurface = basisSurface;
		this.referenceCurve = referenceCurve;
	}

	public IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public IfcCurve getReferenceCurve() {
		return this.referenceCurve;
	}

	public void setReferenceCurve(IfcCurve referenceCurve) {
		this.referenceCurve = referenceCurve;
	}


}

