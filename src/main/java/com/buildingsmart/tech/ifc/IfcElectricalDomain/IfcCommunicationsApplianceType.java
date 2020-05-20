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

@Guid("738a14dd-d304-4b4f-86aa-f9fe0990a0fa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCommunicationsApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of communications  appliance from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("00c121f1-a734-4e9a-bfc7-577ebb3b646f")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCommunicationsApplianceTypeEnum predefinedType;


	public IfcCommunicationsApplianceType()
	{
	}

	public IfcCommunicationsApplianceType(String globalId, IfcCommunicationsApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCommunicationsApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCommunicationsApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

