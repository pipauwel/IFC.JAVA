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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminal;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualAppliance;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCommunicationsAppliance;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricAppliance;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminal;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLamp;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixture;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcMedicalDevice;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcOutlet;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcSanitaryTerminal;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcSpaceHeater;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcStackTerminal;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcWasteTerminal;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("b95360e4-9695-4f5f-b070-7d969f143c5b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirTerminal.class, name = "IfcAirTerminal"), @JsonSubTypes.Type(value = IfcAudioVisualAppliance.class, name = "IfcAudioVisualAppliance"), @JsonSubTypes.Type(value = IfcCommunicationsAppliance.class, name = "IfcCommunicationsAppliance"), @JsonSubTypes.Type(value = IfcElectricAppliance.class, name = "IfcElectricAppliance"), @JsonSubTypes.Type(value = IfcFireSuppressionTerminal.class, name = "IfcFireSuppressionTerminal"), @JsonSubTypes.Type(value = IfcLamp.class, name = "IfcLamp"), @JsonSubTypes.Type(value = IfcLightFixture.class, name = "IfcLightFixture"), @JsonSubTypes.Type(value = IfcMedicalDevice.class, name = "IfcMedicalDevice"), @JsonSubTypes.Type(value = IfcOutlet.class, name = "IfcOutlet"), @JsonSubTypes.Type(value = IfcSanitaryTerminal.class, name = "IfcSanitaryTerminal"), @JsonSubTypes.Type(value = IfcSpaceHeater.class, name = "IfcSpaceHeater"), @JsonSubTypes.Type(value = IfcStackTerminal.class, name = "IfcStackTerminal"), @JsonSubTypes.Type(value = IfcWasteTerminal.class, name = "IfcWasteTerminal")})
public class IfcFlowTerminal extends IfcDistributionFlowElement
{

	public IfcFlowTerminal()
	{
	}

	public IfcFlowTerminal(String globalId)
	{
		super(globalId);
	}


}

