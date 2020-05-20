// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPlaneAngleMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2563c310-58af-4669-8c17-3e479f918c14")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLoadSingleDisplacementDistortion.class, name = "IfcStructuralLoadSingleDisplacementDistortion"))
public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic
{
	@Description("Displacement in x-direction.")
	@DataMember(Order = 0)
	@Guid("df3a3c84-1b7c-4918-a57b-8d5a6f316d13")
	@JacksonXmlProperty(isAttribute=false, localName = "displacementX")
	private IfcLengthMeasure displacementX;

	@Description("Displacement in y-direction.")
	@DataMember(Order = 1)
	@Guid("627b03c9-8288-40d9-9e83-9c39d873dd0f")
	@JacksonXmlProperty(isAttribute=false, localName = "displacementY")
	private IfcLengthMeasure displacementY;

	@Description("Displacement in z-direction.")
	@DataMember(Order = 2)
	@Guid("30b31ff2-b478-470d-8f9c-d0fd2edfef07")
	@JacksonXmlProperty(isAttribute=false, localName = "displacementZ")
	private IfcLengthMeasure displacementZ;

	@Description("Rotation about the x-axis.")
	@DataMember(Order = 3)
	@Guid("030d51da-0844-48f4-8408-2f787a1ee54e")
	@JacksonXmlProperty(isAttribute=false, localName = "rotationalDisplacementRX")
	private IfcPlaneAngleMeasure rotationalDisplacementRX;

	@Description("Rotation about the y-axis.")
	@DataMember(Order = 4)
	@Guid("5ec6bded-673f-4bec-a1c6-6dc845ff6ae0")
	@JacksonXmlProperty(isAttribute=false, localName = "rotationalDisplacementRY")
	private IfcPlaneAngleMeasure rotationalDisplacementRY;

	@Description("Rotation about the z-axis.")
	@DataMember(Order = 5)
	@Guid("f2cb9b0e-9aff-4e09-ac97-30d2e2abd624")
	@JacksonXmlProperty(isAttribute=false, localName = "rotationalDisplacementRZ")
	private IfcPlaneAngleMeasure rotationalDisplacementRZ;


	public IfcStructuralLoadSingleDisplacement()
	{
	}

	public IfcLengthMeasure getDisplacementX() {
		return this.displacementX;
	}

	public void setDisplacementX(IfcLengthMeasure displacementX) {
		this.displacementX = displacementX;
	}

	public IfcLengthMeasure getDisplacementY() {
		return this.displacementY;
	}

	public void setDisplacementY(IfcLengthMeasure displacementY) {
		this.displacementY = displacementY;
	}

	public IfcLengthMeasure getDisplacementZ() {
		return this.displacementZ;
	}

	public void setDisplacementZ(IfcLengthMeasure displacementZ) {
		this.displacementZ = displacementZ;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRX() {
		return this.rotationalDisplacementRX;
	}

	public void setRotationalDisplacementRX(IfcPlaneAngleMeasure rotationalDisplacementRX) {
		this.rotationalDisplacementRX = rotationalDisplacementRX;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRY() {
		return this.rotationalDisplacementRY;
	}

	public void setRotationalDisplacementRY(IfcPlaneAngleMeasure rotationalDisplacementRY) {
		this.rotationalDisplacementRY = rotationalDisplacementRY;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRZ() {
		return this.rotationalDisplacementRZ;
	}

	public void setRotationalDisplacementRZ(IfcPlaneAngleMeasure rotationalDisplacementRZ) {
		this.rotationalDisplacementRZ = rotationalDisplacementRZ;
	}


}

