// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("328058af-09ed-4f92-a541-5232e28d6f02")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTransformer extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("10a2e1d6-97a4-4744-a279-02cce93bdaac")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTransformerTypeEnum predefinedType;


	public IfcTransformer()
	{
	}

	public IfcTransformer(String globalId)
	{
		super(globalId);
	}

	public IfcTransformerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTransformerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

