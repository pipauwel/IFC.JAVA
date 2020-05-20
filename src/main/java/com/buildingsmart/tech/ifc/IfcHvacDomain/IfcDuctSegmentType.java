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

@Guid("01ccdf98-70c1-44aa-a133-0a4bbf9ff7d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctSegmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType
{
	@Description("The type of duct segment.")
	@DataMember(Order = 0)
	@Required()
	@Guid("83db28de-1f7c-4123-bbb4-88e0f6421773")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDuctSegmentTypeEnum predefinedType;


	public IfcDuctSegmentType()
	{
	}

	public IfcDuctSegmentType(String globalId, IfcDuctSegmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDuctSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

