// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("48f9b867-ec04-4a55-9138-f52b74f1b60e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcToroidalSurface extends IfcElementarySurface
{
	@Description("The major radius of the torus.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6d516f41-e0c1-4436-9ba8-bdc235df5f75")
	@JacksonXmlProperty(isAttribute=false, localName = "majorRadius")
	private IfcPositiveLengthMeasure majorRadius;

	@Description("The minor radius of the torus.")
	@DataMember(Order = 1)
	@Required()
	@Guid("996fe0f6-341c-4dda-9436-f345cfac480f")
	@JacksonXmlProperty(isAttribute=false, localName = "minorRadius")
	private IfcPositiveLengthMeasure minorRadius;


	public IfcToroidalSurface()
	{
	}

	public IfcToroidalSurface(IfcAxis2Placement3D position, IfcPositiveLengthMeasure majorRadius, IfcPositiveLengthMeasure minorRadius)
	{
		super(position);
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	public IfcPositiveLengthMeasure getMajorRadius() {
		return this.majorRadius;
	}

	public void setMajorRadius(IfcPositiveLengthMeasure majorRadius) {
		this.majorRadius = majorRadius;
	}

	public IfcPositiveLengthMeasure getMinorRadius() {
		return this.minorRadius;
	}

	public void setMinorRadius(IfcPositiveLengthMeasure minorRadius) {
		this.minorRadius = minorRadius;
	}


}

