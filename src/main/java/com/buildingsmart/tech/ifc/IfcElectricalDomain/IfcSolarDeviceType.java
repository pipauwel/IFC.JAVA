// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9033d16a-1bb0-406c-9981-e63ec50621cc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSolarDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Required()
	@Guid("80cc3e27-6f15-4cca-b8f0-45f6c9290f75")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceTypeEnum predefinedType;


	public IfcSolarDeviceType()
	{
	}

	public IfcSolarDeviceType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

