// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement2D;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("eddbf896-fef4-49ba-b5c8-5315a44af82c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAsymmetricIShapeProfileDef.class, name = "IfcAsymmetricIShapeProfileDef"), @JsonSubTypes.Type(value = IfcCircleProfileDef.class, name = "IfcCircleProfileDef"), @JsonSubTypes.Type(value = IfcCShapeProfileDef.class, name = "IfcCShapeProfileDef"), @JsonSubTypes.Type(value = IfcEllipseProfileDef.class, name = "IfcEllipseProfileDef"), @JsonSubTypes.Type(value = IfcIShapeProfileDef.class, name = "IfcIShapeProfileDef"), @JsonSubTypes.Type(value = IfcLShapeProfileDef.class, name = "IfcLShapeProfileDef"), @JsonSubTypes.Type(value = IfcRectangleProfileDef.class, name = "IfcRectangleProfileDef"), @JsonSubTypes.Type(value = IfcTrapeziumProfileDef.class, name = "IfcTrapeziumProfileDef"), @JsonSubTypes.Type(value = IfcTShapeProfileDef.class, name = "IfcTShapeProfileDef"), @JsonSubTypes.Type(value = IfcUShapeProfileDef.class, name = "IfcUShapeProfileDef"), @JsonSubTypes.Type(value = IfcZShapeProfileDef.class, name = "IfcZShapeProfileDef")})
public abstract class IfcParameterizedProfileDef extends IfcProfileDef
{
	@Description("Position coordinate system of the parameterized profile definition. If unspecified, no translation and no rotation is applied.")
	@DataMember(Order = 0)
	@Guid("b7f101fa-76d8-4290-ac63-aa0b786f3592")
	@JacksonXmlProperty(isAttribute=false, localName = "position")
	private IfcAxis2Placement2D position;


	public IfcParameterizedProfileDef()
	{
	}

	public IfcParameterizedProfileDef(IfcProfileTypeEnum profileType)
	{
		super(profileType);
	}

	public IfcAxis2Placement2D getPosition() {
		return this.position;
	}

	public void setPosition(IfcAxis2Placement2D position) {
		this.position = position;
	}


}

