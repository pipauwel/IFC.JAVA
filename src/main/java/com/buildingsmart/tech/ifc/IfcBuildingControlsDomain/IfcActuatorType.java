// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

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
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum;

@Guid("c5566ffc-0c41-4c04-8976-47ec60b36fda")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActuatorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of actuator from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("0e4f0d49-2432-4458-b687-8429bcd48735")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcActuatorTypeEnum predefinedType;


	public IfcActuatorType()
	{
	}

	public IfcActuatorType(String globalId, IfcActuatorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcActuatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcActuatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

