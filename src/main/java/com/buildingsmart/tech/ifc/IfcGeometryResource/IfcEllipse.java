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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9f128686-ff25-4c00-9bcc-4b9cc58c4598")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEllipse extends IfcConic
{
	@Description("The first radius of the ellipse which shall be positive. Placement.Axes[1] gives the direction of the SemiAxis1.")
	@DataMember(Order = 0)
	@Required()
	@Guid("3acacf5b-ec99-4f5d-a82e-85a6f7a04b36")
	@JacksonXmlProperty(isAttribute=false, localName = "SemiAxis1")
	private double semiAxis1; //IfcPositiveLengthMeasure

	@Description("The second radius of the ellipse which shall be positive.")
	@DataMember(Order = 1)
	@Required()
	@Guid("f589e68f-d624-43a9-b3b0-661d0743325c")
	@JacksonXmlProperty(isAttribute=false, localName = "SemiAxis2")
	private double semiAxis2; //IfcPositiveLengthMeasure


	public IfcEllipse()
	{
	}

	public IfcEllipse(IfcAxis2Placement position, double semiAxis1, double semiAxis2)
	{
		super(position);
		this.semiAxis1 = semiAxis1;
		this.semiAxis2 = semiAxis2;
	}

	public double getSemiAxis1() {
		return this.semiAxis1;
	}

	public void setSemiAxis1(double semiAxis1) {
		this.semiAxis1 = semiAxis1;
	}

	public double getSemiAxis2() {
		return this.semiAxis2;
	}

	public void setSemiAxis2(double semiAxis2) {
		this.semiAxis2 = semiAxis2;
	}


}

