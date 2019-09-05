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

@Guid("0c3d81f9-c173-4e51-8063-1ab1f071f67a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "RoundingRadius")
	@Description("Radius of the circular arcs by which all four corners of the rectangle are equally rounded.")
	@Required()
	@Guid("afc5aaa4-0bee-4503-bf30-a7540e19281c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure roundingRadius;


	public IfcRoundedRectangleProfileDef()
	{
	}

	public IfcRoundedRectangleProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure roundingRadius)
	{
		super(profileType, xDim, yDim);
		this.roundingRadius = roundingRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRoundingRadius() {
		return this.roundingRadius;
	}

	public void setRoundingRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure roundingRadius) {
		this.roundingRadius = roundingRadius;
	}


}

