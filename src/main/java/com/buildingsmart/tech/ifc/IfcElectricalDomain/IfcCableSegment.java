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

@Guid("a16f4db3-e5ef-49a6-98e0-f7c2116a5580")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableSegment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment
{
	@Description("<p>Identifies the predefined types of cable segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("26d7b3aa-772a-4113-97d7-0c30b212a00a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableSegmentTypeEnum predefinedType;


	public IfcCableSegment()
	{
	}

	public IfcCableSegment(String globalId)
	{
		super(globalId);
	}

	public IfcCableSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

