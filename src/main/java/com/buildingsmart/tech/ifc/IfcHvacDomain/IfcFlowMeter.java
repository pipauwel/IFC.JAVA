// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b4df44ca-8253-4baf-a10c-f783b0ca3c80")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFlowMeter extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("8399b678-597b-45d1-bcae-3e2ab882497f")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFlowMeterTypeEnum predefinedType;


	public IfcFlowMeter()
	{
	}

	public IfcFlowMeter(String globalId)
	{
		super(globalId);
	}

	public IfcFlowMeterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFlowMeterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

