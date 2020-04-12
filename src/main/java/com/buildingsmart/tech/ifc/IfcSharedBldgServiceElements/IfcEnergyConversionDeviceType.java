// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGeneratorType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotorType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnectionType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirToAirHeatRecoveryType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBoilerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcChillerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCoilType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCondenserType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCooledBeamType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCoolingTowerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEngineType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCoolerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporatorType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHumidifierType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcUnitaryEquipmentType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("82dcdb2f-9902-446d-944e-e82bc518958b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirToAirHeatRecoveryType.class, name = "IfcAirToAirHeatRecoveryType"), @JsonSubTypes.Type(value = IfcBoilerType.class, name = "IfcBoilerType"), @JsonSubTypes.Type(value = IfcBurnerType.class, name = "IfcBurnerType"), @JsonSubTypes.Type(value = IfcChillerType.class, name = "IfcChillerType"), @JsonSubTypes.Type(value = IfcCoilType.class, name = "IfcCoilType"), @JsonSubTypes.Type(value = IfcCondenserType.class, name = "IfcCondenserType"), @JsonSubTypes.Type(value = IfcCooledBeamType.class, name = "IfcCooledBeamType"), @JsonSubTypes.Type(value = IfcCoolingTowerType.class, name = "IfcCoolingTowerType"), @JsonSubTypes.Type(value = IfcElectricGeneratorType.class, name = "IfcElectricGeneratorType"), @JsonSubTypes.Type(value = IfcElectricMotorType.class, name = "IfcElectricMotorType"), @JsonSubTypes.Type(value = IfcEngineType.class, name = "IfcEngineType"), @JsonSubTypes.Type(value = IfcEvaporativeCoolerType.class, name = "IfcEvaporativeCoolerType"), @JsonSubTypes.Type(value = IfcEvaporatorType.class, name = "IfcEvaporatorType"), @JsonSubTypes.Type(value = IfcHeatExchangerType.class, name = "IfcHeatExchangerType"), @JsonSubTypes.Type(value = IfcHumidifierType.class, name = "IfcHumidifierType"), @JsonSubTypes.Type(value = IfcMotorConnectionType.class, name = "IfcMotorConnectionType"), @JsonSubTypes.Type(value = IfcSolarDeviceType.class, name = "IfcSolarDeviceType"), @JsonSubTypes.Type(value = IfcTransformerType.class, name = "IfcTransformerType"), @JsonSubTypes.Type(value = IfcTubeBundleType.class, name = "IfcTubeBundleType"), @JsonSubTypes.Type(value = IfcUnitaryEquipmentType.class, name = "IfcUnitaryEquipmentType")})
public abstract class IfcEnergyConversionDeviceType extends IfcDistributionFlowElementType
{

	public IfcEnergyConversionDeviceType()
	{
	}

	public IfcEnergyConversionDeviceType(String globalId)
	{
		super(globalId);
	}


}

