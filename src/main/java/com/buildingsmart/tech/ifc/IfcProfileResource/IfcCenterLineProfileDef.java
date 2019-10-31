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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcArbitraryOpenProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("7c8824b5-eca4-4977-8631-71274a016d0c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCenterLineProfileDef extends IfcArbitraryOpenProfileDef
{
	@Description("Constant thickness applied along the center line.")
	@Required()
	@Guid("ec8fae2b-5051-4d07-80f8-bdf8fd902345")
	@JacksonXmlProperty(isAttribute=false, localName = "Thickness")
	private IfcPositiveLengthMeasure thickness;


	public IfcCenterLineProfileDef()
	{
	}

	public IfcCenterLineProfileDef(IfcProfileTypeEnum profileType, IfcBoundedCurve curve, IfcPositiveLengthMeasure thickness)
	{
		super(profileType, curve);
		this.thickness = thickness;
	}

	public IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}


}

