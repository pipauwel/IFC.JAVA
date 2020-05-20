// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b3850b48-6a0f-456c-b37b-c32cb4a34566")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHeatExchanger extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("cc7afc7c-ed90-4885-993a-2084056149d7")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcHeatExchangerTypeEnum predefinedType;


	public IfcHeatExchanger()
	{
	}

	public IfcHeatExchanger(String globalId)
	{
		super(globalId);
	}

	public IfcHeatExchangerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcHeatExchangerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

