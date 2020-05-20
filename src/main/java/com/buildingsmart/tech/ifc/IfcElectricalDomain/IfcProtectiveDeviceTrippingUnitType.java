// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("be726344-2f10-4ab4-a207-182e7e7b5334")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceTrippingUnitType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of protective device tripping unit types from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("5c70a7c4-6daf-4b81-93e6-b7e4e61be9d7")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType;


	public IfcProtectiveDeviceTrippingUnitType()
	{
	}

	public IfcProtectiveDeviceTrippingUnitType(String globalId, IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProtectiveDeviceTrippingUnitTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTrippingUnitTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

