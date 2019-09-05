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

@Guid("724208fb-1891-42c2-957a-3425addde369")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCylindricalSurface extends IfcElementarySurface
{
	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The radius of the cylindrical surface.")
	@Required()
	@Guid("feb725ac-9fc4-4bf3-9bd9-26fb2b49e5a1")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;


	public IfcCylindricalSurface()
	{
	}

	public IfcCylindricalSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
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

