// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("fa24f0f1-91ba-46b3-a264-4ec1679a4bce")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryFaceCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("b7942964-9b3c-4b44-8aae-8d04af7422d0")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("3a0404bd-fe3b-4cc4-af92-314dbf0e7499")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("d13259d4-20ba-49b3-a4fa-a2d7071ac628")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaZ;


	public IfcBoundaryFaceCondition()
	{
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaX() {
		return this.translationalStiffnessByAreaX;
	}

	public void setTranslationalStiffnessByAreaX(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaX) {
		this.translationalStiffnessByAreaX = translationalStiffnessByAreaX;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaY() {
		return this.translationalStiffnessByAreaY;
	}

	public void setTranslationalStiffnessByAreaY(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaY) {
		this.translationalStiffnessByAreaY = translationalStiffnessByAreaY;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaZ() {
		return this.translationalStiffnessByAreaZ;
	}

	public void setTranslationalStiffnessByAreaZ(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaZ) {
		this.translationalStiffnessByAreaZ = translationalStiffnessByAreaZ;
	}


}

