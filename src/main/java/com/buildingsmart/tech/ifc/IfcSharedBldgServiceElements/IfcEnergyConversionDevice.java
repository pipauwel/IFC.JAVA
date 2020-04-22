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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirToAirHeatRecovery;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBoiler;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurner;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcChiller;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCoil;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCondenser;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCooledBeam;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcCoolingTower;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGenerator;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotor;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEngine;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCooler;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporator;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchanger;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHumidifier;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcMotorConnection;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSolarDevice;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformer;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundle;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcUnitaryEquipment;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("856df463-42b9-4a83-a733-b458ab487012")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirToAirHeatRecovery.class, name = "IfcAirToAirHeatRecovery"), @JsonSubTypes.Type(value = IfcBoiler.class, name = "IfcBoiler"), @JsonSubTypes.Type(value = IfcBurner.class, name = "IfcBurner"), @JsonSubTypes.Type(value = IfcChiller.class, name = "IfcChiller"), @JsonSubTypes.Type(value = IfcCoil.class, name = "IfcCoil"), @JsonSubTypes.Type(value = IfcCondenser.class, name = "IfcCondenser"), @JsonSubTypes.Type(value = IfcCooledBeam.class, name = "IfcCooledBeam"), @JsonSubTypes.Type(value = IfcCoolingTower.class, name = "IfcCoolingTower"), @JsonSubTypes.Type(value = IfcElectricGenerator.class, name = "IfcElectricGenerator"), @JsonSubTypes.Type(value = IfcElectricMotor.class, name = "IfcElectricMotor"), @JsonSubTypes.Type(value = IfcEngine.class, name = "IfcEngine"), @JsonSubTypes.Type(value = IfcEvaporativeCooler.class, name = "IfcEvaporativeCooler"), @JsonSubTypes.Type(value = IfcEvaporator.class, name = "IfcEvaporator"), @JsonSubTypes.Type(value = IfcHeatExchanger.class, name = "IfcHeatExchanger"), @JsonSubTypes.Type(value = IfcHumidifier.class, name = "IfcHumidifier"), @JsonSubTypes.Type(value = IfcMotorConnection.class, name = "IfcMotorConnection"), @JsonSubTypes.Type(value = IfcSolarDevice.class, name = "IfcSolarDevice"), @JsonSubTypes.Type(value = IfcTransformer.class, name = "IfcTransformer"), @JsonSubTypes.Type(value = IfcTubeBundle.class, name = "IfcTubeBundle"), @JsonSubTypes.Type(value = IfcUnitaryEquipment.class, name = "IfcUnitaryEquipment")})
public class IfcEnergyConversionDevice extends IfcDistributionFlowElement
{

	public IfcEnergyConversionDevice()
	{
	}

	public IfcEnergyConversionDevice(String globalId)
	{
		super(globalId);
	}


}

