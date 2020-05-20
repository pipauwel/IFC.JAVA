// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("69c85fcc-5dec-4731-af87-612401edf054")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctSegment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment
{
	@DataMember(Order = 0)
	@Guid("0d2f37c7-995f-49ac-93ac-f6490ef06be2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDuctSegmentTypeEnum predefinedType;


	public IfcDuctSegment()
	{
	}

	public IfcDuctSegment(String globalId)
	{
		super(globalId);
	}

	public IfcDuctSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

