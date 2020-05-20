// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7dfc1ce2-90b4-40a6-bd33-b4d698233f5a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFan extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDevice
{
	@DataMember(Order = 0)
	@Guid("78b04d8e-a13f-425e-a5b9-e2649b1d5639")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFanTypeEnum predefinedType;


	public IfcFan()
	{
	}

	public IfcFan(String globalId)
	{
		super(globalId);
	}

	public IfcFanTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFanTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

