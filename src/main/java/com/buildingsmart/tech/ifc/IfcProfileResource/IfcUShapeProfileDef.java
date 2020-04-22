// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("38886d5a-10e6-4fc4-99f8-559f073e7fbf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Web lengths, see illustration above (= h).")
	@DataMember(Order = 0)
	@Required()
	@Guid("1e0ba4ff-53cd-4583-9e64-78f718fc1f17")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private double depth; //IfcPositiveLengthMeasure

	@Description("Flange lengths, see illustration above (= b).")
	@DataMember(Order = 1)
	@Required()
	@Guid("952d016a-ead8-4d08-9f8a-8a5e3a9381ad")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeWidth")
	private double flangeWidth; //IfcPositiveLengthMeasure

	@Description("Constant wall thickness of web (= ts).")
	@DataMember(Order = 2)
	@Required()
	@Guid("edd0c5a2-f668-4d28-90d9-527adbc2892b")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private double webThickness; //IfcPositiveLengthMeasure

	@Description("Constant wall thickness of flange (= tg).")
	@DataMember(Order = 3)
	@Required()
	@Guid("7dc76e01-ba86-4fc0-aefa-12cbd9de4354")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeThickness")
	private double flangeThickness; //IfcPositiveLengthMeasure

	@Description("Fillet radius according the above illustration (= r1).")
	@DataMember(Order = 4)
	@Guid("5aaea55d-d089-4885-b7ff-6c89cc0fdb81")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private double filletRadius; //IfcNonNegativeLengthMeasure

	@Description("Edge radius according the above illustration (= r2).")
	@DataMember(Order = 5)
	@Guid("64a763ed-7fde-46d2-90ef-4e8189de7711")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeRadius")
	private double edgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of flange of the profile.")
	@DataMember(Order = 6)
	@Guid("4b17d3b3-4476-485a-9aeb-b436e9bd7444")
	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	private double flangeSlope;


	public IfcUShapeProfileDef()
	{
	}

	public IfcUShapeProfileDef(IfcProfileTypeEnum profileType, double depth, double flangeWidth, double webThickness, double flangeThickness)
	{
		super(profileType);
		this.depth = depth;
		this.flangeWidth = flangeWidth;
		this.webThickness = webThickness;
		this.flangeThickness = flangeThickness;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getFlangeWidth() {
		return this.flangeWidth;
	}

	public void setFlangeWidth(double flangeWidth) {
		this.flangeWidth = flangeWidth;
	}

	public double getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(double webThickness) {
		this.webThickness = webThickness;
	}

	public double getFlangeThickness() {
		return this.flangeThickness;
	}

	public void setFlangeThickness(double flangeThickness) {
		this.flangeThickness = flangeThickness;
	}

	public double getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(double filletRadius) {
		this.filletRadius = filletRadius;
	}

	public double getEdgeRadius() {
		return this.edgeRadius;
	}

	public void setEdgeRadius(double edgeRadius) {
		this.edgeRadius = edgeRadius;
	}

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

