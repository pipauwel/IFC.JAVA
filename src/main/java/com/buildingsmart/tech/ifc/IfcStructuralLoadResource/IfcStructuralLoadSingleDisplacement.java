// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2563c310-58af-4669-8c17-3e479f918c14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic
{
	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementX")
	@Description("Displacement in x-direction.")
	@Guid("df3a3c84-1b7c-4918-a57b-8d5a6f316d13")
	private double displacementX;

	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementY")
	@Description("Displacement in y-direction.")
	@Guid("627b03c9-8288-40d9-9e83-9c39d873dd0f")
	private double displacementY;

	@JacksonXmlProperty(isAttribute=true, localName = "DisplacementZ")
	@Description("Displacement in z-direction.")
	@Guid("30b31ff2-b478-470d-8f9c-d0fd2edfef07")
	private double displacementZ;

	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRX")
	@Description("Rotation about the x-axis.")
	@Guid("030d51da-0844-48f4-8408-2f787a1ee54e")
	private double rotationalDisplacementRX;

	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRY")
	@Description("Rotation about the y-axis.")
	@Guid("5ec6bded-673f-4bec-a1c6-6dc845ff6ae0")
	private double rotationalDisplacementRY;

	@JacksonXmlProperty(isAttribute=true, localName = "RotationalDisplacementRZ")
	@Description("Rotation about the z-axis.")
	@Guid("f2cb9b0e-9aff-4e09-ac97-30d2e2abd624")
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

