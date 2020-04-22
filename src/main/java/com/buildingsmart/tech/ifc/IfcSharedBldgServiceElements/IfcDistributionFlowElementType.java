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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDeviceType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElementType;

@Guid("958382a6-f56d-4656-9abf-92cc96713ddf")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDistributionChamberElementType.class, name = "IfcDistributionChamberElementType"), @JsonSubTypes.Type(value = IfcEnergyConversionDeviceType.class, name = "IfcEnergyConversionDeviceType"), @JsonSubTypes.Type(value = IfcFlowControllerType.class, name = "IfcFlowControllerType"), @JsonSubTypes.Type(value = IfcFlowFittingType.class, name = "IfcFlowFittingType"), @JsonSubTypes.Type(value = IfcFlowMovingDeviceType.class, name = "IfcFlowMovingDeviceType"), @JsonSubTypes.Type(value = IfcFlowSegmentType.class, name = "IfcFlowSegmentType"), @JsonSubTypes.Type(value = IfcFlowStorageDeviceType.class, name = "IfcFlowStorageDeviceType"), @JsonSubTypes.Type(value = IfcFlowTerminalType.class, name = "IfcFlowTerminalType"), @JsonSubTypes.Type(value = IfcFlowTreatmentDeviceType.class, name = "IfcFlowTreatmentDeviceType")})
public abstract class IfcDistributionFlowElementType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElementType
{

	public IfcDistributionFlowElementType()
	{
	}

	public IfcDistributionFlowElementType(String globalId)
	{
		super(globalId);
	}


}

