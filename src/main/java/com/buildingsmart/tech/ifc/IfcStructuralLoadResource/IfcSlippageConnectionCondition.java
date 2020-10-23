// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a431388c-2787-440c-aeb1-229142deaf2a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition
{
	@Description("Slippage in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 0)
	@Guid("c3f20340-6dea-4111-9954-f94b796af7e4")
	@JacksonXmlProperty(isAttribute=false, localName = "slippageX")
	private IfcLengthMeasure slippageX;

	@Description("Slippage in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 1)
	@Guid("1ad499d3-5c9a-4ee9-b0ae-d03371621e0d")
	@JacksonXmlProperty(isAttribute=false, localName = "slippageY")
	private IfcLengthMeasure slippageY;

	@Description("Slippage in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 2)
	@Guid("25ed9e52-bccc-45a4-8a6a-734547a43857")
	@JacksonXmlProperty(isAttribute=false, localName = "slippageZ")
	private IfcLengthMeasure slippageZ;


	public IfcSlippageConnectionCondition()
	{
	}

	public IfcLengthMeasure getSlippageX() {
		return this.slippageX;
	}

	public void setSlippageX(IfcLengthMeasure slippageX) {
		this.slippageX = slippageX;
	}

	public IfcLengthMeasure getSlippageY() {
		return this.slippageY;
	}

	public void setSlippageY(IfcLengthMeasure slippageY) {
		this.slippageY = slippageY;
	}

	public IfcLengthMeasure getSlippageZ() {
		return this.slippageZ;
	}

	public void setSlippageZ(IfcLengthMeasure slippageZ) {
		this.slippageZ = slippageZ;
	}


}

