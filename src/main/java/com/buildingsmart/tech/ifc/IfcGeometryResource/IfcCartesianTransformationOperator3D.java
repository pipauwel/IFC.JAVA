// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("137f3407-b6b9-4752-b668-e9e574a1b3fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator
{
	@JacksonXmlProperty(isAttribute=false, localName = "Axis3")
	@Description("The exact direction of U[3], the derived Z axis direction.")
	@Guid("42759c76-3cfb-44fb-9a58-78c6f7c1c245")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis3;


	public IfcCartesianTransformationOperator3D()
	{
	}

	public IfcCartesianTransformationOperator3D(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getAxis3() {
		return this.axis3;
	}

	public void setAxis3(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis3) {
		this.axis3 = axis3;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection> getU() {
		return null;
	}


}

