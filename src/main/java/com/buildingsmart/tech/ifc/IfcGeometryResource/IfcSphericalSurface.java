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

@Guid("670a9c08-2e52-4be6-b130-434587b3a111")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSphericalSurface extends IfcElementarySurface
{
	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The radius of the sphere.")
	@Required()
	@Guid("1431b5ce-d37d-4e1d-bb29-b88763676b27")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;


	public IfcSphericalSurface()
	{
	}

	public IfcSphericalSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
	{
		super(position);
		this.radius = radius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}


}

