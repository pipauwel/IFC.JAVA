// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("76426990-f6c8-4462-b489-68361df1c390")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRectangleHollowProfileDef.class, name = "IfcRectangleHollowProfileDef"), @JsonSubTypes.Type(value = IfcRoundedRectangleProfileDef.class, name = "IfcRoundedRectangleProfileDef")})
public class IfcRectangleProfileDef extends IfcParameterizedProfileDef
{
	@Description("The extent of the rectangle in the direction of the x-axis.")
	@DataMember(Order = 0)
	@Required()
	@Guid("cc30f80d-efff-497d-a442-14ef5a82594e")
	@JacksonXmlProperty(isAttribute=false, localName = "xDim")
	private IfcPositiveLengthMeasure xDim;

	@Description("The extent of the rectangle in the direction of the y-axis.")
	@DataMember(Order = 1)
	@Required()
	@Guid("8675ebcb-7de8-4598-8952-7776657d7a52")
	@JacksonXmlProperty(isAttribute=false, localName = "yDim")
	private IfcPositiveLengthMeasure yDim;


	public IfcRectangleProfileDef()
	{
	}

	public IfcRectangleProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure xDim, IfcPositiveLengthMeasure yDim)
	{
		super(profileType);
		this.xDim = xDim;
		this.yDim = yDim;
	}

	public IfcPositiveLengthMeasure getxDim() {
		return this.xDim;
	}

	public void setxDim(IfcPositiveLengthMeasure xDim) {
		this.xDim = xDim;
	}

	public IfcPositiveLengthMeasure getyDim() {
		return this.yDim;
	}

	public void setyDim(IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}


}

