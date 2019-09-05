// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f7c8c08c-d40d-47b7-86fa-76e7d53307af")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcConic extends IfcCurve
{
	@Description("The location and orientation of the conic. Further details of the interpretation of this attribute are given for the individual subtypes.\"")
	@Required()
	@Guid("980a563c-6502-44d2-9643-0799c4467941")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement position;


	public IfcConic()
	{
	}

	public IfcConic(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement position)
	{
		this.position = position;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement position) {
		this.position = position;
	}


}

