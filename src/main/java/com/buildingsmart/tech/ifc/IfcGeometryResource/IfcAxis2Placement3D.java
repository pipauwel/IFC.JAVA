// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("26b1240c-4ac9-469d-8fd3-861653fa5f75")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAxis2Placement3D extends IfcPlacement implements IfcAxis2Placement
{
	@Description("The exact direction of the local Z Axis.")
	@DataMember(Order = 0)
	@Guid("29674702-70eb-4659-a721-8fbac8556be2")
	@JacksonXmlProperty(isAttribute=false, localName = "axis")
	private IfcDirection axis;

	@Description("The direction used to determine the direction of the local X Axis. If necessary an adjustment is made to maintain orthogonality to the Axis direction. If Axis and/or RefDirection is omitted, these directions are taken from the geometric coordinate system.")
	@DataMember(Order = 1)
	@Guid("469b612b-d3e6-4c60-b682-830211fd3c06")
	@JacksonXmlProperty(isAttribute=false, localName = "refDirection")
	private IfcDirection refDirection;


	public IfcAxis2Placement3D()
	{
	}

	public IfcAxis2Placement3D(IfcCartesianPoint location)
	{
		super(location);
	}

	public IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(IfcDirection axis) {
		this.axis = axis;
	}

	public IfcDirection getRefDirection() {
		return this.refDirection;
	}

	public void setRefDirection(IfcDirection refDirection) {
		this.refDirection = refDirection;
	}

	@JsonIgnore
	public List<IfcDirection> getP() {
		return null;
	}


}

