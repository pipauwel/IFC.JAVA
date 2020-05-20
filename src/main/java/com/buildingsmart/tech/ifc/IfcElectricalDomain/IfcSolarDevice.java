// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("509208ea-e863-454b-9bd2-3fdf0c7dbac6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSolarDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("08401fee-143c-4a4a-8600-3460e518aefe")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSolarDeviceTypeEnum predefinedType;


	public IfcSolarDevice()
	{
	}

	public IfcSolarDevice(String globalId)
	{
		super(globalId);
	}

	public IfcSolarDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSolarDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

