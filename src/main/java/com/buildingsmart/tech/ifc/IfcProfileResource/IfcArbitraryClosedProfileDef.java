// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b6ccca8d-998a-47ed-beac-ef1b44ee5681")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArbitraryClosedProfileDef extends IfcProfileDef
{
	@JacksonXmlProperty(isAttribute=false, localName = "OuterCurve")
	@Description("Bounded curve, defining the outer boundaries of the arbitrary profile.")
	@Required()
	@Guid("e5eb7078-ed29-401a-9e78-e38beec339ff")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerCurve;


	public IfcArbitraryClosedProfileDef()
	{
	}

	public IfcArbitraryClosedProfileDef(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerCurve)
	{
		super(profileType);
		this.outerCurve = outerCurve;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getOuterCurve() {
		return this.outerCurve;
	}

	public void setOuterCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerCurve) {
		this.outerCurve = outerCurve;
	}


}

