// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("89fd5813-f37e-4602-a4ad-8cdb9bf8869c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceOfRevolution extends IfcSweptSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "AxisPosition")
	@Description("A point on the axis of revolution and the direction of the axis of revolution.")
	@Required()
	@Guid("f5ca3d78-4e7d-4f00-8f91-e7bad20ebeb5")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axisPosition;


	public IfcSurfaceOfRevolution()
	{
	}

	public IfcSurfaceOfRevolution(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptCurve, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axisPosition)
	{
		super(sweptCurve);
		this.axisPosition = axisPosition;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement getAxisPosition() {
		return this.axisPosition;
	}

	public void setAxisPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement axisPosition) {
		this.axisPosition = axisPosition;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcLine getAxisLine() {
		return null;
	}


}

