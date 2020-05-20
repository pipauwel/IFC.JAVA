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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPlaneAngleMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
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
	@JacksonXmlProperty(isAttribute=false, localName = "depth")
	private IfcPositiveLengthMeasure depth;

	@Description("Flange lengths, see illustration above (= b).")
	@DataMember(Order = 1)
	@Required()
	@Guid("6ed7052b-c662-42bc-a3fa-7e12a958e215")
	@JacksonXmlProperty(isAttribute=false, localName = "flangeWidth")
	private IfcPositiveLengthMeasure flangeWidth;

	@Description("Constant wall thickness of web (= ts).")
	@DataMember(Order = 2)
	@Required()
	@Guid("e0f4c060-66bc-4d98-acca-d3b51e211075")
	@JacksonXmlProperty(isAttribute=false, localName = "webThickness")
	private IfcPositiveLengthMeasure webThickness;

	@Description("Constant wall thickness of flange (= tg).")
	@DataMember(Order = 3)
	@Required()
	@Guid("df89c02a-ade3-42be-bfae-01bf68430794")
	@JacksonXmlProperty(isAttribute=false, localName = "flangeThickness")
	private IfcPositiveLengthMeasure flangeThickness;

	@Description("Fillet radius according the above illustration (= r1).")
	@DataMember(Order = 4)
	@Guid("1594be10-83da-4e4b-9659-4f3415565953")
	@JacksonXmlProperty(isAttribute=false, localName = "filletRadius")
	private IfcNonNegativeLengthMeasure filletRadius;

	@Description("Edge radius according the above illustration (= r2).")
	@DataMember(Order = 5)
	@Guid("23604099-5595-4772-b498-58cf6d21ba2c")
	@JacksonXmlProperty(isAttribute=false, localName = "flangeEdgeRadius")
	private IfcNonNegativeLengthMeasure flangeEdgeRadius;

	@Description("Edge radius according the above illustration (= r3).")
	@DataMember(Order = 6)
	@Guid("55533e11-7b3e-42ed-97af-eec943eb0c3e")
	@JacksonXmlProperty(isAttribute=false, localName = "webEdgeRadius")
	private IfcNonNegativeLengthMeasure webEdgeRadius;

	@Description("Slope of flange of the profile.")
	@DataMember(Order = 7)
	@Guid("00b0c529-097f-4762-b409-70a3fac704e0")
	@JacksonXmlProperty(isAttribute=false, localName = "webSlope")
	private IfcPlaneAngleMeasure webSlope;

	@Description("Slope of web of the profile.")
	@DataMember(Order = 8)
	@Guid("c048d2db-273d-41a9-b441-b903590d3eac")
	@JacksonXmlProperty(isAttribute=false, localName = "flangeSlope")
	private IfcPlaneAngleMeasure flangeSlope;


	public IfcTShapeProfileDef()
	{
	}

	public IfcTShapeProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure depth, IfcPositiveLengthMeasure flangeWidth,
							   IfcPositiveLengthMeasure webThickness, IfcPositiveLengthMeasure flangeThickness)
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

	public IfcNonNegativeLengthMeasure getFlangeEdgeRadius() {
		return this.flangeEdgeRadius;
	}

	public void setFlangeEdgeRadius(IfcNonNegativeLengthMeasure flangeEdgeRadius) {
		this.flangeEdgeRadius = flangeEdgeRadius;
	}

	public IfcNonNegativeLengthMeasure getWebEdgeRadius() {
		return this.webEdgeRadius;
	}

	public void setWebEdgeRadius(IfcNonNegativeLengthMeasure webEdgeRadius) {
		this.webEdgeRadius = webEdgeRadius;
	}

	public IfcPlaneAngleMeasure getWebSlope() {
		return this.webSlope;
	}

	public void setWebSlope(IfcPlaneAngleMeasure webSlope) {
		this.webSlope = webSlope;
	}

	public IfcPlaneAngleMeasure getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(IfcPlaneAngleMeasure flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

