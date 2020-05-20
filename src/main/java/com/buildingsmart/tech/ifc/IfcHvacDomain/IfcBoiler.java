// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bf8bb360-a4b6-4854-88b5-78c7f9524139")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoiler extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("dcce598a-edcb-438b-a65f-0d4084ac2a8f")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBoilerTypeEnum predefinedType;


	public IfcBoiler()
	{
	}

	public IfcBoiler(String globalId)
	{
		super(globalId);
	}

	public IfcBoilerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBoilerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

