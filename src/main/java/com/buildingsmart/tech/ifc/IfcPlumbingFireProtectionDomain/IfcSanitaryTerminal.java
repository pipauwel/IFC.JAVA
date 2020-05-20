// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3aeeb853-9edd-40a5-a6e2-a836653ac710")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSanitaryTerminal extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("c07c360f-6347-43e0-96b7-758b6c8b635a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSanitaryTerminalTypeEnum predefinedType;


	public IfcSanitaryTerminal()
	{
	}

	public IfcSanitaryTerminal(String globalId)
	{
		super(globalId);
	}

	public IfcSanitaryTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSanitaryTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

