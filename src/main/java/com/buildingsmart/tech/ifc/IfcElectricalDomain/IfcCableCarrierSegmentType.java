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

@Guid("70c2a9af-9e6c-46ee-a672-009025453926")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierSegmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType
{
	@Description("<p>Identifies the predefined types of cable carrier segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("b84cf981-c4c0-4593-b6e6-c84749ecb418")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableCarrierSegmentTypeEnum predefinedType;


	public IfcCableCarrierSegmentType()
	{
	}

	public IfcCableCarrierSegmentType(String globalId, IfcCableCarrierSegmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableCarrierSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

