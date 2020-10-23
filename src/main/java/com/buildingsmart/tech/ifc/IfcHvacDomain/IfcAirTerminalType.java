// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cf1c47c5-d381-48b1-a302-0b1cd5558409")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAirTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@DataMember(Order = 0)
	@Required()
	@Guid("2d695211-8a80-4cd1-add4-873b49fe778e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcAirTerminalTypeEnum predefinedType;


	public IfcAirTerminalType()
	{
	}

	public IfcAirTerminalType(String globalId, IfcAirTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAirTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAirTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

