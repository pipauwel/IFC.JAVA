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

@Guid("254749ac-db77-4f69-a8a0-b4cc5d5e66fa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Total extent of the width, defined parallel to the x axis of the position coordinate system.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d3377243-e50b-4612-9cb4-4b5a82a792cd")
	@JacksonXmlProperty(isAttribute=false, localName = "OverallWidth")
	private double overallWidth; //IfcPositiveLengthMeasure

	@Description("Total extent of the depth, defined parallel to the y axis of the position coordinate system.")
	@DataMember(Order = 1)
	@Required()
	@Guid("be006822-4c89-400b-82a0-017a9d9e5a7a")
	@JacksonXmlProperty(isAttribute=false, localName = "OverallDepth")
	private double overallDepth; //IfcPositiveLengthMeasure

	@Description("Thickness of the web of the I-shape. The web is centred on the x-axis and the y-axis of the position coordinate system.")
	@DataMember(Order = 2)
	@Required()
	@Guid("efeab8f4-6c72-4e05-8423-5c9226da4164")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private double webThickness; //IfcPositiveLengthMeasure

	@Description("Flange thickness of the I-shape. Both, the upper and the lower flanges have the same thickness and they are centred on the y-axis of the position coordinate system.")
	@DataMember(Order = 3)
	@Required()
	@Guid("6139d968-6b28-4734-af17-2a8b3447dcd7")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeThickness")
	private double flangeThickness; //IfcPositiveLengthMeasure

	@Description("The fillet between the web and the flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 4)
	@Guid("5f4d9acf-d5cd-4bdc-a4b6-8b5b7288da52")
	@JacksonXmlProperty(isAttribute=false, localName = "FilletRadius")
	private double filletRadius; //IfcNonNegativeLengthMeasure

	@Description("Radius of the lower edges of the top flange and the upper edges of the bottom flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 5)
	@Guid("e6d064b0-e764-412c-a164-30bea7e98f76")
	@JacksonXmlProperty(isAttribute=false, localName = "FlangeEdgeRadius")
	private double flangeEdgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of the lower faces of the top flange and of the upper faces of the bottom flange.  Non-zero in case of tapered flanges, 0 in case of parallel flanges, omitted if unknown.")
	@DataMember(Order = 6)
	@Guid("78bd552f-462b-4bb7-9795-8ba9b2ece37a")
	@JacksonXmlProperty(isAttribute=true, localName = "FlangeSlope")
	private double flangeSlope;


	public IfcIShapeProfileDef()
	{
	}

	public IfcIShapeProfileDef(IfcProfileTypeEnum profileType, double overallWidth, double overallDepth, double webThickness, double flangeThickness)
	{
		super(profileType);
		this.overallWidth = overallWidth;
		this.overallDepth = overallDepth;
		this.webThickness = webThickness;
		this.flangeThickness = flangeThickness;
	}

	public double getOverallWidth() {
		return this.overallWidth;
	}

	public void setOverallWidth(double overallWidth) {
		this.overallWidth = overallWidth;
	}

	public double getOverallDepth() {
		return this.overallDepth;
	}

	public void setOverallDepth(double overallDepth) {
		this.overallDepth = overallDepth;
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

	public double getFlangeSlope() {
		return this.flangeSlope;
	}

	public void setFlangeSlope(double flangeSlope) {
		this.flangeSlope = flangeSlope;
	}


}

