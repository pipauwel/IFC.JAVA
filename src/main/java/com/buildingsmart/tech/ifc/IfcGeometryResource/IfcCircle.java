// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ecd7837c-2e5a-4752-b756-61cf864012e6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCircle extends IfcConic
{
	@Description("The radius of the circle, which shall be greater than zero.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8b0ca9cc-ce09-4600-bc7f-495172eaaac4")
	@JacksonXmlProperty(isAttribute=false, localName = "radius")
	private IfcPositiveLengthMeasure radius;


	public IfcCircle()
	{
	}

	public IfcCircle(IfcAxis2Placement position, IfcPositiveLengthMeasure radius)
	{
		super(position);
		this.radius = radius;
	}

	public IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}


}

