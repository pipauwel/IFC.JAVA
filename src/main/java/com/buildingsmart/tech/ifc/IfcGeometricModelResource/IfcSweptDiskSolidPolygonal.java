// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d4c2b099-4604-4491-b948-5445dd2ff41c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSweptDiskSolidPolygonal extends IfcSweptDiskSolid
{
	@JacksonXmlProperty(isAttribute=true, localName = "FilletRadius")
	@Description("The fillet that is equally applied to all transitions between the segments of the <em>IfcPolyline</em>, providing the geometric representation for <em>the Directrix</em>. If omited, no fillet is applied to the segments.")
	@Guid("1fa1bae9-ec32-470f-a6ca-750f269a3470")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure filletRadius;


	public IfcSweptDiskSolidPolygonal()
	{
	}

	public IfcSweptDiskSolidPolygonal(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve directrix, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
	{
		super(directrix, radius);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getFilletRadius() {
		return this.filletRadius;
	}

	public void setFilletRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure filletRadius) {
		this.filletRadius = filletRadius;
	}


}

