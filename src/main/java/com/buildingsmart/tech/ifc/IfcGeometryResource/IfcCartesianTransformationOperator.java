// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("da40a055-7f34-44ae-85cb-40b20d82ae5a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCartesianTransformationOperator2D.class, name = "IfcCartesianTransformationOperator2D"), @JsonSubTypes.Type(value = IfcCartesianTransformationOperator3D.class, name = "IfcCartesianTransformationOperator3D")})
public abstract class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem
{
	@Description("The direction used to determine U[1], the derived X axis direction.")
	@DataMember(Order = 0)
	@Guid("77d3a933-8ecd-40ec-a018-58dcd07018c7")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis1")
	private IfcDirection axis1;

	@Description("The direction used to determine U[2], the derived Y axis direction.")
	@DataMember(Order = 1)
	@Guid("c87eb32c-c021-4fa9-888e-27a2a2d49f73")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis2")
	private IfcDirection axis2;

	@Description("The required translation, specified as a cartesian point. The actual translation included in the transformation is from the geometric origin to the local origin.")
	@DataMember(Order = 2)
	@Required()
	@Guid("c81e6d3a-d622-4443-a670-a2c528ea33dc")
	@JacksonXmlProperty(isAttribute=false, localName = "LocalOrigin")
	private IfcCartesianPoint localOrigin;

	@Description("The scaling value specified for the transformation.")
	@DataMember(Order = 3)
	@Guid("3240216d-4df6-4546-a6f0-58d59fa41159")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale")
	private double scale;


	public IfcCartesianTransformationOperator()
	{
	}

	public IfcCartesianTransformationOperator(IfcCartesianPoint localOrigin)
	{
		this.localOrigin = localOrigin;
	}

	public IfcDirection getAxis1() {
		return this.axis1;
	}

	public void setAxis1(IfcDirection axis1) {
		this.axis1 = axis1;
	}

	public IfcDirection getAxis2() {
		return this.axis2;
	}

	public void setAxis2(IfcDirection axis2) {
		this.axis2 = axis2;
	}

	public IfcCartesianPoint getLocalOrigin() {
		return this.localOrigin;
	}

	public void setLocalOrigin(IfcCartesianPoint localOrigin) {
		this.localOrigin = localOrigin;
	}

	public double getScale() {
		return this.scale;
	}

	public void setScale(double scale) {
		this.scale = scale;
	}

	public double getScl() {
		return 0.0;
	}

	public int getDim() {
		return 0;
	}


}

