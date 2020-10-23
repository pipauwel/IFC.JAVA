// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0454a0f4-fdfb-4856-bad8-c1a1202137d1")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBoundaryNodeConditionWarping.class, name = "IfcBoundaryNodeConditionWarping"))
public class IfcBoundaryNodeCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 0)
	@Guid("28749803-afba-4c8e-af1b-b6633ca1fde5")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessX")
	private IfcTranslationalStiffnessSelect translationalStiffnessX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 1)
	@Guid("bb56ff40-b0c7-4644-b143-c6943fd818e7")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessY")
	private IfcTranslationalStiffnessSelect translationalStiffnessY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 2)
	@Guid("a218945f-54b2-4f68-95b8-2f7dd2bfa66c")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessZ")
	private IfcTranslationalStiffnessSelect translationalStiffnessZ;

	@Description("Rotational stiffness value about the x-axis of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 3)
	@Guid("5bd4695d-524d-42ba-8631-c02424cc5c89")
	@JacksonXmlProperty(isAttribute=true, localName = "rotationalStiffnessX")
	private IfcRotationalStiffnessSelect rotationalStiffnessX;

	@Description("Rotational stiffness value about the y-axis of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 4)
	@Guid("c7866159-d74a-4fd8-8b19-2e5480ca4903")
	@JacksonXmlProperty(isAttribute=true, localName = "rotationalStiffnessY")
	private IfcRotationalStiffnessSelect rotationalStiffnessY;

	@Description("Rotational stiffness value about the z-axis of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 5)
	@Guid("0f89600a-a85f-402d-805e-76aea33a0370")
	@JacksonXmlProperty(isAttribute=true, localName = "rotationalStiffnessZ")
	private IfcRotationalStiffnessSelect rotationalStiffnessZ;


	public IfcBoundaryNodeCondition()
	{
	}

	public IfcTranslationalStiffnessSelect getTranslationalStiffnessX() {
		return this.translationalStiffnessX;
	}

	public void setTranslationalStiffnessX(IfcTranslationalStiffnessSelect translationalStiffnessX) {
		this.translationalStiffnessX = translationalStiffnessX;
	}

	public IfcTranslationalStiffnessSelect getTranslationalStiffnessY() {
		return this.translationalStiffnessY;
	}

	public void setTranslationalStiffnessY(IfcTranslationalStiffnessSelect translationalStiffnessY) {
		this.translationalStiffnessY = translationalStiffnessY;
	}

	public IfcTranslationalStiffnessSelect getTranslationalStiffnessZ() {
		return this.translationalStiffnessZ;
	}

	public void setTranslationalStiffnessZ(IfcTranslationalStiffnessSelect translationalStiffnessZ) {
		this.translationalStiffnessZ = translationalStiffnessZ;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessX() {
		return this.rotationalStiffnessX;
	}

	public void setRotationalStiffnessX(IfcRotationalStiffnessSelect rotationalStiffnessX) {
		this.rotationalStiffnessX = rotationalStiffnessX;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessY() {
		return this.rotationalStiffnessY;
	}

	public void setRotationalStiffnessY(IfcRotationalStiffnessSelect rotationalStiffnessY) {
		this.rotationalStiffnessY = rotationalStiffnessY;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessZ() {
		return this.rotationalStiffnessZ;
	}

	public void setRotationalStiffnessZ(IfcRotationalStiffnessSelect rotationalStiffnessZ) {
		this.rotationalStiffnessZ = rotationalStiffnessZ;
	}


}

