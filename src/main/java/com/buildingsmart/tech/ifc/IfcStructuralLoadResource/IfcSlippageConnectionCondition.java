// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a431388c-2787-440c-aeb1-229142deaf2a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition
{
	@JacksonXmlProperty(isAttribute=true, localName = "SlippageX")
	@Description("Slippage in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("c3f20340-6dea-4111-9954-f94b796af7e4")
	private double slippageX;

	@JacksonXmlProperty(isAttribute=true, localName = "SlippageY")
	@Description("Slippage in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("1ad499d3-5c9a-4ee9-b0ae-d03371621e0d")
	private double slippageY;

	@JacksonXmlProperty(isAttribute=true, localName = "SlippageZ")
	@Description("Slippage in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("25ed9e52-bccc-45a4-8a6a-734547a43857")
	private double slippageZ;


	public IfcSlippageConnectionCondition()
	{
	}

	public double getSlippageX() {
		return this.slippageX;
	}

	public void setSlippageX(double slippageX) {
		this.slippageX = slippageX;
	}

	public double getSlippageY() {
		return this.slippageY;
	}

	public void setSlippageY(double slippageY) {
		this.slippageY = slippageY;
	}

	public double getSlippageZ() {
		return this.slippageZ;
	}

	public void setSlippageZ(double slippageZ) {
		this.slippageZ = slippageZ;
	}


}

