// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bcce8211-26c2-4b8d-995d-b68177b22846")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMotorConnection extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("a0cc3cb7-75d8-47fc-b91d-993e8e8b5a1a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMotorConnectionTypeEnum predefinedType;


	public IfcMotorConnection()
	{
	}

	public IfcMotorConnection(String globalId)
	{
		super(globalId);
	}

	public IfcMotorConnectionTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMotorConnectionTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

