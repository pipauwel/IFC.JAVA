// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f2443c0e-5c57-46d2-83fe-668bd3d3367a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricFlowStorageDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDevice
{
	@DataMember(Order = 0)
	@Guid("ee7ce2c1-5eae-4e1b-a1d8-6d432d9b8136")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricFlowStorageDeviceTypeEnum predefinedType;


	public IfcElectricFlowStorageDevice()
	{
	}

	public IfcElectricFlowStorageDevice(String globalId)
	{
		super(globalId);
	}

	public IfcElectricFlowStorageDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

