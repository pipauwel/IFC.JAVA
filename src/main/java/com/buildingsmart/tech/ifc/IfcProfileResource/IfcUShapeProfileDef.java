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

@Guid("38886d5a-10e6-4fc4-99f8-559f073e7fbf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Web lengths, see illustration above (= h).")
	@Required()
	@Guid("1e0ba4ff-53cd-4583-9e64-78f718fc1f17")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Flange lengths, see illustration above (= b).")
	@Required()
	@Guid("952d016a-ead8-4d08-9f8a-8a5e3a9381ad")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeWidth")
	private IfcPositiveLengthMeasure flangeWidth;

	@Description("Constant wall thickness of web (= ts).")
	@Required()
	@Guid("edd0c5a2-f668-4d28-90d9-527adbc2892b")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private IfcPositiveLengthMeasure webThickness;

	@Description("Constant wall thickness of flange (= tg).")
	@Required()
	@Guid("7dc76e01-ba86-4fc0-aefa-12cbd9de4354")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeThickness")
	private IfcPositiveLengthMeasure flangeThickness;

	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("5aaea55d-d089-4885-b7ff-6c89cc0fdb81")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private IfcNonNegativeLengthMeasure filletRadius;

	@Description("Edge radius according the above illustration (= r2).")
	@Guid("64a763ed-7fde-46d2-90ef-4e8189de7711")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeRadius")
	private IfcNonNegativeLengthMeasure edgeRadius;

	@Description("Slope of flange of the profile.")
	@Guid("4b17d3b3-4476-485a-9aeb-b436e9bd7444")
	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	private double flangeSlope;


	public IfcUShapeProfileDef()
	{
	}

	public IfcUShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure flangeWidth, IfcPositiveLengthMeasure webThickness, IfcPositiveLengthMeasure flangeThickness)
	{
		super(profileType);
		this.depth = depth;
		this.flangeWidth = flangeWidth;
		this.webThickness = webThickness;
		this.flangeThickness = flangeThickness;
	}

	public IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public IfcPositiveLengthMeasure getFlangeWidth() {
		return this.flangeWidth;
	}

	public void setFlangeWidth(IfcPositiveLengthMeasure flangeWidth) {
		this.flangeWidth = flangeWidth;
	}

	public IfcPositiveLengthMeasure getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(IfcPositiveLengthMeasure webThickness) {
		this.webThickness = webThickness;
	}

	public IfcPositiveLengthMeasure getFlangeThickness() {
		return this.flangeThickness;
	}

	public void setFlangeThickness(IfcPositiveLengthMeasure flangeThickness) {
		this.flangeThickness = flangeThickness;
	}

	public IfcNonNegativeLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(IfcNonNegativeLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}

	public IfcNonNegativeLengthMeasure getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(IfcNonNegativeLengthMeasure edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

