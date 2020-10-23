// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5c94650b-db68-4716-a299-3069c0a7a43b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirTerminalBox extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("5a851e83-1420-4838-b101-36c0f6996d1d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcAirTerminalBoxTypeEnum predefinedType;


	public IfcAirTerminalBox()
	{
	}

	public IfcAirTerminalBox(String globalId)
	{
		super(globalId);
	}

	public IfcAirTerminalBoxTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirTerminalBoxTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

