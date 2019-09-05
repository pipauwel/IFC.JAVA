// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c9e33dba-b4d1-4962-ba22-bf85a030a835")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStackTerminal extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("fe795606-d857-4989-9954-1dac6e946004")
	private com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcStackTerminalTypeEnum predefinedType;


	public IfcStackTerminal()
	{
	}

	public IfcStackTerminal(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcStackTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcStackTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

