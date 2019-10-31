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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeFittingTypeEnum;

@Guid("7c307679-338b-48cf-92f2-d34c9d5f235c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("The type of pipe fitting.")
	@Required()
	@Guid("2c44496c-2f0c-4ee8-9fd6-632c0dceca41")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPipeFittingTypeEnum predefinedType;


	public IfcPipeFittingType()
	{
	}

	public IfcPipeFittingType(String globalId, IfcPipeFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPipeFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

