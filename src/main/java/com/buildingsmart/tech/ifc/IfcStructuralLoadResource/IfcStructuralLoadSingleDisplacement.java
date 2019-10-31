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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadSingleDisplacementDistortion;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadStatic;

@Guid("2563c310-58af-4669-8c17-3e479f918c14")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLoadSingleDisplacementDistortion.class, name = "IfcStructuralLoadSingleDisplacementDistortion"))
public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic
{
	@Description("Displacement in x-direction.")
	@Guid("df3a3c84-1b7c-4918-a57b-8d5a6f316d13")
	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementX")
	private double displacementX;

	@Description("Displacement in y-direction.")
	@Guid("627b03c9-8288-40d9-9e83-9c39d873dd0f")
	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementY")
	private double displacementY;

	@Description("Displacement in z-direction.")
	@Guid("30b31ff2-b478-470d-8f9c-d0fd2edfef07")
	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementZ")
	private double displacementZ;

	@Description("Rotation about the x-axis.")
	@Guid("030d51da-0844-48f4-8408-2f787a1ee54e")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRX")
	private double rotationalDisplacementRX;

	@Description("Rotation about the y-axis.")
	@Guid("5ec6bded-673f-4bec-a1c6-6dc845ff6ae0")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRY")
	private double rotationalDisplacementRY;

	@Description("Rotation about the z-axis.")
	@Guid("f2cb9b0e-9aff-4e09-ac97-30d2e2abd624")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRZ")
	private double rotationalDisplacementRZ;


	public IfcStructuralLoadSingleDisplacement()
	{
	}

	public double getDisplacementX() {
		return this.displacementX;
	}

	public void setDisplacementX(double displacementX) {
		this.displacementX = displacementX;
	}

	public double getDisplacementY() {
		return this.displacementY;
	}

	public void setDisplacementY(double displacementY) {
		this.displacementY = displacementY;
	}

	public double getDisplacementZ() {
		return this.displacementZ;
	}

	public void setDisplacementZ(double displacementZ) {
		this.displacementZ = displacementZ;
	}

	public double getRotationalDisplacementRX() {
		return this.rotationalDisplacementRX;
	}

	public void setRotationalDisplacementRX(double rotationalDisplacementRX) {
		this.rotationalDisplacementRX = rotationalDisplacementRX;
	}

	public double getRotationalDisplacementRY() {
		return this.rotationalDisplacementRY;
	}

	public void setRotationalDisplacementRY(double rotationalDisplacementRY) {
		this.rotationalDisplacementRY = rotationalDisplacementRY;
	}

	public double getRotationalDisplacementRZ() {
		return this.rotationalDisplacementRZ;
	}

	public void setRotationalDisplacementRZ(double rotationalDisplacementRZ) {
		this.rotationalDisplacementRZ = rotationalDisplacementRZ;
	}


}

