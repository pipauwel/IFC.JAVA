// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.*;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("f29818b8-d9e0-49fc-a593-993420817803")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcActuator.class, name = "IfcActuator"), @JsonSubTypes.Type(value = IfcAlarm.class, name = "IfcAlarm"), @JsonSubTypes.Type(value = IfcController.class, name = "IfcController"), @JsonSubTypes.Type(value = IfcFlowInstrument.class, name = "IfcFlowInstrument"), @JsonSubTypes.Type(value = IfcProtectiveDeviceTrippingUnit.class, name = "IfcProtectiveDeviceTrippingUnit"), @JsonSubTypes.Type(value = IfcSensor.class, name = "IfcSensor"), @JsonSubTypes.Type(value = IfcUnitaryControlElement.class, name = "IfcUnitaryControlElement")})
public class IfcDistributionControlElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement
{
	@Description("Reference through the relationship object to related distribution flow elements.")
	@InverseProperty(InverseProp = "relatedControlElements", Range = "IfcRelFlowControlElements")
	@Guid("27a6ae84-a0f5-4f78-b04e-96fb34fe6869")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelFlowControlElements")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "assignedToFlowElement")
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

