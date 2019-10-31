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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcParameterizedProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("e019e0b0-86e1-4188-85b1-4d934b9a1046")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEllipseProfileDef extends IfcParameterizedProfileDef
{
	@Description("The first radius of the ellipse. It is measured along the direction of Position.P[1].")
	@Required()
	@Guid("0b55b950-eb03-41c2-94a3-3c86f780417f")
	@JacksonXmlProperty(isAttribute=false, localName = "SemiAxis1")
	private IfcPositiveLengthMeasure semiAxis1;

	@Description("The second radius of the ellipse. It is measured along the direction of Position.P[2].")
	@Required()
	@Guid("1b240401-6d34-4234-bb82-3aa3883e0508")
	@JacksonXmlProperty(isAttribute=false, localName = "SemiAxis2")
	private IfcPositiveLengthMeasure semiAxis2;


	public IfcEllipseProfileDef()
	{
	}

	public IfcEllipseProfileDef(IfcProfileTypeEnum profileType, IfcPositiveLengthMeasure semiAxis1, IfcPositiveLengthMeasure semiAxis2)
	{
		super(profileType);
		this.semiAxis1 = semiAxis1;
		this.semiAxis2 = semiAxis2;
	}

	public IfcPositiveLengthMeasure getSemiAxis1() {
		return this.semiAxis1;
	}

	public void setSemiAxis1(IfcPositiveLengthMeasure semiAxis1) {
		this.semiAxis1 = semiAxis1;
	}

	public IfcPositiveLengthMeasure getSemiAxis2() {
		return this.semiAxis2;
	}

	public void setSemiAxis2(IfcPositiveLengthMeasure semiAxis2) {
		this.semiAxis2 = semiAxis2;
	}


}

