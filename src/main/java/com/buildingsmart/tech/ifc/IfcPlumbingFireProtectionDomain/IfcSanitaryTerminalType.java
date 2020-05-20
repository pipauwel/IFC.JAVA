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

@Guid("3e6d6990-982c-4e43-a72e-52557bdc1ac3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSanitaryTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of sanitary terminal from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("1e4ce0fe-9a0e-4b63-85a0-96729bee115b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSanitaryTerminalTypeEnum predefinedType;


	public IfcSanitaryTerminalType()
	{
	}

	public IfcSanitaryTerminalType(String globalId, IfcSanitaryTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSanitaryTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSanitaryTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

