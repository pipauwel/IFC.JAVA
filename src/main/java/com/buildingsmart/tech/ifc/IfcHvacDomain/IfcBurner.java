// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8801203d-3144-4447-8539-793ff1689a2d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBurner extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("531547e0-f15b-4808-965e-2210f3ede44a")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum predefinedType;


	public IfcBurner()
	{
	}

	public IfcBurner(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

