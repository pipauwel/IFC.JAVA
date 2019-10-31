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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTypeEnum;

@Guid("42a11802-b62b-451b-b13b-bbbd59194027")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("<p>Identifies the predefined types of protective device from which the type required may be set.</p>")
	@Required()
	@Guid("63f1f340-e5f4-4898-a768-09b5fac4220b")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProtectiveDeviceTypeEnum predefinedType;


	public IfcProtectiveDeviceType()
	{
	}

	public IfcProtectiveDeviceType(String globalId, IfcProtectiveDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProtectiveDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

