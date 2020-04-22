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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcAirTerminalType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcAudioVisualApplianceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCommunicationsApplianceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricApplianceType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLampType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcMedicalDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcOutletType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcSanitaryTerminalType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcSpaceHeaterType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcStackTerminalType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcWasteTerminalType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElementType;

@Guid("8bc99d1e-30dc-4cc0-8017-4b73c4160a91")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAirTerminalType.class, name = "IfcAirTerminalType"), @JsonSubTypes.Type(value = IfcAudioVisualApplianceType.class, name = "IfcAudioVisualApplianceType"), @JsonSubTypes.Type(value = IfcCommunicationsApplianceType.class, name = "IfcCommunicationsApplianceType"), @JsonSubTypes.Type(value = IfcElectricApplianceType.class, name = "IfcElectricApplianceType"), @JsonSubTypes.Type(value = IfcFireSuppressionTerminalType.class, name = "IfcFireSuppressionTerminalType"), @JsonSubTypes.Type(value = IfcLampType.class, name = "IfcLampType"), @JsonSubTypes.Type(value = IfcLightFixtureType.class, name = "IfcLightFixtureType"), @JsonSubTypes.Type(value = IfcMedicalDeviceType.class, name = "IfcMedicalDeviceType"), @JsonSubTypes.Type(value = IfcOutletType.class, name = "IfcOutletType"), @JsonSubTypes.Type(value = IfcSanitaryTerminalType.class, name = "IfcSanitaryTerminalType"), @JsonSubTypes.Type(value = IfcSpaceHeaterType.class, name = "IfcSpaceHeaterType"), @JsonSubTypes.Type(value = IfcStackTerminalType.class, name = "IfcStackTerminalType"), @JsonSubTypes.Type(value = IfcWasteTerminalType.class, name = "IfcWasteTerminalType")})
public abstract class IfcFlowTerminalType extends IfcDistributionFlowElementType
{

	public IfcFlowTerminalType()
	{
	}

	public IfcFlowTerminalType(String globalId)
	{
		super(globalId);
	}


}

