// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("da40a055-7f34-44ae-85cb-40b20d82ae5a")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "Axis1")
	@Description("The direction used to determine U[1], the derived X axis direction.")
	@Guid("77d3a933-8ecd-40ec-a018-58dcd07018c7")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis1;

	@JacksonXmlProperty(isAttribute=false, localName = "Axis2")
	@Description("The direction used to determine U[2], the derived Y axis direction.")
	@Guid("c87eb32c-c021-4fa9-888e-27a2a2d49f73")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis2;

	@JacksonXmlProperty(isAttribute=false, localName = "LocalOrigin")
	@Description("The required translation, specified as a cartesian point. The actual translation included in the transformation is from the geometric origin to the local origin.")
	@Required()
	@Guid("c81e6d3a-d622-4443-a670-a2c528ea33dc")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint localOrigin;

	@JacksonXmlProperty(isAttribute=true, localName = "Scale")
	@Description("The scaling value specified for the transformation.")
	@Guid("3240216d-4df6-4546-a6f0-58d59fa41159")
	private double scale;


	public IfcCartesianTransformationOperator()
	{
	}

	public IfcCartesianTransformationOperator(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint localOrigin)
	{
		this.localOrigin = localOrigin;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getAxis1() {
		return this.axis1;
	}

	public void setAxis1(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis1) {
		this.axis1 = axis1;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getAxis2() {
		return this.axis2;
	}

	public void setAxis2(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis2) {
		this.axis2 = axis2;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getLocalOrigin() {
		return this.localOrigin;
	}

	public void setLocalOrigin(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint localOrigin) {
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

