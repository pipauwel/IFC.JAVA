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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElementType;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum;

@Guid("e471c212-612d-4578-8f9e-e9623be892bf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionChamberElementType extends IfcDistributionFlowElementType
{
	@Description("Predefined types of distribution chambers.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5547f3da-2b18-4dea-8d61-4940224376c8")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDistributionChamberElementTypeEnum predefinedType;


	public IfcDistributionChamberElementType()
	{
	}

	public IfcDistributionChamberElementType(String globalId, IfcDistributionChamberElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDistributionChamberElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDistributionChamberElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

