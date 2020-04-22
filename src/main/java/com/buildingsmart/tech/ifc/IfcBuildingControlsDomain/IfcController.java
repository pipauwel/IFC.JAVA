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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement;

@Guid("7afb752b-f1c9-4813-83a7-ed6599f5cfa0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcController extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@DataMember(Order = 0)
	@Guid("08d1cfc4-3698-4d47-bf23-c6df04a69ff9")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcControllerTypeEnum predefinedType;


	public IfcController()
	{
	}

	public IfcController(String globalId)
	{
		super(globalId);
	}

	public IfcControllerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcControllerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

