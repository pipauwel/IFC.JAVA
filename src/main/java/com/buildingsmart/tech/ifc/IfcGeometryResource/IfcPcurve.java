// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("dd30ecc9-e76f-48d9-b2d9-5340b2f0c0b8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPcurve extends IfcCurve implements IfcCurveOnSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	@Required()
	@Guid("f38fdab6-e98c-4adb-9126-c3042c4c319e")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface;

	@JacksonXmlProperty(isAttribute=false, localName = "ReferenceCurve")
	@Required()
	@Guid("dc6024e0-af04-459d-857b-4eccd3401110")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve referenceCurve;


	public IfcPcurve()
	{
	}

	public IfcPcurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve referenceCurve)
	{
		this.basisSurface = basisSurface;
		this.referenceCurve = referenceCurve;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getReferenceCurve() {
		return this.referenceCurve;
	}

	public void setReferenceCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve referenceCurve) {
		this.referenceCurve = referenceCurve;
	}


}

