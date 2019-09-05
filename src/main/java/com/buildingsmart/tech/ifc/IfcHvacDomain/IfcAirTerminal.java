// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5bfe2e5-0796-4a25-98a1-7484e7d2f7e8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirTerminal extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("432c2a57-b9c5-4706-9f86-8efe65b36e79")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalTypeEnum predefinedType;


	public IfcAirTerminal()
	{
	}

	public IfcAirTerminal(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

