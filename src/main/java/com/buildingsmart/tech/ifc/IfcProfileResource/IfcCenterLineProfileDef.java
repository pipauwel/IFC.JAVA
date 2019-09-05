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

@Guid("7c8824b5-eca4-4977-8631-71274a016d0c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCenterLineProfileDef extends IfcArbitraryOpenProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Thickness")
	@Description("Constant thickness applied along the center line.")
	@Required()
	@Guid("ec8fae2b-5051-4d07-80f8-bdf8fd902345")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness;


	public IfcCenterLineProfileDef()
	{
	}

	public IfcCenterLineProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve curve, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness)
	{
		super(profileType, curve);
		this.thickness = thickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}


}

