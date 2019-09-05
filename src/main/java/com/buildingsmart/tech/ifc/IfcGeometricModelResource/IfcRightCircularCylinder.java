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

@Guid("1daf3ba6-e5cf-4741-8896-c9448b95f83a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCylinder extends IfcCsgPrimitive3D
{
	@JacksonXmlProperty(isAttribute=true, localName = "Height")
	@Description("The distance between the planar circular faces of the cylinder.")
	@Required()
	@Guid("dcf9b582-ff9a-4dd7-8ea9-1ba2cbdc8c7b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height;

	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The radius of the cylinder.")
	@Required()
	@Guid("fccf868b-e746-42cf-86cb-78c653cf2949")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;


	public IfcRightCircularCylinder()
	{
	}

	public IfcRightCircularCylinder(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
	{
		super(position);
		this.height = height;
		this.radius = radius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height) {
		this.height = height;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}


}

