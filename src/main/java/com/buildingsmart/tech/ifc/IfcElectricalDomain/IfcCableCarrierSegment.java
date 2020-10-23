// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cbe43c1f-9ddd-4279-bb40-699045a1e748")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierSegment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment
{
	@Description("<p>Identifies the predefined types of cable carrier segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("5801fc0e-a0ce-4891-b588-7510f5b9f78d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableCarrierSegmentTypeEnum predefinedType;


	public IfcCableCarrierSegment()
	{
	}

	public IfcCableCarrierSegment(String globalId)
	{
		super(globalId);
	}

	public IfcCableCarrierSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

