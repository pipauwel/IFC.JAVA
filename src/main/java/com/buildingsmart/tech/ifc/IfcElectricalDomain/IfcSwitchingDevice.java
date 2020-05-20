// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ddf82f58-8d9d-4781-b90f-d27aca153c7f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSwitchingDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("d917d4c1-a6ef-4baa-b21a-f1e0ed809df5")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSwitchingDeviceTypeEnum predefinedType;


	public IfcSwitchingDevice()
	{
	}

	public IfcSwitchingDevice(String globalId)
	{
		super(globalId);
	}

	public IfcSwitchingDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSwitchingDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

