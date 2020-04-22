// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadSingleForceWarping;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadStatic;

@Guid("c501d0e9-6233-4df9-859a-4a2adf4a47b3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLoadSingleForceWarping.class, name = "IfcStructuralLoadSingleForceWarping"))
public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic
{
	@Description("Force value in x-direction.")
	@DataMember(Order = 0)
	@Guid("8431526b-0b25-451b-a59f-07fb9e510a75")
	@JacksonXmlProperty(isAttribute=true, localName = "ForceX")
	private double forceX;

	@Description("Force value in y-direction.")
	@DataMember(Order = 1)
	@Guid("69b32ae7-a18f-4257-b273-2d29d13aac4e")
	@JacksonXmlProperty(isAttribute=true, localName = "ForceY")
	private double forceY;

	@Description("Force value in z-direction.")
	@DataMember(Order = 2)
	@Guid("8d66ace6-6703-4ec5-87ea-965d5821c756")
	@JacksonXmlProperty(isAttribute=true, localName = "ForceZ")
	private double forceZ;

	@Description("Moment about the x-axis.")
	@DataMember(Order = 3)
	@Guid("6a9e3e2e-1022-476f-99b5-3f2e32665aca")
	@JacksonXmlProperty(isAttribute=true, localName = "MomentX")
	private double momentX;

	@Description("Moment about the y-axis.")
	@DataMember(Order = 4)
	@Guid("8811d283-68df-4ddd-9c7b-8b146d04a12b")
	@JacksonXmlProperty(isAttribute=true, localName = "MomentY")
	private double momentY;

	@Description("Moment about the z-axis.")
	@DataMember(Order = 5)
	@Guid("8448fee7-7bd3-42d1-b6f1-ab7d46fdeba2")
	@JacksonXmlProperty(isAttribute=true, localName = "MomentZ")
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

