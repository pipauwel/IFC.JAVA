// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d4cea3d5-466c-4f2b-99e8-9c0c621d5d69")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAudioVisualAppliance extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("2aa5eecb-56b9-4686-816e-ae3aa1e44546")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualApplianceTypeEnum predefinedType;


	public IfcAudioVisualAppliance()
	{
	}

	public IfcAudioVisualAppliance(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

