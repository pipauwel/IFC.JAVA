// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("71aa25c6-a4a6-41fc-aca4-a67875c0775c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricMotor extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("35fb17f7-400f-49bf-88fa-2fb770bf4a14")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricMotorTypeEnum predefinedType;


	public IfcElectricMotor()
	{
	}

	public IfcElectricMotor(String globalId)
	{
		super(globalId);
	}

	public IfcElectricMotorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricMotorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

