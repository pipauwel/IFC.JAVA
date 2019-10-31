// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralConnectionCondition;

@Guid("a431388c-2787-440c-aeb1-229142deaf2a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition
{
	@Description("Slippage in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("c3f20340-6dea-4111-9954-f94b796af7e4")
	@JacksonXmlProperty(isAttribute=true, localName = "SlippageX")
	private double slippageX;

	@Description("Slippage in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("1ad499d3-5c9a-4ee9-b0ae-d03371621e0d")
	@JacksonXmlProperty(isAttribute=true, localName = "SlippageY")
	private double slippageY;

	@Description("Slippage in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("25ed9e52-bccc-45a4-8a6a-734547a43857")
	@JacksonXmlProperty(isAttribute=true, localName = "SlippageZ")
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

