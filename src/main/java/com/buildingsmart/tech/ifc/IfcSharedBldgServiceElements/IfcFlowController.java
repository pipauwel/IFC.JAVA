// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoard;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControl;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcProtectiveDevice;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcSwitchingDevice;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalBox;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamper;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFlowMeter;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcValve;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("dc35ad4d-f4ca-4a2a-a3c0-fc20a563ed38")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirTerminalBox.class, name = "IfcAirTerminalBox"), @JsonSubTypes.Type(value = IfcDamper.class, name = "IfcDamper"), @JsonSubTypes.Type(value = IfcElectricDistributionBoard.class, name = "IfcElectricDistributionBoard"), @JsonSubTypes.Type(value = IfcElectricTimeControl.class, name = "IfcElectricTimeControl"), @JsonSubTypes.Type(value = IfcFlowMeter.class, name = "IfcFlowMeter"), @JsonSubTypes.Type(value = IfcProtectiveDevice.class, name = "IfcProtectiveDevice"), @JsonSubTypes.Type(value = IfcSwitchingDevice.class, name = "IfcSwitchingDevice"), @JsonSubTypes.Type(value = IfcValve.class, name = "IfcValve")})
public class IfcFlowController extends IfcDistributionFlowElement
{

	public IfcFlowController()
	{
	}

	public IfcFlowController(String globalId)
	{
		super(globalId);
	}


}

