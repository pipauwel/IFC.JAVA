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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("211a7b82-6217-476c-8ecd-feaed2e8b2b9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRightCircularCone extends IfcCsgPrimitive3D
{
	@Description("The distance between the base of the cone and the apex.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a0b36efe-1934-4e3b-80dd-4b67e80b840f")
	@JacksonXmlProperty(isAttribute=false, localName = "height")
	private IfcPositiveLengthMeasure height;

	@Description("The radius of the cone at the base.")
	@DataMember(Order = 1)
	@Required()
	@Guid("96023c2d-7a04-412b-9320-9a31d8e31a05")
	@JacksonXmlProperty(isAttribute=false, localName = "bottomRadius")
	private IfcPositiveLengthMeasure bottomRadius;


	public IfcRightCircularCone()
	{
	}

	public IfcRightCircularCone(IfcAxis2Placement3D position, IfcPositiveLengthMeasure height, IfcPositiveLengthMeasure bottomRadius)
	{
		super(position);
		this.height = height;
		this.bottomRadius = bottomRadius;
	}

	public IfcPositiveLengthMeasure getHeight() {
		return this.height;
	}

	public void setHeight(IfcPositiveLengthMeasure height) {
		this.height = height;
	}

	public IfcPositiveLengthMeasure getBottomRadius() {
		return this.bottomRadius;
	}

	public void setBottomRadius(IfcPositiveLengthMeasure bottomRadius) {
		this.bottomRadius = bottomRadius;
	}


}

