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

@Guid("211a7b82-6217-476c-8ecd-feaed2e8b2b9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCone extends IfcCsgPrimitive3D
{
	@JacksonXmlProperty(isAttribute=true, localName = "Height")
	@Description("The distance between the base of the cone and the apex.")
	@Required()
	@Guid("a0b36efe-1934-4e3b-80dd-4b67e80b840f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height;

	@JacksonXmlProperty(isAttribute=true, localName = "BottomRadius")
	@Description("The radius of the cone at the base.")
	@Required()
	@Guid("96023c2d-7a04-412b-9320-9a31d8e31a05")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomRadius;


	public IfcRightCircularCone()
	{
	}

	public IfcRightCircularCone(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomRadius)
	{
		super(position);
		this.height = height;
		this.bottomRadius = bottomRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure height) {
		this.height = height;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getBottomRadius() {
		return this.bottomRadius;
	}

	public void setBottomRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure bottomRadius) {
		this.bottomRadius = bottomRadius;
	}


}

