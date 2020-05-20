// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cccb9d1c-cabb-444d-9abb-36579a0122eb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEngineType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@DataMember(Order = 0)
	@Required()
	@Guid("5f26588d-6d5b-46e3-a061-92be853f40b4")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcEngineTypeEnum predefinedType;


	public IfcEngineType()
	{
	}

	public IfcEngineType(String globalId, IfcEngineTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcEngineTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcEngineTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

