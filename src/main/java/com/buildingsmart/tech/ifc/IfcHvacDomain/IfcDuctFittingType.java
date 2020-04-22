// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingTypeEnum;

@Guid("cb200223-5993-48b1-9720-c4e9380a4074")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("The type of duct fitting.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e24d6c2c-4c21-4500-89ea-01e996e56021")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDuctFittingTypeEnum predefinedType;


	public IfcDuctFittingType()
	{
	}

	public IfcDuctFittingType(String globalId, IfcDuctFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDuctFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

