// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricFlowStorageDevice;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTank;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("c7723c29-4391-423e-ad55-4bc4ba00f9eb")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcElectricFlowStorageDevice.class, name = "IfcElectricFlowStorageDevice"), @JsonSubTypes.Type(value = IfcTank.class, name = "IfcTank")})
public class IfcFlowStorageDevice extends IfcDistributionFlowElement
{

	public IfcFlowStorageDevice()
	{
	}

	public IfcFlowStorageDevice(String globalId)
	{
		super(globalId);
	}


}

