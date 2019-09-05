// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("61aa9c11-fe11-4bd6-b0d1-5cec357310f0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFireSuppressionTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of fire suppression terminal from which the type required may be set.</p>")
	@Required()
	@Guid("4dcf5d7d-ae7c-4c89-b98c-071cebaed9a0")
	private com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalTypeEnum predefinedType;


	public IfcFireSuppressionTerminalType()
	{
	}

	public IfcFireSuppressionTerminalType(String globalId, com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

