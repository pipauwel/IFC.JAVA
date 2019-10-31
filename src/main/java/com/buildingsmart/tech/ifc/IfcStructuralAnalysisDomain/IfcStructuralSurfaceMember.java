// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberVarying;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum;

@Guid("98531769-b684-4095-a8e0-843609f7cef0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralSurfaceMemberVarying.class, name = "IfcStructuralSurfaceMemberVarying"))
public class IfcStructuralSurfaceMember extends IfcStructuralMember
{
	@Description("Type of member with respect to its load carrying behavior in this analysis idealization.")
	@Required()
	@Guid("7f571c3a-8900-4457-889e-282980a58f89")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcStructuralSurfaceMemberTypeEnum predefinedType;

	@Description("Defines the typically understood thickness of the structural surface member, measured normal to its reference surface.")
	@Guid("dc70652b-1bc6-4bef-8a4f-70049ac774f9")
	@JacksonXmlProperty(isAttribute=false, localName = "Thickness")
	private IfcPositiveLengthMeasure thickness;


	public IfcStructuralSurfaceMember()
	{
	}

	public IfcStructuralSurfaceMember(String globalId, IfcStructuralSurfaceMemberTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcStructuralSurfaceMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralSurfaceMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}


}

