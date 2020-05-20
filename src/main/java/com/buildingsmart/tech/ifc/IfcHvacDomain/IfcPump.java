// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("da626cac-98fb-4f4c-8d4a-c8c4bac3a68d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPump extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDevice
{
	@DataMember(Order = 0)
	@Guid("f3a4f34f-67bd-4977-b1ac-23f5004f8536")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPumpTypeEnum predefinedType;


	public IfcPump()
	{
	}

	public IfcPump(String globalId)
	{
		super(globalId);
	}

	public IfcPumpTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPumpTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

