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

@Guid("6ed8eee1-4ef5-4084-99db-457ee2e6431a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableSegmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType
{
	@Description("<p>Identifies the predefined types of cable segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("5eb0680e-2b1f-4c6a-83ec-db45bf36cf4e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableSegmentTypeEnum predefinedType;


	public IfcCableSegmentType()
	{
	}

	public IfcCableSegmentType(String globalId, IfcCableSegmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

