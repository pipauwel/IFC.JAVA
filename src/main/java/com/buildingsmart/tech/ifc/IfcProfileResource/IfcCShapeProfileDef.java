// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcParameterizedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("7010039f-b69f-42fe-9bb3-20026bfae6ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Profile depth, see illustration above (= h).")
	@Required()
	@Guid("c6c9e777-ca9e-4d70-a3a6-38757c26ef87")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Profile width, see illustration above (= b).")
	@Required()
	@Guid("d3e16bb1-82aa-4312-aa01-8da7cd20409a")
	@JacksonXmlProperty(isAttribute=false, localName = "Width")
	private IfcPositiveLengthMeasure width;

	@Description("Constant wall thickness of profile (= ts).")
	@Required()
	@Guid("ec6de7e9-9f3a-4c81-86a4-a4e785c5e223")
	@JacksonXmlProperty(isAttribute=false, localName = "WallThickness")
	private IfcPositiveLengthMeasure wallThickness;

	@Description("Lengths of girth, see illustration above (= c).")
	@Required()
	@Guid("daaee771-bc5d-4e0a-917c-9676829c6e0b")
	@JacksonXmlProperty(isAttribute=false, localName = "Girth")
	private IfcPositiveLengthMeasure girth;

	@Description("Internal fillet radius according the above illustration (= r1).")
	@Guid("6aa4d5f7-c33d-4000-be64-34c41302db25")
	@JacksonXmlProperty(isAttribute=false, localName = "InternalFilletRadius")
	private IfcNonNegativeLengthMeasure internalFilletRadius;


	public IfcCShapeProfileDef()
	{
	}

	public IfcCShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure width, IfcPositiveLengthMeasure wallThickness, IfcPositiveLengthMeasure girth)
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

