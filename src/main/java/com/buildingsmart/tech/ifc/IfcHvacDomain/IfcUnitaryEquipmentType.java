// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9ad0a30e-c8f8-4b10-a580-7fe63adeee83")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryEquipmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("The type of unitary equipment.")
	@DataMember(Order = 0)
	@Required()
	@Guid("72298c6a-62aa-4795-8440-09510e987809")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcUnitaryEquipmentTypeEnum predefinedType;


	public IfcUnitaryEquipmentType()
	{
	}

	public IfcUnitaryEquipmentType(String globalId, IfcUnitaryEquipmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcUnitaryEquipmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryEquipmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

