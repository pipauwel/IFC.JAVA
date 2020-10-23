// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bce6c9f4-6d2e-4d7b-8d7e-5174db9b4051")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcMirroredProfileDef.class, name = "IfcMirroredProfileDef"))
public class IfcDerivedProfileDef extends IfcProfileDef
{
	@Description("The parent profile provides the origin of the transformation.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a965069b-b250-483b-bca0-761cd8940d02")
	@JacksonXmlProperty(isAttribute=false, localName = "parentProfile")
	private IfcProfileDef parentProfile;

	@Description("Transformation operator applied to the parent profile.")
	@DataMember(Order = 1)
	@Required()
	@Guid("00ccc2f6-4a36-4cf8-990a-50ae7863bf91")
	@JacksonXmlProperty(isAttribute=false, localName = "operator")
	private IfcCartesianTransformationOperator2D operator;

	@Description("The name by which the transformation may be referred to. The actual meaning of the name has to be defined in the context of applications.")
	@DataMember(Order = 2)
	@Guid("22457022-a959-4537-a5dd-0f712caa528f")
	@JacksonXmlProperty(isAttribute=false, localName = "label")
	private IfcLabel label;


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

	public IfcLabel getLabel() {
		return this.label;
	}

	public void setLabel(IfcLabel label) {
		this.label = label;
	}


}

