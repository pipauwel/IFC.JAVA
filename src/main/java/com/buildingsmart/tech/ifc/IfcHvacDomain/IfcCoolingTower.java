// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2cb72f5c-1054-4ad5-a372-d1da32049541")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCoolingTower extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("a3c48294-1abd-4020-9155-50f2821b225a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCoolingTowerTypeEnum predefinedType;


	public IfcCoolingTower()
	{
	}

	public IfcCoolingTower(String globalId)
	{
		super(globalId);
	}

	public IfcCoolingTowerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCoolingTowerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

