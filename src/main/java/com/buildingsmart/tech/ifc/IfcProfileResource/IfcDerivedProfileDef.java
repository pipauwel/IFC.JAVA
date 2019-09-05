// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bce6c9f4-6d2e-4d7b-8d7e-5174db9b4051")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDerivedProfileDef extends IfcProfileDef
{
	@JacksonXmlProperty(isAttribute=false, localName = "ParentProfile")
	@Description("The parent profile provides the origin of the transformation.")
	@Required()
	@Guid("a965069b-b250-483b-bca0-761cd8940d02")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef parentProfile;

	@JacksonXmlProperty(isAttribute=false, localName = "Operator")
	@Description("Transformation operator applied to the parent profile.")
	@Required()
	@Guid("00ccc2f6-4a36-4cf8-990a-50ae7863bf91")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D operator;

	@JacksonXmlProperty(isAttribute=true, localName = "Label")
	@Description("The name by which the transformation may be referred to. The actual meaning of the name has to be defined in the context of applications.")
	@Guid("22457022-a959-4537-a5dd-0f712caa528f")
	private String label;


	public IfcDerivedProfileDef()
	{
	}

	public IfcDerivedProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef parentProfile, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D _operator)
	{
		super(profileType);
		this.parentProfile = parentProfile;
		this.operator = _operator;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getParentProfile() {
		return this.parentProfile;
	}

	public void setParentProfile(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef parentProfile) {
		this.parentProfile = parentProfile;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D getOperator() {
		return this.operator;
	}

	public void setOperator(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D operator) {
		this.operator = operator;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}

