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

@Guid("38886d5a-10e6-4fc4-99f8-559f073e7fbf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("Web lengths, see illustration above (= h).")
	@Required()
	@Guid("1e0ba4ff-53cd-4583-9e64-78f718fc1f17")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeWidth")
	@Description("Flange lengths, see illustration above (= b).")
	@Required()
	@Guid("952d016a-ead8-4d08-9f8a-8a5e3a9381ad")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "WebThickness")
	@Description("Constant wall thickness of web (= ts).")
	@Required()
	@Guid("edd0c5a2-f668-4d28-90d9-527adbc2892b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeThickness")
	@Description("Constant wall thickness of flange (= tg).")
	@Required()
	@Guid("7dc76e01-ba86-4fc0-aefa-12cbd9de4354")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FilletRadius")
	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("5aaea55d-d089-4885-b7ff-6c89cc0fdb81")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "EdgeRadius")
	@Description("Edge radius according the above illustration (= r2).")
	@Guid("64a763ed-7fde-46d2-90ef-4e8189de7711")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure edgeRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	@Description("Slope of flange of the profile.")
	@Guid("4b17d3b3-4476-485a-9aeb-b436e9bd7444")
	private double flangeSlope;


	public IfcUShapeProfileDef()
	{
	}

	public IfcUShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness)
	{
		super(profileType);
		this.depth = depth;
		this.flangeWidth = flangeWidth;
		this.webThickness = webThickness;
		this.flangeThickness = flangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFlangeWidth() {
		return this.flangeWidth;
	}

	public void setFlangeWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth) {
		this.flangeWidth = flangeWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness) {
		this.webThickness = webThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFlangeThickness() {
		return this.flangeThickness;
	}

	public void setFlangeThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness) {
		this.flangeThickness = flangeThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

