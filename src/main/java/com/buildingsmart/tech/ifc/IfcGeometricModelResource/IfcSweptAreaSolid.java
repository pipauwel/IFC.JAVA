// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1bfb8302-5211-4de4-a3b9-20e200cf1097")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSweptAreaSolid extends IfcSolidModel
{
	@JacksonXmlProperty(isAttribute=false, localName = "SweptArea")
	@Description("The surface defining the area to be swept. It is given as a profile definition within the xy plane of the position coordinate system.")
	@Required()
	@Guid("1c1cfe35-c525-4b8e-967a-78258ff390f3")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea;

	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("Position coordinate system for the resulting swept solid of the sweeping operation. The position coordinate system allows for re-positioning of the swept solid. If not provided, the swept solid remains within the position as determined by the cross section or by the directrix used for the sweeping operation.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("fccab43b-72fa-486a-b491-6d2133f1474b")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position;


	public IfcSweptAreaSolid()
	{
	}

	public IfcSweptAreaSolid(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea)
	{
		this.sweptArea = sweptArea;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getSweptArea() {
		return this.sweptArea;
	}

	public void setSweptArea(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea) {
		this.sweptArea = sweptArea;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position) {
		this.position = position;
	}


}

