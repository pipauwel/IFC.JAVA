// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcAlarmType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcControllerType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcFlowInstrumentType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcUnitaryControlElementType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceTrippingUnitType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("f334ae9a-2767-4857-9f21-c304c086eb6c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcActuatorType.class, name = "IfcActuatorType"), @JsonSubTypes.Type(value = IfcAlarmType.class, name = "IfcAlarmType"), @JsonSubTypes.Type(value = IfcControllerType.class, name = "IfcControllerType"), @JsonSubTypes.Type(value = IfcFlowInstrumentType.class, name = "IfcFlowInstrumentType"), @JsonSubTypes.Type(value = IfcProtectiveDeviceTrippingUnitType.class, name = "IfcProtectiveDeviceTrippingUnitType"), @JsonSubTypes.Type(value = IfcSensorType.class, name = "IfcSensorType"), @JsonSubTypes.Type(value = IfcUnitaryControlElementType.class, name = "IfcUnitaryControlElementType")})
public abstract class IfcDistributionControlElementType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElementType
{

	public IfcDistributionControlElementType()
	{
	}

	public IfcDistributionControlElementType(String globalId)
	{
		super(globalId);
	}


}

