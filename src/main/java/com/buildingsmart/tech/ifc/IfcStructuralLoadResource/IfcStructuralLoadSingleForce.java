// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c501d0e9-6233-4df9-859a-4a2adf4a47b3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic
{
	@JacksonXmlProperty(isAttribute=true, localName = "ForceX")
	@Description("Force value in x-direction.")
	@Guid("8431526b-0b25-451b-a59f-07fb9e510a75")
	private double forceX;

	@JacksonXmlProperty(isAttribute=true, localName = "ForceY")
	@Description("Force value in y-direction.")
	@Guid("69b32ae7-a18f-4257-b273-2d29d13aac4e")
	private double forceY;

	@JacksonXmlProperty(isAttribute=true, localName = "ForceZ")
	@Description("Force value in z-direction.")
	@Guid("8d66ace6-6703-4ec5-87ea-965d5821c756")
	private double forceZ;

	@JacksonXmlProperty(isAttribute=true, localName = "MomentX")
	@Description("Moment about the x-axis.")
	@Guid("6a9e3e2e-1022-476f-99b5-3f2e32665aca")
	private double momentX;

	@JacksonXmlProperty(isAttribute=true, localName = "MomentY")
	@Description("Moment about the y-axis.")
	@Guid("8811d283-68df-4ddd-9c7b-8b146d04a12b")
	private double momentY;

	@JacksonXmlProperty(isAttribute=true, localName = "MomentZ")
	@Description("Moment about the z-axis.")
	@Guid("8448fee7-7bd3-42d1-b6f1-ab7d46fdeba2")
	private double momentZ;


	public IfcStructuralLoadSingleForce()
	{
	}

	public double getForceX() {
		return this.forceX;
	}

	public void setForceX(double forceX) {
		this.forceX = forceX;
	}

	public double getForceY() {
		return this.forceY;
	}

	public void setForceY(double forceY) {
		this.forceY = forceY;
	}

	public double getForceZ() {
		return this.forceZ;
	}

	public void setForceZ(double forceZ) {
		this.forceZ = forceZ;
	}

	public double getMomentX() {
		return this.momentX;
	}

	public void setMomentX(double momentX) {
		this.momentX = momentX;
	}

	public double getMomentY() {
		return this.momentY;
	}

	public void setMomentY(double momentY) {
		this.momentY = momentY;
	}

	public double getMomentZ() {
		return this.momentZ;
	}

	public void setMomentZ(double momentZ) {
		this.momentZ = momentZ;
	}


}

