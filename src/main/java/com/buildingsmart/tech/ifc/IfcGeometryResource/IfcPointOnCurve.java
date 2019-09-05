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

@Guid("48ccc19b-d9f1-4207-af14-8d7c8eafab3b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPointOnCurve extends IfcPoint
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisCurve")
	@Description("The curve to which point parameter relates.")
	@Required()
	@Guid("23610d14-c492-4d05-b307-e083998c52f8")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve;

	@JacksonXmlProperty(isAttribute=true, localName = "PointParameter")
	@Description("The parameter value of the point location.")
	@Required()
	@Guid("5ee320ad-16c4-44d7-a272-c4c6f7d2deb2")
	private double pointParameter;


	public IfcPointOnCurve()
	{
	}

	public IfcPointOnCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve, double pointParameter)
	{
		this.basisCurve = basisCurve;
		this.pointParameter = pointParameter;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve basisCurve) {
		this.basisCurve = basisCurve;
	}

	public double getPointParameter() {
		return this.pointParameter;
	}

	public void setPointParameter(double pointParameter) {
		this.pointParameter = pointParameter;
	}

	public int getDim() {
		return 0;
	}


}

