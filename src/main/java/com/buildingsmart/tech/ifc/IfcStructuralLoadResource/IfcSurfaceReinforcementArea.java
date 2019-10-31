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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult;

@Guid("5c929647-20a8-4225-a930-0d718d2b60e1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceReinforcementArea extends IfcStructuralLoadOrResult
{
	@Description("Reinforcement at the face of the member which is located at the side of the positive local z direction of the surface member.  Specified as area per length, e.g. square metre per metre (hence length measure, e.g. metre).  The reinforcement area may be specified for two or three directions of reinforcement bars.")
	@Guid("1659501c-1100-4ab7-b15a-c0365324dcb9")
	@MinLength(2)
	@MaxLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "SurfaceReinforcement1")
	private List<Double> surfaceReinforcement1;

	@Description("Reinforcement at the face of the member which is located at the side of the negative local z direction of the surface member.  Specified as area per length, e.g. square metre per metre (hence length measure, e.g. metre).  The reinforcement area may be specified for two or three directions of reinforcement bars.")
	@Guid("515bb7dd-3c55-498f-b0c9-0ac79b544936")
	@MinLength(2)
	@MaxLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "SurfaceReinforcement2")
	private List<Double> surfaceReinforcement2;

	@Description("Shear reinforcement.  Specified as area per area, e.g. square metre per square metre (hence ratio measure, i.e. unitless).")
	@Guid("dd92eb3e-9d3f-4315-abb6-94152ed4c09f")
	@JacksonXmlProperty(isAttribute=true, localName = "ShearReinforcement")
	private double shearReinforcement;


	public IfcSurfaceReinforcementArea()
	{
	}

	public List<Double> getSurfaceReinforcement1() {
		return this.surfaceReinforcement1;
	}

	public List<Double> getSurfaceReinforcement2() {
		return this.surfaceReinforcement2;
	}

	public double getShearReinforcement() {
		return this.shearReinforcement;
	}

	public void setShearReinforcement(double shearReinforcement) {
		this.shearReinforcement = shearReinforcement;
	}


}

