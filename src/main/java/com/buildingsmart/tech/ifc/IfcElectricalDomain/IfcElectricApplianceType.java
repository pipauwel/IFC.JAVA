// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricApplianceTypeEnum;

@Guid("d3f313a8-e9d6-4123-ae8c-91cb74d1eb3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of electrical appliance from which the type required may be set.</p>")
	@Required()
	@Guid("7e22deff-65cd-48eb-8c95-7a08845da6e2")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcElectricApplianceTypeEnum predefinedType;


	public IfcElectricApplianceType()
	{
	}

	public IfcElectricApplianceType(String globalId, IfcElectricApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

