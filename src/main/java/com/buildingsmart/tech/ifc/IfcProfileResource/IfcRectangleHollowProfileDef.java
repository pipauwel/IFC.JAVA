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

@Guid("19db74b8-9bbd-4310-a2b8-d47984481a40")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "WallThickness")
	@Description("Thickness of the material.")
	@Required()
	@Guid("e469897c-3e73-451f-9c72-a373783992ba")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "InnerFilletRadius")
	@Description("Inner corner radius.")
	@Guid("5aa6d217-3f48-4fbb-9145-55601b62701b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure innerFilletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "OuterFilletRadius")
	@Description("Outer corner radius.")
	@Guid("493f68ea-2c2e-44f2-bef4-d2c48668cc91")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure outerFilletRadius;


	public IfcRectangleHollowProfileDef()
	{
	}

	public IfcRectangleHollowProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness)
	{
		super(profileType, xDim, yDim);
		this.wallThickness = wallThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWallThickness() {
		return this.wallThickness;
	}

	public void setWallThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness) {
		this.wallThickness = wallThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getInnerFilletRadius() {
		return this.innerFilletRadius;
	}

	public void setInnerFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure innerFilletRadius) {
		this.innerFilletRadius = innerFilletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getOuterFilletRadius() {
		return this.outerFilletRadius;
	}

	public void setOuterFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure outerFilletRadius) {
		this.outerFilletRadius = outerFilletRadius;
	}


}

