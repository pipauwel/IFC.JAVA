// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a1202643-3e89-4bf3-9677-82067cb12ecb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("87de95f6-9b74-4313-b83f-99116ef9ec61")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProtectiveDeviceTypeEnum predefinedType;


	public IfcProtectiveDevice()
	{
	}

	public IfcProtectiveDevice(String globalId)
	{
		super(globalId);
	}

	public IfcProtectiveDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

