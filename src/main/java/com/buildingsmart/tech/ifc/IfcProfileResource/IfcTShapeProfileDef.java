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

@Guid("c5e6f97d-9889-46a6-bcbb-63e9cbb0b1c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Web lengths, see illustration above (= h).")
	@DataMember(Order = 0)
	@Required()
	@Guid("ba4784da-d4b1-4f22-a835-28f21fb95c57")
	@JacksonXmlProperty(isAttribute=false, localName = "Depth")
	private double depth; //IfcPositiveLengthMeasure

	@Description("Flange lengths, see illustration above (= b).")
	@DataMember(Order = 1)
	@Required()
	@Guid("6ed7052b-c662-42bc-a3fa-7e12a958e215")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeWidth")
	private double flangeWidth; //IfcPositiveLengthMeasure

	@Description("Constant wall thickness of web (= ts).")
	@DataMember(Order = 2)
	@Required()
	@Guid("e0f4c060-66bc-4d98-acca-d3b51e211075")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private double webThickness; //IfcPositiveLengthMeasure

	@Description("Constant wall thickness of flange (= tg).")
	@DataMember(Order = 3)
	@Required()
	@Guid("df89c02a-ade3-42be-bfae-01bf68430794")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeThickness")
	private double flangeThickness; //IfcPositiveLengthMeasure

	@Description("Fillet radius according the above illustration (= r1).")
	@DataMember(Order = 4)
	@Guid("1594be10-83da-4e4b-9659-4f3415565953")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private double filletRadius; //IfcNonNegativeLengthMeasure

	@Description("Edge radius according the above illustration (= r2).")
	@DataMember(Order = 5)
	@Guid("23604099-5595-4772-b498-58cf6d21ba2c")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeEdgeRadius")
	private double flangeEdgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Edge radius according the above illustration (= r3).")
	@DataMember(Order = 6)
	@Guid("55533e11-7b3e-42ed-97af-eec943eb0c3e")
	@JacksonXmlProperty(isAttribute=false, localName = "WebEdgeRadius")
	private double webEdgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of flange of the profile.")
	@DataMember(Order = 7)
	@Guid("00b0c529-097f-4762-b409-70a3fac704e0")
	@JacksonXmlProperty(isAttribute=true, localName = "WebSlope")
	private double webSlope;

	@Description("Slope of web of the profile.")
	@DataMember(Order = 8)
	@Guid("c048d2db-273d-41a9-b441-b903590d3eac")
	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	private double flangeSlope;


	public IfcTShapeProfileDef()
	{
	}

	public IfcTShapeProfileDef(IfcProfileTypeEnum profileType, double depth, double flangeWidth, double webThickness, double flangeThickness)
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

	public double getFlangeEdgeRadius() {
		return this.flangeEdgeRadius;
	}

	public void setFlangeEdgeRadius(double flangeEdgeRadius) {
		this.flangeEdgeRadius = flangeEdgeRadius;
	}

	public double getWebEdgeRadius() {
		return this.webEdgeRadius;
	}

	public void setWebEdgeRadius(double webEdgeRadius) {
		this.webEdgeRadius = webEdgeRadius;
	}

	public double getWebSlope() {
		return this.webSlope;
	}

	public void setWebSlope(double webSlope) {
		this.webSlope = webSlope;
	}

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

