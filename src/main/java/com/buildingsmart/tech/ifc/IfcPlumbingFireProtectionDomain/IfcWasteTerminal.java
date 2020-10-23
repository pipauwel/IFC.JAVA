// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8f0a8504-a6bc-4682-93f1-f55c09260b1a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWasteTerminal extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("486553fc-cc66-472d-904f-60984dc75a9a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcWasteTerminalTypeEnum predefinedType;


	public IfcWasteTerminal()
	{
	}

	public IfcWasteTerminal(String globalId)
	{
		super(globalId);
	}

	public IfcWasteTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWasteTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

