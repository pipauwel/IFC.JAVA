// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1daf3ba6-e5cf-4741-8896-c9448b95f83a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCylinder extends IfcCsgPrimitive3D
{
	@Description("The distance between the planar circular faces of the cylinder.")
	@DataMember(Order = 0)
	@Required()
	@Guid("dcf9b582-ff9a-4dd7-8ea9-1ba2cbdc8c7b")
	@JacksonXmlProperty(isAttribute=false, localName = "Height")
	private double height; //IfcPositiveLengthMeasure

	@Description("The radius of the cylinder.")
	@DataMember(Order = 1)
	@Required()
	@Guid("fccf868b-e746-42cf-86cb-78c653cf2949")
	@JacksonXmlProperty(isAttribute=false, localName = "Radius")
	private double radius; //IfcPositiveLengthMeasure


	public IfcRightCircularCylinder()
	{
	}

	public IfcRightCircularCylinder(IfcAxis2Placement3D position, double height, double radius)
	{
		super(position);
		this.height = height;
		this.radius = radius;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}

