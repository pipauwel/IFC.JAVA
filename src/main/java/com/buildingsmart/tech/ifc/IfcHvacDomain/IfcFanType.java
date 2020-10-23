// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("13691192-2383-4c23-ab6a-c8a9a2b8c1ba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFanType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType
{
	@Description("Defines the type of fan typically used in building services.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a35b99d4-7d3d-4273-92a5-5812abe54400")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFanTypeEnum predefinedType;


	public IfcFanType()
	{
	}

	public IfcFanType(String globalId, IfcFanTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFanTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFanTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

