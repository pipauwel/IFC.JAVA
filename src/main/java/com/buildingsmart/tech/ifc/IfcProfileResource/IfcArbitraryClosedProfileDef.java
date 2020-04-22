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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcArbitraryProfileDefWithVoids;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("b6ccca8d-998a-47ed-beac-ef1b44ee5681")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcArbitraryProfileDefWithVoids.class, name = "IfcArbitraryProfileDefWithVoids"))
public class IfcArbitraryClosedProfileDef extends IfcProfileDef
{
	@Description("Bounded curve, defining the outer boundaries of the arbitrary profile.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e5eb7078-ed29-401a-9e78-e38beec339ff")
	@JacksonXmlProperty(isAttribute=false, localName = "OuterCurve")
	private IfcCurve outerCurve;


	public IfcArbitraryClosedProfileDef()
	{
	}

	public IfcArbitraryClosedProfileDef(IfcProfileTypeEnum profileType, IfcCurve outerCurve)
	{
		super(profileType);
		this.outerCurve = outerCurve;
	}

	public IfcCurve getOuterCurve() {
		return this.outerCurve;
	}

	public void setOuterCurve(IfcCurve outerCurve) {
		this.outerCurve = outerCurve;
	}


}

