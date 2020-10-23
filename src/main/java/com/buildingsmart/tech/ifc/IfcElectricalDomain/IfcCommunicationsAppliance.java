// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9abafcf8-704e-46c5-95c9-c9134e1a3e62")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCommunicationsAppliance extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@DataMember(Order = 0)
	@Guid("e63beda8-8084-4dc0-aa99-260456cfea13")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCommunicationsApplianceTypeEnum predefinedType;


	public IfcCommunicationsAppliance()
	{
	}

	public IfcCommunicationsAppliance(String globalId)
	{
		super(globalId);
	}

	public IfcCommunicationsApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCommunicationsApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

