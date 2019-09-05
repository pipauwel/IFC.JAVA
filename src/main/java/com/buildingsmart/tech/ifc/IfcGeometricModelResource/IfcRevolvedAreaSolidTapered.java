// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d15358b0-162a-4760-993f-02cce84f936b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRevolvedAreaSolidTapered extends IfcRevolvedAreaSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "EndSweptArea")
	@Required()
	@Guid("965ddc62-69c3-429c-b725-41e028fb1a3d")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea;


	public IfcRevolvedAreaSolidTapered()
	{
	}

	public IfcRevolvedAreaSolidTapered(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axis, double angle, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea)
	{
		super(sweptArea, axis, angle);
		this.endSweptArea = endSweptArea;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getEndSweptArea() {
		return this.endSweptArea;
	}

	public void setEndSweptArea(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endSweptArea) {
		this.endSweptArea = endSweptArea;
	}


}

