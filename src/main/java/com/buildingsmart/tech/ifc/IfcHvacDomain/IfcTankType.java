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

@Guid("540199dc-befa-4477-9a3c-18a376ec1a11")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTankType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType
{
	@Description("Defines the type of tank.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5b6ea321-df4c-44d0-b5b1-4fb2fe31c4d5")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTankTypeEnum predefinedType;


	public IfcTankType()
	{
	}

	public IfcTankType(String globalId, IfcTankTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTankTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTankTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

