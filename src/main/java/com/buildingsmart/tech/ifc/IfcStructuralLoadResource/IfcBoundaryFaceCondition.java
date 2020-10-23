// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fa24f0f1-91ba-46b3-a264-4ec1679a4bce")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryFaceCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 0)
	@Guid("b7942964-9b3c-4b44-8aae-8d04af7422d0")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessByAreaX")
	private IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 1)
	@Guid("3a0404bd-fe3b-4cc4-af92-314dbf0e7499")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessByAreaY")
	private IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@DataMember(Order = 2)
	@Guid("d13259d4-20ba-49b3-a4fa-a2d7071ac628")
	@JacksonXmlProperty(isAttribute=true, localName = "translationalStiffnessByAreaZ")
	private IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaZ;


	public IfcBoundaryFaceCondition()
	{
	}

	public IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaX() {
		return this.translationalStiffnessByAreaX;
	}

	public void setTranslationalStiffnessByAreaX(IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaX) {
		this.translationalStiffnessByAreaX = translationalStiffnessByAreaX;
	}

	public IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaY() {
		return this.translationalStiffnessByAreaY;
	}

	public void setTranslationalStiffnessByAreaY(IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaY) {
		this.translationalStiffnessByAreaY = translationalStiffnessByAreaY;
	}

	public IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaZ() {
		return this.translationalStiffnessByAreaZ;
	}

	public void setTranslationalStiffnessByAreaZ(IfcModulusOfSubgradeReactionSelect translationalStiffnessByAreaZ) {
		this.translationalStiffnessByAreaZ = translationalStiffnessByAreaZ;
	}


}

