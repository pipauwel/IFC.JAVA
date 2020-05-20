// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("89fd5813-f37e-4602-a4ad-8cdb9bf8869c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceOfRevolution extends IfcSweptSurface
{
	@Description("A point on the axis of revolution and the direction of the axis of revolution.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f5ca3d78-4e7d-4f00-8f91-e7bad20ebeb5")
	@JacksonXmlProperty(isAttribute=false, localName = "axisPosition")
	private IfcAxis1Placement axisPosition;


	public IfcSurfaceOfRevolution()
	{
	}

	public IfcSurfaceOfRevolution(IfcProfileDef sweptCurve, IfcAxis1Placement axisPosition)
	{
		super(sweptCurve);
		this.axisPosition = axisPosition;
	}

	public IfcAxis1Placement getAxisPosition() {
		return this.axisPosition;
	}

	public void setAxisPosition(IfcAxis1Placement axisPosition) {
		this.axisPosition = axisPosition;
	}

	public IfcLine getAxisLine() {
		//	AxisLine:=IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
		return new IfcLine(axisPosition.getLocation(),new IfcVector(axisPosition.getZ(),new IfcLengthMeasure(1.0)));
	}


}

