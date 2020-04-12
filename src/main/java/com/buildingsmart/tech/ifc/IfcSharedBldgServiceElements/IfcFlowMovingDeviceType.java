// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCompressorType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFanType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPumpType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("d8da8935-bba2-4350-aa6e-80c238da573c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCompressorType.class, name = "IfcCompressorType"), @JsonSubTypes.Type(value = IfcFanType.class, name = "IfcFanType"), @JsonSubTypes.Type(value = IfcPumpType.class, name = "IfcPumpType")})
public abstract class IfcFlowMovingDeviceType extends IfcDistributionFlowElementType
{

	public IfcFlowMovingDeviceType()
	{
	}

	public IfcFlowMovingDeviceType(String globalId)
	{
		super(globalId);
	}


}

