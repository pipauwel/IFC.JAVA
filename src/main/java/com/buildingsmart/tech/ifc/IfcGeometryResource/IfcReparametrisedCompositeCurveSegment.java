// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("73dcb7dc-33d9-44b6-9ff1-1c8ded7c722d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReparametrisedCompositeCurveSegment extends IfcCompositeCurveSegment
{
	@DataMember(Order = 0)
	@Required()
	@Guid("c5577010-d8c0-41e0-b393-c30f401114a2")
	@JacksonXmlProperty(isAttribute=true, localName = "ParamLength")
	private double paramLength;


	public IfcReparametrisedCompositeCurveSegment()
	{
	}

	public IfcReparametrisedCompositeCurveSegment(IfcTransitionCode transition, Boolean sameSense, IfcCurve parentCurve, double paramLength)
	{
		super(transition, sameSense, parentCurve);
		this.paramLength = paramLength;
	}

	public double getParamLength() {
		return this.paramLength;
	}

	public void setParamLength(double paramLength) {
		this.paramLength = paramLength;
	}


}

