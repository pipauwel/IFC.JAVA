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

@Guid("26b1240c-4ac9-469d-8fd3-861653fa5f75")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAxis2Placement3D extends IfcPlacement implements IfcAxis2Placement
{
	@JacksonXmlProperty(isAttribute=false, localName = "Axis")
	@Description("The exact direction of the local Z Axis.")
	@Guid("29674702-70eb-4659-a721-8fbac8556be2")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis;

	@JacksonXmlProperty(isAttribute=false, localName = "RefDirection")
	@Description("The direction used to determine the direction of the local X Axis. If necessary an adjustment is made to maintain orthogonality to the Axis direction. If Axis and/or RefDirection is omitted, these directions are taken from the geometric coordinate system.")
	@Guid("469b612b-d3e6-4c60-b682-830211fd3c06")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection refDirection;


	public IfcAxis2Placement3D()
	{
	}

	public IfcAxis2Placement3D(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint location)
	{
		super(location);
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis) {
		this.axis = axis;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getRefDirection() {
		return this.refDirection;
	}

	public void setRefDirection(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection refDirection) {
		this.refDirection = refDirection;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection> getP() {
		return null;
	}


}

