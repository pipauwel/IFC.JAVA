// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0f127537-4dfb-420f-bcea-6637237ef8e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCircleProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The radius of the circle.")
	@Required()
	@Guid("e32b7f94-4b79-4078-93cc-014e7f4dcc2f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;


	public IfcCircleProfileDef()
	{
	}

	public IfcCircleProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
	{
		super(profileType);
		this.radius = radius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}


}

