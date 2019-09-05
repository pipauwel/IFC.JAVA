// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("85e8748b-e47c-4c11-8221-841a47ee4045")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("c537cef2-d867-4d4a-b645-6fb7f9be5d3c")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("8bb1166f-0cae-45c5-8ed1-aa0f0fe7d151")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("d890266c-3ca9-4602-814e-5a492138df03")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthZ;

	@Description("Rotational stiffness value about the x-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("652aaf78-6037-48c5-8be4-07a7c7a00c33")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthX;

	@Description("Rotational stiffness value about the y-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("2dd4f7da-1b7c-4e6b-8c65-0c3d9449a8eb")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthY;

	@Description("Rotational stiffness value about the z-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("3a97b6fa-656f-43d4-a0bb-9bb39568c488")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthZ;


	public IfcBoundaryEdgeCondition()
	{
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthX() {
		return this.translationalStiffnessByLengthX;
	}

	public void setTranslationalStiffnessByLengthX(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthX) {
		this.translationalStiffnessByLengthX = translationalStiffnessByLengthX;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthY() {
		return this.translationalStiffnessByLengthY;
	}

	public void setTranslationalStiffnessByLengthY(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthY) {
		this.translationalStiffnessByLengthY = translationalStiffnessByLengthY;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthZ() {
		return this.translationalStiffnessByLengthZ;
	}

	public void setTranslationalStiffnessByLengthZ(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthZ) {
		this.translationalStiffnessByLengthZ = translationalStiffnessByLengthZ;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthX() {
		return this.rotationalStiffnessByLengthX;
	}

	public void setRotationalStiffnessByLengthX(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthX) {
		this.rotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthY() {
		return this.rotationalStiffnessByLengthY;
	}

	public void setRotationalStiffnessByLengthY(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthY) {
		this.rotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthZ() {
		return this.rotationalStiffnessByLengthZ;
	}

	public void setRotationalStiffnessByLengthZ(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthZ) {
		this.rotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
	}


}

