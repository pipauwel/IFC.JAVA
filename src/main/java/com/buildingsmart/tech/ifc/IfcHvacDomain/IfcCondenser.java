// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("598194a7-9978-4f28-b096-33a0f47da50d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCondenser extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("d6eb9482-5fa2-4125-8d3f-c2b1856c208a")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCondenserTypeEnum predefinedType;


	public IfcCondenser()
	{
	}

	public IfcCondenser(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCondenserTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCondenserTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

