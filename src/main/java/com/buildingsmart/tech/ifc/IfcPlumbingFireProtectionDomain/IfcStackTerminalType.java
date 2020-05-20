// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("624a4820-5a46-41c1-93e7-ee8116a0612d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStackTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of stack terminal from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("b0fb0a3f-e933-441c-9baa-d10bb7df2f4d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcStackTerminalTypeEnum predefinedType;


	public IfcStackTerminalType()
	{
	}

	public IfcStackTerminalType(String globalId, IfcStackTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcStackTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStackTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

