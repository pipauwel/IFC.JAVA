// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0f1b28ab-b6cf-44c4-a618-801aad5fa5fa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvaporator extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("9708a7f9-4336-4a02-9829-4fca81fdf440")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcEvaporatorTypeEnum predefinedType;


	public IfcEvaporator()
	{
	}

	public IfcEvaporator(String globalId)
	{
		super(globalId);
	}

	public IfcEvaporatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcEvaporatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

