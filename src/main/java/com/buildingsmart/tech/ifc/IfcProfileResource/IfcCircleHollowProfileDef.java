// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcCircleProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("ec4ff7c3-e1f8-4480-956f-983ac59dd757")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCircleHollowProfileDef extends IfcCircleProfileDef
{
	@Description("Thickness of the material, it is the difference between the outer and inner radius.")
	@Required()
	@Guid("718ae842-2e58-4ad8-a068-918cd5a794e8")
	@JacksonXmlProperty(isAttribute=false, localName = "WallThickness")
	private IfcPositiveLengthMeasure wallThickness;


	public IfcCircleHollowProfileDef()
	{
	}

	public IfcCircleHollowProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure radius, IfcPositiveLengthMeasure wallThickness)
	{
		super(profileType, radius);
		this.wallThickness = wallThickness;
	}

	public IfcPositiveLengthMeasure getWallThickness() {
		return this.wallThickness;
	}

	public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
		this.wallThickness = wallThickness;
	}


}

