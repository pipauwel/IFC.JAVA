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

@Guid("6868acf7-18b5-4d39-9a9f-70d45e418223")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSphere extends IfcCsgPrimitive3D
{
	@Description("The radius of the sphere.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f2c191d1-bda8-4116-980c-18cb4d6e9402")
	@JacksonXmlProperty(isAttribute=false, localName = "Radius")
	private double radius; //IfcPositiveLengthMeasure


	public IfcSphere()
	{
	}

	public IfcSphere(IfcAxis2Placement3D position, double radius)
	{
		super(position);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}

