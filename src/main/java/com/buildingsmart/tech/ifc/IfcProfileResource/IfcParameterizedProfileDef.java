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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcAsymmetricIShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcCircleProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcCShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcEllipseProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcIShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcLShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcRectangleProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcTrapeziumProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcTShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcUShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcZShapeProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;

@Guid("eddbf896-fef4-49ba-b5c8-5315a44af82c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAsymmetricIShapeProfileDef.class, name = "IfcAsymmetricIShapeProfileDef"), @JsonSubTypes.Type(value = IfcCircleProfileDef.class, name = "IfcCircleProfileDef"), @JsonSubTypes.Type(value = IfcCShapeProfileDef.class, name = "IfcCShapeProfileDef"), @JsonSubTypes.Type(value = IfcEllipseProfileDef.class, name = "IfcEllipseProfileDef"), @JsonSubTypes.Type(value = IfcIShapeProfileDef.class, name = "IfcIShapeProfileDef"), @JsonSubTypes.Type(value = IfcLShapeProfileDef.class, name = "IfcLShapeProfileDef"), @JsonSubTypes.Type(value = IfcRectangleProfileDef.class, name = "IfcRectangleProfileDef"), @JsonSubTypes.Type(value = IfcTrapeziumProfileDef.class, name = "IfcTrapeziumProfileDef"), @JsonSubTypes.Type(value = IfcTShapeProfileDef.class, name = "IfcTShapeProfileDef"), @JsonSubTypes.Type(value = IfcUShapeProfileDef.class, name = "IfcUShapeProfileDef"), @JsonSubTypes.Type(value = IfcZShapeProfileDef.class, name = "IfcZShapeProfileDef")})
public abstract class IfcParameterizedProfileDef extends IfcProfileDef
{
	@Description("Position coordinate system of the parameterized profile definition. If unspecified, no translation and no rotation is applied.")
	@DataMember(Order = 0)
	@Guid("b7f101fa-76d8-4290-ac63-aa0b786f3592")
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
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

