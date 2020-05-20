// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7da5429d-8a3e-4380-bd61-3b719dbfeebd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompressorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType
{
	@Description("Defines the type of compressor (e.g., hermetic, reciprocating, etc.).")
	@DataMember(Order = 0)
	@Required()
	@Guid("ffbabe3c-9c16-47e1-ac44-bc3c7f0c6e62")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCompressorTypeEnum predefinedType;


	public IfcCompressorType()
	{
	}

	public IfcCompressorType(String globalId, IfcCompressorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCompressorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCompressorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

