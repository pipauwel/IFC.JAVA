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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController;

@Guid("a1202643-3e89-4bf3-9677-82067cb12ecb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDevice extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("87de95f6-9b74-4313-b83f-99116ef9ec61")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProtectiveDeviceTypeEnum predefinedType;


	public IfcProtectiveDevice()
	{
	}

	public IfcProtectiveDevice(String globalId)
	{
		super(globalId);
	}

	public IfcProtectiveDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

