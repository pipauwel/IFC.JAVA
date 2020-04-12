// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f45b9882-e0fb-41eb-9b0a-805615a37351")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianTransformationOperator2DnonUniform extends IfcCartesianTransformationOperator2D
{
	@Description("The scaling value specified for the transformation along the axis 2. This is normally the y scale factor.")
	@DataMember(Order = 0)
	@Guid("b428bab1-b9bc-4f46-abce-c63c47f01e4c")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale2")
	private double scale2;


	public IfcCartesianTransformationOperator2DnonUniform()
	{
	}

	public IfcCartesianTransformationOperator2DnonUniform(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public double getScale2() {
		return this.scale2;
	}

	public void setScale2(double scale2) {
		this.scale2 = scale2;
	}

	public double getScl2() {
		return 0.0;
	}


}

