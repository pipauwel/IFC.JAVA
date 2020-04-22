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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting;

@Guid("51ec480e-81a5-4667-96a8-af2d91f8dc79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@DataMember(Order = 0)
	@Guid("9d3d9238-0a4a-4e50-88d6-e1577dfd7964")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPipeFittingTypeEnum predefinedType;


	public IfcPipeFitting()
	{
	}

	public IfcPipeFitting(String globalId)
	{
		super(globalId);
	}

	public IfcPipeFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

