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

@Guid("7010039f-b69f-42fe-9bb3-20026bfae6ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("Profile depth, see illustration above (= h).")
	@Required()
	@Guid("c6c9e777-ca9e-4d70-a3a6-38757c26ef87")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;

	@JacksonXmlProperty(isAttribute=true, localName = "Width")
	@Description("Profile width, see illustration above (= b).")
	@Required()
	@Guid("d3e16bb1-82aa-4312-aa01-8da7cd20409a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure width;

	@JacksonXmlProperty(isAttribute=true, localName = "WallThickness")
	@Description("Constant wall thickness of profile (= ts).")
	@Required()
	@Guid("ec6de7e9-9f3a-4c81-86a4-a4e785c5e223")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "Girth")
	@Description("Lengths of girth, see illustration above (= c).")
	@Required()
	@Guid("daaee771-bc5d-4e0a-917c-9676829c6e0b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure girth;

	@JacksonXmlProperty(isAttribute=true, localName = "InternalFilletRadius")
	@Description("Internal fillet radius according the above illustration (= r1).")
	@Guid("6aa4d5f7-c33d-4000-be64-34c41302db25")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure internalFilletRadius;


	public IfcCShapeProfileDef()
	{
	}

	public IfcCShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure width, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure girth)
	{
		super(profileType);
		this.depth = depth;
		this.width = width;
		this.wallThickness = wallThickness;
		this.girth = girth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWidth() {
		return this.width;
	}

	public void setWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure width) {
		this.width = width;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWallThickness() {
		return this.wallThickness;
	}

	public void setWallThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure wallThickness) {
		this.wallThickness = wallThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getGirth() {
		return this.girth;
	}

	public void setGirth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure girth) {
		this.girth = girth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getInternalFilletRadius() {
		return this.internalFilletRadius;
	}

	public void setInternalFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure internalFilletRadius) {
		this.internalFilletRadius = internalFilletRadius;
	}


}

