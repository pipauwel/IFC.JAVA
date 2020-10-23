// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0a9974ef-6873-4eed-93ae-8bdbde6996b6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMedicalDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("bf6dacbf-d58a-4995-9f89-c8568c7b0fb3")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMedicalDeviceTypeEnum predefinedType;


	public IfcMedicalDevice()
	{
	}

	public IfcMedicalDevice(String globalId)
	{
		super(globalId);
	}

	public IfcMedicalDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMedicalDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

