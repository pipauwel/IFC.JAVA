// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1958077b-0d7a-4afd-b16f-5202fbbf4859")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMedicalDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@DataMember(Order = 0)
	@Required()
	@Guid("829dfa5a-f023-4849-8821-07e578e89711")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMedicalDeviceTypeEnum predefinedType;


	public IfcMedicalDeviceType()
	{
	}

	public IfcMedicalDeviceType(String globalId, IfcMedicalDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcMedicalDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMedicalDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

