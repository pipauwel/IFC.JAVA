// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoardType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSwitchingDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalBoxType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFlowMeterType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcValveType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("66974a78-d6cb-4f3e-9ea1-1f409773e445")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirTerminalBoxType.class, name = "IfcAirTerminalBoxType"), @JsonSubTypes.Type(value = IfcDamperType.class, name = "IfcDamperType"), @JsonSubTypes.Type(value = IfcElectricDistributionBoardType.class, name = "IfcElectricDistributionBoardType"), @JsonSubTypes.Type(value = IfcElectricTimeControlType.class, name = "IfcElectricTimeControlType"), @JsonSubTypes.Type(value = IfcFlowMeterType.class, name = "IfcFlowMeterType"), @JsonSubTypes.Type(value = IfcProtectiveDeviceType.class, name = "IfcProtectiveDeviceType"), @JsonSubTypes.Type(value = IfcSwitchingDeviceType.class, name = "IfcSwitchingDeviceType"), @JsonSubTypes.Type(value = IfcValveType.class, name = "IfcValveType")})
public abstract class IfcFlowControllerType extends IfcDistributionFlowElementType
{

	public IfcFlowControllerType()
	{
	}

	public IfcFlowControllerType(String globalId)
	{
		super(globalId);
	}


}

