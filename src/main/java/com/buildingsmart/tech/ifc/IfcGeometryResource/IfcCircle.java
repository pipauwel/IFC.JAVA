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

@Guid("ecd7837c-2e5a-4752-b756-61cf864012e6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCircle extends IfcConic
{
	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The radius of the circle, which shall be greater than zero.")
	@Required()
	@Guid("8b0ca9cc-ce09-4600-bc7f-495172eaaac4")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;


	public IfcCircle()
	{
	}

	public IfcCircle(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
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

