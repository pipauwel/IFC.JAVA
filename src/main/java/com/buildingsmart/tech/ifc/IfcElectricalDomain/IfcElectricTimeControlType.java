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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlTypeEnum;

@Guid("2bb86abe-9d7d-49e5-8a0e-89e7617eddf6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricTimeControlType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("<p>Identifies the predefined types of electrical time control from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("6390956e-1cd2-4033-9c94-ea41642eeaa8")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcElectricTimeControlTypeEnum predefinedType;


	public IfcElectricTimeControlType()
	{
	}

	public IfcElectricTimeControlType(String globalId, IfcElectricTimeControlTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricTimeControlTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricTimeControlTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

