// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4b24357d-355f-45c6-a45d-60de71e8c1fb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightFixture extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("b9ba9222-79a3-484d-9292-e20d220e15ea")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLightFixtureTypeEnum predefinedType;


	public IfcLightFixture()
	{
	}

	public IfcLightFixture(String globalId)
	{
		super(globalId);
	}

	public IfcLightFixtureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLightFixtureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

