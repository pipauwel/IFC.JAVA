// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("21087b7b-8ee5-404b-8c9b-1b17cfc62c90")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricDistributionBoard extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("920c3b35-1613-4cf1-9d02-d2deba60e55d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricDistributionBoardTypeEnum predefinedType;


	public IfcElectricDistributionBoard()
	{
	}

	public IfcElectricDistributionBoard(String globalId)
	{
		super(globalId);
	}

	public IfcElectricDistributionBoardTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricDistributionBoardTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

