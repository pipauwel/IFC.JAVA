// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("00254f70-e0ef-4d79-91de-eade9f1c10c5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvaporativeCooler extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("5235d6fd-e834-4f07-bc90-c52223140472")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcEvaporativeCoolerTypeEnum predefinedType;


	public IfcEvaporativeCooler()
	{
	}

	public IfcEvaporativeCooler(String globalId)
	{
		super(globalId);
	}

	public IfcEvaporativeCoolerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcEvaporativeCoolerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

