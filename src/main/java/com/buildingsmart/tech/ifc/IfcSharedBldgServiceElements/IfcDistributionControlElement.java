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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.*;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuator;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcAlarm;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcController;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcFlowInstrument;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnit;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensor;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcUnitaryControlElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement;

@Guid("f29818b8-d9e0-49fc-a593-993420817803")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcActuator.class, name = "IfcActuator"), @JsonSubTypes.Type(value = IfcAlarm.class, name = "IfcAlarm"), @JsonSubTypes.Type(value = IfcController.class, name = "IfcController"), @JsonSubTypes.Type(value = IfcFlowInstrument.class, name = "IfcFlowInstrument"), @JsonSubTypes.Type(value = IfcProtectiveDeviceTrippingUnit.class, name = "IfcProtectiveDeviceTrippingUnit"), @JsonSubTypes.Type(value = IfcSensor.class, name = "IfcSensor"), @JsonSubTypes.Type(value = IfcUnitaryControlElement.class, name = "IfcUnitaryControlElement")})
public class IfcDistributionControlElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement
{
	@Description("Reference through the relationship object to related distribution flow elements.")
	@InverseProperty(InverseProp = "RelatedControlElements", Range = "IfcRelFlowControlElements")
	@Guid("27a6ae84-a0f5-4f78-b04e-96fb34fe6869")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelFlowControlElements")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "AssignedToFlowElement")
	private Set<IfcRelFlowControlElements> assignedToFlowElement;


	public IfcDistributionControlElement()
	{
	}

	public IfcDistributionControlElement(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelFlowControlElements> getAssignedToFlowElement() {
		return this.assignedToFlowElement;
	}


}

