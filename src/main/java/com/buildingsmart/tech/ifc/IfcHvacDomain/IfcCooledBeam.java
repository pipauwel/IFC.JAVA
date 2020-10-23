// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("05c51059-5e6d-460d-a7a5-86d1fe7054e6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCooledBeam extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@DataMember(Order = 0)
	@Guid("ee357ee8-0a4b-41b9-9ec2-7a650f719e75")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCooledBeamTypeEnum predefinedType;


	public IfcCooledBeam()
	{
	}

	public IfcCooledBeam(String globalId)
	{
		super(globalId);
	}

	public IfcCooledBeamTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCooledBeamTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

