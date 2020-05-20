// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e4ba657e-5119-477a-adcc-96b3366a3658")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCoil extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("4dc322cc-b46e-4816-bd8c-e6ef53a51ed6")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCoilTypeEnum predefinedType;


	public IfcCoil()
	{
	}

	public IfcCoil(String globalId)
	{
		super(globalId);
	}

	public IfcCoilTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCoilTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

