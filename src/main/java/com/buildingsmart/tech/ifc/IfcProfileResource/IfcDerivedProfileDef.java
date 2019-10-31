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
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcMirroredProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;

@Guid("bce6c9f4-6d2e-4d7b-8d7e-5174db9b4051")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcMirroredProfileDef.class, name = "IfcMirroredProfileDef"))
public class IfcDerivedProfileDef extends IfcProfileDef
{
	@Description("The parent profile provides the origin of the transformation.")
	@Required()
	@Guid("a965069b-b250-483b-bca0-761cd8940d02")
	@JacksonXmlProperty(isAttribute=false, localName = "ParentProfile")
	private IfcProfileDef parentProfile;

	@Description("Transformation operator applied to the parent profile.")
	@Required()
	@Guid("00ccc2f6-4a36-4cf8-990a-50ae7863bf91")
	@JacksonXmlProperty(isAttribute=false, localName = "Operator")
	private IfcCartesianTransformationOperator2D operator;

	@Description("The name by which the transformation may be referred to. The actual meaning of the name has to be defined in the context of applications.")
	@Guid("22457022-a959-4537-a5dd-0f712caa528f")
	@JacksonXmlProperty(isAttribute=true, localName = "Label")
	private String label;


	public IfcDerivedProfileDef()
	{
	}

	public IfcDerivedProfileDef(IfcProfileTypeEnum profileType, IfcProfileDef parentProfile, IfcCartesianTransformationOperator2D _operator)
	{
		super(profileType);
		this.parentProfile = parentProfile;
		this.operator = _operator;
	}

	public IfcProfileDef getParentProfile() {
		return this.parentProfile;
	}

	public void setParentProfile(IfcProfileDef parentProfile) {
		this.parentProfile = parentProfile;
	}

	public IfcCartesianTransformationOperator2D getOperator() {
		return this.operator;
	}

	public void setOperator(IfcCartesianTransformationOperator2D operator) {
		this.operator = operator;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}

