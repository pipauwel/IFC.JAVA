// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7010039f-b69f-42fe-9bb3-20026bfae6ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Profile depth, see illustration above (= h).")
	@DataMember(Order = 0)
	@Required()
	@Guid("c6c9e777-ca9e-4d70-a3a6-38757c26ef87")
	@JacksonXmlProperty(isAttribute=false, localName = "depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Profile width, see illustration above (= b).")
	@DataMember(Order = 1)
	@Required()
	@Guid("d3e16bb1-82aa-4312-aa01-8da7cd20409a")
	@JacksonXmlProperty(isAttribute=false, localName = "width")
	private IfcPositiveLengthMeasure width;

	@Description("Constant wall thickness of profile (= ts).")
	@DataMember(Order = 2)
	@Required()
	@Guid("ec6de7e9-9f3a-4c81-86a4-a4e785c5e223")
	@JacksonXmlProperty(isAttribute=false, localName = "wallThickness")
	private IfcPositiveLengthMeasure wallThickness;

	@Description("Lengths of girth, see illustration above (= c).")
	@DataMember(Order = 3)
	@Required()
	@Guid("daaee771-bc5d-4e0a-917c-9676829c6e0b")
	@JacksonXmlProperty(isAttribute=false, localName = "girth")
	private IfcPositiveLengthMeasure girth;

	@Description("Internal fillet radius according the above illustration (= r1).")
	@DataMember(Order = 4)
	@Guid("6aa4d5f7-c33d-4000-be64-34c41302db25")
	@JacksonXmlProperty(isAttribute=false, localName = "internalFilletRadius")
	private IfcNonNegativeLengthMeasure internalFilletRadius;


	public IfcCShapeProfileDef()
	{
	}

	public IfcCShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure width,
							   IfcPositiveLengthMeasure wallThickness, IfcPositiveLengthMeasure girth)
	{
		super(profileType);
		this.depth = depth;
		this.width = width;
		this.wallThickness = wallThickness;
		this.girth = girth;
	}

	public IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public IfcPositiveLengthMeasure getWidth() {
		return this.width;
	}

	public void setWidth(IfcPositiveLengthMeasure width) {
		this.width = width;
	}

	public IfcPositiveLengthMeasure getWallThickness() {
		return this.wallThickness;
	}

	public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
		this.wallThickness = wallThickness;
	}

	public IfcPositiveLengthMeasure getGirth() {
		return this.girth;
	}

	public void setGirth(IfcPositiveLengthMeasure girth) {
		this.girth = girth;
	}

	public IfcNonNegativeLengthMeasure getInternalFilletRadius() {
		return this.internalFilletRadius;
	}

	public void setInternalFilletRadius(IfcNonNegativeLengthMeasure internalFilletRadius) {
		this.internalFilletRadius = internalFilletRadius;
	}


}

