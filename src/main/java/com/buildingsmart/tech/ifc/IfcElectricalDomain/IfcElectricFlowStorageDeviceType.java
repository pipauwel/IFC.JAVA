// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9022a034-602f-4405-bb14-2e18d8a865db")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricFlowStorageDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType
{
	@Description("<p>Identifies the predefined types of electric flow storage devices from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("186735ec-129e-418f-976b-fa860a7b2a9f")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricFlowStorageDeviceTypeEnum predefinedType;


	public IfcElectricFlowStorageDeviceType()
	{
	}

	public IfcElectricFlowStorageDeviceType(String globalId, IfcElectricFlowStorageDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricFlowStorageDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

