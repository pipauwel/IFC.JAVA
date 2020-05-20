// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bf2c24c4-224c-4662-8805-9a9d469e11d1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcChiller extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("5d8d2c02-2623-4b2a-a2a1-aa3082ea2b91")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcChillerTypeEnum predefinedType;


	public IfcChiller()
	{
	}

	public IfcChiller(String globalId)
	{
		super(globalId);
	}

	public IfcChillerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcChillerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

