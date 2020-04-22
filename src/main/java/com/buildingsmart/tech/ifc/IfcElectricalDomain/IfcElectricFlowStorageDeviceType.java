// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricFlowStorageDeviceTypeEnum;

@Guid("9022a034-602f-4405-bb14-2e18d8a865db")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricFlowStorageDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType
{
	@Description("<p>Identifies the predefined types of electric flow storage devices from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("186735ec-129e-418f-976b-fa860a7b2a9f")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

