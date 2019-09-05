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

@Guid("76426990-f6c8-4462-b489-68361df1c390")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangleProfileDef extends IfcParameterizedProfileDef
{
	@JacksonXmlProperty(isAttribute=true, localName = "XDim")
	@Description("The extent of the rectangle in the direction of the x-axis.")
	@Required()
	@Guid("cc30f80d-efff-497d-a442-14ef5a82594e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim;

	@JacksonXmlProperty(isAttribute=true, localName = "YDim")
	@Description("The extent of the rectangle in the direction of the y-axis.")
	@Required()
	@Guid("8675ebcb-7de8-4598-8952-7776657d7a52")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim;


	public IfcRectangleProfileDef()
	{
	}

	public IfcRectangleProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim)
	{
		super(profileType);
		this.xDim = xDim;
		this.yDim = yDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getXDim() {
		return this.xDim;
	}

	public void setXDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure xDim) {
		this.xDim = xDim;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getYDim() {
		return this.yDim;
	}

	public void setYDim(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure yDim) {
		this.yDim = yDim;
	}


}

