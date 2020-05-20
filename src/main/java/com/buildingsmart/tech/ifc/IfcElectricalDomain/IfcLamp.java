// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7e9a3b99-a029-4ddf-b40f-2d971a9359c2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLamp extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("74ec89a6-5a27-465e-b178-e27168f9c234")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLampTypeEnum predefinedType;


	public IfcLamp()
	{
	}

	public IfcLamp(String globalId)
	{
		super(globalId);
	}

	public IfcLampTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLampTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

