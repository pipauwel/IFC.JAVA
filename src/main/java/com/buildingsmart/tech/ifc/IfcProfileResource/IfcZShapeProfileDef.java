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

@Guid("e5fddf04-c0a3-4722-a8bf-d4fce6edec7d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcZShapeProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("Web length, see illustration above (= h).")
	@Required()
	@Guid("3284a48e-fdbf-40bc-a103-a27eab9ba139")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeWidth")
	@Description("Flange length, see illustration above (= b).")
	@Required()
	@Guid("cad1ad25-62c9-4b98-8c5c-a0ff5a9add29")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "WebThickness")
	@Description("Constant wall thickness of web, see illustration above (= ts).")
	@Required()
	@Guid("b7747624-e2b7-488e-962e-d1075158983b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FlangeThickness")
	@Description("Constant wall thickness of flange, see illustration above (= tg).")
	@Required()
	@Guid("8ecc9e30-8247-45b6-90c5-1f465f17216f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "FilletRadius")
	@Description("Fillet radius according the above illustration (= r1).")
	@Guid("eb49981a-a185-4cd0-a4f6-11082b1d7be6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure filletRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "EdgeRadius")
	@Description("Edge radius according the above illustration (= r2).")
	@Guid("401254a3-be8f-49dd-81c2-d77988402c41")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure edgeRadius;


	public IfcZShapeProfileDef()
	{
	}

	public IfcZShapeProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeWidth, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure webThickness, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure flangeThickness)
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


}

