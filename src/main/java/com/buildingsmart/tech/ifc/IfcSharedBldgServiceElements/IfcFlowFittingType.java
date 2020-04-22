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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierFittingType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableFittingType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcJunctionBoxType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeFittingType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElementType;

@Guid("f7823efc-7635-4958-9275-86f733317c9b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCableCarrierFittingType.class, name = "IfcCableCarrierFittingType"), @JsonSubTypes.Type(value = IfcCableFittingType.class, name = "IfcCableFittingType"), @JsonSubTypes.Type(value = IfcDuctFittingType.class, name = "IfcDuctFittingType"), @JsonSubTypes.Type(value = IfcJunctionBoxType.class, name = "IfcJunctionBoxType"), @JsonSubTypes.Type(value = IfcPipeFittingType.class, name = "IfcPipeFittingType")})
public abstract class IfcFlowFittingType extends IfcDistributionFlowElementType
{

	public IfcFlowFittingType()
	{
	}

	public IfcFlowFittingType(String globalId)
	{
		super(globalId);
	}


}

