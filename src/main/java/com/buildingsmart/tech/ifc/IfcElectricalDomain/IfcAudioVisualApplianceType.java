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

@Guid("2e0e9b45-760d-49af-bb15-c4011d0a4e76")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAudioVisualApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of audio-visual appliance from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("5174e2c3-82a6-43e1-a485-103834820e30")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcAudioVisualApplianceTypeEnum predefinedType;


	public IfcAudioVisualApplianceType()
	{
	}

	public IfcAudioVisualApplianceType(String globalId, IfcAudioVisualApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAudioVisualApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAudioVisualApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

