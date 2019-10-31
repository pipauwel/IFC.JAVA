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

@Guid("e5fddf04-c0a3-4722-a8bf-d4fce6edec7d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcZShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Web length, see illustration above (= h).")
	@Required()
	@Guid("3284a48e-fdbf-40bc-a103-a27eab9ba139")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Flange length, see illustration above (= b).")
	@Required()
	@Guid("cad1ad25-62c9-4b98-8c5c-a0ff5a9add29")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeWidth")
	private IfcPositiveLengthMeasure flangeWidth;

	@Description("Constant wall thickness of web, see illustration above (= ts).")
	@Required()
	@Guid("b7747624-e2b7-488e-962e-d1075158983b")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private IfcPositiveLengthMeasure webThickness;

	@Description("Constant wall thickness of flange, see illustration above (= tg).")
	@Required()
	@Guid("8ecc9e30-8247-45b6-90c5-1f465f17216f")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeThickness")
	private IfcPositiveLengthMeasure flangeThickness;

	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("eb49981a-a185-4cd0-a4f6-11082b1d7be6")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private IfcNonNegativeLengthMeasure filletRadius;

	@Description("Edge radius according the above illustration (= r2).")
	@Guid("401254a3-be8f-49dd-81c2-d77988402c41")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeRadius")
	private IfcNonNegativeLengthMeasure edgeRadius;


	public IfcZShapeProfileDef()
	{
	}

	public IfcZShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure flangeWidth, IfcPositiveLengthMeasure webThickness, IfcPositiveLengthMeasure flangeThickness)
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


}

