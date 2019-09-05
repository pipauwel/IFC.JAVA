// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ec824845-e28c-4abc-a57a-8c95bf556dc8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMotorConnectionType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of motor connection from which the type required may be set.</p>")
	@Required()
	@Guid("a52dfeef-c83c-4a8b-9038-f20e8c8d2567")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionTypeEnum predefinedType;


	public IfcMotorConnectionType()
	{
	}

	public IfcMotorConnectionType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

