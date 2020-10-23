// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0c3d81f9-c173-4e51-8063-1ab1f071f67a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef
{
	@Description("Radius of the circular arcs by which all four corners of the rectangle are equally rounded.")
	@DataMember(Order = 0)
	@Required()
	@Guid("afc5aaa4-0bee-4503-bf30-a7540e19281c")
	@JacksonXmlProperty(isAttribute=false, localName = "roundingRadius")
	private IfcPositiveLengthMeasure roundingRadius;


	public IfcRoundedRectangleProfileDef()
	{
	}

	public IfcRoundedRectangleProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim, IfcPositiveLengthMeasure roundingRadius)
	{
		super(profileType, xDim, yDim);
		this.roundingRadius = roundingRadius;
	}

	public IfcPositiveLengthMeasure getRoundingRadius() {
		return this.roundingRadius;
	}

	public void setRoundingRadius(IfcPositiveLengthMeasure roundingRadius) {
		this.roundingRadius = roundingRadius;
	}


}

