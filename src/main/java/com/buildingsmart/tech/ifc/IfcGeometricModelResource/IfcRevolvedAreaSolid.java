// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("81970f2f-c63e-4133-adaf-c74d522cb449")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "Axis")
	@Description("Axis about which revolution will take place.")
	@Required()
	@Guid("7d721792-8d9e-4a49-84d2-65251bbed28a")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axis;

	@JacksonXmlProperty(isAttribute=true, localName = "Angle")
	@Description("The angle through which the sweep will be made. This angle is measured from the plane of the swept area provided by the XY plane of the position coordinate system.")
	@Required()
	@Guid("1119b572-18c2-4c9a-b4cf-e146b2426614")
	private double angle;


	public IfcRevolvedAreaSolid()
	{
	}

	public IfcRevolvedAreaSolid(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axis, double angle)
	{
		super(sweptArea);
		this.axis = axis;
		this.angle = angle;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement getAxis() {
		return this.axis;
	}

	public void setAxis(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axis) {
		this.axis = axis;
	}

	public double getAngle() {
		return this.angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcLine getAxisLine() {
		return null;
	}


}

