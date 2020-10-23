// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("137f3407-b6b9-4752-b668-e9e574a1b3fd")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCartesianTransformationOperator3DnonUniform.class, name = "IfcCartesianTransformationOperator3DnonUniform"))
public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator
{
	@Description("The exact direction of U[3], the derived Z axis direction.")
	@DataMember(Order = 0)
	@Guid("42759c76-3cfb-44fb-9a58-78c6f7c1c245")
	@JacksonXmlProperty(isAttribute=false, localName = "axis3")
	private IfcDirection axis3;


	public IfcCartesianTransformationOperator3D()
	{
	}

	public IfcCartesianTransformationOperator3D(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public IfcDirection getAxis3() {
		return this.axis3;
	}

	public void setAxis3(IfcDirection axis3) {
		this.axis3 = axis3;
	}

	@JsonIgnore
	public List<IfcDirection> getU() {
		//TODO
		// U:=IfcBaseAxis(3,SELF\IfcCartesianTransformationOperator.Axis1, SELF\IfcCartesianTransformationOperator.Axis2,Axis3)
		return null;
	}


}

