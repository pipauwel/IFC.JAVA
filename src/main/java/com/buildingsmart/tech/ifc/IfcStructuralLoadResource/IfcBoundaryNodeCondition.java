// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0454a0f4-fdfb-4856-bad8-c1a1202137d1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryNodeCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("28749803-afba-4c8e-af1b-b6633ca1fde5")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("bb56ff40-b0c7-4644-b143-c6943fd818e7")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("a218945f-54b2-4f68-95b8-2f7dd2bfa66c")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessZ;

	@Description("Rotational stiffness value about the x-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("5bd4695d-524d-42ba-8631-c02424cc5c89")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessX;

	@Description("Rotational stiffness value about the y-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("c7866159-d74a-4fd8-8b19-2e5480ca4903")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessY;

	@Description("Rotational stiffness value about the z-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("0f89600a-a85f-402d-805e-76aea33a0370")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessZ;


	public IfcBoundaryNodeCondition()
	{
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect getTranslationalStiffnessX() {
		return this.translationalStiffnessX;
	}

	public void setTranslationalStiffnessX(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessX) {
		this.translationalStiffnessX = translationalStiffnessX;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect getTranslationalStiffnessY() {
		return this.translationalStiffnessY;
	}

	public void setTranslationalStiffnessY(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessY) {
		this.translationalStiffnessY = translationalStiffnessY;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect getTranslationalStiffnessZ() {
		return this.translationalStiffnessZ;
	}

	public void setTranslationalStiffnessZ(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect translationalStiffnessZ) {
		this.translationalStiffnessZ = translationalStiffnessZ;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect getRotationalStiffnessX() {
		return this.rotationalStiffnessX;
	}

	public void setRotationalStiffnessX(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessX) {
		this.rotationalStiffnessX = rotationalStiffnessX;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect getRotationalStiffnessY() {
		return this.rotationalStiffnessY;
	}

	public void setRotationalStiffnessY(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessY) {
		this.rotationalStiffnessY = rotationalStiffnessY;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect getRotationalStiffnessZ() {
		return this.rotationalStiffnessZ;
	}

	public void setRotationalStiffnessZ(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcRotationalStiffnessSelect rotationalStiffnessZ) {
		this.rotationalStiffnessZ = rotationalStiffnessZ;
	}


}

