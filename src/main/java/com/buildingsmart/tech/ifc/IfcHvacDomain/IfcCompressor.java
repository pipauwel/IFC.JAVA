// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d8aab68b-f996-419d-8d96-d62a306be289")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompressor extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDevice
{
	@DataMember(Order = 0)
	@Guid("063cf1f4-074d-489d-acbe-727457caaef5")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCompressorTypeEnum predefinedType;


	public IfcCompressor()
	{
	}

	public IfcCompressor(String globalId)
	{
		super(globalId);
	}

	public IfcCompressorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCompressorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

