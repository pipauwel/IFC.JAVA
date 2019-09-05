// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("eddbf896-fef4-49ba-b5c8-5315a44af82c")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcParameterizedProfileDef extends IfcProfileDef
{
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("Position coordinate system of the parameterized profile definition. If unspecified, no translation and no rotation is applied.")
	@Guid("b7f101fa-76d8-4290-ac63-aa0b786f3592")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement2D position;


	public IfcParameterizedProfileDef()
	{
	}

	public IfcParameterizedProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType)
	{
		super(profileType);
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement2D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement2D position) {
		this.position = position;
	}


}

