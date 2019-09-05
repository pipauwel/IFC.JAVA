// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a8488154-175e-4eda-b9b6-157a9fa9cafe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceTrippingUnit extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("6801c27d-267c-44ff-a462-840addfa2cc5")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType;


	public IfcProtectiveDeviceTrippingUnit()
	{
	}

	public IfcProtectiveDeviceTrippingUnit(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnitTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

